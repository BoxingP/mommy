package com.twu.mommy;

public class Mommy {
    private StringBuilder sequence;
    private double count;

    public String mommyfy(String input) {
        sequence = new StringBuilder();
        count = 0;

        for (int index = 0; index < input.length(); index++) {
            String currentLetter = Character.toString(input.charAt(index));

            sequence = !isVowel(currentLetter) ? sequence.append(currentLetter) : replaceLetterByMommy(input, index);
        }
        return isBeyondThirtyPercent(input) ? sequence.toString() : input;
    }

    private StringBuilder replaceLetterByMommy(String input, int index) {
        count++;
        if (!isPreviousLetterVowel(input, index)) {
            sequence.append("mommy");
        }
        return sequence;
    }

    private boolean isPreviousLetterVowel(String input, int index) {
        if (index != 0 && isVowel(Character.toString(input.charAt(index - 1)))) return true;
        return false;
    }

    private boolean isVowel(String letter) {
        return letter.matches("[aeiouAEIOU]+");
    }

    private boolean isBeyondThirtyPercent(String input) {
        return input.length() != 0 && count / input.length() > 0.3;
    }
}
