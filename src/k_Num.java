import java.util.ArrayList;
import java.util.Collections;

/**
 * k번째수
 */
public class k_Num {

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> cutting = new ArrayList<Integer>();
            for (int start = commands[i][0] - 1, end = commands[i][1] - 1; start <= end; start++) {
                cutting.add(array[start]);
            }
            Collections.sort(cutting);
            answer[i] = cutting.get(commands[i][2]-1); 

        }
        return answer;
    }

    public static void main(String[] args) {

        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        int[] test = solution(array, commands);

        for (int i : test) {
        System.out.println(i);

        }

    }

}
