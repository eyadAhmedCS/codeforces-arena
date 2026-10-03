
public class euclideanAlgorithm {

    public static int euclidean(int a, int b) {
        if (b != 0) {
            return euclidean(b, a % b);
        } else {
            return a;
        }
    }

}
