package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homePanel extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public homePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*Start game*/
		JButton btnStartGame = new JButton("Click to start game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Model.Player Player = new Model.Player();
				Player.setVisible(true);
				homePanel homePanel = new homePanel();
				homePanel.setVisible(false);	
			}
		});
		btnStartGame.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnStartGame.setBounds(171, 203, 244, 63);
		contentPane.add(btnStartGame);
		
		JLabel lblWelcome = new JLabel("Welcome to CODENAME");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcome.setBounds(109, 42, 366, 108);
		contentPane.add(lblWelcome);
		
		/*Exit */
		JButton btnExit = new JButton("Exit\r\n");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnExit.setBounds(171, 296, 244, 63);
		contentPane.add(btnExit);
	}
}