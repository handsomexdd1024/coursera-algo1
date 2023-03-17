import edu.princeton.cs.algs4.StdOut;
public class HelloGoodbye {
    public static void main(String[] args) {
        String hello = "Hello " + args[0] + " and " + args[1] + ".";
        String bye = "Goodbye " + args[1] + " and " + args[0] + ".";
        StdOut.println(hello);
        StdOut.println(bye);
    }
}
