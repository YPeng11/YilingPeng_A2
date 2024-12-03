public interface RideInterface {

    // 添加访客到队列
    void addVisitorToQueue(Visitor visitor);

    // 从队列中移除访客
    void removeVisitorFromQueue();

    // 打印队列中的访客
    void printQueue();
}
