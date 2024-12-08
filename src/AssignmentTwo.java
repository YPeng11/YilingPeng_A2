public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();

        // 调用各部分逻辑
        System.out.println("---- Part Three ----");
        assignment.partThree();

        System.out.println("---- Part Four A ----");
        assignment.partFourA();

        System.out.println("---- Part Four B ----");
        assignment.partFourB();

        System.out.println("---- Part Five ----");
        assignment.partFive();

        System.out.println("---- Part Six ----");
        assignment.partSix();

        System.out.println("---- Part Seven ----");
        assignment.partSeven();
    }

    public void partThree() {
        // 创建 Employee 对象作为 Ride 的操作员
        Employee operator1 = new Employee("John", 35, "Male", "E002", "Ride Operator");

        // 创建 Ride 对象
        Ride ferrisWheel = new Ride("Ferris Wheel", "Journey to the West", 4, operator1);

        // 创建 Visitor 对象
        Visitor visitor1 = new Visitor("Alice", 30, "Female", "T101", 2);
        Visitor visitor2 = new Visitor("Bob", 25, "Male", "T102", 1);
        Visitor visitor3 = new Visitor("Charlie", 20, "Male", "T103", 3);
        Visitor visitor4 = new Visitor("Diana", 28, "Female", "T104", 2);
        Visitor visitor5 = new Visitor("Eve", 22, "Female", "T105", 1);

        // 将访客添加到队列
        ferrisWheel.addVisitorToQueue(visitor1);
        ferrisWheel.addVisitorToQueue(visitor2);
        ferrisWheel.addVisitorToQueue(visitor3);
        ferrisWheel.addVisitorToQueue(visitor4);
        ferrisWheel.addVisitorToQueue(visitor5);

        // 打印队列中的访客
        System.out.println("Current Queue:");
        ferrisWheel.printQueue();

        // 从队列中移除一个访客
        System.out.println("\nRemoving one visitor from the queue...");
        ferrisWheel.removeVisitorFromQueue();

        // 再次打印队列中的访客
        System.out.println("\nUpdated Queue:");
        ferrisWheel.printQueue();
    }

    public void partFourA() {
        // 创建 Ride 对象
        Employee operator2 = new Employee("John", 35, "Male", "E002", "Ride Operator");
        Ride ride = new Ride("Roller Coaster", "Transformers", 3, operator2);

        // 创建 Visitor 对象
        Visitor v1 = new Visitor("Alice", 30, "Female", "T101", 2);
        Visitor v2 = new Visitor("Bob", 25, "Male", "T102", 1);
        Visitor v3 = new Visitor("Charlie", 20, "Male", "T103", 3);
        Visitor v4 = new Visitor("Diana", 28, "Female", "T104", 2);
        Visitor v5 = new Visitor("Eve", 22, "Female", "T105", 1);

        // 向队列中添加访客
        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);

        // 从队列中移除访客并加入历史记录
        ride.addVisitorToHistory(v1);
        ride.removeVisitorFromQueue();
        ride.addVisitorToHistory(v2);
        ride.removeVisitorFromQueue();

        // 检查访客是否在骑行历史中
        ride.checkVisitorFromHistory(v1);
        ride.checkVisitorFromHistory(v3);

        // 打印骑行历史中的访客数量
        System.out.println("The historical number of visitors for this project is: " + ride.numberOfVisitors());

        // 打印骑行历史
        ride.printRideHistory();
    }

    public void partFourB() {
        // 创建一个新的 Ride 对象
        Employee operator3 = new Employee("Ella", 35, "ella@example.com", "Operator", "Morning");
        Ride swingRide1 = new Ride("Swing Ride", "Batman", 1, operator3);
        // 创建 Visitor 对象
        Visitor v1 = new Visitor("Alice", 30, "Female", "T101", 2);
        Visitor v2 = new Visitor("Bob", 25, "Male", "T102", 1);
        Visitor v3 = new Visitor("Charlie", 20, "Male", "T103", 3);
        Visitor v4 = new Visitor("Diana", 28, "Female", "T104", 2);
        Visitor v5 = new Visitor("Eve", 22, "Female", "T105", 1);
        // 添加至少 5 名访客到 rideHistory
        swingRide1.addVisitorToHistory(v5);
        swingRide1.addVisitorToHistory(v4);
        swingRide1.addVisitorToHistory(v3);
        swingRide1.addVisitorToHistory(v2);
        swingRide1.addVisitorToHistory(v1);

        // 打印未排序的访客历史记录
        System.out.println("Before sorting:");
        swingRide1.printRideHistory();

        // 对 rideHistory 进行排序
        swingRide1.sortRideHistory();

        // 打印排序后的访客历史记录
        System.out.println("After sorting:");
        swingRide1.printRideHistory();
    }

    public void partFive() {
        // 创建新的 Ride 对象
        Employee operator4 = new Employee("John", 32, "john@example.com", "Operator", "Morning");
        Ride ferrisWheel = new Ride("Ferris Wheel", "Yellow Man", 4, operator4);

        // 添加至少 10 名访客到队列
        ferrisWheel.addVisitorToQueue(new Visitor("Alice", 30, "Female", "T101", 2));
        ferrisWheel.addVisitorToQueue(new Visitor("Bob", 25, "Male", "T102", 1));
        ferrisWheel.addVisitorToQueue(new Visitor("Charlie", 20, "Male", "T103", 3));
        ferrisWheel.addVisitorToQueue(new Visitor("Diana", 28, "Female", "T104", 2));
        ferrisWheel.addVisitorToQueue(new Visitor("Diana", 28, "Female", "T104", 2));
        ferrisWheel.addVisitorToQueue(new Visitor("Eve", 22, "Female", "T105", 1));
        ferrisWheel.addVisitorToQueue(new Visitor("Grace", 26, "T106", "Regular", 3));
        ferrisWheel.addVisitorToQueue(new Visitor("Ivy", 22, "Man", "T107", 2));
        ferrisWheel.addVisitorToQueue(new Visitor("Jack", 29, "Female", "T108", 1));
        ferrisWheel.addVisitorToQueue(new Visitor("Kate", 27, "Female", "T109", 2));
        ferrisWheel.addVisitorToQueue(new Visitor("Lily", 23, "Female", "T110", 3));
        // 打印等待队列
        System.out.println("Queue before running the cycle:");
        ferrisWheel.printQueue();

        // 运行一个周期
        ferrisWheel.runOneCycle();

        // 打印运行后的队列
        System.out.println("Queue after running the cycle:");
        ferrisWheel.printQueue();

        // 打印骑行历史记录
        System.out.println("Ride history:");
        ferrisWheel.printRideHistory();
    }

    public void partSix() {
        // 创建新的 Ride 对象
        Employee operator5 = new Employee("John", 32, "Man", "Operator", "Morning");
        Ride ride2 = new Ride("大摆锤", "侏罗纪公园", 5, operator5);

        // 添加至少 5 个访客到已完成游玩的集合
        ride2.addVisitorToHistory(new Visitor("Alice", 30, "Female", "T101", 2));
        ride2.addVisitorToHistory(new Visitor("Bob", 25, "Male", "T102", 1));
        ride2.addVisitorToHistory(new Visitor("Charlie", 20, "Male", "T103", 3));
        ride2.addVisitorToHistory(new Visitor("Diana", 28, "Female", "T104", 2));
        ride2.addVisitorToHistory(new Visitor("Eve", 22, "Female", "T105", 1));
        ride2.addVisitorToHistory(new Visitor("Grace", 26, "T106", "Regular", 3));
        ride2.addVisitorToHistory(new Visitor("Ivy", 22, "Man", "T107", 2));

        // 打印已完成游玩的访客
        System.out.println("已完成游玩的访客：");
        ride2.printRideHistory();

        // 将访客历史导出到文件
        String filename = "ride_history.txt";
        ride2.exportRideHistory(filename);
    }

    public void partSeven() {
        // 创建新的 Ride 对象
        Employee operator6 = new Employee("Jane", 29, "Female", "Operator", "Afternoon");
        Ride ride3 = new Ride("海盗船", "加勒比海盗", 6, operator6);

        // 导入上一部分导出的文件
        String filename = "ride_history.txt";
        ride3.importRideHistory(filename);

        // 打印 LinkedList 中的访客数量
        System.out.printf("导入的访客数量：%d%n", ride3.numberOfVisitors());

        // 打印 LinkedList 中的所有访客
        System.out.println("导入的访客详细信息：");
        ride3.printRideHistory();
    }

}