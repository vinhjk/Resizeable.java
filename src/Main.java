public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println(circle.toString());
        circle.resize(2.0);
        System.out.println(circle.toString());

        Rectangle r = new Rectangle();
        r.setWidth(2);
        r.setLength(3);
        System.out.println(r.toString());
        r.resize(1.2);
        System.out.println(r.toString());

        Square s = new Square();
        s.setSide(7);
        System.out.println(s.toString());
        s.resize(1.5);
        System.out.println(s.toString());
    }
}
