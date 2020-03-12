package excelfiles;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Model.Machines;
import Model.User;
import Model.Validateuser;
import service.CrudOperations;
import service.Manualmachines;


public class Main {

	public static void main(String[] args) throws IOException {
		
//		Manualmachines manualmachines = new Manualmachines();    
//		
//		int iD = 0;
//		String machineName = null;
//		String maintenanceTime = null;
//		
//        Machines machines = new Machines(iD, machineName, maintenanceTime);
		
		System.out.println("Machine Maintenance is really important");
		System.out.println("Lets check your machines health status");
		System.out.println("1. SIGN UP");
		System.out.println("2. SIGN IN");
		System.out.println("3. ADD A NEW MACHINE");	
		System.out.println("4. SHOW DATA OF MANUALLY ADDED MACHINES");		
		System.out.println("5. SHOW DATA OF AVAILABLE MACHINES IN THE LIST");

		String email=null;
		String password=null;
		String Cpassword=null;

		User user = null;
		CrudOperations crud=new CrudOperations();
		int choice = 0;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String yes;
		do {
			choice =Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			System.out.println("SIGN UP");
			System.out.println("Enter Username:");
			email = br.readLine();
			System.out.println("Enter Password:");
			password = br.readLine();
			System.out.println("Confirm Password:");
			Cpassword = br.readLine();
			Validateuser validate1=new Validateuser();
	
			if(validate1.checkUserDetails1(email,password,Cpassword)){
			user=new User(email,password,Cpassword);
			
			crud.addUser(user);
			
			}
			break;
		case 2:
			System.out.println("Sign in");
			System.out.println("Enter Username:");
			email = br.readLine();
			System.out.println("Enter Password:");
			password = br.readLine();
			
			Validateuser validate2=new Validateuser();
			if(validate2.checkUserDetails2(email,password)){
			User user1 = new User(email,password);
			
			crud.addUser(user1);			
			}
			break;
		case 3:{            
            List<Machines> lists =  new ArrayList<Machines>();
        		
        	
        		int iD;
        		String machineName;
        		String maintenanceTime;
////        		
        		int value = 0;
        		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        		Manualmachines manualmachines = new Manualmachines();        		
        		do {

        		System.out.println("Lets run through quick input for your machines");
        		System.out.println("Enter iD of the Machine");
        		iD = Integer.parseInt(br.readLine());
                System.out.println("Enter name of the Machine");
        		machineName = br1.readLine();
                System.out.println("Enter the time when it would need maintenance");
        		maintenanceTime = br1.readLine();
        		
        		Machines machines = new Machines(iD, maintenanceTime, maintenanceTime);
        		machines.setID(iD);
        		machines.setMachineName(machineName);
        		machines.setMaintenanceTime(maintenanceTime);
        			
        			lists = manualmachines.addmachines(machines);
        			
        			WriteExcel excel =new WriteExcel();
        			excel.insertMachines(machines);
        			}while(iD!=0);
        		

    			
    			for(Machines std:lists) {
    				System.out.println("Display");
    				System.out.println(std.getID());
    				System.out.println(std.getMachineName());
    				System.out.println(std.getMaintenanceTime());

        				System.out.println("You rely us on and we will stand up to your Trust");
                        System.out.println("Thank you for choosing our services");
                        
                        break;
                        
           		}
		}
		case 4:
//            List<Machines> lists =  new ArrayList<Machines>();

		
		
                        
//                        Machines machines = new Machines(iD, maintenanceTime, maintenanceTime);

//            			lists = manualmachines.getAllMachines(machines);

            			
        			
//        			for(Machines std:lists) {
//        				System.out.println("Display");
//        				System.out.println(std.getID());
//        				System.out.println(std.getMachineName());
//        				System.out.println(std.getMaintenanceTime());
//        				
        				break;
//        			}
        			
        					

		
		case 5:
			WriteExcel ex=new WriteExcel();
//			ex.writefromExcel("Machine.xls");
              break;
		}
		System.out.println("Do you want to continue");
		yes=br.readLine();
		
		}while(yes.equals("yes"));
		
				
		
	}
}
		
		
		
			
			
			
		
			
			
	
	


