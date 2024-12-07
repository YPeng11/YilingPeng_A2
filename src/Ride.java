import java.util.LinkedList;
import java.util.Queue;//添加以便 Ride 可以存储等待乘坐 Ride 的 Visitors（即 Visitor）对象
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String rideName;
    private String theme;
    private int maxRider;
    private int numOfCycles = 0;
    private Employee operator;
    private Queue<Visitor> visitorQueue;
    private List<Visitor> rideHistory;

    // 默认构造函数
    public Ride() {
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 带参数的构造函数
    public Ride(String rideName, String theme, int maxRider, Employee operator) {
        this.rideName = rideName;
        this.theme = theme;
        this.maxRider = maxRider;
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

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
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
            // addVisitorToHistory(removed); 确保将移除的访客添加到历史记录
            System.out.println(removed.getName() + " removed from the queue.");
        } else {
            System.out.println("The queue is empty.");
        }
    }

    // 打印等待队列
    @Override
    public void printQueue() {
        System.out.println("Queue: ");
        for (Visitor visitor : visitorQueue) {
            System.out.println("- " + visitor.getName());
        }
    }

    // 运行一个周期
    public void runOneCycle() {
        // 验证是否有操作员
        if (operator == null) {
            System.out.println("Ride cannot run without an operator.");
            return;
        }
        // 验证是否有等待访客
        if (visitorQueue.isEmpty()) {
            System.out.println("No visitors in the queue. Ride cannot run.");
            return;
        }

        // 运行周期逻辑
        int riders = Math.min(maxRider, visitorQueue.size());
        System.out.printf("Running one cycle with %d riders.%n", riders);

        for (int i = 0; i < riders; i++) {
            Visitor visitor = visitorQueue.poll(); // 从队列移除
            rideHistory.add(visitor); // 添加到历史记录
        }

        // 增加周期计数
        numOfCycles++;
        System.out.printf("Cycle %d completed. %d visitors were added to the ride history.%n", numOfCycles, riders);
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

    public void sortRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors in the ride history to sort.");
            return;
        }

        // 使用 VisitorComparator 对 rideHistory 进行排序
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history has been sorted.");
    }

    // 导出历史记录
    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName());
                writer.newLine();
            }
            System.out.println("Ride history successfully exported to " + filename);
        } catch (IOException e) {
            System.out.println("Error exporting ride history: " + e.getMessage());
        }
    }
}
