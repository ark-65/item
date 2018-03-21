package ProcessControl;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("整数x："+x+"是偶数");
        } else if (x % 2 == 1) {
            System.out.println("整数x：" + x + "是奇数");
        } else {
            System.out.println("x不是一个数");
        }
    }
}
