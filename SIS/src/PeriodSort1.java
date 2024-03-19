import java.util.Comparator;

public class PeriodSort1 implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
			{
				return s1.getCourse1().getClassName().compareTo(s2.getCourse1().getClassName());
			}
	}
