package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import controller.*;
import model.SaleProduct;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
import javax.swing.JScrollPane;

public class SaleMenuGui extends JFrame {

	private JPanel contentPane;
	private JTextField vareNrTextField;
	private JTextField txtIndtastAntal;
	private JTextField txtTelefon;
	private JTextField kontantBetalingTxtField;
	private SaleController saleController;
	private JTable table;
	private JTable table_1;
	private int proID;
	private int antal;
	private int price;
	private double total;
	private double total1;
	private double total2;

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
		saleController = new SaleController();
		proID = 0;
		antal = 0;
		price = 0;

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
		vareTxtpn.setBounds(10, 125, 300, 21);
		layeredPane.add(vareTxtpn);
		vareTxtpn.setPreferredSize(new Dimension(0, 0));
		vareTxtpn.setMargin(new Insets(3, 3, 3, 0));
		vareTxtpn.setText("Vare");

		vareNrTextField = new JTextField();
		vareNrTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		vareNrTextField.setBounds(10, 146, 300, 48);
		layeredPane.add(vareNrTextField);
		vareNrTextField.setPreferredSize(new Dimension(0, 0));
		vareNrTextField.setColumns(10);

		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtIndtastAntal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIndtastAntal.setText("");
			}
		});
		txtIndtastAntal.setBorder(null);
		txtIndtastAntal.setBackground(Color.WHITE);
		txtIndtastAntal.setBounds(10, 589, 300, 48);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setText("1");
		txtIndtastAntal.setColumns(10);
		
		JTextPane txtpnFindEksisterendeKunde = new JTextPane();
		txtpnFindEksisterendeKunde.setBackground(SystemColor.activeCaption);
		txtpnFindEksisterendeKunde.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnFindEksisterendeKunde.setText("Find eksisterende kunde");
		txtpnFindEksisterendeKunde.setBounds(1150, 125, 300, 21);
		layeredPane.add(txtpnFindEksisterendeKunde);
		
		txtTelefon = new JTextField();
		txtTelefon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTelefon.setText("Telefon");
		txtTelefon.setBounds(1150, 146, 300, 48);
		layeredPane.add(txtTelefon);
		txtTelefon.setColumns(10);
		
		JTextPane txtpnKundeinformation = new JTextPane();
		txtpnKundeinformation.setText("Kundeinformation");
		txtpnKundeinformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnKundeinformation.setBackground(SystemColor.activeCaption);
		txtpnKundeinformation.setBounds(1150, 214, 300, 21);
		layeredPane.add(txtpnKundeinformation);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		table_1.setBounds(1150, 235, 300, 96);
		layeredPane.add(table_1);

		JTextPane antalTxtpn = new JTextPane();
		antalTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		antalTxtpn.setEditable(false);
		antalTxtpn.setBackground(SystemColor.activeCaption);
		antalTxtpn.setBounds(10, 491, 400, 21);
		antalTxtpn.setText("Antal");

		JTextPane vareTxtpn_1 = new JTextPane();
		vareTxtpn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareTxtpn_1.setText("Valgte varer");
		vareTxtpn_1.setPreferredSize(new Dimension(0, 0));
		vareTxtpn_1.setMargin(new Insets(3, 3, 3, 0));
		vareTxtpn_1.setEditable(false);
		vareTxtpn_1.setBackground(SystemColor.activeCaption);
		vareTxtpn_1.setBounds(490, 125, 600, 21);
		layeredPane.add(vareTxtpn_1);
		
		JTextPane returnTxtPn = new JTextPane();
		returnTxtPn.setText("0");
		returnTxtPn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		returnTxtPn.setEditable(false);
		returnTxtPn.setBackground(Color.WHITE);
		returnTxtPn.setBounds(1150, 589, 300, 48);
		layeredPane.add(returnTxtPn);
		
		JTextPane subTotalShowingTxtpn = new JTextPane();
		subTotalShowingTxtpn.setText("0");
		subTotalShowingTxtpn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		subTotalShowingTxtpn.setEditable(false);
		subTotalShowingTxtpn.setBackground(Color.WHITE);
		subTotalShowingTxtpn.setBounds(1150, 461, 300, 48);
		layeredPane.add(subTotalShowingTxtpn);
		
		JButton btnNewButton_3 = new JButton("OK");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total2 = Double.parseDouble(subTotalShowingTxtpn.getText());;
				total1 = Double.parseDouble(kontantBetalingTxtField.getText());
				total = total2 - total1;
				subTotalShowingTxtpn.setText(Double.toString(total));
				if(Double.parseDouble(subTotalShowingTxtpn.getText()) <= 0) {
					total = total * -1;
					total = 0.5 * Math.round(total / 0.5);
					returnTxtPn.setText(Double.toString(total));
					subTotalShowingTxtpn.setText("");
}
					
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBackground(new Color(95, 158, 160));
		btnNewButton_3.setBounds(1778, 420, 85, 40);
		layeredPane.add(btnNewButton_3);
		
		kontantBetalingTxtField = new JTextField();
		kontantBetalingTxtField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kontantBetalingTxtField.setColumns(10);
		kontantBetalingTxtField.setBounds(1150, 372, 300, 48);
		layeredPane.add(kontantBetalingTxtField);
		
		JTextPane txtpnKontantbetaling = new JTextPane();
		txtpnKontantbetaling.setText("Kontantbetaling");
		txtpnKontantbetaling.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnKontantbetaling.setBackground(SystemColor.activeCaption);
		txtpnKontantbetaling.setBounds(1150, 351, 300, 21);
		layeredPane.add(txtpnKontantbetaling);

		JTextPane subTotalTxtpn = new JTextPane();
		subTotalTxtpn.setText("Subtotal");
		subTotalTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		subTotalTxtpn.setEditable(false);
		subTotalTxtpn.setBackground(SystemColor.activeCaption);
		subTotalTxtpn.setBounds(1150, 440, 300, 21);
		layeredPane.add(subTotalTxtpn);

		JButton findVareButton = new JButton("Find vare");

		findVareButton.setActionCommand("S\u00F8g");
		findVareButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		findVareButton.setBackground(SystemColor.inactiveCaption);
		findVareButton.setBounds(310, 146, 120, 48);
		layeredPane.add(findVareButton);
		

		JTextPane textPane = new JTextPane();
		textPane.setBounds(185, 280, -62, 19);
		layeredPane.add(textPane);

		JTextPane vareNavnTextField = new JTextPane();
		vareNavnTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vareNavnTextField.setBounds(10, 285, 300, 48);
		layeredPane.add(vareNavnTextField);

		JTextPane madeByCompanyTextField = new JTextPane();
		madeByCompanyTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		madeByCompanyTextField.setBounds(10, 372, 300, 48);
		layeredPane.add(madeByCompanyTextField);

		JTextPane priceTextField = new JTextPane();
		priceTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		priceTextField.setBounds(10, 461, 300, 48);
		layeredPane.add(priceTextField);

		JTextPane navnTxtpn = new JTextPane();
		navnTxtpn.setText("Vare navn");
		navnTxtpn.setPreferredSize(new Dimension(0, 0));
		navnTxtpn.setMargin(new Insets(3, 3, 3, 0));
		navnTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		navnTxtpn.setEditable(false);
		navnTxtpn.setBackground(SystemColor.activeCaption);
		navnTxtpn.setBounds(10, 264, 300, 21);
		layeredPane.add(navnTxtpn);

		JTextPane producentTxtpn = new JTextPane();
		producentTxtpn.setText("Producent");
		producentTxtpn.setPreferredSize(new Dimension(0, 0));
		producentTxtpn.setMargin(new Insets(3, 3, 3, 0));
		producentTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		producentTxtpn.setEditable(false);
		producentTxtpn.setBackground(SystemColor.activeCaption);
		producentTxtpn.setBounds(10, 351, 300, 21);
		layeredPane.add(producentTxtpn);

		JTextPane prisTxtpn = new JTextPane();
		prisTxtpn.setText("Pris");
		prisTxtpn.setPreferredSize(new Dimension(0, 0));
		prisTxtpn.setMargin(new Insets(3, 3, 3, 0));
		prisTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		prisTxtpn.setEditable(false);
		prisTxtpn.setBackground(SystemColor.activeCaption);
		prisTxtpn.setBounds(10, 440, 300, 21);
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

		JButton tilfojVareSalgButton = new JButton("Tilf\u00F8j");
		tilfojVareSalgButton.setBackground(SystemColor.inactiveCaption);
		tilfojVareSalgButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		tilfojVareSalgButton.setBounds(310, 589, 120, 48);
		layeredPane.add(tilfojVareSalgButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(490, 146, 600, 491);
		layeredPane.add(scrollPane);

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Vare navn", "L\u00E6ngde", "Antal", "Pris" }) {
					Class[] columnTypes = new Class[] { String.class, String.class, Integer.class, Double.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton cancelButton = new JButton("Annuller Salg");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vareNrTextField.setText(null);
				vareNavnTextField.setText(null);
				madeByCompanyTextField.setText(null);
				priceTextField.setText(null);
				txtIndtastAntal.setText(null);
				subTotalShowingTxtpn.setText(null);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
			}
		});
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cancelButton.setBackground(Color.RED);
		cancelButton.setBounds(10, 669, 145, 61);
		layeredPane.add(cancelButton);
		
		JButton btnFjernVare = new JButton("Fjern vare");
		btnFjernVare.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();				
				try {
				int SelectedRowIndex = table.getSelectedRow();
				model.removeRow(SelectedRowIndex);
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
			}
	
		});
		
		btnFjernVare.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFjernVare.setBackground(Color.RED);
		btnFjernVare.setBounds(165, 669, 145, 61);
		layeredPane.add(btnFjernVare);
		
		JButton btnFinishSale = new JButton("F\u00E6rdigg\u00F8r Salg");
		btnFinishSale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnAmountPage frame = new ReturnAmountPage();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnFinishSale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFinishSale.setBackground(Color.GREEN);
		btnFinishSale.setBounds(1150, 669, 212, 61);
		layeredPane.add(btnFinishSale);
		
		JTextPane returnTxtBox = new JTextPane();
		returnTxtBox.setText("Vekslepenge");
		returnTxtBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		returnTxtBox.setEditable(false);
		returnTxtBox.setBackground(SystemColor.activeCaption);
		returnTxtBox.setBounds(1150, 568, 300, 21);
		layeredPane.add(returnTxtBox);
		
		JTextPane txtpnAntal = new JTextPane();
		txtpnAntal.setText("Antal");
		txtpnAntal.setPreferredSize(new Dimension(0, 0));
		txtpnAntal.setMargin(new Insets(3, 3, 3, 0));
		txtpnAntal.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnAntal.setEditable(false);
		txtpnAntal.setBackground(SystemColor.activeCaption);
		txtpnAntal.setBounds(10, 568, 300, 21);
		layeredPane.add(txtpnAntal);
		
		findVareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				proID = Integer.parseInt(vareNrTextField.getText());
				SaleProduct saleProduct = null;
				saleProduct = saleController.searchSaleProductByID(proID);
				if (saleProduct != null) {
					vareNavnTextField.setText(saleProduct.getProductName());
					madeByCompanyTextField.setText(saleProduct.getMadeByCompany());
					price = saleProduct.getPrice();
					priceTextField.setText("" + saleProduct.getPrice());
					vareNrTextField.setText("Indtast varens ID.");
				}	else {
		    		new ErrorOneFrame().setVisible(true);
				}
			}
		});
			
		tilfojVareSalgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				antal = Integer.parseInt(txtIndtastAntal.getText());
				int currPrice = Integer.parseInt(subTotalShowingTxtpn.getText());
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { (vareNavnTextField.getText()), (madeByCompanyTextField.getText()),
						(Integer.parseInt(txtIndtastAntal.getText())),
						(Double.parseDouble(priceTextField.getText()) * antal) });
				currPrice += antal * price;
				subTotalShowingTxtpn.setText("" + currPrice);
				saleController.enterSaleProduct(proID, antal);
				proID = 0;
				antal = 0;
				vareNavnTextField.setText("");
				madeByCompanyTextField.setText("");
				priceTextField.setText("");
				txtIndtastAntal.setText("1");
			}
		});
		

		
	}
}
