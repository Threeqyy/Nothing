package jike_week4;

abstract class Person {
    private final String name;
    private final int age;
    private final String birthday;
    public Person(String name,int age,String birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getBirthday() {
       return this.birthday;
    }
    public void eating(){
        System.out.println("干饭人干饭魂，干饭都是人上人");
    }
    public void getInfo(){
        System.out.println(this.getContent());
    }
    public abstract String getContent();
    public abstract void working();

}

class Student extends Person {
    public Student(String name,int age,String birthday) {
        super(name, age, birthday);
    }
    public String getContent(){
        return "姓名："+super.getName()+"  年龄："+super.getAge()+"  生日："+super.getBirthday();
    }
    public void working(){
        System.out.println("真的不想天天早八啊，救救孩子吧");
    }
}
class Programmer extends Person{
    public Programmer(String name,int age,String birthday) {
        super(name, age, birthday);
    }
    public String getContent() {
        return "姓名：" + super.getName() + "  年龄：" + super.getAge() + "  生日：" + super.getBirthday();
    }
    public void working(){
        System.out.println("打代码使我快乐");
    }
}

public class Lv1 {
    public static void main(String[] args) {
        Student stu = new Student("覃韵怡",19,"1月29日"); // 实例化的是子类
        Programmer programmer = new Programmer("朱浩宇",20,"11月21日");
        stu.getInfo();
        stu.working();
        stu.eating();
        System.out.println("======================================");
        programmer.getInfo();
        programmer.working();
        programmer.eating();
    }
}