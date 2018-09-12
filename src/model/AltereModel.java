/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author italo.francis
 */
public class AltereModel extends AbstractTableModel {
    
     private final List<Altere> dados = new ArrayList<>();
     private final String[] colunas = {"Serial", "MAC","TP Fonte", "TP Carga", "Religador", "CIX1", "CIX2","CIX3", "CIXN","CUX1", "CUX2", "CUX3", "CUX4", "CUX5", "CUX6", "RTC","Tempo Operação" };
      DecimalFormat df = new DecimalFormat("0.0");  
     
     @Override
    public String getColumnName(int column) {

        return colunas[column];

    }
     
     
    @Override
    public int getRowCount() {
     
         return dados.size();
    }

    @Override
    public int getColumnCount() {
         return colunas.length;
    }

  @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {

            case 0:
                return dados.get(linha).getNumSerie();
            case 1:
                return dados.get(linha).getMAC();
            case 2:
                return dados.get(linha).getTpCarga();
            case 3:
                return dados.get(linha).getTpFonte();
            case 4:
                return dados.get(linha).getNumRel();
            case 5:
                return dados.get(linha).getCIX1();
            case 6:
                return dados.get(linha).getCIX2();
            case 7:
                return dados.get(linha).getCIX3();
            case 8:
                return dados.get(linha).getCIXN();
            case 9:
                return dados.get(linha).getCUX1();
            case 10:
                return dados.get(linha).getCUX2();
            case 11:
                return dados.get(linha).getCUX3();
            case 12:
                return dados.get(linha).getCUX4();
            case 13:
                return dados.get(linha).getCUX5();
            case 14:
                return dados.get(linha).getCUX6();
            case 15:
                return dados.get(linha).getRtc();
            case 16:
                return dados.get(linha).getDate();

        }
        return null;

    }

    
    
     public void addRow(Altere altere) {

        this.dados.add(altere);
        this.fireTableDataChanged();

    }
    
     
      public void removeRow() {

        this.dados.removeAll(dados);
        this.fireTableDataChanged();

    }
     
    
}
