package homework28;

public class CheckRange {

    public void checkValueRange(int value) throws OutOfRangeValueException {

        int min = 10;
        int max = 50;

        if (value < min || value > max) {
            throw new OutOfRangeValueException(
                "Xəta! Dəyər aralıqdan kənardadır. Aralıq: " + min + " - " + max
            );
        } else {
            System.out.println("Dəyər müəyyən aralıqdadır");
        }
    }
}

