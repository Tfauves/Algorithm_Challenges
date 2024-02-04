package leetCode;

public class DeterminIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String input = "textbook";

        halvesAreAlike(input);
    }


    public static boolean halvesAreAlike(String s) {
        int[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        int length = s.length();
        int splitIndex = length / 2;
        String stringA = s.substring(0, splitIndex);
        System.out.println(stringA);
        String stringB = s.substring(splitIndex);
        System.out.println(stringB);
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < stringA.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (stringA.charAt(i) == vowels[j]) {
                    countA++;
                }
            }
        }

        for (int i = 0; i < stringB.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {

                if (stringB.charAt(i) == vowels[j]) {
                    countB++;
                }
            }
        }
//        System.out.println(countA == countB);
        return countA == countB;
    }
}
