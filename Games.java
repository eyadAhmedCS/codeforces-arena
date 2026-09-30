
import java.util.Scanner;

public class Games {

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

    // Integer, Integer, (Integer...) -> Integer
    // given friends number and height of wall and height of each person
    // produce minimum width of road. every normal one take 1 width and the bent  take 2
    //   public static int minWidth(int numOfFriends, int fenceHeight, int[] heights) {
    //      return 0;
    //   }
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
