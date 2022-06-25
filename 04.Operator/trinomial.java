public class trinomial
{
	public static void main(String[] args)
	{
		int	x = 50;
		int	y = 60;

		System.out.println("최댓값은 " + max(x, y) + "입니다.");
	}

	static int	max(int a, int b)
	{
		return (a > b ? a : b);
	}
}
