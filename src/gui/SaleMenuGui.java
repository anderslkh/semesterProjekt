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

public class SaleMenuGui extends JFrame {

	private JPanel contentPane;
	private JTextField vareNrTextField;
	private JTextField txtIndtastAntal;

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
		setBounds(100, 100, 837, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton salgButton = new JButton("Salg");
		panel.add(salgButton);
		
		JButton betalingButton = new JButton("Betaling");
		panel.add(betalingButton);
		
		JButton opretKundeButton = new JButton("Opret kunde");
		panel.add(opretKundeButton);
		
		JButton kvitteringButton = new JButton("Kvittering");
		panel.add(kvitteringButton);
		
		JButton udlånButton = new JButton("Udl\u00E5n");
		panel.add(udlånButton);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JTextPane vareTxtpn = new JTextPane();
		vareTxtpn.setText("Vare");
		panel_1.add(vareTxtpn);
		
		vareNrTextField = new JTextField();
		vareNrTextField.setText("Indtast vare nr.");
		panel_1.add(vareNrTextField);
		vareNrTextField.setColumns(10);
		
		JTextPane længdeTxtpn = new JTextPane();
		længdeTxtpn.setText("L\u00E6ngde");
		panel_1.add(længdeTxtpn);
		
		JComboBox længdeComboBox = new JComboBox();
		længdeComboBox.setModel(new DefaultComboBoxModel(new String[] {"1200mm", "2400mm", "3200mm", "3600mm", "4200mm"}));
		panel_1.add(længdeComboBox);
		
		JTextPane antalTxtpn = new JTextPane();
		antalTxtpn.setText("Antal");
		panel_1.add(antalTxtpn);
		
		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setText("Indtast antal");
		panel_1.add(txtIndtastAntal);
		txtIndtastAntal.setColumns(10);
	}

}
