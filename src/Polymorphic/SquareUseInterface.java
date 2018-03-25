package Polymorphic;

/**
 * Created by IntelliJ IDEA from Polymorphic
 *
 * @author: ark_65
 * Date: 2018/3/25
 * Time: 19:03
 * Objective:
 */
public class SquareUseInterface extends QuadrangleUseInterface implements drawTest {
    public void draw() {
        System.out.println("正方形.draw()");
    }
    @Override
    public void doAnyThing() {
        //SomeSentence
    }
}
