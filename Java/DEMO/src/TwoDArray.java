public class TwoDArray
{
    public static void spiralMatrix(int matrix[][])
    {
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix.length-1;

        while(startRow<=endRow && startCol<=endCol)
        {
            //top
            for(int i=startCol;i<=endCol;i++)
                System.out.print(matrix[startRow][i]+" ");
            //Right
            for(int j=startRow+1;j<=endRow;j++)
                System.out.print(matrix[j][endCol]+" ");
            //bottom
            for(int i=endCol-1;i>=startCol;i--){
            if(startRow==endRow)
                break;;
                System.out.print(matrix[endRow][i]+" ");}
            //left
            for(int j=endRow-1;j>=startRow+1;j--){
                if(startCol==endCol)
                    break;
                System.out.print(matrix[j][startCol]+" ");}

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();
    }
    public static int diagonalSum(int matrix[][])
    {
        int sum=0;
       /* for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(i==j)
                {sum+=matrix[i][j];}
                else if (i+j==matrix.length-1)
                {
                    sum+=matrix[i][j];
                }
            }
        }*/
        for(int i=0;i< matrix.length;i++)
        {
            //pd
              sum+=matrix[i][i];
             //sd
            if(i!=matrix.length-i-1);
            sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static boolean staircaseSearch(int matrix2[][],int key)
    {
        int row=0,col=matrix2.length-1;
        while (row<matrix2.length && col>=0)
        {
           if(matrix2[row][col]==key)
           {
               System.out.println("Key Found at ("+row+","+col+")");
               return true;
           }
           else if (key<matrix2[row][col])
        {
            col--;
        }
           else{
               row++;
           }

        }
        System.out.println("Key not Found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16,}};
        int key=33;
        int matrix2[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        //spiralMatrix(matrix);
        //System.out.println(diagonalSum(matrix));
        staircaseSearch(matrix2,key);
    }
}
