import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        @SuppressWarnings("unused")
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Resume.pdf"));
        document.open();

        Font largeBold = new Font(Font.FontFamily.HELVETICA, 32, Font.NORMAL);

        Paragraph paragraph = new Paragraph("Resume", largeBold);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        paragraph.setSpacingAfter(50);
        document.add(paragraph);

        PdfPTable table = new PdfPTable(2);

        table.addCell("First Name");
        table.addCell("Przemyslaw");
        table.addCell("Last Name");
        table.addCell("Kuca");
        table.addCell("Profession");
        table.addCell("IT Student");
        table.addCell("Education");
        table.addCell("2018-2021 PWSZ Tarnow");
        table.addCell("Summary");
        table.addCell("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis placerat quis purus facilisis tincidunt. Suspendisse vel urna lacus. Morbi dignissim felis at nisl iaculis vehicula.");
        document.add(table);

        document.close();
    }
}
