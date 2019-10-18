package eg.edu.alexu.csd.oop.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI_Calculator  {
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static Calculator help_to_solve=new Function();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Calculator window = new GUI_Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(613, 97, 258, 73);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setText("INPUT TO SOLVE IT");
		
		//textField.setEditable(true);
		
		
		
		JButton button = new JButton("Backspace");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x1=textField.getText();
			
				String y;
				if(!x1.isEmpty())
				{
					int e1=x1.length();
					y=x1.substring(0, e1-1);
					x1=y;
					
				}
				
				textField.setText(x1);
				textField_1.setText(x1);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(49, 408, 97, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=3;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_1.setBounds(49, 354, 97, 25);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("6");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=6;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_2.setBounds(49, 297, 97, 25);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=7;
				//UI_Calculator t =new Function();
				//textField.setText(t.print());
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
				
			}
		});
		button_3.setBounds(49, 241, 97, 25);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=8;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_4.setBounds(204, 241, 97, 25);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=5;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_5.setBounds(204, 297, 97, 25);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=2;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_6.setBounds(204, 354, 97, 25);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("0");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=0;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_7.setBounds(204, 408, 97, 25);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton(".");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()!=null)
				{
					textField.setText(textField.getText()+" . ");
					textField_2.setText(textField_2.getText()+" . ");
				}
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_8.setBounds(370, 408, 97, 25);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=1;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_9.setBounds(370, 354, 97, 25);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("4");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=4;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_10.setBounds(370, 297, 97, 25);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=9;
				textField.setText(textField.getText()+(Integer.toString(num)));
				textField_2.setText(textField_2.getText()+(Integer.toString(num)));
			}
		});
		button_11.setBounds(370, 241, 97, 25);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()!=null)
				{
					
						textField.setText(textField.getText()+" / ");
						textField_2.setText(textField.getText());
						lblNewLabel.setText("WAIT FOR COMPLETE INPUT TO SOLVE IT");
					
					
				}
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_12.setBounds(531, 241, 97, 25);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()!=null)
				{
					
						textField.setText(textField.getText()+" * ");
						textField_2.setText(textField.getText());
						lblNewLabel.setText("WAIT FOR COMPLETE INPUT TO SOLVE IT");
		
					
				}
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(531, 297, 97, 25);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
			  textField.setText(textField.getText()+" - ");
	    	  textField_2.setText(textField.getText());
			  lblNewLabel.setText("WAIT FOR COMPLETE INPUT TO SOLVE IT");
					
					
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button_14.setBounds(531, 354, 97, 25);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()!=null)
				{
						textField.setText(textField.getText()+" + ");
						textField_2.setText(textField.getText());
						lblNewLabel.setText("WAIT FOR COMPLETE INPUT TO SOLVE IT");
	
					
				}
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_15.setBounds(531, 408, 97, 25);
		frame.getContentPane().add(button_15);
		
		
		
		
		JButton button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()!=null)
				{
					//Calculator help_to_solve=new Function();
					 help_to_solve.input(textField.getText());
					if(help_to_solve.getResult()!="")
					{
						
						textField.setText(String.valueOf(help_to_solve.getResult()));
						lblNewLabel.setText(textField.getText());
					}
					else
					{
						JFrame parent = new JFrame();
			    		 JOptionPane.showMessageDialog(parent, "Please Enter A Second Number ");
					}
				}
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_16.setBounds(644, 241, 97, 25);
		frame.getContentPane().add(button_16);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(382, 97, 206, 73);
		frame.getContentPane().add(textField);
		textField.setEditable(true);
		
		JLabel label = new JLabel("The Result");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(705, 31, 97, 53);
		frame.getContentPane().add(label);
		
		
		
		JLabel label_1 = new JLabel("Equation");
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_1.setBounds(73, 34, 155, 47);
		frame.getContentPane().add(label_1);
		
		JButton btnNewButton_1 = new JButton("Next Operation");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Calculator help_to_solve=new Function();
				String w=help_to_solve.next();
				if(w==null)
				{
					JFrame parent = new JFrame();
		    		 JOptionPane.showMessageDialog(parent, "This is final equation");
				}
				else
				{
					textField.setText(w);
					textField_2.setText(textField.getText());
					
					//help_to_solve.input(textField.getText());
					//lblNewLabel.setText(help_to_solve.getResult());
					
				}
				
				
			}
		});
		btnNewButton_1.setBounds(644, 408, 227, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Previous Operation");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	Calculator help_to_solve=new Function();
				String r=help_to_solve.prev();
				if(r==null)
				{
					JFrame parent = new JFrame();
	    		 JOptionPane.showMessageDialog(parent, "The Stack is Empty‬");
	    		 
				}
				else
				{
					textField.setText(r);	
					textField_2.setText(textField.getText());
					//help_to_solve.input(r);
					//lblNewLabel.setText(help_to_solve.getResult());
				}
				
				
			}
		});
		btnNewButton_2.setBounds(644, 354, 227, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calculator help_to_solve=new Function();
				help_to_solve.save();
				
				
			}
		});
		btnNewButton.setBounds(49, 467, 248, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Current Operation");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Calculator help_to_solve=new Function();
				textField.setText(help_to_solve.current());
				textField_2.setText(textField.getText());
				
				//help_to_solve.input(textField.getText());
				//lblNewLabel.setText(help_to_solve.getResult());
				
				
			}
		});
		btnNewButton_3.setBounds(644, 297, 227, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete All");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_2.setText("");
				lblNewLabel.setText("");
			}
		});
		btnNewButton_4.setBounds(774, 241, 97, 25);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Load");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	Calculator help_to_solve=new Function();
				help_to_solve.load();
			}
		});
		btnNewButton_5.setBounds(370, 467, 258, 25);
		frame.getContentPane().add(btnNewButton_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(49, 97, 284, 73);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(true);
		
		JLabel lblNewLabel_1 = new JLabel("INTIAL RESULT");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(411, 40, 181, 34);
		frame.getContentPane().add(lblNewLabel_1);

		
		
	}
}
