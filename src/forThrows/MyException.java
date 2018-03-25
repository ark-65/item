package forThrows;

/**
 * Created by IntelliJ IDEA from forThrows
 *
 * @author: ark_65
 * Date: 2018/3/25
 * Time: 22:27
 * Objective:自定义异常
 */
public class MyException extends Exception{
    public MyException(String ErrorMessage) {
        super(ErrorMessage);
    }
}
