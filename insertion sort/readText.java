import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class readText {
    public static void main (String[] args) throws FileNotFoundException {
        int [] arrayWord = {10000};
        File file = new File("text.txt");
        Scanner s = new Scanner(file);

        System.out.println(s.nextLine());
        System.out.println(s.nextLine());
        System.out.println(s.nextLine());
        System.out.println(s.nextLine());
        System.out.println(s.nextLine());

        String[] words = {"rest", "down", "from", "back", "that", "only", "take", "year", "door", "hand", "song", "blue"};
        
        System.out.println("String before sort: " + Arrays.toString(words));
        String sortedWords;

        for (int j = 0; j < words.length; j++) {
            for (int i = j +1; i < words.length; i++) {
                if (words[i].compareTo(words[j]) < 0) {
                    sortedWords = words[j];
                    words[j] = words[i];
                    words[i] = sortedWords;
                }
            }
        System.out.println("String after sort: " + words[j]);
        }
    }
}

    