import java.util.Scanner;
import java.util.ArrayList;
public class GradeChanger
	{
	static Scanner scanner = new Scanner(System.in);
	public static void updateGrade()
		{
			System.out.println("Which Student do you want to update?");
			for(int i = 0; i < Database.database.size();i++)
				{
					System.out.println(Database.database.indexOf(i + 1) + ". " + Database.database.get(i).getFirstName() + Database.database.get(i).getLastName());
				}
			int studentChoice = scanner.nextInt();
			System.out.println(Database.database.get(studentChoice-1).getFirstName() + Database.database.get(studentChoice-1).getLastName() + "'s classes: " + "1. " + Database.database.get(studentChoice-1).getCourse1() + "2. " + Database.database.get(studentChoice-1).getCourse2() + "3. " + Database.database.get(studentChoice-1).getCourse3());
			System.out.println("Which class do you want to edit?");
			
			
			//print data
			//ask class
			//change grade
		}
	}
