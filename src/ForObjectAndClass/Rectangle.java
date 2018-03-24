package ForObjectAndClass;

/**
 * Created by IntelliJ IDEA from ForObjectAndClass
 * User: ark_65
 * Date: 2018/3/24
 * Time: 20:43
 * objective:
 */
public class Rectangle {
    /**
     * @param lon 矩形长度，wide矩形宽度
     */
    private int lon;
    private int wide;

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public Rectangle(int lon, int wide) {
        this.lon = lon;
        this.wide = wide;
        System.out.println("长，宽初始化");
    }

    private void area() {
        System.out.println("此矩形的面积是："+ (lon * wide));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,7);
        r1.area();
    }
}
