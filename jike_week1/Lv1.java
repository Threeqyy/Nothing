package jike_week1;
import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个[0,24]内的数字");
        int i = sc.nextInt();
        if (i > 7 && i <= 18) {
            System.out.println("现在是白天");
        } else if (i >= 18 && i <= 24) {
            System.out.println("现在是晚上");
        } else if (i >= 0 && i < 7) {
            System.out.println("现在是晚上");
        }


    }
}