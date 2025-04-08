public class Data 
{
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data(int rows, int cols)
    {
        grid = new int[rows][cols];
    }

    public int[][] getGrid()
    {
        return grid;
    }

    public void repopulate()
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int o = 0; o < grid[0].length; o++)
            {
                grid[i][o] = MAX;
            }
        }
    }

    public int countIncreasingCols() 
    {
        return 0;
    }
}


