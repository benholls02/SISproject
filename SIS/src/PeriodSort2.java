import java.util.Comparator;

public class PeriodSort2 implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			return s1.getCourse2().getClassName().compareTo(s2.getCourse2().getClassName());
		}
	}
