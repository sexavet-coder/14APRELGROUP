package string;

public class ReverseStringTask {
    public static void main(String[] args) {

        String word = "salam";
        char[] letters = word.toCharArray();
        String reversed = "";

        for (int i = letters.length - 1; i >= 0; i--) {
            reversed = reversed + letters[i];
        }

        System.out.println(reversed);
    }
}
