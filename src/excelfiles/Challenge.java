//package excelfiles;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//import Model.Machines;
//
//
//
//public class Challenge {
//	static List<Machines> list=new ArrayList<Machines>();
//
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//	public void addMachines(Machines m) {
//		if(list.add(m)) {
//			System.out.println("Machine added ");
//		}
//	}
//	
//	public void add() throws IOException {
//		System.out.println("Enter below details :");
//		System.out.print("Id :");
//		String id = br.readLine();
//		System.out.print("Machine name :");
//		String machineName = br.readLine();
//		System.out.print("Time for Maintenance :");
//		String maintenanceTime = br.readLine();
//		Machines m =new Machines(id,machineName, maintenanceTime);
//		m.setID(id);
//		m.setMachineName(machineName);
//		m.setMaintenanceTime(maintenanceTime);
//		addMachines(m);
//	}
//     public void display() {
//		System.out.println("Id\tmachineName\tmaintenanceTime");
//		for(Machines m : list) {
//			
//			System.out.print(m.getID());
//			System.out.print("\t"+m.getMachineName());
//			System.out.println("\t"+m.getMaintenanceTime());
//		}
//	}
//
//}
//
//
