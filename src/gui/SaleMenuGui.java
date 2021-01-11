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
		salgButton.setBackground(SystemColor.activeCaption);
		panel.add(salgButton);
		
		JButton betalingButton = new JButton("Betaling");
		betalingButton.setBackground(SystemColor.activeCaptionBorder);
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
		
		JTextPane vareTxtpn = new JTextPane();
		vareTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareTxtpn.setBackground(Color.LIGHT_GRAY);
		vareTxtpn.setEditable(false);
		vareTxtpn.setBounds(10, 34, 96, 21);
		layeredPane.add(vareTxtpn);
		vareTxtpn.setPreferredSize(new Dimension(0, 0));
		vareTxtpn.setMargin(new Insets(3, 3, 3, 0));
		vareTxtpn.setText("Vare");
		
		JTextPane længdeTxtpn = new JTextPane();
		længdeTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		længdeTxtpn.setEditable(false);
		længdeTxtpn.setBackground(Color.LIGHT_GRAY);
		længdeTxtpn.setBounds(10, 104, 96, 21);
		layeredPane.add(længdeTxtpn);
		længdeTxtpn.setPreferredSize(new Dimension(0, 19));
		længdeTxtpn.setText("L\u00E6ngde");
		
		JComboBox længdeComboBox = new JComboBox();
		længdeComboBox.setBorder(null);
		længdeComboBox.setBackground(Color.WHITE);
		længdeComboBox.setBounds(10, 123, 96, 40);
		layeredPane.add(længdeComboBox);
		længdeComboBox.setModel(new DefaultComboBoxModel(new String[] {"1200mm", "2400mm", "3200mm", "3600mm", "4200mm"}));
		
		vareNrTextField = new JTextField();
		vareNrTextField.setText("Indtast vare nr.");
		vareNrTextField.setBorder(null);
		vareNrTextField.setToolTipText("xd");
		vareNrTextField.setBackground(Color.WHITE);
		vareNrTextField.setBounds(10, 54, 96, 40);
		layeredPane.add(vareNrTextField);
		vareNrTextField.setPreferredSize(new Dimension(0, 0));
		vareNrTextField.setColumns(10);
		
		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setBorder(null);
		txtIndtastAntal.setBackground(Color.WHITE);
		txtIndtastAntal.setBounds(10, 194, 96, 40);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setColumns(10);
		
		JTextPane antalTxtpn = new JTextPane();
		antalTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		antalTxtpn.setEditable(false);
		antalTxtpn.setBackground(Color.LIGHT_GRAY);
		antalTxtpn.setBounds(10, 173, 96, 21);
		layeredPane.add(antalTxtpn);
		antalTxtpn.setText("Antal");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Varenavn", "L\u00E6ngde", "Antal", "Pris"
			}
		));
		table.setBounds(259, 56, 587, 218);
		layeredPane.add(table);
		
		JTextPane vareTxtpn_1 = new JTextPane();
		vareTxtpn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		vareTxtpn_1.setText("Valgte varer");
		vareTxtpn_1.setPreferredSize(new Dimension(0, 0));
		vareTxtpn_1.setMargin(new Insets(3, 3, 3, 0));
		vareTxtpn_1.setEditable(false);
		vareTxtpn_1.setBackground(Color.LIGHT_GRAY);
		vareTxtpn_1.setBounds(259, 34, 587, 21);
		layeredPane.add(vareTxtpn_1);
		
		JButton tilføjVareSalgButton = new JButton("Tilf\u00F8j");
		tilføjVareSalgButton.setBackground(Color.LIGHT_GRAY);
		tilføjVareSalgButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tilføjVareSalgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tilføjVareSalgButton.setBounds(10, 244, 96, 30);
		layeredPane.add(tilføjVareSalgButton);
		
		JTextPane subTotalShowingTxtpn = new JTextPane();
		subTotalShowingTxtpn.setFont(new Font("Tahoma", Font.PLAIN, 38));
		subTotalShowingTxtpn.setEditable(false);
		subTotalShowingTxtpn.setBackground(Color.WHITE);
		subTotalShowingTxtpn.setBounds(259, 401, 291, 60);
		layeredPane.add(subTotalShowingTxtpn);
		
		JButton gåTilBetalingButton = new JButton("G\u00E5 til betaling");
		gåTilBetalingButton.setBackground(Color.LIGHT_GRAY);
		gåTilBetalingButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gåTilBetalingButton.setBounds(551, 401, 152, 60);
		layeredPane.add(gåTilBetalingButton);
		
		JTextPane subTotalTxtpn = new JTextPane();
		subTotalTxtpn.setText("Subtotal");
		subTotalTxtpn.setFont(new Font("Tahoma", Font.BOLD, 14));
		subTotalTxtpn.setEditable(false);
		subTotalTxtpn.setBackground(Color.LIGHT_GRAY);
		subTotalTxtpn.setBounds(259, 370, 291, 30);
		layeredPane.add(subTotalTxtpn);
	}
}
