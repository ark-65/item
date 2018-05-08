package file;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA from file
 *
 * @author: ark_65
 * Date: 2018/5/8
 * Time: 22:54
 * Objective:
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("F:\\gitWorkspace\\item","Word.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("文件已删除");
        }else {
            try {
                file.createNewFile();
                System.out.println("文件已创建");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
