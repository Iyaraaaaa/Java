import java.util.Scanner;

public class Angel1{

	public static void main (String [] args) {
	
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter the Name ?");
		String EmployeeName= scanner.nextLine();
	
		System.out.println("Enter the Age ?");
		int EmployeeAge= scanner.nextInt();
	
		System.out.println("Enter the M or F ?");
		String EmployeeGen= scanner.next();
	
		System.out.println("Enter the Salary ?");
		double EmployeeSalary= scanner.nextDouble();
	
		scanner.close();
		
		System.out.println("Employee Name: "+ EmployeeName);
		System.out.println("Employee Age: "+ EmployeeAge);
		System.out.println("Employee Gender: "+ EmployeeGen);
		System.out.println("Employee Salary: Rs."+ EmployeeSalary);
	
		
	
	
	
	
	
						}

	
			}