package sexavet;

public class thomework6 {
	public static void main(String[] args) {
		int n = 29;
		boolean sade = true;

		if (n <= 1) sade = false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
		    if (n % i == 0) {
		        sade = false;
		        break;
		    }
		}

		if (sade)
		    System.out.println("Sadə ədəddir");
		else
		    System.out.println("Sadə ədəd deyil");

	}

}
