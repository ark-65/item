package ForObjectAndClass;

import java.rmi.AccessException;

/**
 * Created by IntelliJ IDEA from ForObjectAndClass
 * User: ark_65
 * Date: 2018/3/23
 * Time: 21:48
 * objective:
 */
public class AccessProperty {
    static int i = 47;

    public void call() {
        System.out.println("调用call（）方法");
        for (i=0;i<3;i++) {
            System.out.print(i + " ");
            if (i == 2) {
                System.out.println("\n");
            }
        }
    }

    public AccessProperty() {
    }

    public static void main(String[] args) {
        AccessProperty a1 = new AccessProperty();
        AccessProperty a2 = new AccessProperty();
     /* a2.i = 60;     报错了，实例对象不能访问静态成员
        System.out.println("第一个实例对象调用变量i的结果：" + a1.i++);
        System.out.println("第一个实例对象调用变量i的结果：");
        */
        a1.call();
        a2.call();
    }
}
