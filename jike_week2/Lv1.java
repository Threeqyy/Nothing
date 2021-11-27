package jike_week2;

public class Lv1 {
    public static void main(String[] args){
        int[] a = {1,3,4,5,0,6,0,6,6,5,0,4,9,12,-15,100,55};
        for(int i = 1;i < a.length;i++){
            for(int j = 0;j < a.length;j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("第"+i+"次排序后：");
            for(int k =0;k < a.length;k++){
                System.out.print(a[k]+"\t");
            }
            System.out.println("");
        }
    }
}