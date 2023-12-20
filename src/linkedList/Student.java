package linkedList;

public class Student {
    private String name;
    private String phone;
    private int age;
    private ClassRoom classRoom;

    public Student() {
    }

    public Student(String name, String phone, int age, ClassRoom classRoom) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.classRoom = classRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
