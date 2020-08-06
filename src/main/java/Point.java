public class Point{
    public static void main(String[]args) {
        Poi p1 = new Poi(3.5, 6.7);
        Poi p2 = new Poi(9.5, 3.7);
        System.out.println(distance(p1, p2));
    }

    static class Poi {
        double x;
        double y;
        private Poi(double x, double y){
            this.x=x;
            this.y=y;
        }
    }

    public static double distance(Poi p1, Poi p2) {
        double result = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return result;
    }

}