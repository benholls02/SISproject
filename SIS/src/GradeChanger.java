import java.util.Scanner;
import java.util.ArrayList;
public class GradeChanger
	{
	static Scanner scanner = new Scanner(System.in);
	static int menuNumber = 1;
	public static void updateGrade()
		{
			System.out.println("Which Student do you want to edit?");
			for(int i = 0; i < Database.database.size();i++)
				{
					System.out.println(menuNumber++ + ". " + Database.database.get(i).getFirstName() + " " + Database.database.get(i).getLastName());
				}
			int studentChoice = scanner.nextInt();
			System.out.println(Database.database.get(studentChoice-1).getFirstName() + " " + Database.database.get(studentChoice-1).getLastName() + "'s classes: " + "(1) " + Database.database.get(studentChoice-1).getCourse1().getClassName() + ": " + Database.database.get(studentChoice-1).getCourse1().getGrade()  + " (2) " + Database.database.get(studentChoice-1).getCourse2().getClassName() + ": " + Database.database.get(studentChoice-1).getCourse2().getGrade() + " (3) " + Database.database.get(studentChoice-1).getCourse3().getClassName() + ": " + Database.database.get(studentChoice-1).getCourse3().getGrade());
			System.out.println("Which class do you want to edit?");
			int classNumber = scanner.nextInt();
			scanner.nextLine();
			if(classNumber == 1)
				{
					System.out.println("What do you want to change the Grade to?" + " (Current Grade: " + Database.database.get(studentChoice-1).getCourse1().getGrade() + ")");
					String grade1 = scanner.nextLine();
					Database.database.get(studentChoice-1).getCourse1().setGrade(grade1);
					System.out.println("The grade was successfully changed to " + Database.database.get(studentChoice-1).getCourse1().getGrade() + ".");
					
				}
			else if(classNumber==2)
				{
					System.out.println("What do you want to change the Grade to?" + " (Current Grade: " + Database.database.get(studentChoice-1).getCourse2().getGrade() + ")");
					String grade2 = scanner.nextLine();
					Database.database.get(studentChoice-1).getCourse1().setGrade(grade2);
					System.out.println("The grade was successfully changed to " + Database.database.get(studentChoice-1).getCourse2().getGrade() + ".");
				}
			else if(classNumber==3)
				{
					System.out.println("What do you want to change the Grade to?" + " (Current Grade: " + Database.database.get(studentChoice-1).getCourse3().getGrade() + ")");
					String grade3 = scanner.nextLine();
					Database.database.get(studentChoice-1).getCourse3().setGrade(grade3);
					System.out.println("The grade was successfully changed to " + Database.database.get(studentChoice-1).getCourse3().getGrade() + ".");
				}
		}
	}
