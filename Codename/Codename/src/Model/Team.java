package Model;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import View.MainPanel;
import Model.Player;

public class Team {

	public static int redPlayerNumber = 0;
	public static int bluePlayerNumber = 0;
	public static String Color;
	
		public static void validateNumberOfPlayers() {
			if(redPlayerNumber - bluePlayerNumber >= 2 ||bluePlayerNumber - redPlayerNumber >= 2) {
				JOptionPane.showMessageDialog(null, "The difference in the number of teams is too large, please re-select");
			}else if(redPlayerNumber < 2 || bluePlayerNumber < 2) {
				JOptionPane.showMessageDialog(null, "Minimum requirement not met!");
			}else {
				JOptionPane.showMessageDialog(null, "Game is creating...");
				MainPanel MainPanel = new MainPanel();
				MainPanel.setVisible(true);
				Player Player = new Player();
				Player.setVisible(false);
				
			}
		}
		

}
