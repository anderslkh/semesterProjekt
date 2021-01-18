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
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BetalingsMenu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtTelefon;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTable table_1;
	private JTextField textField;

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
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBounds(10, 99, 870, 460);
		layeredPane.add(table);
		
		JTextPane txtpnValgteVarer = new JTextPane();
		txtpnValgteVarer.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnValgteVarer.setText("Valgte varer");
		txtpnValgteVarer.setBackground(SystemColor.activeCaption);
		txtpnValgteVarer.setBounds(10, 78, 870, 21);
		layeredPane.add(txtpnValgteVarer);
		
		JTextPane txtpnFindEksisterendeKunde = new JTextPane();
		txtpnFindEksisterendeKunde.setBackground(SystemColor.activeCaption);
		txtpnFindEksisterendeKunde.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnFindEksisterendeKunde.setText("Find eksisterende kunde");
		txtpnFindEksisterendeKunde.setBounds(924, 78, 400, 21);
		layeredPane.add(txtpnFindEksisterendeKunde);
		
		txtTelefon = new JTextField();
		txtTelefon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTelefon.setText("Telefon");
		txtTelefon.setBounds(924, 99, 400, 40);
		layeredPane.add(txtTelefon);
		txtTelefon.setColumns(10);
		
		JButton btnNewButton = new JButton("S\u00F8g");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(95, 158, 160));
		btnNewButton.setBounds(1324, 99, 85, 40);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kortbetaling");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(SystemColor.info);
		btnNewButton_1.setBounds(924, 470, 130, 40);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Kvittering");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(95, 158, 160));
		btnNewButton_2.setBounds(924, 617, 203, 46);
		layeredPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("OK");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBackground(new Color(95, 158, 160));
		btnNewButton_3.setBounds(1324, 407, 85, 40);
		layeredPane.add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(924, 407, 400, 40);
		layeredPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(924, 323, 400, 40);
		layeredPane.add(textField_3);
		
		JTextPane txtpnSubtotal = new JTextPane();
		txtpnSubtotal.setText("Subtotal");
		txtpnSubtotal.setBackground(SystemColor.activeCaption);
		txtpnSubtotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnSubtotal.setBounds(924, 302, 400, 21);
		layeredPane.add(txtpnSubtotal);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Navn", "Anders Hansen"},
				{"Tlf nr", "12345678"},
				{"Mail", "ahansen@yahoo.com"},
				{"Adresse", "Boligstr\u00E6de 4"},
				{"Postnummer", "9231"},
				{"By", "K\u00F8benhavn"},
			},
			new String[] {
				" ", "Kundeinformation"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(69);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(114);
		table_1.setBounds(924, 183, 400, 96);
		layeredPane.add(table_1);
		
		JTextPane txtpnKundeinformation = new JTextPane();
		txtpnKundeinformation.setText("Kundeinformation");
		txtpnKundeinformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnKundeinformation.setBackground(SystemColor.activeCaption);
		txtpnKundeinformation.setBounds(924, 162, 400, 21);
		layeredPane.add(txtpnKundeinformation);
		
		JTextPane txtpnSubtotal_1 = new JTextPane();
		txtpnSubtotal_1.setText("Kontantbetaling");
		txtpnSubtotal_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnSubtotal_1.setBackground(SystemColor.activeCaption);
		txtpnSubtotal_1.setBounds(924, 386, 400, 21);
		layeredPane.add(txtpnSubtotal_1);
		
		JTextPane txtpnSubtotal_1_1 = new JTextPane();
		txtpnSubtotal_1_1.setText("Retur");
		txtpnSubtotal_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnSubtotal_1_1.setBackground(SystemColor.activeCaption);
		txtpnSubtotal_1_1.setBounds(924, 533, 400, 21);
		layeredPane.add(txtpnSubtotal_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(924, 554, 400, 40);
		layeredPane.add(textField);
		
		JButton btnBetaling = new JButton("Salg");
		btnBetaling.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBetaling.setBackground(SystemColor.activeCaption);
		btnBetaling.setBounds(9, 10, 120, 40);
		layeredPane.add(btnBetaling);
		
		JButton opretKundeButton = new JButton("Opret kunde");
		opretKundeButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		opretKundeButton.setBackground(SystemColor.inactiveCaption);
		opretKundeButton.setBounds(134, 10, 120, 40);
		layeredPane.add(opretKundeButton);
		
		JButton kvitteringButton = new JButton("Kvittering");
		kvitteringButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		kvitteringButton.setBackground(SystemColor.inactiveCaption);
		kvitteringButton.setBounds(259, 10, 120, 40);
		layeredPane.add(kvitteringButton);
		
		JButton udlanButton = new JButton("Udl\u00E5n");
		udlanButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		udlanButton.setBackground(SystemColor.inactiveCaption);
		udlanButton.setBounds(384, 10, 120, 40);
		layeredPane.add(udlanButton);
		
		JButton returnButton = new JButton("<----");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new SaleMenuGui().setVisible(true);
			}
		});
		returnButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		returnButton.setBackground(new Color(95, 158, 160));
		returnButton.setBounds(10, 632, 203, 46);
		layeredPane.add(returnButton);
	}
}
