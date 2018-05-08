package aggregateSet.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA from aggregateSet.practice
 *
 * @author: ark_65
 * Date: 2018/5/8
 * Time: 21:39
 * Objective:
 */
public class PricticeOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        list.remove(10);
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
