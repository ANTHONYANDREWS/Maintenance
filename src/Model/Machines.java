package Model;

public class Machines {
	
		
		public int ID;
		public String machineName;
		public String maintenanceTime;
		
		public Machines(int iD, String machineName, String maintenanceTime) {
			ID = iD;
			this.machineName = machineName;
			this.maintenanceTime = maintenanceTime;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getMachineName() {
			return machineName;
		}

		public void setMachineName(String machineName) {
			this.machineName = machineName;
		}

		public String getMaintenanceTime() {
			return maintenanceTime;
		}

		public void setMaintenanceTime(String maintenanceTime) {
			this.maintenanceTime = maintenanceTime;
		}



	}



