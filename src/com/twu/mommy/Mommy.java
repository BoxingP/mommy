package com.twu.mommy;

public class Mommy {
    public String mommyfy(String input) {
        StringBuilder sequence = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            String currentLetter = Character.toString(input.charAt(index));

            if (!isExpectedLetter(currentLetter)) {
                sequence.append(input.charAt(index));
            }
            if ((isExpectedLetter(currentLetter)) && (isPreviousLetterValid(input, index))) {
                sequence.append("mommy");
            }

        }
        return sequence.toString();
    }

    private boolean isPreviousLetterValid(String input, int index) {
        if (index==0) return true;
        if (!isExpectedLetter(Character.toString(input.charAt(index - 1)))) return true;
        return false;
    }
    private boolean isExpectedLetter(String letter) {
        return letter.matches("[aeou]+");
    }
}
