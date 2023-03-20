public class Percolation {
    private boolean[][] grid;
    private int size;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException(
                "Creating a percolation with negative size value"
        );
        size = n;
        grid = new boolean[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                grid[row][col] = false;
            }
        }
    }

    private boolean boundsCheck(int row, int col) {
        return (row >= 1 && row <= size && col >= 1 && col <= size);
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (!boundsCheck(row, col)) throw new IllegalArgumentException(
                "Grid access out of bound."
        );
        if (!isOpen(row, col)) {
            grid[row - 1][col - 1] = true;
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (!boundsCheck(row, col)) throw new IllegalArgumentException(
                "Grid access out of bound."
        );
        return grid[row - 1][col - 1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (!boundsCheck(row, col)) throw new IllegalArgumentException(
                "Grid acces out of bound."
        );

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
