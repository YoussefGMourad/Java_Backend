package task5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner fileScanner = null;
        try {
            FileReader reader = new FileReader("data");
            fileScanner = new Scanner(reader);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file not found");
        } finally {
            if (fileScanner != null) fileScanner.close();   // always close
        }
    }
}