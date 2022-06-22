public class ascii
{
	public static void main(String[] args)
	{
		char alphabet = 'a';

		while (alphabet <= 'z')
			System.out.println(alphabet++);

		for (char i='a'; i<='z'; i++)
		{
			System.out.print(i + " ");
		}
	}
}
