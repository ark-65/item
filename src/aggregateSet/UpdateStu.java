package aggregateSet;

/**
 * Create with by IntelliJ IDEA
 * User: dragon
 * Date: 18/5/7
 * Time: 上午10:50
 **/

public class UpdateStu implements Comparable<Object> {

    String name;
    long id;

    public UpdateStu(String name, long id) {
        this.name = name;
        this.id = id;
    }

    // 重写compareTo ，为了排序，以id大小为排序规则
    /**
     * 存入TreeSet类实现的Set集合必须实现Comparable接口，该接口中的compareTo(Object 0)方法比较此对象
     * 与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、0或正整数
     */

    @Override
    public int compareTo(Object o) {
        UpdateStu upstu = (UpdateStu) o;
        int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
