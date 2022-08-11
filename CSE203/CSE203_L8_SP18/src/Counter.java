/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author official_rafsan
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
//import java.awt.TextField;
//import java.awt.BorderLayout;
//import javax.swing.SwingConstants;
//import java.awt.Window.Type;

public class Counter extends JFrame {
	/**
	 * 
	 */

	private JPanel contentPane;
	private JButton btnCountDown;
	private JTextField textField;
	private JLabel lblCount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter frame = new Counter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Counter() {
		setType(Type.POPUP);
		setTitle("Counter");
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 319);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Count Up");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(181, 89, 99, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.getText();
				
				int a = Integer.parseInt(textField.getText());
				if(a<100000) {
					a++; //count up increase
					textField.setText(a+"");
					
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(288, 122, 64, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.getText();
				int a = Integer.parseInt(textField.getText());
				
				a=0; //reset
				textField.setText(a+"");
				
			}
		});
		contentPane.add(btnNewButton_1);
		
		btnCountDown = new JButton("Count Down");
		btnCountDown.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCountDown.setBounds(181, 153, 99, 23);
		btnCountDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.getText();
				
				int a = Integer.parseInt(textField.getText());
				if(a>0) {
					a--;
					textField.setText(a+""); //count down decrease
					
				}
				
			}
			
		});
		contentPane.add(btnCountDown);
		
		textField = new JTextField();
		textField.setBounds(194, 123, 86, 20);
		textField.setText("0");
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblCount = new JLabel("Count");
		lblCount.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCount.setBounds(141, 123, 43, 14);
		lblCount.setForeground(Color.BLACK);
		lblCount.setBackground(Color.WHITE);
		contentPane.add(lblCount);
	}
}
