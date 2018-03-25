package ForArray;

/**
 * Created by IntelliJ IDEA from ForArray
 * User: ark_65
 * Date: 2018/3/22
 * Time: 23:32
 * objective:
 */
public class BubbleSort {
    public static void main(String[] args) {
        //创建一个数组，这个数组元素师乱序的
        int[] array = {63, 4, 24, 1, 3, 15};

        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
    }

    /**
     * 冒泡排序
     *
     * @param array 要排序的数组
     */
    public void sort(int[] array) {
        for (int i = 1; i< array.length;i++) {
            //比较相邻的两个元素，较大的数往后冒泡
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        showArray(array);
    }

    /**
     * 显示数组中的所有元素
     *
     * @param array 要显示的数组
     */
    public void showArray(int[] array) {
        for (int i : array) {
            System.out.print(" >" + i);
        }
        System.out.println();
    }
}
