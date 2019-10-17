/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda.gui.tableModels;

import Agenda.dto.Contacto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author miguel
 */
public class ContactosTableModel extends AbstractTableModel {

    private List<Contacto> listaContactos;
    private String[] cabeceras = {"Nombre", "Apellidos", "DNI", "Telefono"};

    public ContactosTableModel(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    @Override
    public int getRowCount() {
        return listaContactos.size();
    }

    @Override
    public int getColumnCount() {
        return cabeceras.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaContactos.get(rowIndex).getNombre();
            case 1:
                return listaContactos.get(rowIndex).getApellidos();
            case 2:
                return listaContactos.get(rowIndex).getDni();
            case 3:
                return listaContactos.get(rowIndex).getTelefono();
        }
        return null;
    }

    public String getColumnName(int i) {
        return cabeceras[i];
    }

    //creamos este método que borra una entrada en la tabla
    public void deleteRow(int row) {
        if (!(listaContactos.size() == 0)) {
            listaContactos.remove(row);         //borra la fila
            //fireTableRowsDeleted(row, row);    //Notifica a todos los listeners que las filas dentro del rango [firstRow, lastRow], inclusive, han sido eliminadas
            fireTableDataChanged();  //Notifica a todos los listeners que el valor de la tabla ha cambiado (con esto saltan las acciones necesarias como repintar la tabla
        }
    }

    public void refrescar() {
        fireTableDataChanged();  //Notifica a todos los listeners que el valor de la tabla ha cambiado (con esto saltan las acciones necesarias como repintar la tabla
    }

}
