package Number;

public class Number {//创建类
    public static void main(String[] args) {//main方法
        byte mybyte = 124;//声明byte型变量并赋值
        short myshort = 32564;//声明short型变量并赋值
        int myint = 45784612;//声明int型变量并赋值
        long mylong = 46789451;//声明long型变量并赋值
        long result = mybyte + myshort + myint + mylong;//获得各数相加后的结果
        System.out.println(result);//输出结果
    }
}
