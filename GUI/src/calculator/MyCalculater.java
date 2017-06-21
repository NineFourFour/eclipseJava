package calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MyCalculater extends JFrame /*implements ActionListener*/{
	
	public MyCalculater(){
		/*JFrame Title on frame*/
		super("Calculator");
		setSize(500, 400);
		
		setLocation(550, 200);
		/*when you click the close button the program will stop in eclipse*/
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//JFrame //pane;
		//pane.setLayout(new BoxLayout(pane, arg1));
		setLayout(null);
		initComponents();
		/*make sure setVisible is last, so all components are visible in the frame or do in main*/
		//setVisible(true);
	}
	/*set the components in the frame*/
	private void initComponents(){
		
		JLabel lblFirst = new JLabel("Num1");
		lblFirst.setBounds(50, 30, 40, 30);
		add(lblFirst);
		
		txtFirst = new JTextField();
		txtFirst.setBounds(50, 55, 45, 20);
		add(txtFirst);
		
		JLabel lblSecond = new JLabel("Num2");
		lblSecond.setBounds(150, 30, 50, 30);
		add(lblSecond);
		
		txtSecond = new JTextField();
		txtSecond.setBounds(150, 55, 45, 20);
		add(txtSecond);
		
		lblThird = new JLabel("Result");
		lblThird.setBounds(250, 30, 50, 30);
		//lblThird.setBounds(new BevelBorder(BevelBorder.LOWERED));
		add(lblThird);
		
		txtThird = new JTextField();
		txtThird.setBounds(250, 55, 45, 20);
		txtThird.setBorder(new BevelBorder(BevelBorder.LOWERED));
		add(txtThird);
		
		JLabel lblPlus = new JLabel("+");
		lblPlus.setBounds(115, 55, 50, 20);
		add(lblPlus);
	
		JLabel lblEquals = new JLabel("=");
		lblEquals.setBounds(215, 55, 50, 20);
		add(lblEquals);	
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(315, 55, 100, 20);
		btnCalculate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calculateButton(e);
			}
		});
		add(btnCalculate);
		
		
		
	}
	
	public void calculateButton(ActionEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(this, "clicked on calculate");
		//show which button is pressed
		//JOptionPane.showMessageDialog(this, e.getSource());
		
		try{
		
		
			int num1 = Integer.parseInt(txtFirst.getText());
			
			try{
				int num2 = Integer.parseInt(txtSecond.getText());
				int num3 = num1 + num2;
				txtThird.setText(Integer.toString(num3));
			}catch(NumberFormatException ef){
				JOptionPane.showMessageDialog(this, "Enter Second number");
				txtSecond.requestFocus();
				txtSecond.selectAll();
			}
		}catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(this, "Enter first number");
			txtFirst.requestFocus();
			txtFirst.selectAll();
		}
		//txtThird.setText(""+(num1+num2));
		//JOptionPane.showMessageDialog(this, num1+num2);
	}
	
	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		calculateButton();
	}*/
	public static void main(String[] args) {
		new MyCalculater().setVisible(true);
		
	}
	//Member variables
	private JTextField txtSecond;
	private JTextField txtFirst;
	private JTextField txtThird;
	private JLabel lblThird;
}
