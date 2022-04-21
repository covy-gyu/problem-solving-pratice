
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FailureRate {
    public static int[] solution(int N, int[] stages) {
        int[] challenger = new int[N + 2];
 
         for (int i = 0; i < stages.length; i++) {
             challenger[stages[i]]++;
         }

         HashMap<Integer, Double> map = new HashMap<>();
    
         int userTotal = stages.length;

         double failRate;

        for (int i = 1; i < N+1; i++) {
            
             if (userTotal == 0) {
                 failRate = 0;
             } else {
                 failRate = (double) challenger[i] / userTotal;
                 userTotal -= challenger[i];
                }
                map.put(i, failRate);
            }
 
         ArrayList<Integer> result = new ArrayList<>(map.keySet());
         Collections.sort(result, (e1, e2) -> (map.get(e2).compareTo(map.get(e1))));
 
 
 
         int[] answer = new int[result.size()];
 
         for (int i = 0; i < answer.length; i++) {
             answer[i] = result.get(i).intValue();
            System.out.println(answer[i]);

         }
         return answer;
     }
    // public static void main(String[] args) throws Exception {
    //     int[] stages = {11,11,1,11,11};
    //     int N=10;
    //     int[] ans = solution(N, stages);

    // }

   
}
