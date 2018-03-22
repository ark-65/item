package CharacterString;

/**
 * Created by IntelliJ IDEA from CharacterString
 * User: ark_65
 * Date: 2018/3/22
 * Time: 22:06
 * objective:
 */
public class PraticeTwo {
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "World Hello";
        String newStr1 = str1.substring(0, 5);
        String newStr2 = str2.substring(6);
        System.out.println(newStr1);
        System.out.println(newStr2);
        if(newStr1.equals(newStr2)){
            System.out.println("两个截取字符串相同");
        }else{
            System.out.println("两个截取字符串不同");
        }
    }
}
