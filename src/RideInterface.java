import java.util.List;

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor); // 将访客添加到队列

    void removeVisitorFromQueue(); // 从队列中删除访客

    void printQueue(); // 打印队列中等待的访客列表

    void runOneCycle(); // 运行一个周期

    void addVisitorToHistory(Visitor visitor); // 将访客添加到历史记录

    boolean checkVisitorFromHistory(Visitor visitor); // 检查访客是否在历史记录中

    int numberOfVisitors(); // 返回历史记录中的访客数量

    void printRideHistory(); // 打印骑行历史记录中的访客列表
}
