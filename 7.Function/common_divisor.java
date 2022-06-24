import java.util.Scanner;

public class common_divisor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int	num1, num2;
		int	greatest_common_divisor;

		System.out.print("num1을 입력하시오: ");
		num1 = sc.nextInt();
		System.out.print("num2를 입력하시오: ");
		num2 = sc.nextInt();

		greatest_common_divisor = find_greatest_common_divisor(num1, num2);
		System.out.println("두 수의 최대 공약수는 " + greatest_common_divisor + "입니다.");
	}

	static int find_greatest_common_divisor(int num1, int num2)
	{
		int common_divisor = num1 < num2 ? num1 : num2;

		while (common_divisor >= 1)
		{
			if (num1 % common_divisor == 0 && num2 % common_divisor == 0)
				return (common_divisor);
			common_divisor--;
		}
		// 오류시 0 반환
		return (0);
	}
}
