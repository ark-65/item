package Packing;

/**
 * Created by IntelliJ IDEA from Packing
 * User: ark_65
 * Date: 2018/3/24
 * Time: 21:17
 * objective:
 */
public class Summation {
    public static void main(String[] args) {
        String str[] = {"89", "12", "10", "18", "35"};
        int sum = 0;
        for (int i=0;i<str.length;i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
