import java.util.LinkedList;
import java.util.Queue;//添加以便 Ride 可以存储等待乘坐 Ride 的 Visitors（即 Visitor）对象
import java.util.List;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String rideName;
    private String theme;
    private Employee operator;
    private Queue<Visitor> visitorQueue;
    private List<Visitor> rideHistory;

    // 默认构造函数
    public Ride() {
    }

    // 带参数的构造函数
    public Ride(String rideName, String theme, Employee operator) {
        this.rideName = rideName;
        this.theme = theme;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
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
            addVisitorToHistory(removed); // 确保将移除的访客添加到历史记录
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

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to ride history.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean exists = rideHistory.contains(visitor);
        System.out.println(visitor.getName() + (exists ? " is in the ride history." : " is not in the ride history."));
        return exists;
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride History:");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println("- " + visitor.getName());
        }
    }
}
