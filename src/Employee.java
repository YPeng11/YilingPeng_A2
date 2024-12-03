public class Employee extends Person {
    private String employeeID;
    private String position; // 添加一个职位属性

    // 默认构造函数
    public Employee() {
    }

    // 带参数的构造函数
    public Employee(String name, int age, String gender, String employeeID, String position) {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.position = position;
    }

    // Getter 和 Setter
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
