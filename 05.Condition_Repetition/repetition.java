public class repetition
{
	public static void main(String[] args)
	{
		int	i = 0, sum = 0;

		while (i <= 1000)
		{
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");
	}
}
