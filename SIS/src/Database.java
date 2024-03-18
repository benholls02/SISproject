import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

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
						database.add(new Student(file.next(), file.next(), null,
								new Course(count++, file.next(), file.next()),
								new Course(count++, file.next(), file.next()),
								new Course(count++, file.next(), file.next())));
						//System.out.println(database.get(i).getCourse1().getClassName() + database.get(i).getCourse1().getPeriod());
						i++;
						count = 1;

					}

			}
		
		}

	
