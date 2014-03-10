/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.presentation;
import Dhelp.DAO.SujetDAO;
import Dhelp.entities.Sujet;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wafa
 */
public class AfficherListeSujet extends  AbstractTableModel{
    


List <Sujet> sujets;
String [] columTab = {"Identif", "nom","nomcateg","contenusujet"};
    public AfficherListeSujet() {
        SujetDAO sujetDAO = new SujetDAO();
        sujets= sujetDAO.DisplayAllSujets();

    }


    public int getRowCount() {
       return  sujets.size();
    }

    public int getColumnCount() {
       return columTab.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
          case 0 : return sujets.get(rowIndex).getId_suj();
          case 1 : return sujets.get(rowIndex).getNom_suj();
          case 2 : return sujets.get(rowIndex).getNom_cat();
          case 3 : return sujets.get(rowIndex).getContenu_suj();
          default: return null;
       }
    }

    @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }



}

