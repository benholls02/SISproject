import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
	{
		public static void main(String[] args) throws IOException
			{

				// Database.fillArrayList();
				// GradeChangerOrClassSwitch.gradeChangerOrClassSwitch();

				// GradeChanger.updateGrade();
				// updateGrade();
				Database.fillArrayList();
				Database.gpaArrayList();
				mainMenu();
				// GradeChanger.updateGrade();
				// ChooseSort.whichSort();
				Database.printList();

			}

		public static void mainMenu()
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.printf(
						"What would you like to do? %n =================================== %n 1. add or delete a student %n 2. change student grades/schedule %n 3. sort students %n =================================== %n");
				int choice = userIntInput.nextInt();
				if(choice == 1)
					{
						subMenus.chooseAddOrDelete();
					}
				else if(choice == 2)
					{
						
					}
				else if(choice == 3)
					{
						
					}
				else
					{
						mainMenu();
					}
			}

	}
