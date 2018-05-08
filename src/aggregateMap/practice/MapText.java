package aggregateMap.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA from aggregateMap.practice
 *
 * @author: ark_65
 * Date: 2018/5/8
 * Time: 22:29
 * Objective:
 */
public class MapText {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        Emp emp1 = new Emp("05", "赵六");
        Emp emp2 = new Emp("010", "张三");
        Emp emp3 = new Emp("015", "娃哈哈");
        Emp emp4 = new Emp("020", "六个核桃");
        Emp emp5 = new Emp("025", "冰糖雪梨");
        Emp emp6 = new Emp("030", "露露");

        map.put(emp1.getId(), emp1.getName());
        map.put(emp2.getId(), emp2.getName());
        map.put(emp3.getId(), emp3.getName());
        map.put(emp4.getId(), emp4.getName());
        map.put(emp5.getId(), emp5.getName());
        map.put(emp6.getId(), emp6.getName());

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("完整的map：");
        while (it.hasNext()) {
            String id = (String) it.next();
            String name = (String) map.get(id);
            System.out.println("id:" + id + ", name:" + name);
        }
        System.out.println("删除015之后的map：");
        map.remove("015");
        Set<String> set2 = map.keySet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            String name = (String) map.get(str);
            System.out.println("id:" + str + ", name: " + name);
        }

    }


}
