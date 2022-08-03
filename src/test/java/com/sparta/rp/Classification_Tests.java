package com.sparta.rp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {
    @Test
    @DisplayName("Given age is 4 return U, PG and 12 films are available")
    void GivenAgeIs4ReturnUAndPGFilmsAreAvailable(){
        int age = 4;
        String expected = "U & PG films are available.";
        String answer = FilmClassification.availableClassifications(age);
        Assertions.assertEquals(expected,answer);

    }
    @Test
    @DisplayName("Given age is 13 return U, PG , 12 and 15 films are available")
    void GivenAgeIs13ReturnUPGAnd12FilmsAreAvailable(){
        int age = 13;
        String expected = "U, PG & 12 films are available.";
        String answer = FilmClassification.availableClassifications(age);
        Assertions.assertEquals(expected,answer);

    }
    @Test
    @DisplayName("Given age is 35 all films are available.")
    void GivenAgeIs35ReturnAllFilmsAreAvailable(){
        int age = 35;
        String expected = "All films are available";
        String answer = FilmClassification.availableClassifications(age);
        Assertions.assertEquals(expected,answer);

    }
    @Test
    @DisplayName("Given age is 16 return U, PG , 12 and 15 films are available")
    void GivenAgeIs16ReturnUPG12And15FilmsAreAvailable(){
        int age = 16;
        String expected = "U, PG, 12 & 15 films are available.";
        String answer = FilmClassification.availableClassifications(age);
        Assertions.assertEquals(expected,answer);

    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,4,5})
    @DisplayName("Check for multiple value in a test")
    void checkForMultipleValuesInTest(int number){
        Assertions.assertEquals(true,number<6);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,4,5,7,9,10,11})
    @DisplayName("Given ages are under 12 return U and PG films are available")
    void givenAgesAreUnder12ReturnUAndPgFilmsAreAvailable(int age){
        String expected = "U & PG films are available.";
        String answer = FilmClassification.availableClassifications(age);
        Assertions.assertEquals(expected,answer);
    }
    @ParameterizedTest
    @ValueSource(ints = {12,13,14})
    @DisplayName("Given ages are between 12 and 14 return U, PG and 12 films are available")
    void givenAgesAreBetween12And14ReturnUPgAnd12FilmsAreAvailable(int age){
        String expected = "U, PG & 12 films are available.";
        String answer = FilmClassification.availableClassifications(age);
        Assertions.assertEquals(expected,answer);
    }
    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("Given ages are between 15 and 17 return U, PG, 12 and 15 films are available")
    void givenAgesAreBetween15And17ReturnUPg12And15FilmsAreAvailable(int age){
        String expected = "U, PG, 12 & 15 films are available.";
        String answer = FilmClassification.availableClassifications(age);
        Assertions.assertEquals(expected,answer);
    }



}
