import java.util.Scanner;

public class Problem_Solving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_students; 
		String id=null, name=null;
		double cgpa=0.00;
		//Input total no of students
		System.out.println("Enter the total number of sudents:");
		Scanner scr = new Scanner(System.in);
		total_students = scr.nextInt();
		
		//Run loop for the total number of students
		
		for(int i=1; i <=total_students; i++) {
			//Input student id, name, cgpa
			System.out.println("Enter the id of sudent:");
			Scanner scr1 = new Scanner(System.in);
		    id=scr1.next();
			System.out.println("Enter name of the sudent:");
			Scanner scr2 = new Scanner(System.in);
			name = scr2.next();
			System.out.println("Enter CGPA of the sudent:");
			Scanner scr3 = new Scanner(System.in);
			cgpa = scr3.nextDouble();
			
		}
		for(int j=0;)
		System.out.println(id+"\t"+name+"\t"+cgpa);
	
	
		
		

	}

}
