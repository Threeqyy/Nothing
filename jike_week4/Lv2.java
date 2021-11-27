package jike_week4;

class Student2 implements Comparable<Student2> {
    private final String name;
    private final int physics;
    private final int math;
    private final int java;
    public Student2(String name, int physics, int math, int java) {
        this.name = name;
        this.physics = physics;
        this.math = math;
        this.java = java;
    }

    public String toString() {
        return this.name + "\t\t" + this.physics + "\t\t" + this.math + "\t\t" + this.java;
    }

    public int compareTo(Student2 stu) {
        if (this.physics > stu.physics) {
            return -1;
        } else if (this.physics < stu.physics) {
            return 1;
        } else {
            if (this.math < stu.math) {
                return 1;
            } else if (this.math > stu.math) {
                return -1;
            } else {
                if (this.java < stu.java) {
                    return -1;
                } else if (this.java > stu.java) {
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }
}
public class Lv2 {
    public static void main (String[] args){
        Student2[] stu = new Student2[5];
        stu[0] = new Student2("钟智 ", 76, 86, 96);
        stu[1] = new Student2("江鸿磊", 74, 78, 97);
        stu[2] = new Student2("黄大航",  97,89, 94);
        stu[3] = new Student2("萌新 ", 89, 78, 94);
        stu[4] = new Student2("朱浩宇", 76, 75, 92);
        java.util.Arrays.sort(stu);
        for(int i = 0; i < stu.length; i++){
            System.out.println(stu[i]);
        }
    }
}