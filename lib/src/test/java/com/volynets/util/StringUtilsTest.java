package com.volynets.util;

import com.volynets.util.StringUtils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = { "259", "89", "56", "1" })
    void testIsPositiveNumberCorrect(String argument) {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPositiveNumber(argument));
    }

    @ParameterizedTest
    @ValueSource(strings = { "-13", " 88", "t663", " ", "2.7" })
    void testIsPositiveNumberIncorrect(String argument) {
        StringUtils stringUtils = new StringUtils();
        assertFalse(stringUtils.isPositiveNumber(argument));
    }
}
