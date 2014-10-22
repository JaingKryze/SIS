
import java.util.Comparator;
public class CourseSorter implements Comparator<Student>
	{
	public int compare(Student s1, Student s2)
		{
		if (StudentInformationSystem.periodToSort == 1)
			{
			return s1.getCourse1().getClassName().compareTo(s2.getCourse1().getClassName());
			}
		else if (StudentInformationSystem.periodToSort == 2)
			{
			return s1.getCourse2().getClassName().compareTo(s2.getCourse2().getClassName());
			}
		else if (StudentInformationSystem.periodToSort == 3)
			{
			return s1.getCourse3().getClassName().compareTo(s2.getCourse3().getClassName());
			}
		else 
			{
			return 0;
			}
		}
	}
