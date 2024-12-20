public class Person {
    private String name;
    private int age;
    private String gender;// 创建一个抽象类，不创建实例对象，提高代码的设计层次和可读性。

    // 默认构造函数
    public Person() {
    }

    // 带参数的构造函数
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter 和 Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
