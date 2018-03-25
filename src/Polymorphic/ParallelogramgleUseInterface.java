package Polymorphic;

/**
 * Created by IntelliJ IDEA from Polymorphic
 *
 * @author: ark_65
 * Date: 2018/3/25
 * Time: 19:01
 * Objective:
 */
/*
* 定义平行四边形类，该类集成了四边形类，并实现了drawTest接口
* */
public class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
    public void draw() {
        System.out.println("平行四边形.draw()");
    }
    //覆盖父类方法
    @Override
    public void doAnyThing() {
        //SomeSentence
    }
}
