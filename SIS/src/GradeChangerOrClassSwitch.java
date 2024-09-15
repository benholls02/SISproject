import java.util.Scanner;
public class GradeChangerOrClassSwitch
	{
		static Scanner scan = new Scanner(System.in); 
		public static void gradeChangerOrClassSwitch()
			{
				System.out.println("What would you like to do?");
				System.out.println("===================================");
				System.out.println("1. Change Grade");
				System.out.println("2. Switch Class");
				System.out.println("=================================== ");
				int firstChoice = scan.nextInt();
				if(firstChoice == 1)
					{
						GradeChanger.updateGrade();
					}
				else if(firstChoice == 2)
					{
						SwitchClass.classSwitch();
					}
				else
					{
						System.out.println("This Option is invalid");
					}
				
				
			}
		
	}
