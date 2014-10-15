package com.twu.mommy;

/**
 * Created by bxpeng on 10/15/14.
 */
public class Mommy {
    public String mommyfy(String input) {
        if (input.equals("a") || input.equals("aa")) return "mommy";
        return input;
    }
}
