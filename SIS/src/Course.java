
public class Course
	{
		private int period;
		private String className;
		private String grade;
		
		public Course(int period, String className, String grade)
		{
			this.setPeriod(period);
			this.setClassName(className);
			this.setGrade(grade);
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

		public String getGrade()
			{
					return grade;
			}

		public void setGrade(String grade)
			{
					this.grade = grade;
			}
	}
