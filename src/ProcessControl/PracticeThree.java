package ProcessControl;


/**
 * Created by IntelliJ IDEA from ProcessControl
 * User: ark_65
 * Date: 2018/3/21
 * Time: 22:56
 * objective:
 */
public class PracticeThree {
    public static void main(String[] args) {
        int x = 1;
        double y = 1;
        double z = 0;
        while (x <= 20) {
            y = 1;
            for (int i = x; i > 0; i--) {
                y *= i ;
            }
          //  System.out.println(y);
            z += (1 / y);
          //  System.out.println(z);
            x++;
        }
        System.out.println(z);
    }
}
