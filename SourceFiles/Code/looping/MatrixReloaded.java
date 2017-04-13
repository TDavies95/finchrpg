import java.lang.*;
import java.util.*;
public class MatrixReloaded{
    public static void main(String [] args){
        
     
        int[][] n = new int[4][4];
        int sum = 0;
        
        for(int j = 0; j<n.length;j++){
        for(int i = 0; i<n[j].length; i++){
            sum+=n[j][i];
        }
        }
        
           System.out.println(sum);
        
        
        
        
    }
}