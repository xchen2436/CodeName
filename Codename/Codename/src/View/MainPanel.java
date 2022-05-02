package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.WordBoard;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.Spring;

import java.awt.*;

public class MainPanel extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public MainPanel() {
		try {
			generateWordboard();
			changeBackgroundColor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		Model.GameEngine GameEngine = new Model.GameEngine();
		Model.WordBoard Wordboard = new Model.WordBoard();
		Model.Clue Clue = new Model.Clue();
		
		public void generateWordboard() throws IOException 
		{			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1256, 914);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			/*Create Operativespanel and Spymasterpanel*/
			JPanel Operativespanel = new JPanel();
			Operativespanel.setBounds(253, 93, 741, 541);
			contentPane.add(Operativespanel);
			Operativespanel.setLayout(null);			
			JPanel Spymasterpanel = new JPanel();
			Spymasterpanel.setBounds(253, 93, 741, 541);
			contentPane.add(Spymasterpanel);
			Spymasterpanel.setLayout(null);			
			JButton btnChangeToSpymaster = new JButton("Change To Spymaster");
			btnChangeToSpymaster.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnChangeToSpymaster.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Clue.resetClue();
					Operativespanel.setVisible(false);
					Spymasterpanel.setVisible(true);
				}
			});
			btnChangeToSpymaster.setBounds(512, 478, 215, 51);
			Operativespanel.add(btnChangeToSpymaster);			
			JButton btnButton1 = new JButton((String) null);
			btnButton1.setBounds(10, 11, 109, 57);
			Operativespanel.add(btnButton1);			
			JButton btnButton6 = new JButton((String) null);
			btnButton6.setBounds(10, 91, 109, 57);
			Operativespanel.add(btnButton6);			
			JButton btnButton11 = new JButton((String) null);
			btnButton11.setBounds(10, 171, 109, 57);
			Operativespanel.add(btnButton11);			
			JButton btnButton21 = new JButton((String) null);
			btnButton21.setBounds(10, 323, 109, 57);
			Operativespanel.add(btnButton21);			
			JButton btnButton2 = new JButton((String) null);
			btnButton2.setBounds(176, 11, 109, 57);
			Operativespanel.add(btnButton2);			
			JButton btnButton7 = new JButton((String) null);
			btnButton7.setBounds(176, 91, 109, 57);
			Operativespanel.add(btnButton7);			
			JButton btnButton12 = new JButton((String) null);
			btnButton12.setBounds(176, 171, 109, 57);
			Operativespanel.add(btnButton12);			
			JButton btnButton17 = new JButton((String) null);
			btnButton17.setBounds(176, 248, 109, 57);
			Operativespanel.add(btnButton17);			
			JButton btnButton22 = new JButton((String) null);
			btnButton22.setBounds(176, 323, 109, 57);
			Operativespanel.add(btnButton22);			
			JButton btnButton24 = new JButton((String) null);
			btnButton24.setBounds(477, 323, 109, 57);
			Operativespanel.add(btnButton24);			
			JButton btnButton18 = new JButton((String) null);
			btnButton18.setBounds(327, 248, 109, 57);
			Operativespanel.add(btnButton18);			
			JButton btnButton23 = new JButton((String) null);
			btnButton23.setBounds(327, 323, 109, 57);
			Operativespanel.add(btnButton23);			
			JButton btnButton13 = new JButton((String) null);
			btnButton13.setBounds(327, 171, 109, 57);
			Operativespanel.add(btnButton13);			
			JButton btnButton8 = new JButton((String) null);
			btnButton8.setBounds(327, 91, 109, 57);
			Operativespanel.add(btnButton8);			
			JButton btnButton3 = new JButton((String) null);
			btnButton3.setBounds(327, 11, 109, 57);
			Operativespanel.add(btnButton3);			
			JButton btnButton4 = new JButton((String) null);
			btnButton4.setBounds(477, 11, 109, 57);
			Operativespanel.add(btnButton4);			
			JButton btnButton9 = new JButton((String) null);
			btnButton9.setBounds(477, 91, 109, 57);
			Operativespanel.add(btnButton9);			
			JButton btnButton16 = new JButton((String) null);
			btnButton16.setBounds(10, 248, 109, 57);
			Operativespanel.add(btnButton16);			
			JButton btnButton14 = new JButton((String) null);
			btnButton14.setBounds(477, 171, 109, 57);
			Operativespanel.add(btnButton14);			
			JButton btnButton19 = new JButton((String) null);
			btnButton19.setBounds(477, 248, 109, 57);
			Operativespanel.add(btnButton19);			
			JButton btnButton10 = new JButton((String) null);
			btnButton10.setBounds(618, 91, 109, 57);
			Operativespanel.add(btnButton10);			
			JButton btnButton5 = new JButton((String) null);
			btnButton5.setBounds(618, 11, 109, 57);
			Operativespanel.add(btnButton5);			
			JButton btnButton15 = new JButton((String) null);
			btnButton15.setBounds(618, 171, 109, 57);
			Operativespanel.add(btnButton15);			
			JButton btnButton20 = new JButton((String) null);
			btnButton20.setBounds(618, 248, 109, 57);
			Operativespanel.add(btnButton20);			
			JButton btnButton25 = new JButton((String) null);
			btnButton25.setBounds(618, 323, 109, 57);
			Operativespanel.add(btnButton25);
		
			/*Clue of operatives panel*/
			JLabel lblClue = new JLabel("Clue :");
			lblClue.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblClue.setBounds(10, 447, 257, 42);
			Operativespanel.add(lblClue);			
			JLabel lblNumberOfClue = new JLabel("Number of clue :");
			lblNumberOfClue.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNumberOfClue.setBounds(10, 487, 257, 42);
			Operativespanel.add(lblNumberOfClue);			
			Clue.textFieldDisplayClue = new JTextField();
			Clue.textFieldDisplayClue.setColumns(10);
			Clue.textFieldDisplayClue.setBounds(294, 438, 150, 40);
			Operativespanel.add(Clue.textFieldDisplayClue);
			Clue.textFieldDisplayClue.setEditable(false);			
			Clue.textFieldDisplayClueNumber = new JTextField();
			Clue.textFieldDisplayClueNumber.setEditable(false);
			Clue.textFieldDisplayClueNumber.setColumns(10);
			Clue.textFieldDisplayClueNumber.setBounds(294, 488, 150, 40);
			Operativespanel.add(Clue.textFieldDisplayClueNumber);	
			
			/*Clue of spymaster panel*/
			Clue.textFieldClue = new JTextField();
			Clue.textFieldClue.setBounds(294, 438, 150, 40);
			Spymasterpanel.add(Clue.textFieldClue);
			Clue.textFieldClue.setColumns(10);			
			Clue.textFieldNumber = new JTextField();
			Clue.textFieldNumber.setBounds(294, 488, 150, 40);
			Spymasterpanel.add(Clue.textFieldNumber);
			Clue.textFieldNumber.setColumns(10);			
			JButton btnSubmiteClue = new JButton("Submit Clue");
			btnSubmiteClue.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnSubmiteClue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (Clue.displayClue()) {
						Operativespanel.setVisible(true);
						Spymasterpanel.setVisible(false);
					}
				}
			});
			btnSubmiteClue.setBounds(512, 481, 215, 51);
			Spymasterpanel.add(btnSubmiteClue);			
			JLabel lblClue_1 = new JLabel("Clue :");
			lblClue_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblClue_1.setBounds(10, 447, 257, 42);
			Spymasterpanel.add(lblClue_1);			
			JLabel lblNumberOfClue_1 = new JLabel("Number of clue :");
			lblNumberOfClue_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNumberOfClue_1.setBounds(10, 487, 257, 42);
			Spymasterpanel.add(lblNumberOfClue_1);			
			JButton btnSMButton1 = new JButton((String) null);
			btnSMButton1.setBounds(10, 11, 109, 57);
			Spymasterpanel.add(btnSMButton1);			
			JButton btnSMButton6 = new JButton((String) null);
			btnSMButton6.setBounds(10, 91, 109, 57);
			Spymasterpanel.add(btnSMButton6);			
			JButton btnSMButton11 = new JButton((String) null);
			btnSMButton11.setBounds(10, 171, 109, 57);
			Spymasterpanel.add(btnSMButton11);			
			JButton btnSMButton16 = new JButton((String) null);
			btnSMButton16.setBounds(10, 248, 109, 57);
			Spymasterpanel.add(btnSMButton16);			
			JButton btnSMButton21 = new JButton((String) null);
			btnSMButton21.setBounds(10, 323, 109, 57);
			Spymasterpanel.add(btnSMButton21);			
			JButton btnSMButton2 = new JButton((String) null);
			btnSMButton2.setBounds(176, 11, 109, 57);
			Spymasterpanel.add(btnSMButton2);			
			JButton btnSMButton7 = new JButton((String) null);
			btnSMButton7.setBounds(176, 91, 109, 57);
			Spymasterpanel.add(btnSMButton7);			
			JButton btnSMButton12 = new JButton((String) null);
			btnSMButton12.setBounds(176, 171, 109, 57);
			Spymasterpanel.add(btnSMButton12);			
			JButton btnSMButton17 = new JButton((String) null);
			btnSMButton17.setBounds(176, 248, 109, 57);
			Spymasterpanel.add(btnSMButton17);			
			JButton btnSMButton22 = new JButton((String) null);
			btnSMButton22.setBounds(176, 323, 109, 57);
			Spymasterpanel.add(btnSMButton22);			
			JButton btnSMButton3 = new JButton((String) null);
			btnSMButton3.setBounds(327, 11, 109, 57);
			Spymasterpanel.add(btnSMButton3);			
			JButton btnSMButton8 = new JButton((String) null);
			btnSMButton8.setBounds(327, 91, 109, 57);
			Spymasterpanel.add(btnSMButton8);			
			JButton btnSMButton13 = new JButton((String) null);
			btnSMButton13.setBounds(327, 171, 109, 57);
			Spymasterpanel.add(btnSMButton13);			
			JButton btnSMButton18 = new JButton((String) null);
			btnSMButton18.setBounds(327, 248, 109, 57);
			Spymasterpanel.add(btnSMButton18);			
			JButton btnSMButton23 = new JButton((String) null);
			btnSMButton23.setBounds(327, 323, 109, 57);
			Spymasterpanel.add(btnSMButton23);			
			JButton btnSMButton24 = new JButton((String) null);
			btnSMButton24.setBounds(477, 323, 109, 57);
			Spymasterpanel.add(btnSMButton24);			
			JButton btnSMButton19 = new JButton((String) null);
			btnSMButton19.setBounds(477, 248, 109, 57);
			Spymasterpanel.add(btnSMButton19);			
			JButton btnSMButton14 = new JButton((String) null);
			btnSMButton14.setBounds(477, 171, 109, 57);
			Spymasterpanel.add(btnSMButton14);			
			JButton btnSMButton9 = new JButton((String) null);
			btnSMButton9.setBounds(477, 91, 109, 57);
			Spymasterpanel.add(btnSMButton9);			
			JButton btnSMButton4 = new JButton((String) null);
			btnSMButton4.setBounds(477, 11, 109, 57);
			Spymasterpanel.add(btnSMButton4);
			JButton btnSMButton10 = new JButton((String) null);
			btnSMButton10.setBounds(618, 91, 109, 57);
			Spymasterpanel.add(btnSMButton10);	
			JButton btnSMButton5 = new JButton((String) null);
			btnSMButton5.setBounds(618, 11, 109, 57);
			Spymasterpanel.add(btnSMButton5);		
			JButton btnSMButton15 = new JButton((String) null);
			btnSMButton15.setBounds(618, 171, 109, 57);
			Spymasterpanel.add(btnSMButton15);			
			JButton btnSMButton20 = new JButton((String) null);
			btnSMButton20.setBounds(618, 248, 109, 57);
			Spymasterpanel.add(btnSMButton20);			
			JButton btnSMButton25 = new JButton((String) null);
			btnSMButton25.setBounds(618, 323, 109, 57);
			Spymasterpanel.add(btnSMButton25);
			JLabel lblTurn = new JLabel("RED TEAM TURN");
			lblTurn.setBounds(263, 645, 687, 30);
			contentPane.add(lblTurn);
			lblTurn.setForeground(Color.RED);
			lblTurn.setFont(new Font("Tahoma", Font.BOLD, 15));
			
			/*Validate Card*/
			btnButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton1.getBackground().equals(Color.red)) {				
							btnButton1.setBackground(btnSMButton1.getBackground());
							btnButton1.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton1.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton1.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton1.getBackground().equals(Color.blue)){							
							btnButton1.setBackground(btnSMButton1.getBackground());
							btnButton1.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton1.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton1.getBackground().equals(Color.white)) {							
							btnButton1.setBackground(btnSMButton1.getBackground());
							btnButton1.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton1.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton1.getBackground().equals(Color.blue)) {
							btnButton1.setBackground(btnSMButton1.getBackground());
							btnButton1.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton1.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton1.getBackground().equals(Color.black)) {
							btnButton1.setBackground(btnSMButton1.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton1.getBackground().equals(Color.red)){
							btnButton1.setBackground(btnSMButton1.getBackground());
							btnButton1.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton1.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton1.getBackground().equals(Color.white)) {
							btnButton1.setBackground(btnSMButton1.getBackground());
							btnButton1.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton1.setText("");
						}
					}
				}
			});
			btnButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton2.getBackground().equals(Color.red)) {
							btnButton2.setBackground(btnSMButton2.getBackground());
							btnButton2.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton2.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton2.getBackground().equals(Color.black)) {
							btnButton2.setBackground(btnSMButton2.getBackground());
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();	
						}else if(btnSMButton2.getBackground().equals(Color.blue)){
							btnButton2.setBackground(btnSMButton2.getBackground());
							btnButton2.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton2.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton2.getBackground().equals(Color.white)) {
							btnButton2.setBackground(btnSMButton2.getBackground());
							btnButton2.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton2.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton2.getBackground().equals(Color.blue)) {
							btnButton2.setBackground(btnSMButton2.getBackground());
							btnButton2.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton2.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton2.getBackground().equals(Color.black)) {
							btnButton2.setBackground(btnSMButton2.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton2.getBackground().equals(Color.red)){
							btnButton2.setBackground(btnSMButton2.getBackground());
							btnButton2.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton2.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton2.getBackground().equals(Color.white)){
							btnButton2.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton2.setText("");
							btnButton2.setBackground(btnSMButton2.getBackground());
						}
					}
				}
			});
			btnButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(lblTurn.getForeground()== Color.red) {
							if (btnSMButton3.getBackground().equals(Color.red)) {
								btnButton3.setBackground(btnSMButton3.getBackground());
								btnButton3.setEnabled(false);
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								btnSMButton3.setText("");
								GameEngine.countSecondClick();
								if(GameEngine.secondclick == 2) {
									lblTurn.setText("BLUE TEAM TURN");
									lblTurn.setForeground(Color.blue);
									GameEngine.secondclick = 0;
								}
								GameEngine.countRed();
								GameEngine.genarateWinner();
							}else if(btnSMButton3.getBackground().equals(Color.black)) {
								btnButton3.setBackground(btnSMButton3.getBackground());
								Clue.resetClue();
								lblTurn.setText("GAME OVER");
								lblTurn.setForeground(Color.black);
								JOptionPane.showMessageDialog(null, "GAME OVER");
								JOptionPane.showMessageDialog(null, "Winner is BLUE team");
								GameEngine.resetGame();	
							}else if(btnSMButton3.getBackground().equals(Color.blue)){
								btnButton3.setBackground(btnSMButton3.getBackground());
								btnButton3.setEnabled(false);
								Clue.resetClue();
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								btnSMButton3.setText("");
								GameEngine.countBlue();
								GameEngine.genarateWinner();
							}
							else if(btnSMButton3.getBackground().equals(Color.white)) {
								btnButton3.setBackground(btnSMButton3.getBackground());
								btnButton3.setEnabled(false);
								Clue.resetClue();
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								btnSMButton3.setText("");
							}
						}
						else if(lblTurn.getForeground()== Color.blue) 
						{	
							if (btnSMButton3.getBackground().equals(Color.blue)) {
								btnButton3.setBackground(btnSMButton3.getBackground());
								btnButton3.setEnabled(false);
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								btnSMButton3.setText("");
								GameEngine.countSecondClick();
								if(GameEngine.secondclick == 2) {
									lblTurn.setText("RED TEAM TURN");
									lblTurn.setForeground(Color.red);
									GameEngine.secondclick = 0;
								}
								GameEngine.countBlue();
								GameEngine.genarateWinner();
							}else if(btnSMButton3.getBackground().equals(Color.black)) {
								btnButton3.setBackground(btnSMButton3.getBackground());
								Clue.resetClue();
								lblTurn.setText("");
								lblTurn.setForeground(Color.black);
								JOptionPane.showMessageDialog(null, "GAME OVER");
								JOptionPane.showMessageDialog(null, "Winner is RED team");
								GameEngine.resetGame();
							}else if(btnSMButton3.getBackground().equals(Color.red)){
								btnButton3.setBackground(btnSMButton3.getBackground());
								btnButton3.setEnabled(false);
								Clue.resetClue();
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								btnSMButton3.setText("");
								GameEngine.countRed();
								GameEngine.genarateWinner();
							}else if(btnSMButton3.getBackground().equals(Color.white)) {
								btnButton3.setEnabled(false);
								Clue.resetClue();
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								btnSMButton3.setText("");
								btnButton3.setBackground(btnSMButton3.getBackground());
							}
						}
				}
			});
			btnButton4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton4.getBackground().equals(Color.red)) {				
							btnButton4.setBackground(btnSMButton4.getBackground());
							btnButton4.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton1.setText("");							
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton4.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton4.getBackground().equals(Color.blue)){							
							btnButton4.setBackground(btnSMButton4.getBackground());
							btnButton4.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton4.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton4.getBackground().equals(Color.white)) {							
							btnButton4.setBackground(btnSMButton4.getBackground());
							btnButton4.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton4.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton4.getBackground().equals(Color.blue)) {
							btnButton4.setBackground(btnSMButton4.getBackground());
							btnButton4.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton4.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton4.getBackground().equals(Color.black)) {
							btnButton4.setBackground(btnSMButton4.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton4.getBackground().equals(Color.red)){
							btnButton4.setBackground(btnSMButton4.getBackground());
							btnButton4.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton4.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton4.getBackground().equals(Color.white)) {
							btnButton4.setBackground(btnSMButton4.getBackground());
							btnButton4.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton1.setText("");
						}
					}
				}
			});
			btnButton5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton5.getBackground().equals(Color.red)) {				
							btnButton5.setBackground(btnSMButton5.getBackground());
							btnButton5.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton5.setText("");							
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton5.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton5.getBackground().equals(Color.blue)){							
							btnButton5.setBackground(btnSMButton5.getBackground());
							btnButton5.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton5.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton5.getBackground().equals(Color.white)) {							
							btnButton5.setBackground(btnSMButton5.getBackground());
							btnButton5.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton5.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton5.getBackground().equals(Color.blue)) {
							btnButton5.setBackground(btnSMButton5.getBackground());
							btnButton5.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton5.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton5.getBackground().equals(Color.black)) {
							btnButton5.setBackground(btnSMButton5.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton5.getBackground().equals(Color.red)){
							btnButton5.setBackground(btnSMButton5.getBackground());
							btnButton5.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton5.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton5.getBackground().equals(Color.white)) {
							btnButton5.setBackground(btnSMButton5.getBackground());
							btnButton5.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton5.setText("");
						}
					}
				}
			});
			btnButton6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton6.getBackground().equals(Color.red)) {				
							btnButton6.setBackground(btnSMButton6.getBackground());
							btnButton6.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton6.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton6.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton6.getBackground().equals(Color.blue)){							
							btnButton6.setBackground(btnSMButton6.getBackground());
							btnButton6.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton6.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton6.getBackground().equals(Color.white)) {							
							btnButton6.setBackground(btnSMButton6.getBackground());
							btnButton6.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton6.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton6.getBackground().equals(Color.blue)) {
							btnButton6.setBackground(btnSMButton6.getBackground());
							btnButton6.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton6.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton6.getBackground().equals(Color.black)) {
							btnButton6.setBackground(btnSMButton6.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton6.getBackground().equals(Color.red)){
							btnButton6.setBackground(btnSMButton6.getBackground());
							btnButton6.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton6.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton6.getBackground().equals(Color.white)) {
							btnButton6.setBackground(btnSMButton6.getBackground());
							btnButton6.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton6.setText("");
						}
					}
				}
			});
			btnButton7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton7.getBackground().equals(Color.red)) {				
							btnButton7.setBackground(btnSMButton7.getBackground());
							btnButton7.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton7.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton7.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton7.getBackground().equals(Color.blue)){							
							btnButton7.setBackground(btnSMButton7.getBackground());
							btnButton7.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton7.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton7.getBackground().equals(Color.white)) {							
							btnButton7.setBackground(btnSMButton7.getBackground());
							btnButton7.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton7.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton7.getBackground().equals(Color.blue)) {
							btnButton7.setBackground(btnSMButton7.getBackground());
							btnButton7.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton7.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton7.getBackground().equals(Color.black)) {
							btnButton7.setBackground(btnSMButton7.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton7.getBackground().equals(Color.red)){
							btnButton7.setBackground(btnSMButton7.getBackground());
							btnButton7.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton7.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton7.getBackground().equals(Color.white)) {
							btnButton7.setBackground(btnSMButton7.getBackground());
							btnButton7.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton7.setText("");
						}
					}

				}
			});
			btnButton8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton8.getBackground().equals(Color.red)) {				
							btnButton8.setBackground(btnSMButton8.getBackground());
							btnButton8.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton8.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton8.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton8.getBackground().equals(Color.blue)){							
							btnButton8.setBackground(btnSMButton8.getBackground());
							btnButton8.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton8.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton8.getBackground().equals(Color.white)) {							
							btnButton8.setBackground(btnSMButton8.getBackground());
							btnButton8.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton8.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton8.getBackground().equals(Color.blue)) {
							btnButton8.setBackground(btnSMButton8.getBackground());
							btnButton8.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton8.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton8.getBackground().equals(Color.black)) {
							btnButton8.setBackground(btnSMButton8.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton8.getBackground().equals(Color.red)){
							btnButton8.setBackground(btnSMButton8.getBackground());
							btnButton8.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton8.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton8.getBackground().equals(Color.white)) {
							btnButton8.setBackground(btnSMButton8.getBackground());
							btnButton8.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton8.setText("");
						}
					}

				}
			});
			btnButton9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton9.getBackground().equals(Color.red)) {				
							btnButton9.setBackground(btnSMButton9.getBackground());
							btnButton9.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton9.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton9.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton9.getBackground().equals(Color.blue)){							
							btnButton9.setBackground(btnSMButton9.getBackground());
							btnButton9.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton9.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton9.getBackground().equals(Color.white)) {							
							btnButton9.setBackground(btnSMButton9.getBackground());
							btnButton9.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton9.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton9.getBackground().equals(Color.blue)) {
							btnButton9.setBackground(btnSMButton9.getBackground());
							btnButton9.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton9.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton9.getBackground().equals(Color.black)) {
							btnButton9.setBackground(btnSMButton9.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton9.getBackground().equals(Color.red)){
							btnButton9.setBackground(btnSMButton9.getBackground());
							btnButton9.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton9.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton9.getBackground().equals(Color.white)) {
							btnButton9.setBackground(btnSMButton9.getBackground());
							btnButton9.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton9.setText("");
						}
					}

				}
			});
			btnButton10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton10.getBackground().equals(Color.red)) {				
							btnButton10.setBackground(btnSMButton10.getBackground());
							btnButton10.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton10.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton10.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton10.getBackground().equals(Color.blue)){							
							btnButton10.setBackground(btnSMButton10.getBackground());
							btnButton10.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton10.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton10.getBackground().equals(Color.white)) {							
							btnButton10.setBackground(btnSMButton10.getBackground());
							btnButton10.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton10.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton10.getBackground().equals(Color.blue)) {
							btnButton10.setBackground(btnSMButton10.getBackground());
							btnButton10.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton10.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton10.getBackground().equals(Color.black)) {
							btnButton10.setBackground(btnSMButton10.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton10.getBackground().equals(Color.red)){
							btnButton10.setBackground(btnSMButton10.getBackground());
							btnButton10.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton10.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton10.getBackground().equals(Color.white)) {
							btnButton10.setBackground(btnSMButton10.getBackground());
							btnButton10.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton10.setText("");
						}
					}

				}
			});
			btnButton11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton11.getBackground().equals(Color.red)) {				
							btnButton11.setBackground(btnSMButton11.getBackground());
							btnButton11.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton11.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton11.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton11.getBackground().equals(Color.blue)){							
							btnButton11.setBackground(btnSMButton11.getBackground());
							btnButton11.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton11.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton11.getBackground().equals(Color.white)) {							
							btnButton11.setBackground(btnSMButton11.getBackground());
							btnButton11.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton11.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton11.getBackground().equals(Color.blue)) {
							btnButton11.setBackground(btnSMButton11.getBackground());
							btnButton11.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton11.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton11.getBackground().equals(Color.black)) {
							btnButton11.setBackground(btnSMButton11.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton11.getBackground().equals(Color.red)){
							btnButton11.setBackground(btnSMButton11.getBackground());
							btnButton11.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton11.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton11.getBackground().equals(Color.white)) {
							btnButton11.setBackground(btnSMButton11.getBackground());
							btnButton11.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton11.setText("");
						}
					}

				}
			});
			btnButton12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton12.getBackground().equals(Color.red)) {				
							btnButton12.setBackground(btnSMButton12.getBackground());
							btnButton12.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton12.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton12.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton12.getBackground().equals(Color.blue)){							
							btnButton12.setBackground(btnSMButton12.getBackground());
							btnButton12.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton12.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton12.getBackground().equals(Color.white)) {							
							btnButton12.setBackground(btnSMButton12.getBackground());
							btnButton12.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton12.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton12.getBackground().equals(Color.blue)) {
							btnButton12.setBackground(btnSMButton12.getBackground());
							btnButton12.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton12.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton12.getBackground().equals(Color.black)) {
							btnButton12.setBackground(btnSMButton12.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton12.getBackground().equals(Color.red)){
							btnButton12.setBackground(btnSMButton12.getBackground());
							btnButton12.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton12.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton12.getBackground().equals(Color.white)) {
							btnButton12.setBackground(btnSMButton12.getBackground());
							btnButton12.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton12.setText("");
						}
					}

				}
			});
			btnButton13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton13.getBackground().equals(Color.red)) {				
							btnButton13.setBackground(btnSMButton13.getBackground());
							btnButton13.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton13.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton13.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton13.getBackground().equals(Color.blue)){							
							btnButton13.setBackground(btnSMButton13.getBackground());
							btnButton13.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton13.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton13.getBackground().equals(Color.white)) {							
							btnButton13.setBackground(btnSMButton13.getBackground());
							btnButton13.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton13.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton13.getBackground().equals(Color.blue)) {
							btnButton13.setBackground(btnSMButton13.getBackground());
							btnButton13.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton13.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton13.getBackground().equals(Color.black)) {
							btnButton13.setBackground(btnSMButton13.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton13.getBackground().equals(Color.red)){
							btnButton13.setBackground(btnSMButton13.getBackground());
							btnButton13.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton13.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton13.getBackground().equals(Color.white)) {
							btnButton13.setBackground(btnSMButton13.getBackground());
							btnButton13.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton13.setText("");
						}
					}

				}
			});
			btnButton14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton14.getBackground().equals(Color.red)) {				
							btnButton14.setBackground(btnSMButton14.getBackground());
							btnButton14.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton14.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton14.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton14.getBackground().equals(Color.blue)){							
							btnButton14.setBackground(btnSMButton14.getBackground());
							btnButton14.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton14.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton14.getBackground().equals(Color.white)) {							
							btnButton14.setBackground(btnSMButton14.getBackground());
							btnButton14.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton14.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton14.getBackground().equals(Color.blue)) {
							btnButton14.setBackground(btnSMButton14.getBackground());
							btnButton14.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton14.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton14.getBackground().equals(Color.black)) {
							btnButton14.setBackground(btnSMButton14.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton14.getBackground().equals(Color.red)){
							btnButton14.setBackground(btnSMButton14.getBackground());
							btnButton14.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton14.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton14.getBackground().equals(Color.white)) {
							btnButton14.setBackground(btnSMButton14.getBackground());
							btnButton14.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton14.setText("");
						}
					}

				}
			});
			btnButton15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton15.getBackground().equals(Color.red)) {				
							btnButton15.setBackground(btnSMButton15.getBackground());
							btnButton15.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton15.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton15.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton15.getBackground().equals(Color.blue)){							
							btnButton15.setBackground(btnSMButton15.getBackground());
							btnButton15.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton15.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton15.getBackground().equals(Color.white)) {							
							btnButton15.setBackground(btnSMButton15.getBackground());
							btnButton15.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton15.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton15.getBackground().equals(Color.blue)) {
							btnButton15.setBackground(btnSMButton15.getBackground());
							btnButton15.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton15.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton15.getBackground().equals(Color.black)) {
							btnButton15.setBackground(btnSMButton15.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton15.getBackground().equals(Color.red)){
							btnButton15.setBackground(btnSMButton15.getBackground());
							btnButton15.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton15.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton15.getBackground().equals(Color.white)) {
							btnButton15.setBackground(btnSMButton15.getBackground());
							btnButton15.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton15.setText("");
						}
					}

				}
			});
			btnButton16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton16.getBackground().equals(Color.red)) {				
							btnButton16.setBackground(btnSMButton16.getBackground());
							btnButton16.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton16.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton16.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton16.getBackground().equals(Color.blue)){							
							btnButton16.setBackground(btnSMButton16.getBackground());
							btnButton16.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton16.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton16.getBackground().equals(Color.white)) {							
							btnButton16.setBackground(btnSMButton16.getBackground());
							btnButton16.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton16.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton16.getBackground().equals(Color.blue)) {
							btnButton16.setBackground(btnSMButton16.getBackground());
							btnButton16.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton16.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton16.getBackground().equals(Color.black)) {
							btnButton16.setBackground(btnSMButton16.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton16.getBackground().equals(Color.red)){
							btnButton16.setBackground(btnSMButton16.getBackground());
							btnButton16.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton16.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton16.getBackground().equals(Color.white)) {
							btnButton16.setBackground(btnSMButton16.getBackground());
							btnButton16.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton16.setText("");
						}
					}

				}
			});
			btnButton17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton17.getBackground().equals(Color.red)) {				
							btnButton17.setBackground(btnSMButton17.getBackground());
							btnButton17.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton17.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton17.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton17.getBackground().equals(Color.blue)){							
							btnButton17.setBackground(btnSMButton17.getBackground());
							btnButton17.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton17.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton17.getBackground().equals(Color.white)) {							
							btnButton17.setBackground(btnSMButton17.getBackground());
							btnButton17.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton17.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton17.getBackground().equals(Color.blue)) {
							btnButton17.setBackground(btnSMButton17.getBackground());
							btnButton17.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton17.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton17.getBackground().equals(Color.black)) {
							btnButton17.setBackground(btnSMButton17.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton17.getBackground().equals(Color.red)){
							btnButton17.setBackground(btnSMButton17.getBackground());
							btnButton17.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton17.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton17.getBackground().equals(Color.white)) {
							btnButton17.setBackground(btnSMButton17.getBackground());
							btnButton17.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton17.setText("");
						}
					}

				}
			});
			btnButton18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton18.getBackground().equals(Color.red)) {				
							btnButton18.setBackground(btnSMButton18.getBackground());
							btnButton18.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton18.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton18.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton18.getBackground().equals(Color.blue)){							
							btnButton18.setBackground(btnSMButton18.getBackground());
							btnButton18.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton18.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton18.getBackground().equals(Color.white)) {							
							btnButton18.setBackground(btnSMButton18.getBackground());
							btnButton18.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton18.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton18.getBackground().equals(Color.blue)) {
							btnButton18.setBackground(btnSMButton18.getBackground());
							btnButton18.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton18.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton18.getBackground().equals(Color.black)) {
							btnButton18.setBackground(btnSMButton18.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton18.getBackground().equals(Color.red)){
							btnButton18.setBackground(btnSMButton18.getBackground());
							btnButton18.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton18.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton18.getBackground().equals(Color.white)) {
							btnButton18.setBackground(btnSMButton18.getBackground());
							btnButton18.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton18.setText("");
						}
					}

				}
			});
			btnButton19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton19.getBackground().equals(Color.red)) {				
							btnButton19.setBackground(btnSMButton19.getBackground());
							btnButton19.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton19.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton19.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton19.getBackground().equals(Color.blue)){							
							btnButton19.setBackground(btnSMButton19.getBackground());
							btnButton19.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton19.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton19.getBackground().equals(Color.white)) {							
							btnButton19.setBackground(btnSMButton19.getBackground());
							btnButton19.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton19.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton19.getBackground().equals(Color.blue)) {
							btnButton19.setBackground(btnSMButton19.getBackground());
							btnButton19.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton19.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton19.getBackground().equals(Color.black)) {
							btnButton19.setBackground(btnSMButton19.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton19.getBackground().equals(Color.red)){
							btnButton19.setBackground(btnSMButton19.getBackground());
							btnButton19.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton19.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton19.getBackground().equals(Color.white)) {
							btnButton19.setBackground(btnSMButton19.getBackground());
							btnButton19.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton19.setText("");
						}
					}

				}
			});
			btnButton20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton20.getBackground().equals(Color.red)) {				
							btnButton20.setBackground(btnSMButton20.getBackground());
							btnButton20.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton20.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton20.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton20.getBackground().equals(Color.blue)){							
							btnButton20.setBackground(btnSMButton20.getBackground());
							btnButton20.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton20.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton20.getBackground().equals(Color.white)) {							
							btnButton20.setBackground(btnSMButton20.getBackground());
							btnButton20.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton20.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton20.getBackground().equals(Color.blue)) {
							btnButton20.setBackground(btnSMButton20.getBackground());
							btnButton20.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton20.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton20.getBackground().equals(Color.black)) {
							btnButton20.setBackground(btnSMButton20.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton20.getBackground().equals(Color.red)){
							btnButton20.setBackground(btnSMButton20.getBackground());
							btnButton20.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton20.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton20.getBackground().equals(Color.white)) {
							btnButton20.setBackground(btnSMButton20.getBackground());
							btnButton20.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton20.setText("");
						}
					}

				}
			});
			btnButton21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton21.getBackground().equals(Color.red)) {				
							btnButton21.setBackground(btnSMButton21.getBackground());
							btnButton21.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton21.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton21.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton21.getBackground().equals(Color.blue)){							
							btnButton21.setBackground(btnSMButton21.getBackground());
							btnButton21.setEnabled(false);Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton21.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton21.getBackground().equals(Color.white)) {							
							btnButton21.setBackground(btnSMButton21.getBackground());
							btnButton21.setEnabled(false);Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton21.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton21.getBackground().equals(Color.blue)) {
							btnButton21.setBackground(btnSMButton21.getBackground());
							btnButton21.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton21.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton21.getBackground().equals(Color.black)) {
							btnButton21.setBackground(btnSMButton21.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton21.getBackground().equals(Color.red)){
							btnButton21.setBackground(btnSMButton21.getBackground());
							btnButton21.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton21.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton21.getBackground().equals(Color.white)) {
							btnButton21.setBackground(btnSMButton21.getBackground());
							btnButton21.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton21.setText("");
						}
					}
				}
			});
			btnButton22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton22.getBackground().equals(Color.red)) {				
							btnButton22.setBackground(btnSMButton22.getBackground());
							btnButton22.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton22.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton22.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton22.getBackground().equals(Color.blue)){							
							btnButton22.setBackground(btnSMButton22.getBackground());
							btnButton22.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton22.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton22.getBackground().equals(Color.white)) {							
							btnButton22.setBackground(btnSMButton22.getBackground());
							btnButton22.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton22.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton22.getBackground().equals(Color.blue)) {
							btnButton22.setBackground(btnSMButton22.getBackground());
							btnButton22.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton22.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton22.getBackground().equals(Color.black)) {
							btnButton22.setBackground(btnSMButton22.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton22.getBackground().equals(Color.red)){
							btnButton22.setBackground(btnSMButton22.getBackground());
							btnButton22.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton22.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton22.getBackground().equals(Color.white)) {
							btnButton22.setBackground(btnSMButton22.getBackground());
							btnButton22.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton22.setText("");
						}
					}
				}
			});
			btnButton23.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton23.getBackground().equals(Color.red)) {				
							btnButton23.setBackground(btnSMButton23.getBackground());
							btnButton23.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton23.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton23.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton23.getBackground().equals(Color.blue)){							
							btnButton23.setBackground(btnSMButton23.getBackground());
							btnButton23.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton23.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton23.getBackground().equals(Color.white)) {							
							btnButton23.setBackground(btnSMButton23.getBackground());
							btnButton23.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton23.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton23.getBackground().equals(Color.blue)) {
							btnButton23.setBackground(btnSMButton23.getBackground());
							btnButton23.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton23.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton23.getBackground().equals(Color.black)) {
							btnButton23.setBackground(btnSMButton23.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton23.getBackground().equals(Color.red)){
							btnButton23.setBackground(btnSMButton23.getBackground());
							btnButton23.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton23.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton23.getBackground().equals(Color.white)) {
							btnButton23.setBackground(btnSMButton23.getBackground());
							btnButton23.setEnabled(false);
								
							
							
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton23.setText("");
						}
					}
				}
			});
			btnButton24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton24.getBackground().equals(Color.red)) {				
							btnButton24.setBackground(btnSMButton24.getBackground());
							btnButton24.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton24.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton24.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton24.getBackground().equals(Color.blue)){							
							btnButton24.setBackground(btnSMButton24.getBackground());
							btnButton24.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton24.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton24.getBackground().equals(Color.white)) {							
							btnButton24.setBackground(btnSMButton24.getBackground());
							btnButton24.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton24.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton24.getBackground().equals(Color.blue)) {
							btnButton24.setBackground(btnSMButton24.getBackground());
							btnButton24.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton24.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton24.getBackground().equals(Color.black)) {
							btnButton24.setBackground(btnSMButton24.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton24.getBackground().equals(Color.red)){
							btnButton24.setBackground(btnSMButton24.getBackground());
							btnButton24.setEnabled(false);
							btnSMButton24.setText("");
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton24.getBackground().equals(Color.white)) {
							btnButton24.setBackground(btnSMButton24.getBackground());
							btnButton24.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton24.setText("");
						}
					}
				}
			});
			btnButton25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lblTurn.getForeground()== Color.red) {
						if (btnSMButton25.getBackground().equals(Color.red)) {				
							btnButton25.setBackground(btnSMButton25.getBackground());
							btnButton25.setEnabled(false);
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton25.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("BLUE TEAM TURN");
								lblTurn.setForeground(Color.blue);
								GameEngine.secondclick = 0;
							}
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton25.getBackground().equals(Color.black)) {							
							Clue.resetClue();
							lblTurn.setText("GAME OVER");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is BLUE team");
							GameEngine.resetGame();
						}else if(btnSMButton25.getBackground().equals(Color.blue)){							
							btnButton25.setBackground(btnSMButton25.getBackground());
							btnButton25.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton25.setText("");
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}
						else if(btnSMButton25.getBackground().equals(Color.white)) {							
							btnButton25.setBackground(btnSMButton25.getBackground());
							btnButton25.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton25.setText("");
						}
					}
					else if(lblTurn.getForeground()== Color.blue) {	
						if (btnSMButton25.getBackground().equals(Color.blue)) {
							btnButton25.setBackground(btnSMButton25.getBackground());
							btnButton25.setEnabled(false);
							lblTurn.setText("BLUE TEAM TURN");
							lblTurn.setForeground(Color.blue);
							btnSMButton25.setText("");
							GameEngine.countSecondClick();
							if(GameEngine.secondclick == 2) {
								lblTurn.setText("RED TEAM TURN");
								lblTurn.setForeground(Color.red);
								GameEngine.secondclick = 0;
							}
							GameEngine.countBlue();
							GameEngine.genarateWinner();
						}else if(btnSMButton25.getBackground().equals(Color.black)) {
							btnButton25.setBackground(btnSMButton25.getBackground());
							Clue.resetClue();
							lblTurn.setText("");
							lblTurn.setForeground(Color.black);
							JOptionPane.showMessageDialog(null, "GAME OVER");
							JOptionPane.showMessageDialog(null, "Winner is RED team");
							GameEngine.resetGame();
						}else if(btnSMButton25.getBackground().equals(Color.red)){
							btnButton25.setBackground(btnSMButton25.getBackground());
							btnButton25.setEnabled(false);
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton25.setText("");
							GameEngine.countRed();
							GameEngine.genarateWinner();
						}else if(btnSMButton25.getBackground().equals(Color.white)) {
							btnButton25.setBackground(btnSMButton25.getBackground());
							btnButton25.setEnabled(false);							
							Clue.resetClue();
							lblTurn.setText("RED TEAM TURN");
							lblTurn.setForeground(Color.red);
							btnSMButton25.setText("");
						}
					}
				}
			});
			Wordboard.assignWordcard();
			
			/*set Operativespanel button*/
			btnButton1.setText(WordBoard.words[0]);
			btnButton2.setText(WordBoard.words[1]);
			btnButton3.setText(WordBoard.words[2]);
			btnButton4.setText(WordBoard.words[3]);
			btnButton5.setText(WordBoard.words[4]);
			btnButton6.setText(WordBoard.words[5]);
			btnButton7.setText(WordBoard.words[6]);
			btnButton8.setText(WordBoard.words[7]);
			btnButton9.setText(WordBoard.words[8]);
			btnButton10.setText(WordBoard.words[9]);
			btnButton11.setText(WordBoard.words[10]);
			btnButton12.setText(WordBoard.words[11]);
			btnButton13.setText(WordBoard.words[12]);
			btnButton14.setText(WordBoard.words[13]);
			btnButton15.setText(WordBoard.words[14]);
			btnButton16.setText(WordBoard.words[15]);
			btnButton17.setText(WordBoard.words[16]);
			btnButton18.setText(WordBoard.words[17]);
			btnButton19.setText(WordBoard.words[18]);
			btnButton20.setText(WordBoard.words[19]);
			btnButton21.setText(WordBoard.words[20]);
			btnButton22.setText(WordBoard.words[21]);
			btnButton23.setText(WordBoard.words[22]);
			btnButton24.setText(WordBoard.words[23]);
			btnButton25.setText(WordBoard.words[24]);
			
			/*set Spymasterpanel button*/
			btnSMButton1.setText(WordBoard.words[0]);
			btnSMButton2.setText(WordBoard.words[1]);
			btnSMButton3.setText(WordBoard.words[2]);
			btnSMButton4.setText(WordBoard.words[3]);
			btnSMButton5.setText(WordBoard.words[4]);
			btnSMButton6.setText(WordBoard.words[5]);
			btnSMButton7.setText(WordBoard.words[6]);
			btnSMButton8.setText(WordBoard.words[7]);
			btnSMButton9.setText(WordBoard.words[8]);
			btnSMButton10.setText(WordBoard.words[9]);
			btnSMButton11.setText(WordBoard.words[10]);
			btnSMButton12.setText(WordBoard.words[11]);
			btnSMButton13.setText(WordBoard.words[12]);
			btnSMButton14.setText(WordBoard.words[13]);
			btnSMButton15.setText(WordBoard.words[14]);
			btnSMButton16.setText(WordBoard.words[15]);
			btnSMButton17.setText(WordBoard.words[16]);
			btnSMButton18.setText(WordBoard.words[17]);
			btnSMButton19.setText(WordBoard.words[18]);
			btnSMButton20.setText(WordBoard.words[19]);
			btnSMButton21.setText(WordBoard.words[20]);
			btnSMButton22.setText(WordBoard.words[21]);
			btnSMButton23.setText(WordBoard.words[22]);
			btnSMButton24.setText(WordBoard.words[23]);
			btnSMButton25.setText(WordBoard.words[24]);
			btnSMButton1.setEnabled(false);
			btnSMButton2.setEnabled(false);
			btnSMButton3.setEnabled(false);
			btnSMButton4.setEnabled(false);
			btnSMButton5.setEnabled(false);
			btnSMButton6.setEnabled(false);
			btnSMButton7.setEnabled(false);
			btnSMButton8.setEnabled(false);
			btnSMButton9.setEnabled(false);
			btnSMButton10.setEnabled(false);
			btnSMButton11.setEnabled(false);
			btnSMButton12.setEnabled(false);
			btnSMButton13.setEnabled(false);
			btnSMButton14.setEnabled(false);
			btnSMButton15.setEnabled(false);
			btnSMButton16.setEnabled(false);
			btnSMButton17.setEnabled(false);
			btnSMButton18.setEnabled(false);
			btnSMButton19.setEnabled(false);
			btnSMButton20.setEnabled(false);
			btnSMButton21.setEnabled(false);
			btnSMButton22.setEnabled(false);
			btnSMButton23.setEnabled(false);
			btnSMButton24.setEnabled(false);
			btnSMButton25.setEnabled(false);
		
			
			Wordboard.assignKeymap();
			/*set color */
			btnSMButton25.setBackground(new Color(Wordboard.r[24], Wordboard.g[24], Wordboard.b[24])); 
			btnSMButton24.setBackground(new Color(Wordboard.r[23], Wordboard.g[23], Wordboard.b[23]));
			btnSMButton23.setBackground(new Color(Wordboard.r[22], Wordboard.g[22], Wordboard.b[22]));
			btnSMButton22.setBackground(new Color(Wordboard.r[21], Wordboard.g[21], Wordboard.b[21]));
			btnSMButton21.setBackground(new Color(Wordboard.r[20], Wordboard.g[20], Wordboard.b[20]));
			btnSMButton20.setBackground(new Color(Wordboard.r[19], Wordboard.g[19], Wordboard.b[19]));
			btnSMButton19.setBackground(new Color(Wordboard.r[18], Wordboard.g[18], Wordboard.b[18]));
			btnSMButton18.setBackground(new Color(Wordboard.r[17], Wordboard.g[17], Wordboard.b[17]));
			btnSMButton17.setBackground(new Color(Wordboard.r[16], Wordboard.g[16], Wordboard.b[16]));
			btnSMButton16.setBackground(new Color(Wordboard.r[15], Wordboard.g[15], Wordboard.b[15]));
			btnSMButton15.setBackground(new Color(Wordboard.r[14], Wordboard.g[14], Wordboard.b[14]));
			btnSMButton14.setBackground(new Color(Wordboard.r[13], Wordboard.g[13], Wordboard.b[13]));
			btnSMButton13.setBackground(new Color(Wordboard.r[12], Wordboard.g[12], Wordboard.b[12]));
			btnSMButton12.setBackground(new Color(Wordboard.r[11], Wordboard.g[11], Wordboard.b[11]));
			btnSMButton11.setBackground(new Color(Wordboard.r[10], Wordboard.g[10], Wordboard.b[10]));
			btnSMButton10.setBackground(new Color(Wordboard.r[9], Wordboard.g[9], Wordboard.b[9]));
			btnSMButton9.setBackground(new Color(Wordboard.r[8], Wordboard.g[8], Wordboard.b[8]));
			btnSMButton8.setBackground(new Color(Wordboard.r[7], Wordboard.g[7], Wordboard.b[7]));
			btnSMButton7.setBackground(new Color(Wordboard.r[6], Wordboard.g[6], Wordboard.b[6]));
			btnSMButton6.setBackground(new Color(Wordboard.r[5], Wordboard.g[5], Wordboard.b[5]));
			btnSMButton5.setBackground(new Color(Wordboard.r[4], Wordboard.g[4], Wordboard.b[4]));
			btnSMButton4.setBackground(new Color(Wordboard.r[3], Wordboard.g[3], Wordboard.b[3]));
			btnSMButton3.setBackground(new Color(Wordboard.r[2], Wordboard.g[2], Wordboard.b[2]));
			btnSMButton2.setBackground(new Color(Wordboard.r[1], Wordboard.g[1], Wordboard.b[1]));
			btnSMButton1.setBackground(new Color(Wordboard.r[0], Wordboard.g[0], Wordboard.b[0]));

		    }
		
		
		
		/*Change background color*/
		public void changeBackgroundColor() {
			JLabel lblChangeColor = new JLabel("Click to change background-color");
			lblChangeColor.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblChangeColor.setBounds(20, 732, 317, 31);
			contentPane.add(lblChangeColor);			
			displayBackgroundColor();
		}

		/*Display background color*/
		public void displayBackgroundColor() {
			JButton btnChangeDefult = new JButton("Defult");
			btnChangeDefult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.setBackground(new Color(240,240,240));
				}
			});
			btnChangeDefult.setForeground(Color.BLACK);
			btnChangeDefult.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnChangeDefult.setBounds(10, 774, 89, 23);
			contentPane.add(btnChangeDefult);			
			JButton btnChangeGreen = new JButton("GREEN");
			btnChangeGreen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.setBackground(Color.GREEN);
				}
			});
			btnChangeGreen.setForeground(Color.GREEN);
			btnChangeGreen.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnChangeGreen.setBounds(10, 808, 89, 23);
			contentPane.add(btnChangeGreen);			
			JButton btnChangeCyan = new JButton("CYAN");
			btnChangeCyan.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.setBackground(Color.CYAN);
				}
			});
			btnChangeCyan.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnChangeCyan.setForeground(Color.CYAN);
			btnChangeCyan.setBounds(109, 774, 89, 23);
			contentPane.add(btnChangeCyan);			
			JButton btnChangePink = new JButton("PINK");
			btnChangePink.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.setBackground(Color.PINK);
				}
			});
			btnChangePink.setForeground(Color.PINK);
			btnChangePink.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnChangePink.setBounds(109, 808, 89, 23);
			contentPane.add(btnChangePink);			
			JButton btnChangeYellow = new JButton("YELLOW");
			btnChangeYellow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.setBackground(Color.YELLOW);
				}
			});
			btnChangeYellow.setForeground(Color.YELLOW);
			btnChangeYellow.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnChangeYellow.setBounds(208, 774, 89, 23);
			contentPane.add(btnChangeYellow);			
			JButton btnChangeOrange = new JButton("ORANGE");
			btnChangeOrange.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.setBackground(Color.ORANGE);
				}
			});
			btnChangeOrange.setForeground(Color.ORANGE);
			btnChangeOrange.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnChangeOrange.setBounds(208, 808, 89, 23);
			contentPane.add(btnChangeOrange);
		}
		

	}




