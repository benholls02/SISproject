import java.util.ArrayList;
import java.util.Scanner;
public class SwitchClass
	{
	static int count = 1;
	static Scanner scanIt = new Scanner(System.in);
	public static void classSwitch()
		{
			System.out.println("Which Student do you want to edit?");
			for(int i = 0; i < Database.database.size();i++)
				{
					System.out.println(count++ + ". " + Database.database.get(i).getFirstName() + " " + Database.database.get(i).getLastName());
				}
			int student = scanIt.nextInt();
			System.out.println(Database.database.get(student-1).getFirstName() + " " + Database.database.get(student-1).getLastName() + "'s classes: " + "(1) " + Database.database.get(student-1).getCourse1().getClassName() + ": " + Database.database.get(student-1).getCourse1().getGrade()  + " (2) " + Database.database.get(student-1).getCourse2().getClassName() + ": " + Database.database.get(student-1).getCourse2().getGrade() + " (3) " + Database.database.get(student-1).getCourse3().getClassName() + ": " + Database.database.get(student-1).getCourse3().getGrade());
			System.out.println("Which class do you want to Switch?");
			int course = scanIt.nextInt();
			scanIt.nextLine();
			if(course == 1)
				{
					System.out.println("What class do you want to Switch for " + Database.database.get(student-1).getCourse1().getClassName() + "?");
					String newClass1 = scanIt.nextLine();
					Database.database.get(student-1).getCourse1().setClassName(newClass1);
					System.out.println("The class was successfully switched to " + Database.database.get(student-1).getCourse1().getClassName() + ".");
					
				}
			else if(course==2)
				{
					System.out.println("What class do you want to Switch for " + Database.database.get(student-1).getCourse2().getClassName() + "?");
					String newClass2 = scanIt.nextLine();
					Database.database.get(student-1).getCourse1().setClassName(newClass2);
					System.out.println("The class was successfully switched to " + Database.database.get(student-1).getCourse2().getClassName() + ".");
				}
			else if(course==3)
				{
					System.out.println("What class do you want to Switch for " + Database.database.get(student-1).getCourse3().getClassName() + "?");
					String newClass3 = scanIt.nextLine();
					Database.database.get(student-1).getCourse1().setClassName(newClass3);
					System.out.println("The class was successfully switched to " + Database.database.get(student-1).getCourse3().getClassName() + ".");
				}
		}
	}
