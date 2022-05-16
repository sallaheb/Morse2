package com.nology;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.HashMap;

public class MorseCode {
    public BiMap<String, String> CodeTranslator = HashBiMap.create();;

    public MorseCode() {
        this.CodeTranslator.put("A", ".- ");
        this.CodeTranslator.put("B", "-... ");
        this.CodeTranslator.put("C", "-.-. ");
        this.CodeTranslator.put("D", "-.. ");
        this.CodeTranslator.put("E", ". ");
        this.CodeTranslator.put("F", "..-. ");
        this.CodeTranslator.put("G", "--. ");
        this.CodeTranslator.put("H", ".... ");
        this.CodeTranslator.put("I", ".. ");
        this.CodeTranslator.put("J", ".--- ");
        this.CodeTranslator.put("K", "-.- ");
        this.CodeTranslator.put("L", ".-.. ");
        this.CodeTranslator.put("M", "-- ");
        this.CodeTranslator.put("N", "-. ");
        this.CodeTranslator.put("O", "--- ");
        this.CodeTranslator.put("P", ".--. ");
        this.CodeTranslator.put("Q", "--.- ");
        this.CodeTranslator.put("R", ".-. ");
        this.CodeTranslator.put("S", "... ");
        this.CodeTranslator.put("T", "- ");
        this.CodeTranslator.put("U", "..- ");
        this.CodeTranslator.put("V", "...- ");
        this.CodeTranslator.put("W", ".-- ");
        this.CodeTranslator.put("X", "-..- ");
        this.CodeTranslator.put("Y", "-.-- ");
        this.CodeTranslator.put("Z", "--.. ");
        this.CodeTranslator.put("0", "----- ");
        this.CodeTranslator.put("1", ".---- ");
        this.CodeTranslator.put("2", "..--- ");
        this.CodeTranslator.put("3", "...-- ");
        this.CodeTranslator.put("4", "....- ");
        this.CodeTranslator.put("5", "..... ");
        this.CodeTranslator.put("6", "-.... ");
        this.CodeTranslator.put("7", "--... ");
        this.CodeTranslator.put("8", "---.. ");
        this.CodeTranslator.put("9", "----. ");
        this.CodeTranslator.put(" ", " ");
    }


    public String convertToMorseCode(String string) {
        return string;
    }

    public String convertToEnglish(String morseCode) {
        return morseCode;
    }

}
