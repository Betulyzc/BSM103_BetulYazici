import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Maps {

    public static void main(String[] args) {
        Map<String,Integer> citys=new HashMap<String,Integer>();
        citys.put("İstanbul",34);
        citys.put("Ankara",06);
        citys.put("İzmir",35);

        System.out.println(citys);
        System.out.println("İndeksler - Keys "+citys.keySet());
        System.out.println(citys.values());

        Map<Integer,Set<String >> citys2=new HashMap<Integer,Set<String>>();
        citys2.put(34,new TreeSet<String >());
        citys2.get(34).add("İstanbul");
        citys2.get(34).add("Beşiktas");
        System.out.println(citys2);
    }
}
