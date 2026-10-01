
import java.util.Scanner;

public class VanyaFence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numF = in.nextInt();
        int h = in.nextInt();
        int[] list = new int[numF];

        for (int i = 0; i < numF; i++) {
            list[i] = in.nextInt();
        }
        System.out.println(minWidth(numF, h, list));
    }

    public static int minWidth(int numOfFriends, int fenceHeight, int[] heights) {
        if (numOfFriends == 0) {
            return 0;
        }
        int width = 0;

        for (int i = 0; i < numOfFriends; i++) {
            width += (heights[i] <= fenceHeight) ? 1 : 2;
        }

        return width;
    }
}
