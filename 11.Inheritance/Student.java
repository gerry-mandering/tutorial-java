public class Student extends Person
{
	private String	studentId;
	private int		grade;
	private double	GPA;

	public String getStudentId()
	{
		return (studentId);
	}

	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}

	public int getGrade()
	{
		return (grade);
	}

	public void setGrade(int grade)
	{
		this.grade = grade;
	}

	public double getGPA()
	{
		return (GPA);
	}

	public void setGPA(int GPA)
	{
		this.GPA = GPA;
	}

	public Student(String name, int age, int height, int weight, String studentId, int grade, double GPA)
	{
		// 부모의 생성자를 실행함
		super(name, age, height, weight);
		this.studentId = studentId;
		this.grade = grade;
		this.GPA = GPA;
	}

	public void show()
	{
		System.out.println("--------------------");
		System.out.println("학생	이름	: " + getName());
		System.out.println("학생	나이	: " + getAge());
		System.out.println("학생	키	: " + getHeight());
		System.out.println("학생	몸무게	: " + getWeight());
		System.out.println("학생	아이디	: " + getStudentId());
		System.out.println("학생	학년	: " + getGrade());
		System.out.println("학생	학점	: " + getGPA());
		System.out.println("--------------------");
	}
}
