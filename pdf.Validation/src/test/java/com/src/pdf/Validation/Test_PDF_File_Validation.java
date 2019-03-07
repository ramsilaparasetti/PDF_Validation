package com.src.pdf.Validation;


import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.src.pdf.Validation.PDF_File_Validation;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_PDF_File_Validation {
	
static PDF_File_Validation pfv = new PDF_File_Validation();	
public static String monthName_CAPS;
public static String monthName_Small;
public static String expPageCount;
public static String filePath;
public static String siteName;
public static String fileFolder;
public static String fileName;
public static String year;
public String[] pdfHeaderContent = {"",
							 		"CONTENTS", 
							 		"1. " + monthName_CAPS + " AT A GLANCE", 
							 		"2. PRODUCTION",
							 		"3. AVAILABILITY",
							 		"4. TEMPERATURE CONDITIONS",
							 		"5. WIND CONDITIONS",
							 		"6. DOWNTIMES",
							 		"7. SERVICE ORDERS",
							 		"8. SPARE PARTS",
							 		"9. CONTACT"};
public String pdfPage2Content = "1. " + monthName_Small + " at a glance Page 3\n"
+ "2. Production Page 4\n"
+ "3. Availability Page 5\n"
+ "4. Temperature Conditions Page 6\n"
+ "5. Wind Conditions Page 7\n"
+ "6. Downtimes Page 8\n"
+ "7. Service Orders Page 9\n"
+ "8. Spare Parts Page 10\n"
+ "9. Contact Page 11";
public String pdfPage3Content = "Site Production in " + monthName_Small + "\n"
+ "Accumulated Site Production for Production Period*\n"
+ " \n"		
+ "Site Availability in " + monthName_Small + "\n" 
+ "Average Site Availability for Production Period\n"
+ " \n"		
+ "Service Orders\n"
+ " \n"		
+ "CO2 saved in " + monthName_Small;



	@BeforeClass
	public static void  intial_Setup() throws IOException
	{	
	//test	
		   Properties prop = new Properties();
		    InputStream input = null;
	
		    try {
		        input = new FileInputStream("config.properties");
		        prop.load(input);
		        monthName_CAPS = prop.getProperty("monthName_CAPS");
		        monthName_Small = prop.getProperty("monthName_Small");
		        expPageCount = prop.getProperty("expPageCount");
		        fileFolder = prop.getProperty("fileFolder");
		        fileName = prop.getProperty("fileName");
		        year = prop.getProperty("year");
		        siteName = prop.getProperty("siteName");
		        
		    	filePath = fileFolder + fileName + "_" + monthName_Small + "_" + year + "_" + siteName + ".pdf";
				pfv.openPDFFile(filePath);

		        
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    } finally {
		        if (input != null) {
		            try {
		                input.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }

	}
	
	@Test
	public void validate_PDF_FileCount() throws IOException
	{
		int actualPageCount = pfv.getPDFPageCount();
		double expCount = Double.parseDouble(expPageCount);
		assertTrue(expCount == actualPageCount);
	}

	@Test
	public void validate_PDF_HeaderContent_All_Pages() throws IOException
	{
		int tolalPageCount = pfv.getPDFPageCount();
		for (int pageCounter = 1; pageCounter <= tolalPageCount; pageCounter++)
		{
			String pdfContent = pfv.readPDFFileByArea(pageCounter, "Header");
			assertTrue(pdfContent.contains(pdfHeaderContent[pageCounter - 1]));
		}

	}
	
	@Test
	public void validate_PDF_Page_1_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(1, 1);
		//System.out.println(pdfContent);
		assertTrue(pdfContent.contains("Öland " + siteName));
		assertTrue(pdfContent.contains("Monthly Report"));
		assertTrue(pdfContent.contains(monthName_Small + " " + year));
	}
	
	@Test
	public void validate_PDF_Page_2_Content() throws IOException
	{
			String pdfContent = pfv.readPDFFileByArea(2, "Page2");
			assertTrue(pdfContent.trim().equals(pdfPage2Content.trim()));
	}

	@Test
	public void validate_PDF_Page_3_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFileByArea(3, "Page3");
		assertTrue(pdfContent.trim().equals(pdfPage3Content.trim()));
	}

	@Test
	public void validate_PDF_Page_4_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(4, 4);
		assertTrue(pdfContent.contains("i. Site Production for Production Period"));
		assertTrue(pdfContent.contains("ii. Turbine Production in current Month"));
	}

	@Test
	public void validate_PDF_Page_5_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(5, 5);
		assertTrue(pdfContent.contains("i. Site Availability for Production Period"));
		assertTrue(pdfContent.contains("ii. Turbine Availability in current Month and Average for Production\nPeriod"));
		assertTrue(pdfContent.contains("* The availabilities displayed in this report will be used as the basis for the overall availability calculations. In case\nyou have any questions, please contact us. This calculation will be viewed as definitive at the time when the next\nmonthly report is published."));
	}

	@Test
	public void validate_PDF_Page_6_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(6, 6);
		assertTrue(pdfContent.contains("i. Monthly Site Temperature Conditions for Production Period"));
		assertTrue(pdfContent.contains("ii. Daily Site Temperature Conditions for Reporting Month"));
	}

	@Test
	public void validate_PDF_Page_7_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(7, 7);
		assertTrue(pdfContent.contains("i. Monthly Site Wind Conditions for Production Period"));
		assertTrue(pdfContent.contains("ii. Daily Site Wind Conditions for Reporting Month"));
	}

	@Test
	public void validate_PDF_Page_8_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(8, 8);
		assertTrue(pdfContent.contains("Top 5 Alarms (all WTGs) for the Reporting Month"));
	}

	@Test
	public void validate_PDF_Page_9_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(9, 9);
		assertTrue(pdfContent.contains("(excl. CMS Service Orders)"));
	}

	@Test
	public void validate_PDF_Page_10_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(10, 10);
		assertTrue(pdfContent.contains("(Spare Parts)"));
	}

	@Test
	public void validate_PDF_Page_11_Content() throws IOException
	{
		String pdfContent = pfv.readPDFFile(11, 11);
		assertTrue(pdfContent.contains("In case you have any questions, feel free to contact our expert."));
		assertTrue(pdfContent.contains("Name: Patrik Andersson \nPhone: +46 702 236863 \nEmail : patrik.andersson2@eon.com "));
	}

	@AfterClass
	public static void tear_Down() throws IOException
	{
		pfv.closePDFFile();
	}
	


}
