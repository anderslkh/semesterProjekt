package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReturnAmountPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnAmountPage frame = new ReturnAmountPage();
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
	public ReturnAmountPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton acceptFinishedSale_PT = new JButton("Print Kvittering");
		acceptFinishedSale_PT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		acceptFinishedSale_PT.setFont(new Font("Tahoma", Font.BOLD, 19));
		acceptFinishedSale_PT.setBounds(232, 180, 182, 49);
		layeredPane.add(acceptFinishedSale_PT);
		
		JTextPane returnTxtbox = new JTextPane();
		returnTxtbox.setEditable(false);
		returnTxtbox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		returnTxtbox.setBackground(UIManager.getColor("Button.background"));
		returnTxtbox.setText("Salg afsluttet");
		returnTxtbox.setBounds(128, 74, 204, 64);
		layeredPane.add(returnTxtbox);
		
		JTextPane amountTxtbox = new JTextPane();
		amountTxtbox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		amountTxtbox.setEditable(false);
		amountTxtbox.setBackground(SystemColor.menu);
		amountTxtbox.setBounds(157, 74, 236, 64);
		layeredPane.add(amountTxtbox);
		
		JButton btnNytSalg = new JButton("Nyt Salg");
		btnNytSalg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaleMenuGui JFrameInit = new SaleMenuGui();
				JFrameInit.setVisible(true);
			}
		});
		btnNytSalg.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNytSalg.setBounds(10, 180, 182, 49);
		layeredPane.add(btnNytSalg);
	}
}
