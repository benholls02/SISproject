import java.util.Scanner;
import java.io.IOException;
public class subMenus {
	 
	public static void main(String [] args)throws IOException {
		Database.fillArrayList();
			System.out.println("Ok, do you want to add a student (a) or remove a student (b) ?");
			Scanner sc = new Scanner(System.in);
			String ans = sc.next();
			if (ans.equals("a")){
				addStudent();
			}else if(ans.equals("b")) {
				removeStudent();
			}
				
			
		

	}
			public static void addStudent() {
				Scanner userStringInput=new Scanner(System.in); 
			    Scanner userIntInput=new Scanner(System.in);
				Scanner scanner = new Scanner(System.in);			
				System.out.println("New student? Okay."); 
				System.out.println("Please type in their first name:"); 
				String firstName = userStringInput.nextLine();
				System.out.println("Enter Last name: ");
				String lastName = userStringInput.nextLine();
				System.out.println("Enter the GPA:");
		        Double GPA = scanner.nextDouble();
		        System.out.println("Enter the first period course details (period, name, grade):");
		        Course course1 = new Course(scanner.nextInt(), scanner.next(), scanner.next());
		        System.out.println("Enter second period course details (period, name, grade):");
		        Course course2 = new Course(scanner.nextInt(), scanner.next(), scanner.next());
		        System.out.println("Enter third period course details (period, name, grade):");
		        Course course3 = new Course(scanner.nextInt(), scanner.next(), scanner.next());
		        scanner.close();
				
				
				Database.database.add(new Student(firstName, lastName, GPA, course1, course2, course3));
				
				System.out.println("New student added. Would you like to view the current student roster and grades?(Y or N)");
				String yay = userStringInput.nextLine();
					if (yay.equals("Y")){
						int count = 1;
				        for (Student student : Database.database) {
				            System.out.print(count + ") " + student.getFirstName() + " " + student.getLastName());
				            System.out.print (" |  Courses: ");
				            System.out.print("   1. " + student.getCourse1().getClassName() + " ~ " + student.getCourse1().getGrade());
				            System.out.print("   2. " + student.getCourse2().getClassName() + " ~ " + student.getCourse2().getGrade());
				            System.out.print("   3. " + student.getCourse3().getClassName() + " ~ " + student.getCourse3().getGrade());
				            System.out.println();
				            count++;
				        }
				        
					}else if (yay.equals("N")){
						System.out.println("Ok.");
					}
					
					System.out.println("Please press '1' to go back to the main menu.");
					Scanner one = new Scanner(System.in);
					if(one.equals("1")) {
						// Main();
					}
			//	Course course1 = new Course(firstP, firstGrade);
		      //  Course course2 = new Course(secondP, secondGrade);
		       // Course course3 = new Course(thirdP, thirdGrade);
		        
			//	Database.database.add(new Student(firstName, lastName, course1, firstGrade, course2, secondGrade, course3, thirdGrade));
				
				//^^^^ This wont work right now, will have to resove ^^^^^ 
				
				
	}
			public static void removeStudent() {
				int count = 1;
		        for (Student student : Database.database) {
		            System.out.print(count + ") " + student.getFirstName() + " " + student.getLastName());
		            System.out.print (" |  Courses: ");
		            System.out.print("   1. " + student.getCourse1().getClassName() + " ~ " + student.getCourse1().getGrade());
		            System.out.print("   2. " + student.getCourse2().getClassName() + " ~ " + student.getCourse2().getGrade());
		            System.out.print("   3. " + student.getCourse3().getClassName() + " ~ " + student.getCourse3().getGrade());
		            System.out.println();
		            count++;
		        }
		        System.out.println("Enter the number corresponding to the student you want to delete:");
		        Scanner del = new Scanner(System.in);
		        int index = del.nextInt();
		        if (index >= 1 && index <= Database.database.size()) {
		            Database.database.remove(index - 1);
		            System.out.println("Student removed.");
		        }
		        del.close(); 
		        
		    }

}
