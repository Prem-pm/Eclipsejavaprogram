package logesstellarday3;

import java.util.*;
import java.lang.*;
import java.io.*;
class sum{
    
    final static float PIE = 3.14f;
    static int s_x, s_y, s_z;
    
    public static void main(String[] args) {
        
        int i, N, x, y, z;
        int arr[] = new int[50];
        float sum = 0.0f;
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        N = 3 * N;
        
        for(i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        
        s_x = arr[0];
        s_y = arr[1];
        s_z = arr[2];
        
        for(i = 3; i < N ; i += 3){
            sum += shortDist(arr[i], arr[i+1], arr[i+2]);
        }
        System.out.printf("%.2f", sum);
    }
    
    private static float shortDist(int x, int y, int z) {
        
        float dis;
     // check if the Z-axis and any other one axis are the same.
        if(z == s_z && (y == s_y || x == s_x ) && s_z != 0){
            
            //check if the x axis of next co-ordinate is same
            if(x != s_x){
                dis = (2 * PIE * (Math.abs(x - s_x))) / 6.0f;
            }
            
            //check if the y axis of next co-ordinate is same
            else{
                dis = (2 * PIE * (Math.abs(y - s_y))) / 6.0f;
            }
        }
        else{
            dis = (int)(Math.sqrt(Math.pow(x - s_x, 2) + Math.pow(y - s_y, 2)) + Math.abs(z - s_z));
        }
        s_x = x;
        s_y = y;
        s_z = z;
        return dis;
    }
}
