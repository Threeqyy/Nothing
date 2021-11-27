package jike_week3;

class Student{
    private String numb;
    private String name;
    private String sex;
    private int java;
    public void tell(){
        System.out.println("学号："+getNumb()+"    姓名："+getName()+"      性别："+getSex()+"    Java成绩："+getJava());
    }
    public Student(String numb,String name,String sex,int java){
        this.setNumb(numb);
        this.setName(name);
        this.setSex(sex);
        this.setJava(java);

    }
    public void setNumb(String m){
        numb = m;
    }
    public void setName(String n){
        name = n;
    }
    public void setSex(String s){
        sex = s;
    }
    public void setJava(int j){
        java = j;
    }
    public String getNumb(){
        return numb;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getJava(){
        return java;
    }
}

public class Lv3 {
    public static void main(String[] args) {
        Student[] stu = new Student[5];
        stu[0] = new Student("001", "钟智", "男", 96);
        stu[1] = new Student("002", "江鸿磊", "男", 97);
        stu[2] = new Student("003", "黄大航", "男", 94);
        stu[3] = new Student("004", "萌新", "未知", 94);
        stu[4] = new Student("005", "落樱", "未知", 92);
        for (Student stus : stu) {
            stus.tell();
        }
        System.out.println("=========================================================");

        int max = stu[0].getJava();
        int min = stu[0].getJava();
        float average = 0;
        int sum = 0;

        for(int i = 0; i < stu.length; i++){
            max = Math.max(stu[i].getJava(), max);
            min = Math.min(stu[i].getJava(), min);
            sum = sum + stu[i].getJava();
        }
        average = sum/ stu.length;


        System.out.println("Java语言成绩的最大值为："+max);
        System.out.println("Java语言成绩的最小值为："+min);
        System.out.println("五位同学Java语言的平均成绩为："+average);
    }
}