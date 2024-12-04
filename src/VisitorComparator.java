import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // 按名字排序（字母顺序）
        int nameComparison = v1.getName().compareToIgnoreCase(v2.getName());
        if (nameComparison != 0) {
            return nameComparison; // 如果名字不同，直接返回结果
        }
        // 如果名字相同，则按年龄排序（升序）
        return Integer.compare(v1.getAge(), v2.getAge());
    }
}
