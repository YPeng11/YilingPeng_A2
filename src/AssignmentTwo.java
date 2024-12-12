public class AssignmentTwo {
    // 创建 Visitor 对象
    private Visitor v1 = new Visitor("Aura", 19, "Female", "001", 2);
    private Visitor v2 = new Visitor("Booz", 52, "Male", "002", 1);
    private Visitor v3 = new Visitor("Chsids", 34, "Male", "003", 3);
    private Visitor v4 = new Visitor("Dave", 28, "Female", "004", 2);
    private Visitor v5 = new Visitor("Elsopyia", 42, "Female", "005", 1);
    private Visitor v6 = new Visitor("Frank", 27, "Male", "006", 4);
    private Visitor v7 = new Visitor("Good", 9, "Female", "007", 1);
    private Visitor v8 = new Visitor("Hire", 35, "Male", "008", 3);
    private Visitor v9 = new Visitor("Iric", 67, "Male", "009", 5);
    private Visitor v10 = new Visitor("Jean", 29, "Female", "010", 2);

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
        Employee operator1 = new Employee("王小一", 35, "Male", "E002", "Ride Operator");

        // 创建 Ride 对象
        Ride ride1 = new Ride("摩天轮", "西游记", 4, operator1);

        // 将访客添加到队列
        Visitor[] visitors = { v1, v2, v3, v4, v5 };
        for (Visitor visitor : visitors) {
            ride1.addVisitorToQueue(visitor);
        }

        // 打印队列中的访客
        System.out.println("正在等待的游客:");
        ride1.printQueue();

        // 从队列中移除一个访客
        System.out.println("\n已完成等待:");
        ride1.removeVisitorFromQueue();

        // 再次打印队列中的访客
        System.out.println("\n当前所剩游客队列:");
        ride1.printQueue();
    }

    public void partFourA() {
        // 创建 Ride 对象
        Employee operator2 = new Employee("John", 35, "Male", "E002", "Ride Operator");
        Ride ride2 = new Ride("Roller Coaster", "Transformers", 3, operator2);

        // 向队列中添加访客
        Visitor[] visitors = { v1, v2, v3, v4, v5 };
        for (Visitor visitor : visitors) {
            ride2.addVisitorToQueue(visitor);
        }

        // 从队列中移除访客并加入历史记录
        ride2.addVisitorToHistory(v1);
        ride2.removeVisitorFromQueue();
        ride2.addVisitorToHistory(v2);
        ride2.removeVisitorFromQueue();

        // 检查访客是否在骑行历史中
        ride2.checkVisitorFromHistory(v1);
        ride2.checkVisitorFromHistory(v3);

        // 打印骑行历史中的访客数量
        System.out.println("历史中游客的数量为: " + ride2.numberOfVisitors());

        // 打印骑行历史
        System.out.println("\n当前历史记录:");
        ride2.printRideHistory();
    }

    public void partFourB() {
        // 创建一个新的 Ride 对象
        Employee operator3 = new Employee("Ella", 35, "ella@example.com", "Operator", "Morning");
        Ride Ride3 = new Ride("Swing Ride", "Batman", 1, operator3);

        Visitor[] visitors = { v5, v4, v3, v2, v1 };
        for (Visitor visitor : visitors) {
            Ride3.addVisitorToHistory(visitor);
        }

        // 打印未排序的访客历史记录
        System.out.println("未排序前的队列:");
        Ride3.printRideHistory();

        // 对 rideHistory 进行排序
        Ride3.sortRideHistory();

        // 打印排序后的访客历史记录
        System.out.println("已排序队列:");
        Ride3.printRideHistory();
    }

    public void partFive() {
        // 创建新的 Ride 对象
        Employee operator4 = new Employee("John", 32, "john@example.com", "Operator", "Morning");
        Ride ride4 = new Ride("Ferris Wheel", "Yellow Man", 4, operator4);

        // 添加至少 10 名访客到队列
        Visitor[] visitors = { v1, v2, v3, v4, v5, v6, v7, v8, v9, v10 };
        for (Visitor visitor : visitors) {
            ride4.addVisitorToQueue(visitor);
        }
        // 打印等待队列
        System.out.println("开始前的队伍为:");
        ride4.printQueue();

        // 运行一个周期
        ride4.runOneCycle();

        // 打印运行后的队列
        System.out.println("一个项目周期的周期为" + ride4.getMaxRider() + ",\n运行一次后的队列为:");
        ride4.printQueue();

        // 打印骑行历史记录
        System.out.println("此时历史记录为:");
        ride4.printRideHistory();
    }

    public void partSix() {
        // 创建新的 Ride 对象
        Employee operator5 = new Employee("John", 32, "Man", "Operator", "Morning");
        Ride ride5 = new Ride("大摆锤", "侏罗纪公园", 5, operator5);

        // 添加至少 10 名访客到队列
        Visitor[] visitors = { v1, v2, v3, v4, v5, v6, v7, v8, v9, v10 };
        for (Visitor visitor : visitors) {
            ride5.addVisitorToHistory(visitor);
        }
        // 打印已完成游玩的访客
        System.out.println("已完成游玩的访客：");
        ride5.printRideHistory();

        // 将访客历史导出到文件
        String filename = "ride_history.txt";
        ride5.exportRideHistory(filename);
    }

    public void partSeven() {
        // 创建新的 Ride 对象
        Employee operator6 = new Employee("Jane", 29, "Female", "Operator", "Afternoon");
        Ride ride6 = new Ride("海盗船", "加勒比海盗", 6, operator6);

        // 导入上一部分导出的文件
        String filename = "ride_history.txt";
        ride6.importRideHistory(filename);

        // 打印 LinkedList 中的访客数量
        System.out.printf("导入的访客数量：%d%n", ride6.numberOfVisitors());

        // 打印 LinkedList 中的所有访客
        System.out.println("导入的访客详细信息：");
        ride6.printRideHistory();
    }

}