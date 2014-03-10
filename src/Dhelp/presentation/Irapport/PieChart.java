package Dhelp.presentation.Irapport;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import Dhelp.DAO.stat_DAO;
import Dhelp.entities.Article;
import java.util.List;
public class PieChart extends JFrame{
    DefaultPieDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe
    ChartPanel cp;            //Panel
      
    
    stat_DAO stat = new stat_DAO();
        Article a = new Article();
        List<Article> A= stat.stat_best5_art();
 
    public PieChart() {
        dataset = new DefaultPieDataset();
//Statique
        for (int i = 0; i < 7; i++) {  
           dataset.setValue(stat.stat_best5_art().get(i).getNom_article(),stat.stat_best5_art().get(i).getNote_article());
        }     
        
graphe = ChartFactory.createPieChart3D("Exemple Camemberg", dataset,true ,true ,false);
        cp = new ChartPanel(graphe);
        this.add(cp);
    }
	 public static void main (String args[]){
        PieChart pchart = new PieChart();
        pchart.setVisible(true);

    }
}

