package aggregateMap;

import java.util.*;

/**
 * Created by IntelliJ IDEA from aggregateMap
 *
 * @author: ark_65
 * Date: 2018/5/7
 * Time: 22:57
 * Objective:
 */
public class MapText {
    public static void main(String[] args) {
        // 由HashMap实现的Map对象
        Map<String, String> map = new HashMap<>();

        Emp emp1 = new Emp("351", "张三");
        Emp emp2 = new Emp("512", "李四");
        Emp emp3 = new Emp("853", "王五");
        Emp emp4 = new Emp("125", "冯六");
        Emp emp5 = new Emp("341", "黄七");

        map.put(emp1.getE_id(), emp1.getE_name());
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp3.getE_id(), emp3.getE_name());
        map.put(emp4.getE_id(), emp4.getE_name());
        map.put(emp5.getE_id(), emp5.getE_name());

        // 获取Map集合中的key对象集合
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("HashMap类实现的Map集合，无序：");
        while (it.hasNext()) {
            // 遍历Map集合
            String str = (String) it.next();
            String name = (String) map.get(str);
            System.out.println(str + " " + name);
        }
        // 创建TreeMap集合对象
        TreeMap<String, String> treemap = new TreeMap<>();
        // 向集合添加对象
        treemap.putAll(map);
        Iterator<String> iter = treemap.keySet().iterator();
        System.out.println("TreeMap 类实现的Map集合，键对象升序：");
        while (iter.hasNext()) {
            // 获取集合中的key对象
            String str = (String)iter.next();
            // 获取集合中对应key对象的value值
            String name = (String) treemap.get(str);
            System.out.println(str + " " + name);
        }
    }
}
