package sql.SQLite;/*
 * Created by Mars Tan on 11/19/2016.
 * Copyright ISOTOPE Studio
 */

import sql.SQLite.lib.SQLite;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLiteMain {

    private static HashMap<Long, String> changeFormflds = new HashMap<>();
    private static HashMap<Long, String> changeFormsfld = new HashMap<>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Database path...");
//        String path = sc.next();
        SQLite sql = new SQLite("C:\\Users\\david\\Desktop\\anki\\", "collection.anki2");
        Connection c;
        Statement statement;
        try {
            c = sql.openConnection();
            statement = c.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
        try {
            ResultSet result = statement.executeQuery("SELECT * FROM notes");
            while (result.next()) {
                long row = result.getLong("id");
                String sfld = result.getString("sfld");
                String flds = result.getString("flds");
                String[] temp = flds.split("\u001F");
                String[] fields = new String[4];
                fields[0] = temp[0];
                if (temp.length > 1)
                    fields[1] = temp[1];
                if (temp.length > 2)
                    fields[2] = temp[2];
                fields[3] = "0";
                if (sfld.endsWith("�ޤ�")) {
                    String newS;
                    String newF;
                    if ((flds.contains("��1]"))) {
                        switch (sfld.charAt(sfld.length() - 3)) {
                            case ('��'):
                                newS = sfld.replaceAll("���ޤ�", "��");
                                fields[1] = fields[1].replaceAll("���ޤ�", "��");
                                break;
                            case ('��'):
                                newS = sfld.replaceAll("���ޤ�", "��");
                                fields[1] = fields[1].replaceAll("���ޤ�", "��");
                                break;
                            case ('��'):
                                newS = sfld.replaceAll("���ޤ�", "��");
                                fields[1] = fields[1].replaceAll("���ޤ�", "��");
                                break;
                            case ('��'):
                                newS = sfld.replaceAll("���ޤ�", "��");
                                fields[1] = fields[1].replaceAll("���ޤ�", "��");
                                break;
                            case ('��'):
                                newS = sfld.replaceAll("�ˤޤ�", "��");
                                fields[1] = fields[1].replaceAll("�ˤޤ�", "��");
                                break;
                            case ('��'):
                                newS = sfld.replaceAll("�ߤޤ�", "��");
                                fields[1] = fields[1].replaceAll("�ߤޤ�", "��");
                                break;
                            case ('��'):
                                newS = sfld.replaceAll("��ޤ�", "��");
                                fields[1] = fields[1].replaceAll("��ޤ�", "��");
                                break;
                            default:
                                continue;
                        }
                        fields[0] = newS;
                        fields[1] = fields[1].replaceAll("\\[sound:.*\\.mp3\\]", "");
                        newF = connectString(fields);
                        changeFormsfld.put(row, newS);
                        changeFormflds.put(row, newF);
                        System.out.println(sfld + "->" + newS);
                        System.out.println(newF);
                    } else if (flds.contains("��2]")) {
                        newS = sfld.replaceAll("�ޤ�", "��");
                        fields[0] = newS;
                        fields[1] = fields[1].replaceAll("�ޤ�", "��").replaceAll("\\[sound:.*\\.mp3\\]", "");
                        newF = connectString(fields);
                        changeFormsfld.put(row, newS);
                        changeFormflds.put(row, newF);
                        System.out.println(sfld + "->" + newS);
                        System.out.println(newF);
                    } else if (flds.contains("��3]")) {
                        newS = sfld.replaceAll("���ޤ�", "����");
                        fields[0] = newS;
                        fields[1] = fields[1].replaceAll("���ޤ�", "����").replaceAll("\\[sound:.*\\.mp3\\]", "");
                        newF = connectString(fields);
                        changeFormsfld.put(row, newS);
                        changeFormflds.put(row, newF);
                        System.out.println(sfld + "->" + newS);
                        System.out.println(newF);
                    }
                }
            }
            for (long row : changeFormflds.keySet()) {
                String s = "UPDATE notes SET flds='" + changeFormflds.get(row) + "', sfld='" + changeFormsfld.get(row) + "' WHERE id = '" + row + "';";
                System.out.println(s);
                statement.executeUpdate(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static String connectString(String[] s) {
        StringBuilder sb = new StringBuilder(s[0]);
        for (int i = 1; i < s.length; i++) {
            sb.append('\u001F').append(s[i]);
        }
        return sb.toString();
    }
}
