package com.volynets.util;

import static org.apache.commons.lang3.StringUtils.isNumeric;

/**
 * Defines specific methods for working with string.
 */
public class StringUtils {

    /**
     * Defines positive number in string or not.
     * @param str - current string
     * @return true if positive, else false
     */
    public boolean isPositiveNumber(String str) {
        return isNumeric(str);
    }
}