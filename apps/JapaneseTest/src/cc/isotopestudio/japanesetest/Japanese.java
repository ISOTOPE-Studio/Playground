package cc.isotopestudio.japanesetest;
/*
 * Created by Mars Tan on 2/16/2017.
 * Copyright ISOTOPE Studio
 */

public class Japanese {

    static final String[] HIRAGANA = {
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��"};
    static final String[] KATAKANA = {
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��", "��",
            "��", "��", "��", "��", "��",
            "��", "��"};
    static final String[] ROMAJI = {
            "a", "i", "u", "e", "o",
            "ka", "ki", "ku", "ke", "ko",
            "sa", "shi", "su", "se", "so",
            "ta", "chi", "tsu", "te", "to",
            "na", "ni", "nu", "ne", "no",
            "ha", "hi", "fu", "he", "ho",
            "ma", "mi", "mu", "me", "mo",
            "ya", "yu", "yo",
            "ra", "ri", "ru", "re", "ro",
            "wa", "wo"};


    static String getRomaji(String kana) {
        for (int i = 0; i < HIRAGANA.length; i++) {
            if (HIRAGANA[i].equals(kana)) return ROMAJI[i];
        }
        for (int i = 0; i < KATAKANA.length; i++) {
            if (KATAKANA[i].equals(kana)) return ROMAJI[i];
        }
        return "";
    }

}
