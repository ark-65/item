package CharacterString;

/**
 * Created by IntelliJ IDEA from CharacterString
 * User: ark_65
 * Date: 2018/3/22
 * Time: 22:18
 * objective:使用字符串生成器，将字符串str追加1~10这10个数组
 */
public class PracticeFout {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            str.append((i + 1+" "));
        }
        System.out.println(str);
    }
}
