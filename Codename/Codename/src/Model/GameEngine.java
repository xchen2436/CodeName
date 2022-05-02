package Model;

import javax.swing.JOptionPane;

import View.MainPanel;
import Model.Player;

public class GameEngine {
	
	public static int countred = 0;
	public static int countblue = 0;
	public static int secondclick = 0;
	public static String winner = "";
	
	
	/*Count red number */
	public static int countRed() {
		return countred = countred + 1;
	}
	/*Count blue number */
	public static int countBlue() {
		return countblue = countblue + 1;
	}
	/*Count second click*/
	public static int countSecondClick(){
		return secondclick = secondclick + 1; 
	}
	/*Generate winner*/
	public static void genarateWinner(){
		if(GameEngine.countred == 9) {
			winner = "RED";
			displayWinner();
		}
		else if(GameEngine.countblue == 8) {
			winner = "BLUE";
			displayWinner();
		}
	}
	/*Display winner*/
	public static void displayWinner(){
			JOptionPane.showMessageDialog(null, "Winner is " + winner + " team");
			resetGame();
	}
	
	/*Reset game*/
	public static void resetGame(){
		int result = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "End", JOptionPane.YES_NO_OPTION);
	            if(result == JOptionPane.YES_OPTION){
					MainPanel MainPanel = new MainPanel();
					MainPanel.setVisible(false);
					Player Player = new Player();
					Player.setVisible(true);
	            }else {
	            	System.exit(0);
	            }
	}
	
}
