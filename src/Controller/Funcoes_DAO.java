package Controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import static com.itextpdf.text.Font.FontFamily.COURIER;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Funcoes_DAO {
public static LocalDate data = java.time.LocalDate.now();
public static String recebe = data.format(DateTimeFormatter.ISO_DATE);

    public static void atestado() throws Exception {
        Document doc = null;
        OutputStream os = null;
        String a, b, c, d, e;
        a = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        b = JOptionPane.showInputDialog(null, "Digite sua carteira de identidade");
        c = JOptionPane.showInputDialog(null, "Ate quando sera o atestado");
        d = recebe;
        e = JOptionPane.showInputDialog(null, "Digite o motivo do atestado");

        try {
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
            os = new FileOutputStream("Atestado.pdf");
            PdfWriter.getInstance(doc, os);
            doc.open();
            Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
            Paragraph titulo = new Paragraph("              ATESTADO MÉDICO \n \n ", f);
            doc.add(titulo);
            Paragraph par = new Paragraph("Atesto para fins de repouso que o Sr.(a) " + a + " portador da Documentação N " + b + " "
                    + "esteve sob cuidados do dia " + d + " e devera se afastar de suas atividades pelo periodo de " + d + " ate " + c + " por motivos de " + e);
            doc.add(par);
            Paragraph par2 = new Paragraph("Informações relevantes: ");
            doc.add(par2);

            Paragraph par3 = new Paragraph("\n Local: hospital Irma agostina                   Data: " + d);
            doc.add(par3);
            Paragraph par4 = new Paragraph("\n  ______________________________________ \n       Carimbo assinatura");
            doc.add(par4);
        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }

        }
        Desktop.getDesktop().open(new File("Atestado.pdf"));
    }
    public static void receita() throws Exception{
    
        Document doc = null;
        OutputStream os = null;
        String a, b, c, d, e;
        a = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        b = JOptionPane.showInputDialog(null, "Digite o CRM");
        c = JOptionPane.showInputDialog(null, "Qual o nome do paciente?");
        d = recebe;

        try {
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
            os = new FileOutputStream("Receita.pdf");
            PdfWriter.getInstance(doc, os);
            doc.open();
            Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
            Paragraph par = new Paragraph("Nome: " +a);
            doc.add(par);
            Paragraph par2 = new Paragraph("CRM: " +b);
            doc.add(par2);
            Paragraph par3 = new Paragraph("\n           Receituário", f);
            doc.add(par3);
            Paragraph par4 = new Paragraph("\n \n Paciente: " +c);
            doc.add(par4);
            
            Paragraph par5 = new Paragraph("\n \n \n \n \n \n Data: 26/11/2024                                                       Assinatura: ___________________________ ");
            doc.add(par5);
            
            
        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }

        }
        Desktop.getDesktop().open(new File("Receita.pdf"));
    }
    public static void declaracao() throws Exception{
        Document doc = null;
        OutputStream os = null;
        String a, b, c, d, e;
        a = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        b = JOptionPane.showInputDialog(null, "As horas que chegou: ");
        c = JOptionPane.showInputDialog(null, "As horas que saiu");
        d = recebe;
       

        try {
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
            os = new FileOutputStream("Declaracao.pdf");
            PdfWriter.getInstance(doc, os);
            doc.open();
            Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
            Paragraph titulo = new Paragraph("             Declaração de comparecimento", f);
            doc.add(titulo);
            Paragraph par = new Paragraph("\n Declaro que para fins de vontade maior o Sr.(a) " + a + 
                    " esteve em consulta odontologica no dia 26/11/2024 Durante o periodo de "+b+"Hrs ate "+c+"Hrs");
            doc.add(par);
            Paragraph par2 = new Paragraph("\n \n São Paulo. 26/11/2024 ");
            doc.add(par2);
            
            Paragraph par4 = new Paragraph("\n ______________________________________ \n      Carimbo assinatura");
            doc.add(par4);
        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }

        }
        Desktop.getDesktop().open(new File("Declaracao.pdf"));
    }
    }
    
    
    

