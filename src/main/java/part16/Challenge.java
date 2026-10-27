package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the two methods below. Then run ChallengeTest until every
// test is green. Change only the lines marked YOUR CODE.
// You need a for loop (part 08) and String methods like charAt and indexOf (part 11).

public class Challenge {

    // Return the text with every character written twice.
    // doubleLetters("hi")     should return "hhii"
    // doubleLetters("Java")   should return "JJaavvaa"
    // doubleLetters("")       should return ""
    public static String doubleLetters(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }

    // Count how many times word appears in s. Do not count overlaps:
    // once you find word, keep looking AFTER it.
    // countWord("hi hi hi", "hi")   should return 3
    // countWord("aaaa", "aa")       should return 2   (not 3)
    // countWord("hello", "bye")     should return 0
    public static int countWord(String s, String word) {
        if (word == null || word.isEmpty() || s == null || s.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = s.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }
}
