package sexavet;

public class thomework11 {
	public static void main(String[] args) {
		int count = 0;
		int number = 2;

		while (count < 20) {
		    boolean sade = true;

		    for (int i = 2; i <= Math.sqrt(number); i++) {
		        if (number % i == 0) {
		            sade = false;
		            break;
		        }
		    }

		    if (sade) {
		        System.out.println(number);
		        count++;
		    }

		    number++;
		}

	}

}
