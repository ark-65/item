package Polymorphic;

/**
 * Created by IntelliJ IDEA from Polymorphic
 * User: ark_65
 * Date: 2018/3/24
 * Time: 23:16
 * objective:
 */
public class ObjectInstance {
    @Override
    public String toString() {
        return "在" + getClass().getName()+"类中重写toString()方法";
    }

    public static void main(String[] args) {
        System.out.println(new ObjectInstance());
    }
}
