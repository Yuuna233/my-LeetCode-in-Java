import java.util.*;

public class test1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }

        for(int[] a:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        } 
        System.out.println(Arrays.deepToString(arr));
        in.close();
    }
}