package Polymorphic;

/**
 * Created by IntelliJ IDEA from Polymorphic
 * User: ark_65
 * Date: 2018/3/24
 * Time: 22:58
 * objective:
 */
public class Test {
    public Test() {
        System.out.println("初始化实例");
    }

    protected void doSomething(){
        System.out.println("做了一些事情");
    }

    protected Test doIt(){
        return new Test();
    }
}
