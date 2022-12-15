package orinak1;

public class ForTest1 {
    public static void main(String[] args) {
        int x, y;
        y = 40;
        for (x = 0; x < 20; x = x + 2) {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            y = y - 2;
        }

    }
}