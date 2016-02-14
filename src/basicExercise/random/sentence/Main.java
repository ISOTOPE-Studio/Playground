package basicExercise.random.sentence;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Main {

	final static String[] list = { "�󽭶�ȥ", "���Ծ�", "ǧ�ŷ�������", "��������", "�˵���", "�������ɳ��", "��ʯ����", "�����İ�", "����ǧ��ѩ", "��ɽ�续",
			"һʱ���ٺ���", "ң�빫誵���", "С�ǳ�����", "����Ӣ��", "�����ڽ�", "̸Ц��", "ǿ²�ҷ�����", "�ʹ�����", "����ӦЦ��", "��������", "��������", "һ�׻�������",
			"Ī�����ִ�Ҷ��", "�η���Х������", "����âЬ��ʤ��", "˭��", "һ��������ƽ��", "���ʹ��紵����", "΢��", "ɽͷб��ȴ��ӭ", "����������ɪ��", "��ȥ", "Ҳ�޷���Ҳ����",
			"����ǧ������", "ˮ����ȥ���޼�", "ң�ԶĿ", "�׳��", "��������", "����¥ͷ", "�Ϻ�����", "��������", "���⹳����", "�����ı�", "���˻�", "������",
			"��˵���㿰��", "������", "��ӥ��δ����������", "��Ӧ�߼�", "���ɲ���", "��ϧ����", "�ǳ����", "�������", "ٻ���˻�ȡ", "������", "Ӣ����", "����ҹ�Ż�ǧ��",
			"������", "������", "���������·", "��������", "�����ת", "һҹ������", "���ѩ���ƽ���", "Ц��ӯӯ����ȥ", "����Ѱ��ǧ�ٶ�", "��Ȼ����", "����ȴ��", "�ƻ���ɺ��",
			"ѰѰ����", "��������", "����Ҳ�����", "էů����ʱ��", "���ѽ�Ϣ", "������յ����", "�����������缱", "���Ҳ", "������", "ȴ�Ǿ�ʱ��ʶ", "���ػƻ��ѻ�", "����",
			"�����˭��ժ", "���Ŵ�������", "�����ú�", "��ͩ����ϸ��", "���ƻ���ε�", "��ε�", "��һ�������˵�", "����Ũ�Ƴ�����", "����������", "�ѽ�������", "����ɴ��",
			"��ҹ����͸", "����Ѿƻƻ��", "�а���ӯ��", "Ī��������", "��������", "�˱Ȼƻ���", "��������", "�Գ�ͤ��", "�����Ъ", "������������", "������", "���۴ݷ�",
			"ִ���࿴����", "��������ҭ", "��ȥȥǧ���̲�", "ĺ�����������", "�����Թ������", "���ǿ����������", "�������Ѻδ�", "������", "�������", "��ȥ����", "Ӧ�������þ�����",
			"������ǧ�ַ���", "�������˵" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ĭд���");
		JButton button = new JButton("���");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Center on screen
		Toolkit toolkit = frame.getToolkit();
		Dimension size = toolkit.getScreenSize(); // resolution of the monitor
		frame.setLocation(size.width / 2 - frame.getWidth() / 2, size.height / 2 - frame.getHeight() / 2);

		frame.setSize(100, 100);
		frame.add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = (int) (Math.random() * list.length);
				JOptionPane.showMessageDialog(frame,"���������¾�: \n"+ list[index]);

			}
		});
		frame.setVisible(true);
	}

	public void oldMain() {
		System.out.println("Input sentences, end with \"-1\"");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String temp = sc.next();
		while (!temp.equals("-1")) {
			list.add(temp);
			temp = sc.next();
		}

		System.out.println("Input any integer, end output with \"-1\"");
		int op = sc.nextInt();
		while (op != -1) {
			int index = (int) (Math.random() * list.size());
			System.out.println(list.get(index));
			op = sc.nextInt();
		}
	}
}
