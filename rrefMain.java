import java.util.Arrays;
import java.util.Scanner;

class rrefMain
{
	public static void main(String[] args)
	{
		
		int column = 0;
		int row = 0;
		int next = 1;
		
		RREF rref = new RREF();
		while(next == 1)
		{
			Scanner scInt = new Scanner(System.in);
			System.out.print("column: ");
			column = scInt.nextInt();
			System.out.print("row: ");
			row = scInt.nextInt();
			
			double[][] matrix = new double[row][column];
			System.out.println("請逐列輸入矩陣(數字間用空白隔開):");
			for(int i = 0; i < row; i++)
			{
				Scanner sc = new Scanner(System.in);
				String AColumn = sc.nextLine();
				String[] columnArr = AColumn.split(" ");
				for(int j = 0; j < column; j++)
				{
					matrix[i][j] = Double.parseDouble(columnArr[j]);
				}
			}
			System.out.println();
			
			for(int i = 0; i < row; i++)
			{
				rref.cursorEntry(matrix, i);
				rref.divideM(matrix, i);
				rref.eliminateM(matrix, i);
				rref.printM(matrix);
				
			}
			
			System.out.print("(1)繼續 (0)結束 : ");
			next = scInt.nextInt();
			
		}
	}
}