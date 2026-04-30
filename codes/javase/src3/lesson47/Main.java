package lesson47;


public class Main {

    public static void main(String[] args) {

        SchoolBell bell1 = SchoolBell.getInstance();

        SchoolBell bell2 = SchoolBell.getInstance();

        bell1.ring();
        bell2.ring();

        System.out.println(bell1 == bell2);
    }
}
