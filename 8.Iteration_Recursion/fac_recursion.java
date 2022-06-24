import java.util.Scanner;

public class fac_recursion
{
	public static int fac(int number)
	{
		if (number == 0)
			return (1);
		else
			return (number * fac(number - 1));
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
