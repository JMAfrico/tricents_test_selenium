package com.tricents.pdf;

import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class PdfManager {

	private static String CAMINHO_PDF = System.getProperty("user.dir")+"/evidencias/arquivo";
	
	public static Document createPDF() throws Throwable {
		Document doc = new Document(PageSize.A4);
		FileOutputStream os = new FileOutputStream(CAMINHO_PDF +".pdf");
		PdfWriter.getInstance(doc, os);
		doc.open();
		return doc;
	}
	
	public static void addCabecalho(Document doc, String nomeCT) {
		Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD);
		String usuarioLogado;
		usuarioLogado = System.getProperty("user.name");
		
		PdfPTable tableheader = new PdfPTable(new float[] { 0.15f, 0.35f,0.13f,0.37f });
		
		PdfPCell header = new PdfPCell(new Paragraph("Evidencias de teste"));
		header.setUseBorderPadding(false);
		header.setBorderColor(BaseColor.BLUE);
		header.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		header.setColspan(4);
		tableheader.setSpacingBefore(20);
		header.setColspan(4); 
		tableheader.addCell(header);
	}
}
