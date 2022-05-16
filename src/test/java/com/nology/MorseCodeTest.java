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
        //ACT
        String result = "";
        String word = "WAR";

        // Arrange
        result = morseCode.convertToMorseCode(word);

        //Assert

        assertEquals(result, ".-- .- .-. ");
    }

    @org.junit.jupiter.api.Test
    void ShouldConvertToEnglishSingleCharacter() {
        String result = morseCode.CodeTranslator.inverse().get(".-- ");
        assertEquals(result, "W");
    }

    @org.junit.jupiter.api.Test
    public void ShouldConvertToEnglishMultipleCharacters() {

        //ACT
        String result = "";
        String code = ".-- .- .-.";

        // Arrange
        result = morseCode.convertToEnglish(code);

        //Assert

        assertEquals(result, "WAR");
    }



}