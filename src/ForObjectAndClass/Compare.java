package ForObjectAndClass;

/**
 * Created by IntelliJ IDEA from ForObjectAndClass
 * User: ark_65
 * Date: 2018/3/24
 * Time: 20:31
 * objective:
 */
public class Compare {
    public static void main(String[] args) {
        String c1 = new String("abc");
        String c2 = new String("abc");
        String c3 = c1;
        //使用“==”运算符比较c2与c3
        System.out.println(c2 == c3);
        //使用equals()方法比较c2与c3
        System.out.println(c2.equals(c3));
        System.out.println(c1 == c2);
    }
}
