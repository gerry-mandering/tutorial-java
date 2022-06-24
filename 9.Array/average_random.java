import java.util.Random;

public class average_random
{
	public static double average(int[] arr)
	{
		double sum = 0;

		for (int i = 0; i < 100; i++)
		{
			sum += arr[i];
		}
		return (sum / 100.0);
	}

	public static void main(String[] args)
	{
		//100명의 키 150 ~ 200
		Random rd = new Random();
		int[] arr = new int[100];
		
		for (int i = 0; i < 100; i++)
		{
			//arr[i] = rd.nextInt(51) + 150;
			arr[i] = (int)(Math.random() * 51 + 150);
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}

		System.out.println("사이즈 100의 배열 평균은 " + average(arr) + "입니다.");
	}
}
