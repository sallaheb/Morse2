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


    public String convertToMorseCode(String word) {
        // mapping the key and outputting the value in result

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            Character character = Character.toUpperCase(word.charAt(i));
            result += CodeTranslator.get(character.toString());

        }

        return result;
    }

    public String convertToEnglish(String code) {
        // taking the values from bimap and splitting them to allow looping of singular value to match against keys
        // inverse always the retrieval of keys for the key value pair
        String[] characters = code.split(" ");
        String result = "";
        for (int i = 0; i < characters.length; i++) {
            result += CodeTranslator.inverse().get(characters[i] + " ");
        }
        return result;
    }

}
