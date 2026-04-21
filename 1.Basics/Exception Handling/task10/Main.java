package task10;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void readfile(String name) throws IOException {
        FileReader file = new FileReader(name);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name ... ");
        try{
            readfile(input.next());

        }
        catch (IOException e){
            System.out.println("No file found ... ");
        }

    }
}