import java.util.LinkedList;
import java.util.Queue;//添加以便 Ride 可以存储等待乘坐 Ride 的 Visitors（即 Visitor）对象
import java.util.List;

public class Ride implements RideInterface {
    private String rideName;
    private String theme;
    private Employee operator;
    private Queue<Visitor> visitorQueue;

    // 默认构造函数
    public Ride() {
    }

    // 带参数的构造函数
    public Ride(String rideName, String theme, Employee operator) {
        this.rideName = rideName;
        this.theme = theme;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
    }

    // Getter 和 Setter
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        // 将访客添加到访客队列中
        visitorQueue.add(visitor);
        // 打印添加到队列中的访客姓名
        System.out.println(visitor.getName() + " added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!visitorQueue.isEmpty()) {
            Visitor removed = visitorQueue.poll();
            System.out.println(removed.getName() + " removed from the queue.");
        } else {
            System.out.println("The queue is empty.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Queue: ");
        for (Visitor visitor : visitorQueue) {
            System.out.println("- " + visitor.getName());
        }
    }
}
