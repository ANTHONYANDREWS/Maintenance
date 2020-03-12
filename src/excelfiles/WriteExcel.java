package excelfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Model.Machines;


public class WriteExcel {
	
	  private static String[] columns = { "ID", "MACHINE_NAME", "MAINTENANCE_TIME"};
	  
	  private static List<Machines> machines = new ArrayList<Machines>();
	  
	
	  public void writefromExcel(String file)  throws IOException{

		
		machines.add(new Machines(1,"CNC Machine","3months"));
		machines.add(new Machines(2,"Milling Machine","4months"));
		machines.add(new Machines(3,"Compressor Machine","12months"));
		machines.add(new Machines(4,"Power Pressed Machine","3months"));
		machines.add(new Machines(5,"Fly press Machine","2months"));
		machines.add(new Machines(6,"Slotting","3months"));
		machines.add(new Machines(7,"Mechanical shearing machine","6months"));
		machines.add(new Machines(8,"Shaping Machine","5months"));
		machines.add(new Machines(9,"Hydraulic press break Machine","7months"));
		machines.add(new Machines(10,"Universal Turning Machine","10months"));
		machines.add(new Machines(11,"Drilling Machine","4months"));
		machines.add(new Machines(12,"Pipe bending Machine","3months"));
		

	//Blank workbook
	XSSFWorkbook workbook = new XSSFWorkbook(); 
	
	//Create a blank sheet
	XSSFSheet sheet = workbook.createSheet("Machines");
	
	// Create a Row
    Row headerRow = sheet.createRow(0);

    for (int i = 0; i < columns.length; i++) {
      Cell cell = headerRow.createCell(i);
      cell.setCellValue(columns[i]);
    }
    
 // Create Other rows and cells with contacts data
    int rowNum = 1;

    for (Machines machine : machines) {
      Row row = sheet.createRow(rowNum++);
      row.createCell(0).setCellValue(machine.ID);
      row.createCell(1).setCellValue(machine.machineName);
      row.createCell(2).setCellValue(machine.maintenanceTime);
      
  	System.out.print(machine.getID());
  	System.out.println(machine.getMachineName());
  	System.out.println(machine.getMaintenanceTime());

    }
    
    // Resize all columns to fit the content size
    for (int i = 0; i < columns.length; i++) {
      sheet.autoSizeColumn(i);
    }
    

    
    FileOutputStream out = new FileOutputStream(new File("Machine.xlsx"));
    workbook.write(out);
    out.close();
    System.out.println("Data written succesfully.");
    

  }

}
