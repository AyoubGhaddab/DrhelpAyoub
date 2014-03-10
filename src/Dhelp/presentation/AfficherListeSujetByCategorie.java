/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.presentation;

import Dhelp.entities.Sujet;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marwen
 */
public class AfficherListeSujetByCategorie extends AbstractTableModel{
    
    List<Sujet> sujet;
    String []tabart={"nom du sujet","nom de la categorie ","Contenu"};
    
    public  AfficherListeSujetByCategorie(List lsta){
       
        sujet = lsta; 
      
    }

    @Override
    public int getRowCount() {
        return sujet.size();
    }

    @Override
    public int getColumnCount() {
        return tabart.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
       {
              case 0 : return sujet.get(rowIndex).getId_suj();
              case 1 : return sujet.get(rowIndex).getNom_suj();
              case 2 : return sujet.get(rowIndex).getNom_cat();
              case 3 : return sujet.get(rowIndex).getContenu_suj();
              
              
             default: return null;
       }
    }
    @Override
    public String getColumnName(int column) {
       return  tabart[column];
    }

}
