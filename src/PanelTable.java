import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class PanelTable extends JPanel implements MouseListener{
	static JTable tblBook;
	static DefaultTableModel modelbook;
	static TableRowSorter tblSort;
	
	private Database dbPet=new Database("BookStorage.txt");
	private Database dbColumn=new Database("BookColumns.txt");
	private Vector value;
	
	public PanelTable() {
		tblSort=new TableRowSorter();
		modelbook=new DefaultTableModel();
		tblBook=new JTable(modelbook);
		modelbook.setColumnIdentifiers(dbColumn.setColumns());
		dbPet.displayRecords(modelbook);
		tblBook.addMouseListener(this);
		
	
	}

	public void walaNaFinishNa(){
		String records="";	
		for (int row = 0; row < tblBook.getRowCount(); row++) {
			for (int column = 0; column < tblBook.getColumnCount(); column++) {
				records+=tblBook.getValueAt(row, column)+"#";
			}
			records+="\n";
		}
		//JOptionPane.showMessageDialog(null, records);
		dbPet.addRecords(records);
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(tblBook)){
			int row=tblBook.getSelectedRow();
			value=new Vector();
			
			value.add(tblBook.getValueAt(row,0)+"");
			value.add(tblBook.getValueAt(row,1)+"");
			value.add(tblBook.getValueAt(row,2)+"");
			value.add(tblBook.getValueAt(row,3)+"");
			value.add(tblBook.getValueAt(row,4)+"");
			value.add(tblBook.getValueAt(row,5)+"");
			
			
			
			
			PanelInfo.setValues(value);
		
			PanelButtons.setDefaultButtons();
		}
	}
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
}
