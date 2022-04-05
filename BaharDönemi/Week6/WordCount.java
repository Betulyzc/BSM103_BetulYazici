import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class WordCount{

    public static void main(String[] args) throws FileNotFoundException {
        countWords();

    }
    public static void countWords() throws FileNotFoundException {
        Scanner input =new Scanner(new File("Test.txt"));
        Set<String> words=new HashSet<String>();

        while (input.hasNext()){
            String word=input.next().toLowerCase();
            words.add(word);

        }
        System.out.println("Kelimeler: "+words);
        System.out.println("kelime Sayısı: "+words.size());

        for (String word:words)
            System.out.println(word);

    }
}
