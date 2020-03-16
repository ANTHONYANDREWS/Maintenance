package Model;

public class Machines {
	
		
		public int id;
		public String machineName;
		public String maintenanceTime;
		
		public Machines(int iD, String machineName, String maintenanceTime) {
			this.id = iD;
			this.machineName = machineName;
			this.maintenanceTime = maintenanceTime;
		}

		public int getID() {
			return id;
		}

		public void setID(int iD) {
			this.id = iD;
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



