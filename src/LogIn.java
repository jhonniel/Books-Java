import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
public class LogIn extends JFrame {

	
    JLabel lblUser,lblPassword,lblLogin;
    JTextField txtFirst, txtSecond ;
    
    
    
    JButton btnLogin,btnCancel;
  
    
 
public LogIn() {
	lblUser=new JLabel("Username:");
	lblPassword=new JLabel("Password:");
	lblLogin=new JLabel ("Login");
   
	txtFirst=new JTextField();
	txtSecond=new JPasswordField();
	
	btnLogin=new JButton("Login");
	btnCancel = new JButton("Cancel");
	
	
	
	setLayout(null);
	
	add(lblUser).setBounds(30, 115, 100, 20);
	add(lblPassword).setBounds(30, 150, 130, 20);
	add(lblLogin).setBounds(10,0,100,50);
	
	
	add(txtFirst).setBounds(120, 110, 230, 30);
	add(txtSecond).setBounds(120, 150, 230, 30);
	
	add(btnCancel).setBounds(140, 190, 90, 30);
	add(btnLogin).setBounds(240, 190, 90, 30);

	
	

	
	btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			 String uname = txtFirst.getText();
			   String pass = txtSecond.getText();
			  
			   if(uname.equals("user") && pass.equals("pass"))
			   {
				   JOptionPane.showMessageDialog(null,"login successful",
					      "Tama",JOptionPane.INFORMATION_MESSAGE); 
				  // MainMovie reg= new MainMovie ();
				   Book B=new Book();
					 B.setWindow();
				 
			   }
			   
			   
			    else
			    {
			      JOptionPane.showMessageDialog(null,"Incorrect user or password",
			      "Mali",JOptionPane.ERROR_MESSAGE); 
			    }
			  
			 
    
    	 
    	 
    	 
         }
	});	
	
	
			  
	

  

	
			  
	
	
   btnCancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
	        System.exit(0);
	        
	        
	        
	        
		}});	  
   
   
   


  
  

  
 
   lblUser.setFont(new Font("Arial", Font.BOLD, 15));
   lblPassword.setFont(new Font("Arial", Font.BOLD, 15));
   lblLogin.setFont(new Font("Arial", Font.BOLD, 25));
  
   
   
   txtFirst.setBackground(Color.white);
   txtSecond.setBackground(Color.white);
   
   
   btnLogin.setForeground(Color.white);
   btnCancel.setForeground(Color.white);
   btnLogin.setBackground(Color.blue);
   btnCancel.setBackground(Color.red);
   
   getContentPane().setBackground(new Color(0,14,94,140));
			setTitle("Log In");
			setUndecorated(true);
			setSize(400, 300);
			setLocationRelativeTo(null);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
   
public static void main(String[] args) {
	new LogIn();
}
}