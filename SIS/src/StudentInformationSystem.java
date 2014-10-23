import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentInformationSystem
	{
	static int periodToSort;
	private static String menuNumber = "...";
	private static Scanner keypad = new Scanner (System.in);
	//find way around this
	public static ArrayList<Student> studentList = new ArrayList<Student>();
	public static void main(String[] args) throws IOException
		{
		initStudents();
		run();
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
		while(file.hasNext())
			{
			firstName = file.next();
			lastName = file.next();
			course1Name = file.next();
			course1Grade = file.next();
			course2Name = file.next();
			course2Grade = file.next();
			course3Name = file.next();
			course3Grade = file.next();
			Student.addStudent(firstName, lastName, course1Name, course1Grade, course2Name, course2Grade, course3Name, course3Grade);
			}
		return studentList;
		}
	public static void run()
		{
		menuNumber = "...";
		String input;
		while(true)
			{
			displayStudentList();
			displayMenu("0");
			input=keypad.nextLine();
			displayMenu(input);
			switch(menuNumber)
				{
				case "0":
					{
					run();
					break;
					}
				case "1":
					{
					input = keypad.nextLine();
					if(input.equals("0"))
						{
						run();
						return;
						}
					else if(input.equals("1"))
						{
						System.out.println("Enter one at a time the first name of the student, last name of the student, the course 1 name, the course 1 grade, the course 2 name, the course 2 grade, the course 3 name, and the course 3 grade.");
						String firstName = keypad.nextLine();
						String lastName = keypad.nextLine();
						String course1Name = keypad.nextLine();
						String course1Grade = keypad.nextLine();
						String course2Name = keypad.nextLine();
						String course2Grade = keypad.nextLine();
						String course3Name = keypad.nextLine();
						String course3Grade = keypad.nextLine();
						Student.addStudent(firstName, lastName, course1Name, course1Grade, course2Name, course2Grade, course3Name, course3Grade);
						displayStudentList();
						run();
						return;
						}
					else if(input.equals("2"))
						{
						System.out.println("What is the number of the student you wish to delete?");
						int studentNumber = keypad.nextInt();
						Student.deleteStudent(studentNumber);
						run();
						return;
						}
					else
						{
						System.out.println("Stop trying to break the program it wont work");
						run();
						return;
						}
					}
				case "2":
					{
					input=keypad.nextLine();
					if(input.equals("0"))
						{
						run();
						return;
						}
					else if(input.equals("1"))
						{
						System.out.println("Enter the student's number the class period and the new grade");
						input = keypad.nextLine();
						String [] inputArray = input.split(" ");
						Course.changeGrade(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]), inputArray[2]);
						run();
						return;
						}
					else if(input.equals("2"))
						{
						System.out.println("Enter the student's number the first class period number and the second class period number");
						input = keypad.nextLine();
						String [] inputArray = input.split(" ");
						Course.changeClass(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2]));
						run();
						return;
						}
					else
						{
						System.out.println("Stop trying to break the program it wont work");
						run();
						return;
						}
					}
				case "3":
					{
					input=keypad.nextLine();
					if(input.equals("0"))
						{
						run();
						return;
						}
					else if(input.equals("1"))
						{
						Collections.sort(studentList , new NameSorter());
						run();
						return;
						}
					else if(input.equals("2"))
						{
						Collections.sort(studentList , new GPASorter());
						run();
						return;
						}
					else if(input.equals("3"))
						{
						System.out.println("Input the class period you wish to sort by.");
						periodToSort = keypad.nextInt();
						Collections.sort(studentList , new NameSorter());
						Collections.sort(studentList, new CourseSorter());
						run();
						return;
						}
					else
						{
						System.out.println("Stop trying to break the program it wont work");
						run();
						return;
						}
					}
				default:
					{
					System.out.println("Congrats you somehow managed to break the system.");
					System.exit(0);
					}
				}
			}
		}
	public static void displayStudentList()
		{
		int i = 0;
		for(Student x : studentList)
			{
			i++;
			System.out.println(i + ") " + x.getFirstName() + " " + x.getLastName() + " " + x.getGPA() + " " 
			+ x.getCourse1().getPeriod() + " " + x.getCourse1().getClassName() + " " + x.getCourse1().getLetterGrade()
			+ x.getCourse2().getPeriod() + " " + x.getCourse2().getClassName() + " " + x.getCourse2().getLetterGrade()
			+ x.getCourse3().getPeriod() + " " + x.getCourse3().getClassName() + " " + x.getCourse3().getLetterGrade());
			}
		}
	public static void displayMenu(String input)
		{
		if(menuNumber.equals("0") && input.equals("0"))
			{
			System.out.println("Goodbye!");
			System.exit(0);
			}
		switch (input)
			{
			case "0":
				{
				System.out.println("What would you like to do?");
				System.out.println("0) exit program");
				System.out.println("1) add or delete a student\n2) change student grades/schedule\n3) sort students");
				menuNumber = "0";
				break;
				}
			//add delete student
			case "1":
				{
				System.out.println("What would you like to do?");
				System.out.println("0) return to main menu");
				System.out.println("1) add a student");
				System.out.println("2) delete a student");
				menuNumber = "1";
				break;
				}
			//change grade/class
			case "2":
				{
				System.out.println("What would you like to do?");
				System.out.println("0) return to main menu");
				System.out.println("1) change a students grade");
				System.out.println("2) change a students class");
				menuNumber = "2";
				break;
				}
			//sort by last name/grade/class
			case "3":
				{
				System.out.println("What would you like to do?");
				System.out.println("0) return to main menu");
				System.out.println("1) sort by last name");
				System.out.println("2) sort by grade");
				System.out.println("3) sort by class name");
				menuNumber = "3";
				break;
				}
			default:
				{
				System.out.println("error input not recognized");
				run();
				return;
				}
			}
		}
	}
