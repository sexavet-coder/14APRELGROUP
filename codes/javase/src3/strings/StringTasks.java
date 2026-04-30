package strings;

public class StringTasks {

    public static void main(String[] args) {

        String text = "Java123 is fun 456 and COOL789!";

        boolean hasNumber = text.matches(".*\\d.*");

        System.out.println("Rəqəm varmı: " + hasNumber);



        String noNumbers = text.replaceAll("\\d", "");

        System.out.println("Rəqəmlər silindi: " + noNumbers);


        String noSpaces = text.replaceAll("\\s", "");

        System.out.println("Boşluqlar silindi: " + noSpaces);



        String replacedNumbers = text.replaceAll("\\d", "#");

        System.out.println("Rəqəmlər # ilə əvəz edildi: " + replacedNumbers);

    }
}