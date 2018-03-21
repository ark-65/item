package Number;

public class Part {
    //声明常量PI，此时如不对PI进行复制，则会出现错误提示
    static final double PI = 3.14;
    static int age = 23;

    public static void main(String[] args) {
        final int number;
        number = 1235;
        age = 22;
        //number = 1236        //会报错，number为常量
        System.out.println("常量PI的值为：" + PI);
        System.out.println("number赋值后的值为：" + number);
        System.out.println("int型变量age的值为：" + age);
    }
}
