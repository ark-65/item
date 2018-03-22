package ForArray;

/**
 * Created by IntelliJ IDEA from ForArray
 * User: ark_65
 * Date: 2018/3/22
 * Time: 22:45
 * objective:使用foreach遍历二维数组
 */
public class Tautog {
    public static void main(String[] args) {
        int arr2[][] = {{4, 3}, {1, 2}};
        System.out.println("数组中的元素是：");
        int i = 0;
        //外层云鬟变量为一维数组
        for (int x[]: arr2) {
            i++;
            int j = 0;
            for (int e : x) {
                j++;
                if (i == arr2.length && j == x.length) {
                    System.out.print(e);
                }else{
                    //如果不是二维数组中的最后一个元素
                    System.out.print(e + "、");
                }
            }
        }
    }
}
