import java.util.Scanner;

public class array
{
	public static int cmp(int a, int b)
	{
		return (a > b ? 1 : 0);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int	size = 0;
		int temp = 0;

		System.out.print("생성할 배열의 크기를 입력하시오: ");
		size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력하시오: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size - 1; i++)
		{
			for (int j = 0; j < size - i - 1; j++)
			{
				if (cmp(arr[j], arr[j + 1]) == 1)
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < size; i++)
		{
			if (i < size - 1)
				System.out.print(arr[i] + " ");
			else
				System.out.println(arr[i]);
		}
	}
}
