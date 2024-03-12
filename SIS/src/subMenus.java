import java.util.Scanner;
public class subMenus {
	public static void main(String [] args) {
		System.out.println("Hello, welcome to the Student Access System. Please select an option."); 
		System.out.println("(a) Add or remove a student"); 
		System.out.println("(b) Change grades");
		System.out.println("(c) sort students");
		Scanner sc = new Scanner(System.in);
		String ans = sc.next();
		if (ans.equals("a")) {
			addStudent();
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
				
				Course course1 = new Course(firstP, firstGrade);
		        Course course2 = new Course(secondP, secondGrade);
		        Course course3 = new Course(thirdP, thirdGrade);
		        
				Database.database.add(new Student(firstName, lastName, course1, firstGrade, course2, secondGrade, course3, thirdGrade));
				
				//^^^^ This wont work right now, will have to resove ^^^^^ 
				
				
	}
			public static void removeStudent() {
				
			}

}
