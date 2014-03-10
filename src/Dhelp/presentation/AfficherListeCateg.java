/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import Dhelp.DAO.CategorieDAO;
import Dhelp.entities.Categorie;
/**
 *
 * @author marwen
 */
public class AfficherListeCateg  extends AbstractTableModel{


List <Categorie> categories;
String [] columTab = {"Identif", "nom de la categ"};
    public AfficherListeCateg() {
        CategorieDAO depotDAO = new CategorieDAO();
        categories = depotDAO.DisplayAllCategories();

    }


    public int getRowCount() {
       return  categories.size();
    }

    public int getColumnCount() {
       return columTab.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
          case 0 : return categories.get(rowIndex).getId_cat();
          case 1 : return categories.get(rowIndex).getNom_cat();
          default: return null;
       }
    }

    @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }



}