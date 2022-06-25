import java.util.Random;

public class random_10X10
{
	public static void main(String[] args)
	{
		Random rd = new Random();
		int[][] arr = new int[10][10];

		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				arr[i][j] = rd.nextInt(100) + 1;
				System.out.printf("%3d", arr[i][j]);
				if (j != 9)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
