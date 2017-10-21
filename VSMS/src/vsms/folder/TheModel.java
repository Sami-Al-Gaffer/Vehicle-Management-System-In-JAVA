
package vsms.folder;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;


public class TheModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public TheModel(){}
    
    public TheModel(Object[][] data,String[] columnName){
        this.columns=columnName;
        this.rows=data;
    }
    
    @Override
    public Class getColumnClass(int column){
    if(column == 7){
        return Icon.class;
    }
    else{
        return (getValueAt(0, column) == null ? Object.class : getValueAt(0, column).getClass());
    }
}
    
    public int getRowCount() {
        return this.rows.length;
        
    }

    
    public int getColumnCount() {
        return this.columns.length;
       }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col){
        return this.columns[col];
    }
    
}
