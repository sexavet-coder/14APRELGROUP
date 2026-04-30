package interfaceTask;

public class Main2 {
    public static void main(String[] args) {

        Player p1 = new Player("Ali", 100);

        try {
            Player p2 = (Player) p1.clone();

            System.out.println("Original hashCode: " + p1.hashCode());
            System.out.println("Clone hashCode: " + p2.hashCode());
            System.out.println("== ilə yoxlama: " + (p1 == p2));
            System.out.println("equals() ilə yoxlama: " + p1.equals(p2));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

