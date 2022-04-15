import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatching {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz ifadeyi girin: ");
        String exp = input.next();
        if (isMatching(exp))
            System.out.println("dengelidir");
        else
            System.out.println("dengesizdir");

    }

    public static boolean isMatching(String exp) {
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < exp.length(); i++) {

            if (exp.charAt(i)=='(')
                s.push(exp.charAt(i));

            else if (exp.charAt(i)==')')
                if (!s.isEmpty())
                    s.pop();
                else
                    return false;

        }
        return (s.isEmpty());
    }
}
