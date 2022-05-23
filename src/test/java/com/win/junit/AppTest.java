package com.win.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.params.provider.CsvSource;


/**
 * Unit test for simple App.
 */
public class AppTest {
    // #1 -ParameterizedTest
    @DisplayName("Should pass a non-null message to our test method")
    @ParameterizedTest
    @ValueSource(strings = "String of text")
    void shouldPassNonNullMessageAsMethodParameter(String message) {
        assertNotSame(message, MethodReturnType.returnString());
    }

    // #2 - ParameterizedTest Enum
    @DisplayName("Should pass non-null enum values as method parameters")
    @ParameterizedTest(name = "{index} => suit=''{0}''")
    @EnumSource(Suits.class)
    void shouldPassNonNullEnumValuesAsMethodParameter(Suits suit) {
        assertNotNull(suit);
    }

    // #3- Creating Our Test Data by Using the CSV Format
    @DisplayName("Should calculate the correct sum")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, c={2}, sum={3}")
    @CsvSource({
            "1, 1, 1, 3",
            "2, 3, 4, 9"
    })
    void sum(int a, int b, int c, int sum) {
        assertEquals(sum, AverageMethod.sum(a, b, c));
    }

    // #4 Assert Object
    @Test
    @DisplayName("Same object")
    void objectAssertionTest() {

        TvShow tvshow1 = new TvShow("Superman","Fiction",5);
        TvShow tvshow2 = tvshow1;
        assertSame(tvshow1,tvshow2);
    }

     // #5 AssertDeosntThrow
     @Test
     @DisplayName("Should not throw an exception")
     void shouldNotThrowException() {
         assertDoesNotThrow(() -> new TvShow("Superman","Fiction",5));
     }
}
