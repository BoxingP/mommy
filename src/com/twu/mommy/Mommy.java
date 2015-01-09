package com.twu.mommy;

public class Mommy {

    public String mommyfy(String input) {
        if (!isBeyondThirtyPercent(input)) return input;

        StringBuilder output = new StringBuilder();
        int index = 0;
        while (index < input.length()) {
            String currentLetter = Character.toString(input.charAt(index));

            output.append(!isVowel(currentLetter) ? currentLetter : replaceLetterByMommy(input, index));
            index++;
        }
        return  output.toString();
    }

    private String replaceLetterByMommy(String input, int index) {
        return !isPreviousLetterVowel(input, index) ? "mommy" : "";
    }

    private boolean isPreviousLetterVowel(String input, int index) {
        return  index != 0 && isVowel(Character.toString(input.charAt(index - 1)));
    }

    private boolean isVowel(String letter) {
        return letter.matches("[aeiouAEIOU]+");
    }

    private boolean isBeyondThirtyPercent(String input) {
        int count = 0;
        for (int index = 0; index < input.length(); index++) {
            if (Character.toString(input.charAt(index)).matches("[aeiouAEIOU]+")) count++;
        }

        return  (double) count / input.length() > 0.3;
    }
}
