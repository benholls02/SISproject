import java.util.Scanner;
public class GradeChangerOrClassSwitch
	{
		static Scanner scan = new Scanner(System.in); 
		public static void gradeChangerOrClassSwitch()
			{
				System.out.println("Do you wish to Change Grade or Switch Class?");
				System.out.println("(1) Change Grade");
				System.out.println("(2) Switch Class");
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
