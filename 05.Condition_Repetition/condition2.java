public class condition2
{
	public static void main(String[] args)
	{
		String	a = "Man";
		int		b = 0;

		if (a.equals("Man"))
		{
			System.out.println("남자 입니다.");
		}
		else
		{
			System.out.println("남자가 아닙니다.");
		}

		if (b == 3)
		{
			System.out.println("b는 3입니다.");
		}
		else
		{
			System.out.println("b는 3이 아닙니다.");
		}

		if (a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("남자이며 b는 0 입니다.");
		}
		else
		{
			System.out.println("거짓 입니다.");
		}
	}
}
