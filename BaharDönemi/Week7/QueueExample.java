import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        String data[]={"java","php","python","C","c++"};
        java.util.Queue<String> q= new LinkedList<String>();

        for (String word: data)
            q.add(word);

        System.out.println("queue" +q);
        System.out.println("peek " +q.peek());
        System.out.println(q.size());
    }
}
