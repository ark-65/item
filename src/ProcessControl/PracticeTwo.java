package ProcessControl;

/**
 * Created by IntelliJ IDEA from ProcessControl
 * User: ark_65
 * Date: 2018/3/21
 * Time: 22:47
 * objective:用for循环打印菱形
 */
public class PracticeTwo {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            for (int j=1;j<=5-i;j++) {
                System.out.print(" ");
            }
            for (int k = 1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=1;i<=4;i++) {
            //空格 1 2 3 4 so
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            //* 7 5 3 1倒着来的基数
            for(int k=7;k>=2*i-1;k--){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
