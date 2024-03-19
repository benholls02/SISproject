import java.util.Scanner;
import java.io.IOException;
public class subMenus {
	 
	public static void main(String [] args)throws IOException {
		Database.fillArrayList();
		System.out.println("Hello, welcome to the Student Access System. Please select an option."); 
		System.out.println("(a) Add or remove a student"); 
		System.out.println("(b) Change grades");
		System.out.println("(c) sort students");
		Scanner sc = new Scanner(System.in);
		String ans = sc.next();
		if (ans.equals("a")) {
			System.out.println("Ok, do you want to add a student (a) or remove a student (b) ?");
			Scanner sc2 = new Scanner(System.in);
			String ans2 = sc.next();
			if (ans2.equals("a")){
				addStudent();
			}else if(ans2.equals("b")) {
				removeStudent();
			}
				
			
		}

	}
			public static void addStudent() {

		
				System.out.println("New student?/n Okay, please type in first name, last name followed by their GPA.");
				Scanner userStringInput=new Scanner(System.in); 
			    Scanner userIntInput=new Scanner(System.in);
				Scanner scanner = new Scanner(System.in);			
				System.out.println("New student? Okay."); 
				System.out.println("Please type in their first name:"); 
				String firstName = userStringInput.nextLine();
				System.out.println("Enter Last name: ");
				String lastName = userStringInput.nextLine();
				System.out.println("First period: ");
				String course1 = userStringInput.nextLine();
				System.out.println("First period grade: ");
				String firstGrade = userStringInput.nextLine();
				System.out.println("Second period: ");
				String course2 = userStringInput.nextLine();
				System.out.println("Second period grade: ");
				String secondGrade = userIntInput.nextLine();
				System.out.println("Third period:");
				String course3 = userStringInput.nextLine();
				System.out.println("Third period grade: ");
				String thirdGrade = userStringInput.nextLine();
				
			//	Course course1 = new Course(firstP, firstGrade);
		      //  Course course2 = new Course(secondP, secondGrade);
		       // Course course3 = new Course(thirdP, thirdGrade);
		        
			//	Database.database.add(new Student(firstName, lastName, course1, firstGrade, course2, secondGrade, course3, thirdGrade));
				
				//^^^^ This wont work right now, will have to resove ^^^^^ 
				
			
	}
			public static void removeStudent() {
		        for (Student student : Database.database) {
		            System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
		            System.out.println("Courses:");
		            System.out.println("1. " + student.getCourse1().getClassName() + " - " + student.getCourse1().getPeriod());
		            System.out.println("2. " + student.getCourse2().getClassName() + " - " + student.getCourse2().getPeriod());
		            System.out.println("3. " + student.getCourse3().getClassName() + " - " + student.getCourse3().getPeriod());
		            System.out.println();
		        }
		    }

}
