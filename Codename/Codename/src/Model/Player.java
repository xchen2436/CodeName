package Model;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Player extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldR1;
	private JTextField textFieldR2;
	private JTextField textFieldR3;
	private JTextField textFieldR4;
	private JTextField textFieldB1;
	private JTextField textFieldB2;
	private JTextField textFieldB3;
	private JTextField textFieldB4;
	private JButton btnAddR1;
	private JButton btnAddR2;
	private JButton btnAddR3;
	private JButton btnAddR4;
	private JButton btnAddB1;
	private JButton btnAddB2;
	private JButton btnAddB3;
	private JButton btnAddB4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblOperatives;
	private JLabel lblOperatives_1;

	/**
	 * Create the frame.
	 */
	public Player() {
		
		Team Team = new Team();
		/*Create team panel*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textFieldR1 = new JTextField();
		textFieldR1.setBounds(91, 121, 184, 43);
		contentPane.add(textFieldR1);
		textFieldR1.setColumns(10);
		textFieldR2 = new JTextField();
		textFieldR2.setColumns(10);
		textFieldR2.setBounds(91, 217, 184, 43);
		contentPane.add(textFieldR2);
		textFieldR3 = new JTextField();
		textFieldR3.setColumns(10);
		textFieldR3.setBounds(91, 313, 184, 43);
		contentPane.add(textFieldR3);
		textFieldR4 = new JTextField();
		textFieldR4.setColumns(10);
		textFieldR4.setBounds(91, 416, 184, 43);
		contentPane.add(textFieldR4);
		textFieldB1 = new JTextField();
		textFieldB1.setColumns(10);
		textFieldB1.setBounds(589, 121, 184, 43);
		contentPane.add(textFieldB1);
		textFieldB2 = new JTextField();
		textFieldB2.setColumns(10);
		textFieldB2.setBounds(589, 217, 184, 43);
		contentPane.add(textFieldB2);
		textFieldB3 = new JTextField();
		textFieldB3.setColumns(10);
		textFieldB3.setBounds(589, 313, 184, 43);
		contentPane.add(textFieldB3);
		textFieldB4 = new JTextField();
		textFieldB4.setColumns(10);
		textFieldB4.setBounds(589, 416, 184, 43);
		contentPane.add(textFieldB4);
		assignSpyMaster();
		enterUsername();
		generatePlayer();
	}
	
		/*Assign SpyMaster*/
		private void assignSpyMaster() {
		btnAddR1 = new JButton("Add R1");
		btnAddR1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddR1.setForeground(Color.RED);
		btnAddR1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldR1.getText().equals("") == false) {
					textFieldR2.setVisible(true);
					btnAddR2.setVisible(true);
					JOptionPane.showMessageDialog(null, "Spymaster " + textFieldR1.getText() + " has added.");
				}
			}
		});
		btnAddR1.setBounds(302, 131, 129, 23);
		contentPane.add(btnAddR1);
		btnAddB1 = new JButton("Add B1");
		btnAddB1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddB1.setForeground(Color.BLUE);
		btnAddB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldB1.getText().equals("") == false) {
					textFieldB2.setVisible(true);
					btnAddB2.setVisible(true);
					JOptionPane.showMessageDialog(null, "Spymaster " + textFieldB1.getText() + " has added.");
				}
			}
		});
		btnAddB1.setBounds(799, 131, 129, 23);
		contentPane.add(btnAddB1);
	}

		/*Enter player username*/
		public void enterUsername() {
			btnAddR2 = new JButton("Add R2");
			btnAddR2.setForeground(Color.RED);
			btnAddR2.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAddR2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {					
					if(textFieldR2.getText().equals("") == false) {
						textFieldR3.setVisible(true);
						btnAddR3.setVisible(true);
						JOptionPane.showMessageDialog(null, "Player " + textFieldR2.getText() + " has added.");						
					}
				}
			});
			btnAddR2.setBounds(302, 227, 129, 23);
			contentPane.add(btnAddR2);
			
			btnAddR3 = new JButton("Add R3");
			btnAddR3.setForeground(Color.RED);
			btnAddR3.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAddR3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textFieldR3.getText().equals("") == false) {
						textFieldR4.setVisible(true);
						btnAddR4.setVisible(true);
						JOptionPane.showMessageDialog(null, "Player " + textFieldR3.getText() + " has added.");
					}
				}
			});
			btnAddR3.setBounds(302, 323, 129, 23);
			contentPane.add(btnAddR3);			
			btnAddR4 = new JButton("Add R4");
			btnAddR4.setForeground(Color.RED);
			btnAddR4.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAddR4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Player " + textFieldR4.getText() + " has added.");
				}
			});
			btnAddR4.setBounds(302, 426, 129, 23);
			contentPane.add(btnAddR4);			
			btnAddB2 = new JButton("Add B2");
			btnAddB2.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAddB2.setForeground(Color.BLUE);
			btnAddB2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textFieldB2.getText().equals("") == false) {
						textFieldB3.setVisible(true);
						btnAddB3.setVisible(true);
						JOptionPane.showMessageDialog(null, "Player " + textFieldB2.getText() + " has added.");
					}
				}
			});
			btnAddB2.setBounds(799, 227, 129, 23);
			contentPane.add(btnAddB2);			
			btnAddB3 = new JButton("Add B3");
			btnAddB3.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAddB3.setForeground(Color.BLUE);
			btnAddB3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textFieldB3.getText().equals("") == false) {
						textFieldB4.setVisible(true);
						btnAddB4.setVisible(true);
						JOptionPane.showMessageDialog(null, "Player" + textFieldB3.getText() + " has added.");
					}
				}				
			});
			btnAddB3.setBounds(799, 323, 129, 23);
			contentPane.add(btnAddB3);			
			btnAddB4 = new JButton("Add B4");
			btnAddB4.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAddB4.setForeground(Color.BLUE);
			btnAddB4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Player " + textFieldB4.getText() + " has added.");
				}
			});
			btnAddB4.setBounds(799, 426, 129, 23);
			contentPane.add(btnAddB4);
			textFieldR2.setVisible(false);
			textFieldR3.setVisible(false);
			textFieldR4.setVisible(false);
			btnAddR2.setVisible(false);
			btnAddR3.setVisible(false);
			btnAddR4.setVisible(false);
			textFieldB2.setVisible(false);
			textFieldB3.setVisible(false);
			textFieldB4.setVisible(false);
			btnAddB2.setVisible(false);
			btnAddB3.setVisible(false);
			btnAddB4.setVisible(false);		
		}
		
		/*Generate number of players*/
		public void generatePlayer() {
			JButton btnContinue = new JButton("CONTINUE");
			btnContinue.setForeground(Color.BLACK);
			btnContinue.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnContinue.setBounds(352, 595, 179, 59);
			contentPane.add(btnContinue);			
			JLabel lblRed = new JLabel("RED TEAM(START TEAM)");
			lblRed.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblRed.setForeground(Color.RED);
			lblRed.setBounds(91, 44, 273, 43);
			contentPane.add(lblRed);			
			JLabel lblBlueTeam = new JLabel("BLUE TEAM");
			lblBlueTeam.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblBlueTeam.setForeground(Color.BLUE);
			lblBlueTeam.setBounds(589, 44, 179, 43);
			contentPane.add(lblBlueTeam);			
			lblNewLabel = new JLabel("Spymaster");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setBounds(91, 87, 94, 23);
			contentPane.add(lblNewLabel);			
			lblNewLabel_1 = new JLabel("Spymaster");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1.setBounds(589, 87, 94, 23);
			contentPane.add(lblNewLabel_1);			
			lblOperatives = new JLabel("Operatives");
			lblOperatives.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblOperatives.setBounds(91, 183, 94, 23);
			contentPane.add(lblOperatives);			
			lblOperatives_1 = new JLabel("Operatives");
			lblOperatives_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblOperatives_1.setBounds(589, 183, 94, 23);
			contentPane.add(lblOperatives_1);
			btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldR4.getText().isEmpty() == false) {
					Team.redPlayerNumber = 4;
				}else if(textFieldR3.getText().isEmpty() == false) {
					Team.redPlayerNumber = 3;
				}else if(textFieldR2.getText().isEmpty() == false) {
					Team.redPlayerNumber = 2;
				}else if(textFieldR1.getText().isEmpty() == false) {
					Team.redPlayerNumber = 1;
				}
				if(textFieldB4.getText().isEmpty() == false) {
					Team.bluePlayerNumber = 4;
				}else if(textFieldB3.getText().isEmpty() == false) {
					Team.bluePlayerNumber = 3;
				}else if(textFieldB2.getText().isEmpty() == false) {
					Team.bluePlayerNumber = 2;
				}else if(textFieldB1.getText().isEmpty() == false) {
					Team.bluePlayerNumber = 1;
				}
				Team.validateNumberOfPlayers();
			}
		});
	}
}