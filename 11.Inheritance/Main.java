public class Main
{
	public static void main(String[] args)
	{
		Student student1 = new Student("홍길동", 20, 175, 70, "20180894", 1, 4.5);
		Student student2 = new Student("김민석", 24, 174, 60, "20180894", 2, 4.1);
		Teacher teacher1 = new Teacher("Jhon Snow", 33, 176, 77, "ABC203", 3000000, 5);

		Student[] students = new Student[100];

		for (int i = 0; i < 100; i++)
		{
			students[i] = new Student("가나다", 17, 173, 70, i + "", 1, 3.0);
			students[i].show();
		}

		student1.show();
		student2.show();
		teacher1.show();
	}
}
