package sexavet;

public class PrimitiveTypeConversionHome {
    public static void main(String[] args) {
        int num1 = 55;
        byte byteNum1 = (byte) num1;
        System.out.println("int → byte: " + byteNum1);

        short num2 = 636;
        byte byteNum2 = (byte) num2;
        System.out.println("short → byte: " + byteNum2);

        long num3 = 458L;
        short shortNum3 = (short) num3;
        System.out.println("long → short: " + shortNum3);

        long num4 = 92523635483L;
        int intNum4 = (int) num4;
        System.out.println("long → int: " + intNum4);

        double num5 = 65787.3;
        int intNum5 = (int) num5;
        System.out.println("double → int: " + intNum5);

        char ch1 = 'q';
        int intFromChar = (int) ch1;
        System.out.println("char → int: " + intFromChar);

        int num6 = 266;
        char charFromInt = (char) num6;
        System.out.println("int → char: " + charFromInt);
    }
}