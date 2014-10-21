import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentInformationSystem
	{
	private Scanner keyboard = new Scanner (System.in);
	private static ArrayList<Student> studentList = new ArrayList<Student>;
	public static void main(String[] args)
		{
		initStudents();
		}
	public static ArrayList<Student> initStudents() throws IOException
		{
		String firstName;
		String lastName;
		String course1Name;
		String course1Grade;
		String course2Name;
		String course2Grade;
		String course3Name;
		String course3Grade;
		Scanner file = new Scanner( new File( "studentlist.txt" ) );
		while(file.hasNextLine())
			{
			firstName = file.next();
			lastName = file.next();
			course1Name = file.next();
			course1Grade = file.next();
			course2Name = file.next();
			course2Grade = file.next();
			studentList.addStudent(firstName, lastName, course1Name, course1Grade, course2Grade, course3Name, course3Grade);
			}
		return studentList;
		}
	public void listen()
		{
		while(true)
			{
			
			}
		}
	public void display()
		{
		System.out.println();
		}
	
	
	}
