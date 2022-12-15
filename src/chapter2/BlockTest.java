package chapter2;

public class BlockTest {

    public static void main(String[] args) {
        int x, y;
        y = 60;
        for (x = 0; x < 30; x=x+2){
            System.out.println("x:" + x);
            System.out.println("y" + y);
            y = y - 2;
        }
    }
}