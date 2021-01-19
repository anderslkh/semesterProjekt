package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ErrorOneFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorOneFrame frame = new ErrorOneFrame();
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
	public ErrorOneFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton acceptError = new JButton("OK");
		acceptError.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		acceptError.setFont(new Font("Tahoma", Font.BOLD, 24));
		acceptError.setBounds(110, 180, 182, 49);
		layeredPane.add(acceptError);
		
		JTextPane errorTxtBox = new JTextPane();
		errorTxtBox.setEditable(false);
		errorTxtBox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		errorTxtBox.setBackground(UIManager.getColor("Button.background"));
		errorTxtBox.setText("Vare nr ikke fundet.");
		errorTxtBox.setBounds(88, 78, 236, 64);
		layeredPane.add(errorTxtBox);
	}
}
