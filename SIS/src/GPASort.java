import java.util.Comparator;

public class GPASort implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
			{
				//return s1.getGPA().compareTo(s2.getGPA());
				return Double.compare(s2.getGPA(), s1.getGPA());
			}
	}
