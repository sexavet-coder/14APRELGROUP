package classtask;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {

        try {
            File folder = new File("myFolder");

            if (!folder.exists()) {
                folder.mkdir();
            }

            File file = new File("myFolder/qeyd.txt");

            if (file.exists()) {
                System.out.println("Fayl artıq var");
            } else {

                file.createNewFile();

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Java-da fayllarla işləmək maraqlıdır!");

                bw.close();
                fw.close();

                System.out.println("Fayl yaradıldı və məlumat yazıldı.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
