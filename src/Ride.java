public class Ride {
    private String rideName;
    private int theme;
    private Employee operator; // 员工类作为操作员

    // 默认构造函数
    public Ride() {
    }

    // 带参数的构造函数
    public Ride(String rideName, int theme, Employee operator) {
        this.rideName = rideName;
        this.theme = theme;
        this.operator = operator;
    }

    // Getter 和 Setter
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int gettheme() {
        return theme;
    }

    public void settheme(int theme) {
        this.theme = theme;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }
}
