import java.util.*;
public class Test0{
    public static void main(String[] args) {
        double[][] arr={
            {1.2},
            {2.34,5.67},
            {1.234,5.678,9.123}
        };
        for(double[] i:arr){
            for(double j:i){
                System.out.print(j+"\t");
            }
        }
        System.out.println("\n"+Arrays.deepToString(arr));
       
    }
}