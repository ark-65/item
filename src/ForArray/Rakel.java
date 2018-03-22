package ForArray;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA from ForArray
 * User: ark_65
 * Date: 2018/3/22
 * Time: 23:07
 * objective:
 */
public class Rakel {
    public static void main(String[] args) {
        int a[]=new int []{1,2,3,4,5,6,7,21,123};
        Arrays.sort(a);
        int w=Arrays.binarySearch(a,1,5,8);
        System.out.print(w);
    }
}
