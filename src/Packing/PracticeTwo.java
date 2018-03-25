package Packing;

/**
 * Created by IntelliJ IDEA from Packing
 * User: ark_65
 * Date: 2018/3/24
 * Time: 21:27
 * objective:
 */
public class PracticeTwo {
    public static void main(String[] args) {
        Character c1 = new Character('A');
        Character c2 = new Character('A');
        Character c3 = new Character('B');
        System.out.println(c1.equals(c2));
        Character c4 = Character.toLowerCase(c1);
        Character c5 = Character.toLowerCase(c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c4.equals(c5));
        System.out.println(c4);
        System.out.println(c5);


    }
}
