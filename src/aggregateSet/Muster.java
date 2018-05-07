package aggregateSet;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA from aggregate
 *
 * @author: ark_65
 * Date: 2018/5/4
 * Time: 23:59
 * Objective:
 */
public class Muster {
    public static void main(String[] args) {
        // 实例化集合对象
        Collection<String> list = new ArrayList<>();
        // 向集合添加数据
        list.add("a");
        list.add("b");
        list.add("c");
        // 创建迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }
    }
}
