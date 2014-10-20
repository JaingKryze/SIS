//Seth Novosel
import java.util.Scanner;
public class Course
	{
	private int period;
	private String className;
	private String letterGrade;
	static String changeGrade;
	static String changeClass;
	public Course (int p, String c, String l)
		{
		period = p;
		className = c;
		letterGrade = l;
		}	
	public int getPeriod()
		{
		return period;
		}
	public void setPeriod(int period)
		{
		this.period = period;
		}
	public String getClassName()
		{
		return className;
		}
	public void setClassName(String className)
		{
		this.className = className;
		}
	public String getLetterGrade()
		{
		return letterGrade;
		}
	public void setLetterGrade(String letterGrade)
		{
		this.letterGrade = letterGrade;
		}
	public void changeGrade(int studentNum, int courseNum, String newGrade)
		{
		System.out.println("What do you want to change the student's grade to?");
		Scanner userInput = new Scanner(System.in); 
		changeGrade = userInput.nextLine();
		}
	public void changeClass(int studentNum, int periodNum1, int periodNum2)
		{
		System.out.println("What do you want to change the student's class to?");
		Scanner userInput1 = new Scanner(System.in); 
		changeClass = userInput1.nextLine();
		}
	}
