import java.util.Comparator;

public class PeriodSort3 implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			return s1.getCourse3().getClassName().compareTo(s2.getCourse3().getClassName());
		}
	}
