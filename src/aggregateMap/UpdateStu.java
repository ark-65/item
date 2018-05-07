package aggregateMap;

import java.util.*;

/**
 * Create with by IntelliJ IDEA
 *
 * @author: dragon
 * Date: 18/5/7
 * Time: 下午12:13
 **/

public class UpdateStu {
    public static void main(String[] args) {
        // 创建map实例
        Map<String, String> map = new HashMap<>();
        // 向集合中添加对象
        map.put("01", "李同学");
        map.put("02", "微同学");
        // 构建Map集合中所有key对象的集合
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("key集合中的元素：");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("values集合中的元素：");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
