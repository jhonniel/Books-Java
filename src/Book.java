import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Book extends JFrame implements WindowListener,MouseListener{
	Vector rows;
	
	PanelTable table=new PanelTable();
	JScrollPane pane;
	Database dbPet=new Database("BookStorage.txt");

	Book(){ } //end of constructor
	
	public void setWindow(){

		
		
	
		pane=new JScrollPane();
		pane.setViewportView(PanelTable.tblBook); //so table is viewed
		
		setLayout(null);
		table.setBackground(Color.BLUE);
		add(new PanelInfo()).setBounds(12,10, 890, 100);
		add(new PanelButtons()).setBounds(105, 400, 750, 30);
		add(new PanelSearch()).setBounds(5,115,200,30);
		
		add(new JScrollPane(PanelTable.tblBook)).setBounds(100,150,760,240);
		getContentPane().setBackground(Color.BLUE);
		setTitle("Book Management System");
		setSize(950, 500);
		
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowListener(this);
		addMouseListener(this);
		
	
	} //end of setWindow
	
	public void Shutdown(){
		String records="";	
		for (int row = 0; row < PanelTable.tblBook.getRowCount(); row++) {
			for (int column = 0; column < PanelTable.tblBook.getColumnCount(); column++) {
				records+=PanelTable.tblBook.getValueAt(row, column)+"#";
			}
			records+="\n";
		}
		//JOptionPane.showMessageDialog(null, records);
		dbPet.addRecords(records);
	}
	
	
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {
		Shutdown();
	}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}

	public void mouseClicked(MouseEvent e) {
		PanelButtons.setSaveButtons();
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
	
}//end of class
