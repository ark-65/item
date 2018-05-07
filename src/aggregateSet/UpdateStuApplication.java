package aggregateSet;

import java.util.TreeSet;
import java.util.Iterator;

/**
 * Create with by IntelliJ IDEA
 *
 * @author : dragon
 * Date: 18/5/7
 * Time: 上午10:56
 **/

public class UpdateStuApplication {

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李同学", 01011);
        UpdateStu stu2 = new UpdateStu("张同学", 01021);
        UpdateStu stu3 = new UpdateStu("王同学", 01051);
        UpdateStu stu4 = new UpdateStu("马同学", 01012);

        TreeSet<UpdateStu> tree = new TreeSet<>();
        // 向集合添加对象
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        // Set 集合中的所有对象的迭代器
        Iterator<UpdateStu> it = tree.iterator();
        System.out.println("Set 集合中的所有元素：");

        // 遍历集合
        while (it.hasNext()) {
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }

        // 截取排在stu2 对象之前的对象
        it = tree.headSet(stu2).iterator();
        System.out.println("截取前面部分的集合：");

        while (it.hasNext()) {
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }

        // 截取在stu2 和 stu3 之前的对象
        it = tree.subSet(stu2, stu3).iterator();
        System.out.println("截取中间部分的集合：");

        while (it.hasNext()) {
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
    }
}
