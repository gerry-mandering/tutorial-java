import java.util.Scanner;

public class max
{
	public static int find_max(int[] arr, int count)
	{
		int max = arr[0];

		for (int i = 1; i < count; i++)
		{
			if (arr[i] > max)
				max = arr[i];
		}
		return (max);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count;
		int[] arr = null;

		System.out.print("몇 개의 숫자를 입력할지 입력하시오: ");
		count = sc.nextInt();

		arr = new int[count];

		for (int i = 0; i < count; i++)
		{
			System.out.print((i + 1) + "번째 숫자를 입력하시오: ");
			arr[i] = sc.nextInt();
		}

		System.out.println("최댓값은 " + find_max(arr, count) + "입니다.");
	}
}
