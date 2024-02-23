import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("image/us.gif");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("Hello.gif");
            fileWriter.write("Hello!");
            fileWriter.close();
            System.out.println("Dose it exits " + file.exists());
            System.out.println("The file has " + file.length() + " bytes");
            System.out.println("Can it be read? " + file.canRead());
            System.out.println("Can it be writen? " + file.canWrite());
            System.out.println("Is it a directory? " + file.isDirectory());
            System.out.println("Is it a file? " + file.isFile());
            System.out.println("Is it absolute? " + file.isAbsolute());
            System.out.println("Is it hidden? " + file.isHidden());
            System.out.println("Absolute path isc" + file.getAbsolutePath());
            System.out.println("Last modified on " + new Date(file.lastModified()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}