import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Database
	{
		static ArrayList<Student> database = new ArrayList<Student>();
		
		public static void fillArrayList() throws FileNotFoundException
		{
			Scanner file = new Scanner(new File("studentList.txt"));
			while(file.hasNext())
				{
					database.add(new Student(file.next(),file.next(),file.next(),file.next(),file.next()));
				}
			
		}
		
		
	}
