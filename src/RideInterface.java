//import java.util.Iterator;

public interface RideInterface {

    // 添加访客到队列
    void addVisitorToQueue(Visitor visitor);

    // 从队列中移除访客
    void removeVisitorFromQueue();

    // 打印队列中的访客
    void printQueue();

    // 将访客添加到骑行历史记录中
    void addVisitorToHistory(Visitor visitor);

    // 检查访客是否在骑行历史记录中
    boolean checkVisitorFromHistory(Visitor visitor);

    // 获取骑行历史记录中的访客数量
    int numberOfVisitors();

    // 打印骑行历史记录中的访客
    void printRideHistory();

    // 排序骑行历史记录中的访客
    void sortRideHistory();

    // 导出骑行历史记录
    void exportRideHistory(String filename);

    // 导入骑行历史记录
    void importRideHistory(String filename);
}
