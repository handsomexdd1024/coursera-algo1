import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.util.NoSuchElementException;

public class RandomWord {
    public static void main(String[] args) {
        String word = "", tmp;
        int count = 0;
//        while (true) {
////            try {
////                tmp = StdIn.readString();
////                if (StdRandom.bernoulli(1.0/(++count))) {
////                    word = tmp;
////                }
////            } catch (NoSuchElementException e) {
////                break;
////            }
//
//        }
        while (!StdIn.isEmpty()) {
            tmp = StdIn.readString();
            if (StdRandom.bernoulli(1.0/(++count))) {
                word = tmp;
            }
        }
        StdOut.println(word);
    }
}
