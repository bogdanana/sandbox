package package1;

class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.5, 6.7);
        Point p2 = new Point(9.5, 3.7);
        System.out.println(Point.distance(p1, p2));
    }
}
