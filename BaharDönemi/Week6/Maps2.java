import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Maps2 {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> wordCountMap=new HashMap<String,Integer>();
        Scanner input=new Scanner(new File("Text.txt"));

        while(input.hasNext()){
            String word=input.next().toLowerCase();
        }

        String word=null;
        if (!wordCountMap.containsKey(word)){
            wordCountMap.put(word,1);

        }else{
            int count=wordCountMap.get(word);
            wordCountMap.put(word,count+1);
        }
        System.out.println(wordCountMap);

    }
}
