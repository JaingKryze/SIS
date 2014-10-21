import java.util.Comparator;
public class CourseSorter implements Comparator<Student>
	{
	public int compare(Student s1, Student s2)
		{
		if (StudentInformationSystem.periodToSort == 1)
			{
			return s1.get().compareTo(s2.getLastName());
			}
		if (StudentInformationSystem.periodToSort == 2)
			{
			return s1.get().compareTo(s2.getLastName());
			}
		if (StudentInformationSystem.periodToSort == 3)
			{
			return s1.get().compareTo(s2.getLastName());
			}
		}
	}
