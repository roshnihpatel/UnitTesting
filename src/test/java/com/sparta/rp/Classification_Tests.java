package com.sparta.rp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classification_Tests {
    @Test
    @DisplayName("Given age is 4 return U, PG and 12 films are available")
    void GivenAgeIs4ReturnUPG12FilmsAreAvailable(){
        int age = 4;
        String expected = "U, PG & 12 films are available.";
        String answer = FilmClassification.availableClassifications(4);
        Assertions.assertEquals(expected,answer);

    }
    @Test
    @DisplayName("Given age is 13 return U, PG , 12 and 15 films are available")
    void GivenAgeIs13ReturnUPG12And15FilmsAreAvailable(){
        int age = 16;
        String expected = "U, PG, 12 & 15 films are available.";
        String answer = FilmClassification.availableClassifications(13);
        Assertions.assertEquals(expected,answer);

    }
    @Test
    @DisplayName("Given age is 35 all films are available.")
    void GivenAgeIs35ReturnAllFilmsAreAvailable(){
        int age = 35;
        String expected = "All films are available.";
        String answer = FilmClassification.availableClassifications(35);
        Assertions.assertEquals(expected,answer);

    }

}
