package jike_week2;

public class Lv2 {
    public static void main(String[] args) {
        System.out.println(Lv2.add(1000));
    }

    public static int add(int n){
        if(n>1){
            return add(n-1)+n;
        }else{
            return n;
        }
    }
}