package com.twu.mommy;

public class Mommy {
    private StringBuilder sequence;
    private double count;

    public String mommyfy(String input) {
        sequence = new StringBuilder();
        count = 0;

        for (int index = 0; index < input.length(); index++) {
            String currentLetter = Character.toString(input.charAt(index));

            sequence = !isExpectedLetter(currentLetter) ? sequence.append(currentLetter) : replaceLetter(input, index);
        }
        return isEnough(input) ? sequence.toString() : input;
    }

    private StringBuilder replaceLetter(String input, int index) {
        count++;
        if (isPreviousLetterValid(input, index)) {
            sequence.append("mommy");
        }
        return sequence;
    }

    private boolean isPreviousLetterValid(String input, int index) {
        if (index == 0) return true;
        if (!isExpectedLetter(Character.toString(input.charAt(index - 1)))) return true;
        return false;
    }

    private boolean isExpectedLetter(String letter) {
        return letter.matches("[aeiouAEIOU]+");
    }

    private boolean isEnough(String input) {
        return input.length() != 0 && count / input.length() > 0.3;
    }
}
