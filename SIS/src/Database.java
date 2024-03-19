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
						
						i++;
						count = 1;
					}
				for(int y = 0; y < database.size(); y++)
					{
						int value1, value2, value3;
						if(database.get(y).getCourse1().getGrade().substring(0,1).compareTo("A")==0)
							{
								
							}
					}

			}
		
		}

	
