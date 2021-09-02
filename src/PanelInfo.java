import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelInfo extends JPanel implements KeyListener,MouseListener{
	private JLabel lblID,lblBook,lblAuthor,lblYear,lblBorrower,lblNcopie;
	static JTextField txtID,txtBook,txtAuthor,txtYear,txtBorrower,txtNcopie;
	
	//private static JComboBox cboBreed,cboType,cboTime;
	//private static JButton btnCal;
	
Book p=new Book();


	//private Database dbBreed=new Database("Breed.txt");
	//private Database dbType=new Database("Type.txt");
	
	private static Vector rows;
	
	
		
	
	public PanelInfo() {
		
		lblID =new JLabel("Book ID ");
		lblBorrower =new JLabel("Borrower");
		lblNcopie =new JLabel("No. of Copy");
		lblBook =new JLabel("Book Name: ");
		lblAuthor =new JLabel("Author:");
		lblYear =new JLabel("Year : ");
	
		
		txtID=new JTextField();
		txtID.setEditable(false);
		txtBorrower=new JTextField();
		txtNcopie=new JTextField();
		txtBook=new JTextField();
		txtAuthor=new JTextField();
		txtYear=new JTextField();
		
		
		
		 setLayout(new GridLayout(2,4));
		 setBorder(BorderFactory.createTitledBorder(null,"Book Management System",
				TitledBorder.CENTER,2));
		 add(txtID);add(new JLabel(""));
		 add(txtBorrower);add(new JLabel(""));
		 add(txtNcopie);add(new JLabel(""));
		 add(txtBook);add(new JLabel(""));
		 add(txtAuthor);add(new JLabel(""));
		 add(txtYear);add(new JLabel(""));
		 add(lblID);add(new JLabel(""));
		 add(lblBorrower);add(new JLabel(""));
		 add(lblNcopie);add(new JLabel(""));
		 add(lblBook); add(new JLabel(""));
		 add(lblAuthor);add(new JLabel(""));
		 add(lblYear);add(new JLabel(""));
		
		 
	
		
	
		setBackground(Color.GRAY); 
		 
		 
	   
		txtID.setText((PanelTable.tblBook.getRowCount()+1)+"");

		
	}
	
	
	
	
	public static void clear(){
		txtID.setText((PanelTable.tblBook.getRowCount()+1)+"");
		txtBorrower.setText("");
		txtNcopie.setText("");
		txtBook.setText("");
		txtAuthor.setText("");
		txtYear.setText("");

		
	}
	
	public static Vector getValues(){
		rows=new Vector();
		rows.add(txtID.getText());
		rows.add(txtBorrower.getText());
		rows.add(txtNcopie.getText());
		rows.add(txtBook.getText());
		rows.add(txtAuthor.getText());
		rows.add(txtYear.getText());
	
		return rows;
	}
	public static void setValues(Vector value){
		txtID.setText(value.get(0).toString());
		txtBorrower.setText(value.get(1).toString());
		txtNcopie.setText(value.get(2).toString());
		txtBook.setText(value.get(3).toString());
		txtAuthor.setText(value.get(4).toString());
		txtYear.setText(value.get(5).toString());
	
	}

	
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {
		if(e.getSource().equals(txtYear)){
			if(e.getKeyChar()=='-'){
				e.consume();
			}
		}else if(e.getSource().equals(txtYear)){
			if(e.getKeyChar()>='a' && e.getKeyChar()<='z'){
				e.consume();
			}
			//if(!(e.getKeyChar()>='a' && e.getKeyChar()<='z')){
		}
	}
	

	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { 
		
	}
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	
	
	        }
	        
	      
	       
	        
	      
	        
	        
	        
 
   
	}


