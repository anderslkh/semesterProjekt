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

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);

		JButton salgButton = new JButton("Salg");
		salgButton.setBackground(SystemColor.activeCaption);
		panel.add(salgButton);

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
		layeredPane.setSize(new Dimension(1920, 0));
		contentPane.add(layeredPane, BorderLayout.CENTER);

		JTextPane vareTxtpn = new JTextPane();
		vareTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareTxtpn.setBackground(Color.LIGHT_GRAY);
		vareTxtpn.setEditable(false);
		vareTxtpn.setBounds(10, 34, 96, 21);
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
		vareNrTextField.setText("Indtast vare nr.");
		vareNrTextField.setBorder(null);
		vareNrTextField.setToolTipText("xd");
		vareNrTextField.setBackground(Color.WHITE);
		vareNrTextField.setBounds(10, 54, 400, 40);
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
		txtIndtastAntal.setBounds(10, 622, 400, 40);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setColumns(10);

		JTextPane antalTxtpn = new JTextPane();
		antalTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		antalTxtpn.setEditable(false);
		antalTxtpn.setBackground(Color.LIGHT_GRAY);
		antalTxtpn.setBounds(10, 591, 96, 21);
		layeredPane.add(antalTxtpn);
		antalTxtpn.setText("Antal");

		table = new JTable();
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Varenavn", "L\u00E6ngde", "Antal", "Pris" }) {
					Class[] columnTypes = new Class[] { Integer.class, String.class, Integer.class, Integer.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		table.setBounds(576, 56, 870, 462);
		layeredPane.add(table);

		JTextPane vareTxtpn_1 = new JTextPane();
		vareTxtpn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareTxtpn_1.setText("Valgte varer");
		vareTxtpn_1.setPreferredSize(new Dimension(0, 0));
		vareTxtpn_1.setMargin(new Insets(3, 3, 3, 0));
		vareTxtpn_1.setEditable(false);
		vareTxtpn_1.setBackground(Color.LIGHT_GRAY);
		vareTxtpn_1.setBounds(576, 34, 870, 21);
		layeredPane.add(vareTxtpn_1);

		JButton tilføjVareSalgButton = new JButton("Tilf\u00F8j");
		tilføjVareSalgButton.setBackground(Color.LIGHT_GRAY);
		tilføjVareSalgButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tilføjVareSalgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { Integer.parseInt(vareNrTextField.getText()),
						Integer.parseInt(txtIndtastAntal.getText())});
			}
		});
		tilføjVareSalgButton.setBounds(420, 622, 120, 40);
		layeredPane.add(tilføjVareSalgButton);

		JTextPane subTotalShowingTxtpn = new JTextPane();
		subTotalShowingTxtpn.setFont(new Font("Tahoma", Font.PLAIN, 38));
		subTotalShowingTxtpn.setEditable(false);
		subTotalShowingTxtpn.setBackground(Color.WHITE);
		subTotalShowingTxtpn.setBounds(982, 690, 291, 60);
		layeredPane.add(subTotalShowingTxtpn);

		JButton gåTilBetalingButton = new JButton("G\u00E5 til betaling");
		gåTilBetalingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new BetalingsMenu().setVisible(true);
			}
		});
		
		gåTilBetalingButton.setBackground(Color.LIGHT_GRAY);
		gåTilBetalingButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gåTilBetalingButton.setBounds(1283, 690, 152, 60);
		layeredPane.add(gåTilBetalingButton);

		JTextPane subTotalTxtpn = new JTextPane();
		subTotalTxtpn.setText("Subtotal");
		subTotalTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		subTotalTxtpn.setEditable(false);
		subTotalTxtpn.setBackground(Color.LIGHT_GRAY);
		subTotalTxtpn.setBounds(982, 656, 291, 30);
		layeredPane.add(subTotalTxtpn);
		
		JButton søgeVareSalgButton = new JButton("Søg");
		søgeVareSalgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		søgeVareSalgButton.setActionCommand("S\u00F8g");
		søgeVareSalgButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		søgeVareSalgButton.setBackground(Color.LIGHT_GRAY);
		søgeVareSalgButton.setBounds(420, 64, 96, 30);
		layeredPane.add(søgeVareSalgButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(185, 280, -62, 19);
		layeredPane.add(textPane);
		
		JTextPane vareNavnTextField = new JTextPane();
		vareNavnTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vareNavnTextField.setBounds(10, 319, 400, 40);
		layeredPane.add(vareNavnTextField);
		
		JTextPane madeByCompanyTextField = new JTextPane();
		madeByCompanyTextField.setBounds(10, 401, 400, 40);
		layeredPane.add(madeByCompanyTextField);
		
		JTextPane priceTextField = new JTextPane();
		priceTextField.setBounds(10, 511, 400, 40);
		layeredPane.add(priceTextField);
		
		JTextPane navnTxtpn = new JTextPane();
		navnTxtpn.setText("Vare navn");
		navnTxtpn.setPreferredSize(new Dimension(0, 0));
		navnTxtpn.setMargin(new Insets(3, 3, 3, 0));
		navnTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		navnTxtpn.setEditable(false);
		navnTxtpn.setBackground(Color.LIGHT_GRAY);
		navnTxtpn.setBounds(10, 291, 96, 21);
		layeredPane.add(navnTxtpn);
		
		JTextPane producentTxtpn = new JTextPane();
		producentTxtpn.setText("Producent");
		producentTxtpn.setPreferredSize(new Dimension(0, 0));
		producentTxtpn.setMargin(new Insets(3, 3, 3, 0));
		producentTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		producentTxtpn.setEditable(false);
		producentTxtpn.setBackground(Color.LIGHT_GRAY);
		producentTxtpn.setBounds(10, 370, 96, 21);
		layeredPane.add(producentTxtpn);
		
		JTextPane prisTxtpn = new JTextPane();
		prisTxtpn.setText("Pris");
		prisTxtpn.setPreferredSize(new Dimension(0, 0));
		prisTxtpn.setMargin(new Insets(3, 3, 3, 0));
		prisTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		prisTxtpn.setEditable(false);
		prisTxtpn.setBackground(Color.LIGHT_GRAY);
		prisTxtpn.setBounds(10, 480, 96, 21);
		layeredPane.add(prisTxtpn);
		
		JList list = new JList();
		list.setBounds(515, 503, -99, -112);
		layeredPane.add(list);
		
		JComboBox vareListeComboBox = new JComboBox();
		vareListeComboBox.setBounds(10, 95, 400, 160);
		layeredPane.add(vareListeComboBox);
		
//		public String længdeComboBoxVærdi() {
//			JComboBox længdeComboBox = null;
//			String str = længdeComboBox.getSelectedItem().toString();
//			return str;
//		}
	}
}
