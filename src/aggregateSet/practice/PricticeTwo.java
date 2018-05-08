package aggregateSet.practice;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA from aggregateSet.practice
 *
 * @author: ark_65
 * Date: 2018/5/8
 * Time: 21:46
 * Objective:
 */
public class PricticeTwo implements Comparable<Object> {
    String str;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PricticeTwo(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public PricticeTwo(String str, int id) {
        this.str = str;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        PricticeTwo p = (PricticeTwo)o;
        int result = id > p.id ? 1 : (id == p.id ? 0 : -1);
        return result;
    }

    public static void main(String[] args) {
        PricticeTwo s1 = new PricticeTwo("A", 1);
        PricticeTwo s2 = new PricticeTwo("a", 2);
        PricticeTwo s3 = new PricticeTwo("c", 3);
        PricticeTwo s4 = new PricticeTwo("C", 4);
        PricticeTwo s5 = new PricticeTwo("a", 5);

        TreeSet<PricticeTwo> tree = new TreeSet<>();
        tree.add(s1);
        tree.add(s2);
        tree.add(s3);
        tree.add(s4);
        tree.add(s5);
        Iterator<PricticeTwo> it = tree.iterator();

        List<String> list = new ArrayList<>();
        list.add(s1.getStr());
        list.add(s2.getStr());
        list.add(s3.getStr());
        list.add(s4.getStr());
        list.add(s5.getStr());

        System.out.println("List中的对象有：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Set中的对象有：");
        while (it.hasNext()) {
            PricticeTwo p2 = it.next();
            System.out.println(p2.getStr());
        }
    }


}
