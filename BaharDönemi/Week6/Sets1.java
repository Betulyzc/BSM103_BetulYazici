import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets1 {

    public static void main(String[] args) {
        ArrayList<String > lists=new ArrayList<>();
        lists.add("Kalem");
        lists.add("Masa");
        lists.add("Bilgisayar");
        lists.add(3,"Dolap");
        lists.add("Kalem");
        lists.add("Masa");
        lists.add("Bilgisayar");
        lists.add("Dolap");
        System.out.println(lists);
        System.out.println(lists.size());

        Set<String> sets=new HashSet<String>();

        sets.add("Kalem");
        sets.add("Masa");
        sets.add("Bilgisayar");
        sets.add("Defter");
        sets.add("Kalem");
        sets.add("Masa");

        System.out.println(sets);
        System.out.println(sets.size());
        System.out.println(sets.contains("Dolap"));

        sets.clear();
        System.out.println(sets);
        sets.addAll(lists);
        System.out.println(sets);

    }
}
