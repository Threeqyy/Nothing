package jike_week3;

class Cylinder{

    int radius = 10;
    int height = 5;
    double pi = 3.14;
    public void surfaceArea(){
        double s = 2*pi*radius*height+2*pi*radius*radius;
        System.out.println(s);
    }
    public void volume(){
        double v = pi*radius*radius*height;
        System.out.println(v);
    }
}

public class Lv2 {
    public static void main(String[] args){
        Cylinder cy1 = new Cylinder();
        System.out.print("圆柱体的表面积为：");
        cy1.surfaceArea();
        System.out.print("圆柱体的体积为：");
        cy1.volume();
    }


}
