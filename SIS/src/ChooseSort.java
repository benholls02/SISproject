import java.util.Collections;
import java.util.Scanner;

public class ChooseSort
	{
		public static void whichSort()
			{
				Scanner userInt = new Scanner(System.in);
				
				System.out.println("What would you like to sort by?");
				System.out.println("1. Sort by last name");
				System.out.println("2. Sort by GPA");
				System.out.println("3. Sort by period");
				
				int choice = userInt.nextInt();
				if(choice==1)
					{
						Collections.sort(Database.database, new LastNameSort());
					}
				if(choice==3)
					{
						System.out.println("By what period number? (1, 2, 3)");
						int periodNumber = userInt.nextInt();
						
						Collections.sort(Database.database, new LastNameSort());
						
						if(periodNumber == 1)
							{
								Collections.sort(Database.database, new PeriodSort1());
							}
						
						
						//PeriodSort.periodOrder(periodNumber);
						
					}
			}
	}
