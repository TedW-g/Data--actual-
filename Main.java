public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Data.MAX);
        Data dat = new Data(3,3);
        System.out.println(dat);
        dat.repopulate();
        System.out.println(dat);
        
        int[][] grid1 =
        {
            {10,50,40},
            {20,40,20},
            {30,50,30}
        };
        dat = new Data(grid1);
        System.out.println(dat);
        System.out.println(dat.countIncreasingCols());
        System.out.println();

        int[][] grid2 = 
        {
            {10,540,440,440},
            {220,450,440,190}
        };
        dat = new Data(grid2);
        System.out.println(dat);
        System.out.println(dat.countIncreasingCols());
    }
}