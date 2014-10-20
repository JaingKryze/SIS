//Seth Novosel
public class Course
	{
	private int period;
	private String className;
	private String letterGrade;
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
		
		}
	public void changeClass(int studentNum, int periodNum1, int periodNum2)
		{
		
		}
	}
