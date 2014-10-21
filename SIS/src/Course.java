//Seth Novosel
//School test
import java.util.ArrayList;
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
	public static void changeGrade(int studentNum, int courseNum, String newGrade)
		{
		if(courseNum == 1)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).getCourse1().setLetterGrade(newGrade);
			}
		if(courseNum == 2)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).getCourse2().setLetterGrade(newGrade);
			}
		if(courseNum == 3)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).getCourse3().setLetterGrade(newGrade);
			}
		}
	public static void changeClass(int studentNum, int periodNum1, int periodNum2)
		{
		Course course1;
		Course course2;
		//Sets course
		if(periodNum1 == 1)
			{
			 course1 = StudentInformationSystem.studentList.get(studentNum - 1).getCourse1();
			}
		else if(periodNum1 == 2)
			{
			 course1 = StudentInformationSystem.studentList.get(studentNum - 1).getCourse2();
			}
		else if(periodNum1 == 3)
			{
			 course1 = StudentInformationSystem.studentList.get(studentNum - 1).getCourse3();
			}
		
		if(periodNum2 == 1)
			{
			 course2 = StudentInformationSystem.studentList.get(studentNum - 1).getCourse1();
			}
		else if(periodNum2 == 2)
			{
			 course2 = StudentInformationSystem.studentList.get(studentNum - 1).getCourse2();
			}
		else if(periodNum2 == 3)
			{
			 course2 = StudentInformationSystem.studentList.get(studentNum - 1).getCourse3();
			}
		
		
		//fills course
		if(periodNum1 == 1)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).setCourse1(course1);
			}
		else if(periodNum1 == 2)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).setCourse2(course1);
			}
		else if(periodNum1 == 3)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).setCourse3(course1);
			}
		
		if(periodNum2 == 1)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).setCourse1(course2);
			}
		else if(periodNum2 == 2)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).setCourse2(course2);
			}
		else if(periodNum2 == 3)
			{
			StudentInformationSystem.studentList.get(studentNum - 1).setCourse3(course2);
			}
		}
	}