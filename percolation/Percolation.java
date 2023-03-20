import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {
    private static int[][] direction = {
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1}
    };
    private boolean[] grid;
    private WeightedQuickUnionUF block;
    private int size;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException(
                "Initializing with a non-positive value of board size"
        );
        size = n;
        grid = new boolean[n * n];
        block = new WeightedQuickUnionUF(n * n);
        for (int i = 0; i < n*n; i++) {
            grid[i] = false;
        }
    }

    private boolean safeBoundsCheck(int row, int col) {
        return (row > 0 && row <= size && col > 0 && col <= size);
    }

    private void boundsCheck(int row, int col) {
        if (!safeBoundsCheck(row, col)) {
            throw new IllegalArgumentException(
                    "Grid access out of bound."
            );
        }
    }

    private int loc2index(int row, int col) {
        boundsCheck(row, col);
        return ((row-1)*size+col-1);
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        boundsCheck(row, col);
        if (!isOpen(row, col)) {
            grid[loc2index(row, col)] = true;
            for (int i = 0; i < 4; i++) {
                if (
                        safeBoundsCheck(row + direction[i][0], col + direction[i][1])
                        && isOpen(row + direction[i][0], col + direction[i][1])
                ) {
                    block.union();
                }
            }
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
    }

    // returns the number of open sites
    public int numberOfOpenSites() {

    }

    // does the system percolate?
    public boolean percolates() {

    }

    // test client (optional)
    public static void main(String[] args) {

    }
}
