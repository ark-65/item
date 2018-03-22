package CharacterString;

import java.util.Date;

/**
 * Created by IntelliJ IDEA from CharacterString
 * User: ark_65
 * Date: 2018/3/22
 * Time: 21:51
 * objective:
 */
public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        String time = String.format("%tc", date);
        String form = String.format("%tF", date);
        //输出打印
        System.out.println("全部的时间信息是："+time);
        System.out.println("年-月-日格式："+ form);
    }
}
