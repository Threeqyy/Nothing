package jike_week1;
import java.util.Arrays;

public class Lv3 {
    public static void main(String[] args){
        int[] a = {0,5,4,1,0,6,11};
        int[] b = {3,9,2,10,8,7};
        int[] AB = addArrays(a , b);
        System.out.println(Arrays.toString(AB));
    }
    public static int[] addArrays(int[] a,int[] b){
        int[] AB = new int[a.length + b.length];
        System.arraycopy(a,0,AB,0,a.length);
        System.arraycopy(b,0,AB,a.length,b.length);
        Arrays.sort(AB);
        return AB;
    }
}
