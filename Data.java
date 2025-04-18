public class Data 
{
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data(int[][] arr)
    {
        grid = arr;
    }

    public Data(int rows, int cols)
    {
        grid = new int[rows][cols];
    }

    public void repopulate()
    {
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                int random = 0;
                while(random % 10 != 0 || random % 100 == 0) random = (int) (Math.random() * MAX + 1);
                grid[row][col] = random;
            }
        }
    }

    public int countIncreasingCols() 
    {
        int count = 0;
        for (int col = 0; col < grid[0].length; col++)
        {
            boolean ascend = true;
            for (int row = 1; row < grid.length; row++)
            {
                if (grid[row-1][col] > grid[row][col])
                { 
                    ascend = false;
                }
            }
            if(ascend) count++;
        }
        return count;
    }

    public String toString()
    {
        String s = "";
        for (int[] row : grid)
        {
            for (int col : row) s += col + " ";
            s += "\n";
        }
        return s;
    }
}


