public class Visitor extends Person {
    private String visitorID;
    private int membershipStatus;

    // 默认构造函数
    public Visitor() {
    }

    // 带参数的构造函数
    public Visitor(String name, int age, String gender, String visitorID, int membershipStatus) {
        super(name, age, gender); // 调用父类的构造函数
        this.visitorID = visitorID;
        this.membershipStatus = membershipStatus;
    }

    // Getter 和 Setter
    public String getvisitorID() {
        return visitorID;
    }

    public void setvisitorID(String visitorID) {
        this.visitorID = visitorID;
    }

    public int getmembershipStatus() {
        return membershipStatus;
    }

    public void setmembershipStatus(int membershipStatus) {
        this.membershipStatus = membershipStatus;
    }
}
