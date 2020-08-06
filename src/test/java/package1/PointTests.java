package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static package1.Point.distance;

public class PointTests {

    @Test
    public void testArea(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(3,3);
        Assert.assertEquals(Point.distance(p1, p2), Math.sqrt(8));
    }
}
