package jike_week1;

public class Lv3Plus {
    public static void main(String[] args) {
        int[][] a = {{6, 8}, {10, 5}, {15, 10}, {12, 8}};
        int[][] b = {{1, 8}, {3, 9}, {2, 17}, {9, 8}, {13, 7}};

        addArrays(a,b);
    }

    //把a，b两个二维数组合并成一个二维数组并输出
    public static void addArrays(int[][] a,int[][] b){
        int[][] AB = new int[9][2];
        System.arraycopy(a,0,AB,0,a.length);
        System.arraycopy(b,0,AB,a.length,b.length);

        //利用冒泡算法排序
        for(int i = 0;i < AB.length-1;i++){
            for(int j = 0;j < AB.length-i-1;j++){
                if(AB[j][0]>AB[j+1][0]){
                    int[][] temp = new int[1][2];
                    temp[0] = AB[j];
                    AB[j] = AB[j+1];
                    AB[j+1] = temp[0];
                }
            }
        }
        for(int i=0; i<AB.length; i++) {
            for (int j = 0; j < AB[i].length; j++) {
                System.out.print(AB[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}