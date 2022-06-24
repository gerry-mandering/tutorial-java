import java.util.Scanner;

public class fibo_iteration
{
	public static int fibo(int index)
	{
		int n1 = 0;
		int n2 = 1;
		int	result = 0;

		if (index == 0)
			return (n1);
		else if (index == 1)
			return (n2);

		for (int i = 1; i < index; i++)
		{
			result = n1 + n2;
			n1 = n2;
			n2 = result;
		}
		return (result);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int index;

		System.out.println("피보나치 수열 : 0, 1, 1, 2, 3, 5, 8 ...");
		System.out.print("피보나치 수열의 몇 번째 숫자를 구하고 싶은지 입력하시오: ");
		index = sc.nextInt();

		System.out.println("해당 숫자는 " + fibo(index) + "입니다.");
	}
}
