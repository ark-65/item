package forThrows;

/**
 * Created by IntelliJ IDEA from forThrows
 *
 * @author: ark_65
 * Date: 2018/3/25
 * Time: 23:08
 * Objective:
 */
public class Tran {
    //定义方法，抛出异常
    static int avg(int number1, int number2) throws MyException {
        if (number1 < 0 || number2 < 0) {
            throw new MyException("不可以用复数");
        }
        if (number1 > 100 || number2 > 100) {
            throw new MyException("不可以大于100");
        }
        return number1 + number2;
    }

    public static void main(String[] args) {
        try {
            int result = avg(102, 150);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
