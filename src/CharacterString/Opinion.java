package CharacterString;

/**
 * Created by IntelliJ IDEA from CharacterString
 * User: ark_65
 * Date: 2018/3/22
 * Time: 21:28
 * objective:
 */
public class Opinion {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("ABC");
        boolean b = s1.equals(s2);
        //使用equalsIgnoreCase()方法比较s1和s2
        boolean b2 = s2.equalsIgnoreCase(s1);
        System.out.println(s1+"equals"+s2 + ":" + b);
        System.out.println(s1+"equalsIgnoreCase"+s2 + ":" + b2);
    }
}
