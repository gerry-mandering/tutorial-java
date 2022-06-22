public class variable
{
	final static double PI = 3.141592;	//상수
	final static int	INT_MAX = 2147483647;

	public static void main(String[] args)
	{
		int		r = 30;					//변수
		int		a = INT_MAX;
		int		intType = 100;
		double	doubleType = 150.5;
		String	stringType = "김민석";

		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		System.out.println(r * r * PI);
		System.out.println(a);
		System.out.println(a + 1);
	}
}
