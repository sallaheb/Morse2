package com.nology;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    private MorseCode morseCode;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        morseCode = new MorseCode();
    }

    @org.junit.jupiter.api.Test
    void ShouldConvertToMorseCodeSingleCharacter() {
        String result = morseCode.CodeTranslator.get("A");
        assertEquals(result, ".- ");
    }

    @org.junit.jupiter.api.Test
    public void shouldConvertToMorseCodeMultipleCharacters() {

        String result = "";
        String word = "WAR";

        for (int i = 0; i < word.length(); i++) {
            Character character = Character.toUpperCase(word.charAt(i));
            result += morseCode.CodeTranslator.get(character.toString());
        }

        assertEquals(result, ".-- .- .-. ");
    }

    @org.junit.jupiter.api.Test
    void ShouldConvertToEnglishSingleCharacter() {
        String result = morseCode.CodeTranslator.inverse().get(".-- ");
        assertEquals(result, "W");
    }

    @org.junit.jupiter.api.Test
    public void ShouldConvertToEnglishMultipleCharacters() {
        String code = ".-- .- .-. ";
        String[] characters = code.split(" ");
        String result = "";
        for (int i = 0; i < characters.length; i++) {
            result += morseCode.CodeTranslator.inverse().get(characters[i] + " ");
        }
        assertEquals(result, "WAR");
    }



}