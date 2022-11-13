package mainclass;

import java.util.Scanner;

import com.rajandco.Exceptions.EmployeeException;
import com.rajandco.models.Security;
import com.rajandco.usedcases.AddNewDepartment;
import com.rajandco.usedcases.RegisterNewEmployee;
import com.rajandco.usedcases.RespondLeaveRequest;
import com.rajandco.usedcases.ShowAllDepartments;
import com.rajandco.usedcases.TransferEmployeeAnotherDepartments;
import com.rajandco.usedcases.UpdateDepartmentDetails;
import com.rajandco.usedcasesOF_Employee.ChangePasswordOfEmployee;
import com.rajandco.usedcasesOF_Employee.RequestForLeave;
import com.rajandco.usedcasesOF_Employee.UpdateEmployeeDetails;
import com.rajandco.usedcasesOF_Employee.ViewProfile;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("welcome in Raj And Co ");
		
		System.out.println("Press 1 => Admin");
		System.out.println("Press 2 => Employee");
		
		String person=sc.nextLine();
		System.out.println(person);
		
		
		
//		============   Admin section   ===================================================
		
		if(person.equals("1")) {
			
		System.out.println("Enter username");
		String name=sc.nextLine();
		
		System.out.println("Enter password");
		String Password=sc.nextLine();
			
		boolean access=Security.admin(name,Password);
		
		if(access==true) {System.out.println("Welcome "+name);}
		System.out.println();
		
		
			while(access) {
				System.out.println();
			System.out.println("Choose from below options");
			System.out.println();
				System.out.println("1 => Update Department details..... ");
				System.out.println("2 => View all departments......");
				System.out.println("3 => Tranfer employee in another department..... ");
				System.out.println("4 => Add new Department.....");
				System.out.println("5 => Register New Employee.....");
				System.out.println("6 => Leave requests Respond....");
				System.out.println("9 => Logout....");
				
				int choose1=Integer.parseInt(sc.nextLine());
				
				if(choose1==1) {
					UpdateDepartmentDetails ob=new UpdateDepartmentDetails("show");
					
				}
				else if(choose1==2) {
					ShowAllDepartments ob=new ShowAllDepartments("show");
				}
				else if(choose1==3) {
		TransferEmployeeAnotherDepartments ob=new TransferEmployeeAnotherDepartments("show");
					
					
				}
				else if(choose1==4) {
					AddNewDepartment ob=new AddNewDepartment("show");
					
				}
				else if(choose1==5) {
					RegisterNewEmployee ob=new RegisterNewEmployee("show");
					
				}
				else if(choose1==6) {
					RespondLeaveRequest ob=new RespondLeaveRequest("show");
					
				}
				
				else if(choose1==9) {
					access=false;
					System.out.println("Logout Success.......");
				}
				
					
				
								
			}//while loop end   <<<---------======
		}
//		---------------Employee start here-------------------------------------------------------
		
		else if(person.equals("2")) {
			System.out.println("Enter username");
			String name=sc.nextLine();
			
			System.out.println("Enter password");
			String Password=sc.nextLine();
			
			boolean access=false;
			try {
				access = Security.employee(name,Password);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} //======= Authenticate========
			
			if(access==true) {System.out.println("Welcome "+name);}
			System.out.println();
			
			
				while(access) {
				System.out.println("Choose from below options");
				System.out.println();
					System.out.println("1 => View Profile ....");
					System.out.println("2 => Update profile.......");
					System.out.println("3 => Request for Leave..........");
					System.out.println("4 => Update Password............");
					System.out.println("9 => For logout............");
					
					
					int choose1=Integer.parseInt(sc.nextLine());
					
					if(choose1==1) {
						ViewProfile ob=new ViewProfile();
						ob.calling(name, Password);
					}
					else if(choose1==2) {
						UpdateEmployeeDetails ob=new UpdateEmployeeDetails();
						ob.calling(name, Password);
					}
					else if(choose1==3) {
						RequestForLeave ob=new RequestForLeave();
						ob.calling(name, Password);
						
					}
					else if(choose1==4) {
						ChangePasswordOfEmployee ob=new ChangePasswordOfEmployee();
						ob.calling(name, Password);
					}
					else if(choose1==9) {
						access=false;
						System.out.println("Logout Success.......");
					}
					
				}
			
		}
		else {
			System.out.println("Please choose right option from above options");
		}
		
		
		
	}
	
	
}
