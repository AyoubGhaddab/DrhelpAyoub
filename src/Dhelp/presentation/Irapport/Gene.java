package Dhelp.presentation.Irapport;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import Dhelp.util.MyConnection;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
/**
 *
 * @
 */
public class Gene {
   static String CATEG="Médicament";
    
    
    public Gene(String cat){
        CATEG=cat;
      
    }

    public static void setCATEG(String CATEG) {
        Gene.CATEG = CATEG;
    }

    public static String getCATEG() {
        return CATEG;
    }
    
                
public static void main(String[] args) {
        // - Paramètres de connexion à la base de données
        
        Connection connection;
        try {
           
            // - Connexion à la base
            connection=MyConnection.getInstance();
            // - Chargement et compilation du rapport
            System.out.println("oci");
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\user\\Desktop\\go\\Google Drive\\Drhelp\\src\\Dhelp\\presentation\\Irapport\\test1.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            // - Paramètres à envoyer au rapport
            Map  parameters = new HashMap();
            parameters.put("i_categ",CATEG);
            
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\Users\\user\\Desktop\\myreport.pdf");
            System.out.println("success");
        }

        catch (JRException e) {
            System.out.println("erreur de compilation"+ e.getMessage());
         } 
}

}
/**/