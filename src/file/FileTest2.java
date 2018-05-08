package file;

import java.io.File;

/**
 * Created by IntelliJ IDEA from file
 *
 * @author: ark_65
 * Date: 2018/5/8
 * Time: 22:58
 * Objective:
 */
public class FileTest2 {
    public static void main(String[] args) {
        File file = new File("F:\\gitWorkspace\\item", "word.txt");
        if (file.exists()) {
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            System.out.println("文件名称：" + name);
            System.out.println("文件长度是：" + length);
            System.out.println("该文件是隐藏文件吗：" + hidden);
        } else {
            System.out.println("该文件不存在");
        }
    }
}
