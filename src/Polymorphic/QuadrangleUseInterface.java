package Polymorphic;

/**
 * Created by IntelliJ IDEA from Polymorphic
 *
 * @author: ark_65
 * Date: 2018/3/25
 * Time: 18:56
 * Objective:
 */
public class QuadrangleUseInterface {
    public void doAnyThing() {
        System.out.println("父类doAnyThing");
    }

    public static void main(String[] args) {
        drawTest[] d = {
                new SquareUseInterface(), new ParallelogramgleUseInterface()
        };
        for (int i = 0;i<d.length;i++) {
            d[i].draw();
        }

    }
}
