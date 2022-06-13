public class Main{

    public static void main(String[] args) {
        LinkedIntList linkList = new LinkedIntList();
        linkList.add(5);
        linkList.add(7);
        System.out.println(linkList.toString());
        linkList.remove(0);
        linkList.add(0,11);
        System.out.println(linkList.toString());

        int count = linkList.size();
        System.out.println(count);
    }
}
