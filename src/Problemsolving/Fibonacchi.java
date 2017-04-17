package Problemsolving;

/**
 * Created by kafiluddin on 4/16/17.
 */
public class Fibonacchi {
    public static void main(String[] args) {


        int prev = 0;
        int next = 1;
        for (int i = 0; i < 45; i++) {
            System.out.println(prev);
            prev=next-prev;
            next=next+prev;

        }
    }
}
