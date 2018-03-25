package Polymorphic;

/**
 * Created by IntelliJ IDEA from Polymorphic
 * User: ark_65
 * Date: 2018/3/24
 * Time: 23:23
 * objective:
 */
public class Paralleogram extends Quadrangle {
 /*   public static void main(String[] args) {
       // Paralleogram p = new Paralleogram();
        //将平行四边形类对象看做是四边形对象，成为向上转型操作
        //draw(p);
        draw(new Paralleogram());

        Quadrangle q = new Paralleogram();
        //Paralleogram p = q;
        //将父类对象赋予子类对象，这种写法是错误的
        //将父类对象赋予子类对象，并强制转为子类型，这种写法是正确的
        Paralleogram p = (Paralleogram) q;

    }
    */

    public static void main(String[] args) {
        //实例化父类对象
        Quadrangle q = new Quadrangle();
        //判断父类对象是否为Parallelogram 子类的一个实例
        if (q instanceof Paralleogram) {
            Paralleogram p = (Paralleogram)q;
        }
        //判断父类对象是否为Square子类的一个实例
        if (q instanceof Square) {
            Square s = (Square)q;
        }
        //由于q对象不为Anything类的对象，所以这条语句是错误的
        //System.out.println(q instanceof Anything);
    }
}
