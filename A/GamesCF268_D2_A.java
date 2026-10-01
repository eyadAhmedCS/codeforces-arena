
import java.util.HashMap;
import java.util.Scanner;

public class GamesCF268_D2_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] homeColors = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            homeColors[i] = in.nextInt();
            int awayUni = in.nextInt();

            if (map.containsKey(awayUni)) {
                map.replace(awayUni, map.get(awayUni) + 1);
            } else {
                map.put(awayUni, 1);
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += map.getOrDefault(homeColors[i], 0);
        }

        System.out.println(sum);
    }
}
