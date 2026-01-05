package string;

public class StringTasks {
    public static void main(String[] args) {

        String name = "Məhərrəm";
        System.out.println("1) name = " + name);

        String message = "Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println("2) message = " + message);

        System.out.println("3) message length = " + message.length());

        System.out.println("4) 7-ci simvol = " + message.charAt(6));

        System.out.println("5) 'n' index = " + message.indexOf('n'));

        System.out.println("6) lowercase = " + message.toLowerCase());

        System.out.println("7) uppercase = " + message.toUpperCase());

        System.out.println("8) \"faydalıdır\" var? " + message.contains("faydalıdır"));

        System.out.println("9) \"faydalıdır\" ilə bitir? " + message.endsWith("faydalıdır"));

        System.out.println("10) \"Java\" ilə başlayır? " + message.startsWith("Java"));

        name = "   Sexavet";
        System.out.println("11) name = [" + name + "]");

        System.out.println("12) trim = [" + name.trim() + "]");

        name = "Əli";
        System.out.println("13) name = " + name);

        System.out.println("14) ilk 4 simvol = " + name.substring(0, 4));

        name = "Sexavet Qurbanlı";
        System.out.println("15) name = " + name);

        String[] parts = name.split(" ");

        System.out.println("17) split nəticəsi:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
