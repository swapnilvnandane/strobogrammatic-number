package com.app;

import java.util.Map;

/**
 * Strobogrammatic number.
 *
 * **/
public class StrobogrammaticNumber {

    /**
     * Check number is strobogrammatic or not.
     *
     * @param number the number to check.
     * */
    public static boolean check(String number) {
        Map<Character, Character> map = Map.of(
                '0', '0',
                '1', '1',
                '6', '9',
                '8', '8',
                '9', '6'
        );

        int i = 0;
        int max = number.length() - 1;

        while (i <= max) {
            if (!map.containsKey(number.charAt(i)) || map.get(number.charAt(i)) != number.charAt(max)) {
                return false;
            }
            i++;
            max--;
        }
        return true;
    }
}
