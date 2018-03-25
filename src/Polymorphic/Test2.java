package Polymorphic;

/**
 * Created by IntelliJ IDEA from Polymorphic
 * User: ark_65
 * Date: 2018/3/24
 * Time: 22:59
 * objective:
 */
public class Test2 extends Test {
    public Test2() {
        //调用父类构造方法
        super();
        //调用父类成员方法
        super.doSomething();
    }

    public void doSomethingnew(){
        System.out.println("子类新增的方法");
    }

    //重写父类方法
    @Override
    public void doSomething(){
        System.out.println("重写了父类的doSomething方法");
    }

    //重写父类方法，方法返回值类型为Test2类型
    @Override
    public Test2 doIt() {
        return new Test2();
    }

    public static void main(String[] args) {
        Test2 tt = new Test2();
        tt.doSomething();
        tt.doSomethingnew();
    }
}
