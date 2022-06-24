public class Teacher extends Person
{
	private String	teacherId;
	private	int		monthSalary;
	private int		workYear;

	public String getTeacherId()
	{
		return (teacherId);
	}

	public void setTeacherId(String teacherId)
	{
		this.teacherId = teacherId;
	}

	public int getMonthSalary()
	{
		return (monthSalary);
	}

	public void setMonthSalary(int monthSalary)
	{
		this.monthSalary = monthSalary;
	}

	public int getWorkYear()
	{
		return (workYear);
	}

	public void setWorkYear(int workYear)
	{
		this.workYear = workYear;
	}

	public Teacher(String name, int age, int height, int weight, String teacherId, int monthSalary, int workYear)
	{
		super(name, age, height, weight);
		this.teacherId = teacherId;
		this.monthSalary = monthSalary;
		this.workYear = workYear;
	}

	public void show()
	{
		System.out.println("--------------------");
		System.out.println("교사	이름	: " + getName());
		System.out.println("교사	나이	: " + getAge());
		System.out.println("교사	키	: " + getHeight());
		System.out.println("교사	몸무게	: " + getWeight());
		System.out.println("교사	아이디	: " + getTeacherId());
		System.out.println("교사	월급	: " + getMonthSalary());
		System.out.println("교사	연차	: " + getWorkYear());
		System.out.println("--------------------");
	}
}
