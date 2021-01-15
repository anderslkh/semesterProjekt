package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;

public class SaleMenuGui extends JFrame {

	private JPanel contentPane;
	private JTextField vareNrTextField;
	private JTextField txtIndtastAntal;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleMenuGui frame = new SaleMenuGui();
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
	public SaleMenuGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(new Dimension(1920, 0));
		contentPane.add(layeredPane, BorderLayout.CENTER);

		JTextPane vareTxtpn = new JTextPane();
		vareTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareTxtpn.setBackground(SystemColor.activeCaption);
		vareTxtpn.setEditable(false);
		vareTxtpn.setBounds(10, 125, 400, 21);
		layeredPane.add(vareTxtpn);
		vareTxtpn.setPreferredSize(new Dimension(0, 0));
		vareTxtpn.setMargin(new Insets(3, 3, 3, 0));
		vareTxtpn.setText("Vare");

		vareNrTextField = new JTextField();
		vareNrTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vareNrTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vareNrTextField.setText("");
			}
		});
		vareNrTextField.setText("Indtast varens ID.");
		vareNrTextField.setBorder(null);
		vareNrTextField.setToolTipText("xd");
		vareNrTextField.setBackground(Color.WHITE);
		vareNrTextField.setBounds(10, 146, 400, 40);
		layeredPane.add(vareNrTextField);
		vareNrTextField.setPreferredSize(new Dimension(0, 0));
		vareNrTextField.setColumns(10);

		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIndtastAntal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIndtastAntal.setText("");
			}
		});
		txtIndtastAntal.setBorder(null);
		txtIndtastAntal.setBackground(Color.WHITE);
		txtIndtastAntal.setBounds(10, 512, 400, 40);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setColumns(10);

		JTextPane antalTxtpn = new JTextPane();
		antalTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		antalTxtpn.setEditable(false);
		antalTxtpn.setBackground(SystemColor.activeCaption);
		antalTxtpn.setBounds(10, 491, 400, 21);
		layeredPane.add(antalTxtpn);
		antalTxtpn.setText("Antal");

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Varenavn", "L\u00E6ngde", "Antal", "Pris" }) {
					Class[] columnTypes = new Class[] { Integer.class, String.class, Integer.class, Integer.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		table.setBounds(576, 146, 870, 460);
		layeredPane.add(table);

		JTextPane vareTxtpn_1 = new JTextPane();
		vareTxtpn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareTxtpn_1.setText("Valgte varer");
		vareTxtpn_1.setPreferredSize(new Dimension(0, 0));
		vareTxtpn_1.setMargin(new Insets(3, 3, 3, 0));
		vareTxtpn_1.setEditable(false);
		vareTxtpn_1.setBackground(SystemColor.activeCaption);
		vareTxtpn_1.setBounds(576, 125, 870, 21);
		layeredPane.add(vareTxtpn_1);

		JButton tilfojVareSalgButton = new JButton("Tilf\u00F8j");
		tilfojVareSalgButton.setBackground(new Color(95, 158, 160));
		tilfojVareSalgButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tilfojVareSalgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { Integer.parseInt(vareNrTextField.getText()),
						Integer.parseInt(txtIndtastAntal.getText())});
			}
		});
		tilfojVareSalgButton.setBounds(410, 512, 120, 40);
		layeredPane.add(tilfojVareSalgButton);

		JTextPane subTotalShowingTxtpn = new JTextPane();
		subTotalShowingTxtpn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		subTotalShowingTxtpn.setEditable(false);
		subTotalShowingTxtpn.setBackground(Color.WHITE);
		subTotalShowingTxtpn.setBounds(576, 690, 291, 40);
		layeredPane.add(subTotalShowingTxtpn);

		JButton betalingsButton = new JButton("G\u00E5 til betaling");
		betalingsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new BetalingsMenu().setVisible(true);
			}
		});
		
		betalingsButton.setBackground(new Color(95, 158, 160));
		betalingsButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		betalingsButton.setBounds(867, 690, 187, 40);
		layeredPane.add(betalingsButton);

		JTextPane subTotalTxtpn = new JTextPane();
		subTotalTxtpn.setText("Subtotal");
		subTotalTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		subTotalTxtpn.setEditable(false);
		subTotalTxtpn.setBackground(SystemColor.activeCaption);
		subTotalTxtpn.setBounds(576, 669, 291, 21);
		layeredPane.add(subTotalTxtpn);
		
		JButton findVareButton = new JButton("Find vare");
		findVareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		findVareButton.setActionCommand("S\u00F8g");
		findVareButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		findVareButton.setBackground(new Color(95, 158, 160));
		findVareButton.setBounds(410, 144, 120, 40);
		layeredPane.add(findVareButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(185, 280, -62, 19);
		layeredPane.add(textPane);
		
		JTextPane vareNavnTextField = new JTextPane();
		vareNavnTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vareNavnTextField.setBounds(10, 272, 400, 40);
		layeredPane.add(vareNavnTextField);
		
		JTextPane madeByCompanyTextField = new JTextPane();
		madeByCompanyTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		madeByCompanyTextField.setBounds(10, 352, 400, 40);
		layeredPane.add(madeByCompanyTextField);
		
		JTextPane priceTextField = new JTextPane();
		priceTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		priceTextField.setBounds(10, 432, 400, 40);
		layeredPane.add(priceTextField);
		
		JTextPane navnTxtpn = new JTextPane();
		navnTxtpn.setText("Vare navn");
		navnTxtpn.setPreferredSize(new Dimension(0, 0));
		navnTxtpn.setMargin(new Insets(3, 3, 3, 0));
		navnTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		navnTxtpn.setEditable(false);
		navnTxtpn.setBackground(SystemColor.activeCaption);
		navnTxtpn.setBounds(10, 251, 400, 21);
		layeredPane.add(navnTxtpn);
		
		JTextPane producentTxtpn = new JTextPane();
		producentTxtpn.setText("Producent");
		producentTxtpn.setPreferredSize(new Dimension(0, 0));
		producentTxtpn.setMargin(new Insets(3, 3, 3, 0));
		producentTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		producentTxtpn.setEditable(false);
		producentTxtpn.setBackground(SystemColor.activeCaption);
		producentTxtpn.setBounds(10, 331, 400, 21);
		layeredPane.add(producentTxtpn);
		
		JTextPane prisTxtpn = new JTextPane();
		prisTxtpn.setText("Pris");
		prisTxtpn.setPreferredSize(new Dimension(0, 0));
		prisTxtpn.setMargin(new Insets(3, 3, 3, 0));
		prisTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		prisTxtpn.setEditable(false);
		prisTxtpn.setBackground(SystemColor.activeCaption);
		prisTxtpn.setBounds(10, 411, 400, 21);
		layeredPane.add(prisTxtpn);
		
		JList list = new JList();
		list.setBounds(515, 503, -99, -112);
		layeredPane.add(list);
		
		JButton salgButton = new JButton("Salg");
		salgButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		salgButton.setBackground(SystemColor.activeCaption);
		salgButton.setBounds(9, 10, 120, 40);
		layeredPane.add(salgButton);
		
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
		
	}
}
