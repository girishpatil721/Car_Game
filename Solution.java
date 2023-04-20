import java.util.* ;
public class Solution {
  
    public static int find(int n, int[] position, int[] speed, int d) {
        
         int ans = 0;
    
        int[][] cars = new int[n][4];

        // Sorting the cars by the position they have to cover.
        for(int i = 0; i < n; i++){
            cars[i] = new int[]{d - position[i], speed[i]};
        }
        
        Arrays.sort(cars);

        // Finding the number of unique arriving time of the cars.
        float ma = 0;
        float eps = 1e-9f;
        for (int i = 0; i < n; i++){
            float t = (float)cars[i][0] / cars[i][1];
            if (t-ma > eps){
                ans += 1;
                ma = t;
            }
        }
        return ans;

    }
}