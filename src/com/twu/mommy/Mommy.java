package com.twu.mommy;

public class Mommy {
    public String mommyfy(String input) {
        StringBuilder sequence = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) != 'a') {
                sequence.append(input.charAt(index));
            }
            if (input.charAt(index) == 'a' && (index == 0 || input.charAt(index - 1) != 'a')) {
                sequence.append("mommy");
            }
        }
        return sequence.toString();
    }
}
