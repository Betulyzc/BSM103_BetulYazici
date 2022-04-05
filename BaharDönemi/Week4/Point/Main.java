public class Main {

    public static void main(String[] args) {
        Point p1=new Point(7,2);
        Point p2=new Point(4,3);

        System.out.println("p1("+p1.getX()+","+p1.getY()+")");
        System.out.println("Orijine uzaklığı: "+p1.distanceFromOrigin());

        System.out.println("p2("+p2.getX()+","+p1.getY()+")");
        System.out.println("Orijine uzaklığı: "+p2.distanceFromOrigin());

        p1.translate(11,6);
        System.out.println("p1("+p1.getX() +","+p1.getY()+")");
        System.out.println("Orijine uzaklığı: "+p1.distanceFromOrigin());

        System.out.println("p1= "+p1);

        Point p3=new Point(7,2);
        Point p4=new Point(7,2);
}}
