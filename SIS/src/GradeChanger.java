import java.util.Scanner;
import java.util.ArrayList;
public class GradeChanger
	{
	Scanner scanner = new Scanner(System.in);
	public static void updateGrade()
		{
			System.out.println("Which Student do you want to update?");
			for(int i = 0; i < Database.database.size();i++)
				{
					System.out.println(Database.database.get(i).getFirstName() + Database.database.get(i).getLastName());
				}
					
			
			
			//print data
			//ask class
			//change grade
		}
	}
