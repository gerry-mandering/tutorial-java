import java.util.Scanner;

public class divisor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int	number, index, divisor;

		System.out.print("약수를 구하고 싶은 숫자를 입력하시오: ");
		number = sc.nextInt();
		System.out.print("몇 번째 약수를 구하고 싶은지 입력하시오: ");
		index = sc.nextInt();

		divisor = find_divisor(number, index);
		if (divisor == 0)
			System.out.println(index + "번째 약수는 없습니다.");
		else
			System.out.println(index + "번째 약수는 " + divisor + "입니다.");
	}

	static int find_divisor(int number, int index)
	{
		int count = 0;

		for (int i = 1; i <= number; i++)
		{
			if (number % i == 0)
				count++;
			if (count == index)
				return (i);
		}
		// 0 입력시
		return (0);
	}
}
