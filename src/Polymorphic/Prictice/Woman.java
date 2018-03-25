package Polymorphic.Prictice;

/**
 * Created by IntelliJ IDEA from Polymorphic.Prictice
 *
 * @author: ark_65
 * Date: 2018/3/25
 * Time: 19:17
 * Objective:
 */
public class Woman extends Human {
    public Woman() {
        System.out.println("女人初始化");
    }


    public static void main(String[] args) {
        Woman w1 = new Woman();
        forType(w1);

    }
}
