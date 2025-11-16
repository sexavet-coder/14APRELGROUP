package sexavet;

public class PrimitiveTypeConversion {
    public static void main(String[] args) {
        short s1 = 69;
        byte b1 = (byte) s1;
        System.out.println("short → byte: " + b1);

        short s2 = 589;
        byte b2 = (byte) s2;
        System.out.println("short → byte: " + b2);

        long l1 = 458L;
        int i1 = (int) l1;
        System.out.println("long → int: " + i1);

        long l2 = 52523635483L;
        int i2 = (int) l2;
        System.out.println("long → int: " + i2);

        double d1 = 5632.6;
        float f1 = (float) d1;
        System.out.println("double → float: " + f1);

        char c1 = 'D';
        int i3 = (int) c1;
        System.out.println("char → int: " + i3);

        int i4 = 123;
        char c2 = (char) i4;
        System.out.println("int → char: " + c2);
    }
}