package ProcessControl;

import java.util.Date;

public class GetSwitch {

    public static void main(String[] args) {
        Date date = new Date();
        int week = date.getDay();

        switch (week){
            case 1:
                System.out.println("今天是星期一");
                break;
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期三");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            default:
                System.out.println("可能是星期天吧，我也不知道");

        }
    }
}
