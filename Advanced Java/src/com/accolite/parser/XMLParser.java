package com.accolite.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLParser {
	
	public static void writeToFile(String file, List<License> licenses) {
		try{
			File  f = new File(file);
			FileWriter fw = new FileWriter(f);
			BufferedWriter br = new BufferedWriter(fw);
			
			for(License l : licenses) {
				br.append(l.toString());
			}
			br.close();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static ArrayList<License> getLicenses(Document dom){
		ArrayList<License> licenses = new ArrayList<>();
		NodeList csrList = dom.getElementsByTagName("CSR_Producer");
		for(int j = 0; j < csrList.getLength(); j++) {
			NodeList nList = ((Element) csrList.item(j)).getElementsByTagName("License");
			int nipr = Integer.parseInt(((Element) csrList.item(j)).getAttribute("NIPR_Number"));
			for(int i = 0; i < nList.getLength(); i++) {
				Element ele = (Element)nList.item(i);
				License license = new License();
				license.setNipr_Number(nipr);
				license.setDate_Status_Effective(ele.getAttribute("Date_Status_Effective"));
				license.setLicense_Class(ele.getAttribute("License_Class"));
				license.setLicense_Class_Code(Integer.parseInt(ele.getAttribute("License_Class_Code")));
				license.setLicense_Expiration_Date(ele.getAttribute("License_Expiration_Date"));
				license.setLicense_Issue_Date(ele.getAttribute("License_Issue_Date"));
				license.setLicense_Number(Integer.parseInt(ele.getAttribute("License_Number")));
				license.setResident_Indicator(ele.getAttribute("Resident_Indicator").charAt(0));
				license.setState_Code(ele.getAttribute("State_Code"));
				license.setState_ID(Integer.parseInt(ele.getAttribute("State_ID")));
				licenses.add(license);
			}
		}
		return licenses;
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			File f = new File("license.xml");
			File f1 = new File("loa.xml");
			
			Document dom = db.parse(f);
			Document dom1 = db.parse(f1);
			
			System.out.println("ello");			

			ArrayList<License> licenses = getLicenses(dom);
			System.out.println("ello");			

			ArrayList<License> licenses1 = getLicenses(dom1);
			System.out.println("ello");			
			
			ArrayList<License> invalidLicense = new ArrayList<>();
			ArrayList<License> validLicense = new ArrayList<>();
			
			int flag = 0;
			
			for(License l : licenses) {
				flag = 0;
				for(License l1 : licenses1) {
					System.out.println(l);
					System.out.println(l1);
					if(l.equals(l1)) {
						validLicense.add(l);
						flag = 1;
						break;
						
					}
				}
				if(flag == 0) {
					invalidLicense.add(l);
				}
			}
			
			writeToFile("merger.csv", validLicense);
			writeToFile("invalidLicenses.csv", invalidLicense);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	}
}