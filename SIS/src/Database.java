import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class Database
	{

		static ArrayList<Student> database = new ArrayList<Student>();

		public static void fillArrayList() throws IOException
			{
				Scanner file = new Scanner(new File("studentList.txt"));
				int count = 1;
				int i = 0;
				while (file.hasNext())
					{
						database.add(new Student(file.next(), file.next(), 0.00,
								new Course(count++, file.next(), file.next()),
								new Course(count++, file.next(), file.next()),
								new Course(count++, file.next(), file.next())));

						i++;
						count = 1;
					}

			}

		public static void gpaArrayList()
			{
				for (int y = 0; y < database.size(); y++)
					{
						double value1 = 0.00;
						double value2 = 0.00; 
						double value3 = 0.00;

						if (database.get(y).getCourse1().getGrade().substring(0, 1).equals("A"))
							{
								value1 = 4.00;
							}
						else if (database.get(y).getCourse1().getGrade().substring(0, 1).equals("B"))
							{
								value1 = 3.00;
							}
						else if (database.get(y).getCourse1().getGrade().substring(0, 1).equals("C"))
							{
								value1 = 2.00;
							}
						else if (database.get(y).getCourse1().getGrade().substring(0, 1).equals("D"))
							{
								value1 = 1.00;
							}
						else if (database.get(y).getCourse1().getGrade().substring(0, 1).equals("F"))
							{
								value1 = 0.00;
							}

						if (database.get(y).getCourse2().getGrade().substring(0, 1).equals("A"))
							{
								value2 = 4.00;
							}
						else if (database.get(y).getCourse2().getGrade().substring(0, 1).equals("B"))
							{
								value2 = 3.00;
							}
						else if (database.get(y).getCourse2().getGrade().substring(0, 1).equals("C"))
							{
								value2 = 2.00;
							}
						else if (database.get(y).getCourse2().getGrade().substring(0, 1).equals("D"))
							{
								value2 = 1.00;
							}
						else if (database.get(y).getCourse2().getGrade().substring(0, 1).equals("F"))
							{
								value2 = 0.00;
							}

						if (database.get(y).getCourse3().getGrade().substring(0, 1).equals("A"))
							{
								value3 = 4.00;
							}
						else if (database.get(y).getCourse3().getGrade().substring(0, 1).equals("B"))
							{
								value3 = 3.00;
							}
						else if (database.get(y).getCourse3().getGrade().substring(0, 1).equals("C"))
							{
								value3 = 2.00;
							}
						else if (database.get(y).getCourse3().getGrade().substring(0, 1).equals("D"))
							{
								value3 = 1.00;
							}
						else if (database.get(y).getCourse3().getGrade().substring(0, 1).equals("F"))
							{
								value3 = 0.00;
							}

						if (database.get(y).getCourse1().getGrade().length() > 1)
							{
								if (database.get(y).getCourse1().getGrade().substring(1).equals("+"))
									{
										value1 += 0.30;
									}
								else if (database.get(y).getCourse1().getGrade().substring(1).equals("-"))
									{
										value1 -= 0.30;
									}
							}

						if (database.get(y).getCourse2().getGrade().length() > 1)
							{
								if (database.get(y).getCourse1().getGrade().substring(1).equals("+"))
									{
										value2 += 0.30;
									}
								else if (database.get(y).getCourse1().getGrade().substring(1).equals("-"))
									{
										value2 -= 0.30;
									}
							}

						if (database.get(y).getCourse3().getGrade().length() > 1)
							{
								if (database.get(y).getCourse1().getGrade().substring(1).equals("+"))
									{
										value3 += 0.30;
									}
								else if (database.get(y).getCourse1().getGrade().substring(1).equals("-"))
									{
										value3 -= 0.30;
									}
							}

						database.get(y).setGPA((value1 + value2 + value3) / 3);
					}
			}

		public static void printList()
			{
				DecimalFormat d = new DecimalFormat("0.00");
				for (int i = 0; i < database.size(); i++)
					{
						System.out.println(database.get(i).getFirstName() + " " + database.get(i).getLastName() + " "
								+ d.format(database.get(i).getGPA()) + " " + database.get(i).getCourse1().getClassName()
								+ " " + database.get(i).getCourse1().getGrade() + " "
								+ database.get(i).getCourse2().getClassName() + " "
								+ database.get(i).getCourse2().getGrade() + " "
								+ database.get(i).getCourse3().getClassName() + " "
								+ database.get(i).getCourse3().getGrade());
					}
			}

	}
