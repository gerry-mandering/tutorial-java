import java.util.Scanner;

public class fibo_recursion
{
	public static int fibo(int index)
	{
		if (index == 0)
			return (0);
		else if (index == 1 || index == 2)
			return (1);
		else
			return (fibo(index - 1) + fibo(index - 2));
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
