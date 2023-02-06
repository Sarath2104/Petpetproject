package org.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class jvmReports {
	
	public static void generateJvmReport(String jsonpath) {
		
		File f=new File(System.getProperty("user.dir")+"\\target\\reports\\JVMReports");
		
		Configuration con = new Configuration(f, "facebook project");
		con.addClassifications("Browsername", "Chrome");
		con.addClassifications("Browser version", "102");
		con.addClassifications("OS name", "Windows");
		con.addClassifications("OS verision", "11");
		con.addClassifications("Spring name", "21");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		
		ReportBuilder rb = new ReportBuilder(li, con);
		rb.generateReports();
	}

}
