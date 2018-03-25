package Polymorphic.Prictice;

/**
 * Created by IntelliJ IDEA from Polymorphic.Prictice
 *
 * @author: ark_65
 * Date: 2018/3/25
 * Time: 19:14
 * Objective:
 */

/**
 * 人类的抽象类
 */
public abstract class Human {
    private String sex;
    private String name;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //定义两个方法，在子类中覆盖第二个
    public static void forType(Human human) {
        System.out.println("人类都有性别");
    }

    public void forName() {
        System.out.println("人类都有一个名字，每个人的名字都不一样");
    }

    public static void main(String[] args) {
        Woman w1 = new Woman();
        Human h1 = new Human() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }
}
