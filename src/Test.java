
/*
 * Created by david on 2018/09/13.
 * Copyright ISOTOPE Studio
 */

public class Test {
    private static final String[] NUM = {"һ", "��", "��", "��", "��", "��", "��", "��", "��", "ʮ", "ʮһ", "ʮ��"};

    public static void main(String[] s) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("- [Chapter "+ i +" | ��" + NUM[i - 1] + "��Ԫ](http://notes.marstanjx.com/n5/chapter/"+ i +")");
        }


    }

}
