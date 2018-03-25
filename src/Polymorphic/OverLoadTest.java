package Polymorphic;

/**
 * Created by IntelliJ IDEA from Polymorphic
 *
 * @author: ark_65
 * Date: 2018/3/24
 * Time: 23:51
 * objective:
 */
public class OverLoadTest {

    public static int add(int a, int b) {
        return a + b;
    }

    //定义一个方法名称相同，参数类型不同的方法
    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a) {
        return a;
    }

    public static int add(int a, double b) {
        return 1;
    }

    public static int add(int... a) {
        int s = 0;
        for (int i=0;i<a.length;i++) {
            s += a[i];
        }
        return s;
    }

    //这个方法与前一个方法参数次序不同
    public static int add(double a, int b) {
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("调用add(int,int)方法：" + add(1,2) );
        System.out.println("调用add(double,double)方法：" + add(2.1,3.3));
        System.out.println("调用add(int)方法：" + add(1));
        //调用不定长参数方法
        System.out.println("调用不定长参数方法：" + add(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}
