package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Model.Machines;

public class Manualmachines {
	
	
static List<Machines> lists = new ArrayList<Machines>();

public List<Machines> addmachines(Machines machines) {
	lists.add(machines);
		return lists;	
		}

public void sortmachines(String time){
	System.out.println("ID\tMachineName\tMaintenanceTime");
	for(Machines m:lists)
		if(m.maintenanceTime.equalsIgnoreCase(time))
			System.out.println(m.getID()+"\t"+m.getMachineName()+"\t"+m.getMaintenanceTime());
	
	}

public List<Machines> removeMachines() throws IOException{
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("ENTER ID");
	int iD=Integer.parseInt(br.readLine());
	
		for(Machines m:lists)
		{
	if(m.getID()==iD)
	{
              lists.remove(m);
             System.out.println("iD REMOVED SUCESSFULLY");
	}
	else
		System.out.println("ID NOT FOUND IN THE LIST");
}
	return lists;
	


}


}





