import java.util.Scanner;

public class last_word
{
	public static boolean is_white_space(char input)
	{
		if ((input >= 9 && 13 >= input) || input == ' ')
			return (true);
		else
			return (false);
	}

	public static String find_last_word(String str)
	{
		String	last_word;
		int		i = str.length() - 1;
		int		start, end;

		while (i >= 0)
		{
			if (is_white_space(str.charAt(i)))
				i--;
			else
				break;
		}
		end = i + 1;
		while (i >= 0)
		{
			if (is_white_space(str.charAt(i)))
				break;
			i--;
		}
		start = i + 1;
		last_word = str.substring(start, end);
		return (last_word);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.print("문자열을 입력하시오: ");
		str = sc.nextLine();

		System.out.println("해당 문자열의 마지막 단어는 " + find_last_word(str) + "입니다.");
	}
}
