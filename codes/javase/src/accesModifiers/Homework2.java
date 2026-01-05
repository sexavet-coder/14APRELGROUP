package accesModifiers;

import java.util.Random;

public class Homework2 {

    public static void main(String[] args) {

        char[] chars = {'J', 'a', 'v', 'a', '!'};
        String fromArray = new String(chars);
        System.out.println("1) String = " + fromArray);

        String s = "AbC";
        boolean is3EnglishLetters = s.matches("[A-Za-z]{3}");
        System.out.println("2) 3 simvol + ingilis hərfi? " + is3EnglishLetters);

        String emptyTest = "   ";
        System.out.println("3a) isEmpty? " + emptyTest.isEmpty());
        System.out.println("3b) isBlank? " + emptyTest.isBlank());

        boolean ends = endsWithCheck("Salam dunya", "dunya");
        System.out.println("4) endsWith = " + ends);

        Random random = new Random();
        int randomNumber = random.nextInt(21) + 10;
        System.out.println("5) random 10..30 = " + randomNumber);

        double value = 12.34567;
        double rounded = Math.round(value * 100.0) / 100.0;
        System.out.println("6) rounded (2 rəqəm) = " + rounded);
    }

    public static boolean endsWithCheck(String text, String ending) {
        boolean result = text.endsWith(ending);
        return result;
    }
}
