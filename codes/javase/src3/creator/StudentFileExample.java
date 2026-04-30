package creator;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            File folder = new File("student_data");

            if (!folder.exists()) {
                folder.mkdir();
            }

            File file = new File("student_data/info.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.print("Ad daxil edin: ");
            String ad = sc.nextLine();

            System.out.print("Soyad daxil edin: ");
            String soyad = sc.nextLine();

            System.out.print("Yaş daxil edin: ");
            int yas = sc.nextInt();

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Ad: " + ad);
            bw.newLine();

            bw.write("Soyad: " + soyad);
            bw.newLine();

            bw.write("Yaş: " + yas);
            bw.newLine();

            bw.close();
            fw.close();

            System.out.println("\nFayldan oxunan məlumatlar:");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


            br.close();
            fr.close();

            boolean deleted = file.delete();

            if (deleted) {
                System.out.println("\nFayl silindi.");
            }

            boolean folderDeleted = folder.delete();

            if (folderDeleted) {
                System.out.println("Folder silindi.");
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        sc.close();
    }
}