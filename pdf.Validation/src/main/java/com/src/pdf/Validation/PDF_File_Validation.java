package com.src.pdf.Validation;


import java.awt.Rectangle;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;


public class PDF_File_Validation {
		
		public PDDocument pdfDocument = null;

		public void openPDFFile(String filePath) throws IOException
		{
			URL url = new URL(filePath);
			InputStream is = url.openStream();
			BufferedInputStream fileParse = new BufferedInputStream(is);
			pdfDocument = PDDocument.load(fileParse);
		}
		
		public void closePDFFile() throws IOException
		{
			pdfDocument.close();
		}
		
		public Rectangle getPDFRegion(String regionType)
		{
			Rectangle region = null;
			//coordinates (x, y, width, height) of PDF page region
			if (regionType == "Header") region = new Rectangle(10, 60, 1000, 20); 
			else if (regionType == "Page2") region = new Rectangle(10, 80, 1000, 300);
			else if (regionType == "Page3") region = new Rectangle(10, 80, 350, 300);
			return region;
		}
		
		public PDPage getPDFPage(int pageIndex) throws IOException
		{
			PDPage page = pdfDocument.getPage(pageIndex - 1);
			return page;
		}
		
		public int getPDFPageCount() throws IOException
		{
			PDPageTree pageCount = pdfDocument.getDocumentCatalog().getPages();
			int pdfPageCount = pageCount.getCount();
			return pdfPageCount;
		}

		public String readPDFFileByArea(int pageIndex, String regionType) throws IOException
		{
			PDFTextStripperByArea stripper = new PDFTextStripperByArea();
			stripper.setSortByPosition(true);
			stripper.addRegion("pdfRegion", getPDFRegion(regionType));
			stripper.extractRegions(getPDFPage(pageIndex));
			String pdfContent = stripper.getTextForRegion("pdfRegion");
			return pdfContent;
		}
		
		public String readPDFFile(int pageStartIndex, int pageEndIndex) throws IOException
		{
			PDFTextStripper stripper = new PDFTextStripper();
			stripper.setStartPage(pageStartIndex);
			stripper.setEndPage(pageEndIndex);
			String pdfContent = stripper.getText(pdfDocument);
			return pdfContent;
		}


}
