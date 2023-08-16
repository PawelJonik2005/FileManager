import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();
        System.out.println("Podaj ścieżkę do katalogu (np. /Users/pjoni/Documents)");
        String directory = scanner.nextLine();
        fileManager.listFilesInDirectory(directory);
        //drugi sposob--->fileManager.listFilesInDirectory("/Users/pjoni/Documents");
    }
}