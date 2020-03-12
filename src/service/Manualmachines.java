package service;

import java.util.ArrayList;
import java.util.List;

import Model.Machines;

public class Manualmachines {
	static int valve = 0;
	
	
static List<Machines> lists = new ArrayList<Machines>();

public List<Machines> addmachines(Machines machines) {
	lists.add(machines);
		return lists;	
		}

public List<Machines> getAllMachines(Machines machines){
	return lists;
	}

}


