package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class BetalingsMenu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BetalingsMenu frame = new BetalingsMenu();
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
	public BetalingsMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton salgButton = new JButton("Salg");
		salgButton.setBackground(SystemColor.activeCaptionBorder);
		panel.add(salgButton);
		
		JButton betalingButton = new JButton("Betaling");
		betalingButton.setBackground(SystemColor.activeCaption);
		panel.add(betalingButton);
		
		JButton opretKundeButton = new JButton("Opret kunde");
		opretKundeButton.setBackground(SystemColor.activeCaptionBorder);
		panel.add(opretKundeButton);
		
		JButton kvitteringButton = new JButton("Kvittering");
		kvitteringButton.setBackground(SystemColor.activeCaptionBorder);
		panel.add(kvitteringButton);
		
		JButton udlånButton = new JButton("Udl\u00E5n");
		udlånButton.setBackground(SystemColor.activeCaptionBorder);
		panel.add(udlånButton);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBounds(10, 65, 485, 434);
		layeredPane.add(table);
		
		JTextPane txtpnValgteVarer = new JTextPane();
		txtpnValgteVarer.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnValgteVarer.setText("Valgte varer");
		txtpnValgteVarer.setBackground(Color.LIGHT_GRAY);
		txtpnValgteVarer.setBounds(10, 40, 485, 24);
		layeredPane.add(txtpnValgteVarer);
		
		JTextPane txtpnFindEksisterendeKunde = new JTextPane();
		txtpnFindEksisterendeKunde.setBackground(Color.LIGHT_GRAY);
		txtpnFindEksisterendeKunde.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnFindEksisterendeKunde.setText("Find eksisterende kunde");
		txtpnFindEksisterendeKunde.setBounds(536, 40, 220, 24);
		layeredPane.add(txtpnFindEksisterendeKunde);
		
		textField = new JTextField();
		textField.setBounds(536, 64, 220, 30);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("S\u00F8g");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(755, 64, 85, 29);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(536, 466, 85, 21);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(707, 466, 85, 21);
		layeredPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBounds(610, 417, 85, 21);
		layeredPane.add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(505, 418, 96, 19);
		layeredPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(729, 437, 96, 19);
		layeredPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(658, 358, 96, 19);
		layeredPane.add(textField_3);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setBackground(Color.LIGHT_GRAY);
		textPane_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPane_1_1.setBounds(524, 358, 96, 19);
		layeredPane.add(textPane_1_1);
		
		table_1 = new JTable();
		table_1.setBounds(536, 161, 186, 130);
		layeredPane.add(table_1);
	}
}
