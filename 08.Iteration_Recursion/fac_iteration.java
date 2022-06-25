import java.util.Scanner;

public class fac_iteration
{
	public static int fac(int num)
	{
		int	result = 1;
		
		if (num == 0)
			return (result);
		for (int i = 1; i <= num; i++)
			result *= i;
		return (result);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int	number;

		while (true)
		{
			System.out.print("0 또는 양의 정수를 입력하시오: ");
			number = sc.nextInt();
			if (number < 0)
				System.out.print("잘못 입력하셨습니다. 다시 ");
			else
				break;
		}

		System.out.println(number + "! = " + fac(number) + "입니다.");
	}
}
