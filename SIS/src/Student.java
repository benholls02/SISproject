
public class Student
	{
		private String firstName;
		private String lastName;
		private double GPA;
		private Course course1;
		private Course course2;
		private Course course3;
		
		public Student(String firstName, String lastName, double GPA, Course course1, Course course2, Course course3)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.GPA = GPA;
			this.course1 = course1;
			this.course2 = course2;
			this.course3 = course3;
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public double getGPA()
			{
				return GPA;
			}

		public void setGPA(double gPA)
			{
				GPA = gPA;
			}

		public Course getCourse1()
			{
				return course1;
			}

		public void setCourse1(Course course1)
			{
				this.course1 = course1;
			}

		public Course getCourse2()
			{
				return course2;
			}

		public void setCourse2(Course course2)
			{
				this.course2 = course2;
			}

		public Course getCourse3()
			{
				return course3;
			}

		public void setCourse3(Course course3)
			{
				this.course3 = course3;
			}
	}
