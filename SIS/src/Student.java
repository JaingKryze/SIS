import java.util.ArrayList;
public class Student {
	private String firstName;
	private String lastName;
	private double GPA;
	private Course course1;
	private Course course2;
	private Course course3;
public Student(String f, String l, double g, Course a, Course b, Course c)
	{
	firstName = f;
	lastName = l;
	GPA = g;
	course1 = a;
	course2 = b;
	course3 = c; 
	}
public static void addStudent(String firstName, String lastName, String course1Name, String course1LetterGrade, String course2Name, String course2LetterGrade, String course3Name, String course3LetterGrade)
	{
	StudentInformationSystem.studentList.add(new Student(firstName, lastName, (double)0, new Course(1, course1Name, course1LetterGrade), new Course(2, course2Name, course2LetterGrade), new Course(3, course3Name, course3LetterGrade)));
	}
public String getFirstName()
	{
	return firstName;
	}
public String getLastName()
	{
	return lastName;
	}
public double getGPA()
	{
	return GPA;
	}
public Class getCourse1()
	{
	return course1;
	}
public Class getCourse2()
	{
	return course2;
	}
public Class getCourse3()
	{
	return course3;
	}
public void setFirstName(String firstName)
	{
	this.firstName = firstName;
	}
public void setLastName(String lastName)
	{
	this.lastName = lastName;
	}
public void setGPA(double gPA)
	{
	GPA = gPA;
	}
public void setCourse1(Course course1)
	{
	this.course1 = course1;
	}
public void setCourse2(Course course2)
	{
	this.course2 = course2;
	}
public void setCourse3(Course course3)
	{
	this.course3 = course3;
	}
public static void deleteStudent(int studentNum)
	{
	StudentInformationSystem.studentList.get(studentNum-1).remove();
	}

public double calculateGPA(int studentNum)
	{
	String a = StudentInformationSystem.studentList.get(studentNum-1).getCourse1().getLetterGrade().substring(0,1);
	if(a == "A")
		{
		preGPA1 = 
		}
	//Possibility: use substring to take charAt(0) and if it is A, B, C, D, or F, just get to that GPA number, then use charAt(2) to add or subtract the difference, for example, plus .3 or whatever, for A+
	GPA = (StudentInformationSystem.studentList.get(studentNum-1).getCourse1().getLetterGrade() + StudentInformationSystem.studentList.get(studentNum-1).getCourse2().getLetterGrade() + StudentInformationSystem.studentList.get(studentNum-1).getCourse3().getLetterGrade())/3;
	}

}
