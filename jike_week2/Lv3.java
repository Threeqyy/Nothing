package jike_week2;

public class Lv3 {
    public static void main(String[] args){
        int[][] a = {{5,6,78,1},{7,54,15,6},{7,45,16,12},{17,2,11,-15}};
        int[][] b = {{8,13,19,-5},{45,-8,1,45}, {33,4,6,27},{14,22,75,31}};
        multiply(a,b);
    }
    static void multiply(int[][] a,int[][] b){
        int[][] AB = new int[4][4];
        int temp = 0;
        for(int i = 0; i < AB.length; i++){
            for(int j = 0; j < AB.length; j++){
                for(int k = 0; k < AB.length; k++){
                    temp = temp + a[i][k]*b[k][j];
                }
                AB[i][j] = temp;
            }
        }
        for(int i = 0; i < AB.length; i++){
            for(int j = 0; j < AB.length; j++){
                System.out.print(AB[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
