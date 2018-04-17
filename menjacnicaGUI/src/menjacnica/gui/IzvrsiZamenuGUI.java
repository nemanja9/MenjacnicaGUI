package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.DefaultComboBoxModel;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs;
	private JTextField kupovni;
	private JTextField textField;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JTextField iznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSlider slider;
	private JButton btnIzvriZamenu;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvr\u0161i zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 469, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getKupovni());
		contentPane.add(getTextField());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvriZamenu());
		contentPane.add(getBtnOdustani());
		setLocationRelativeTo(null);
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblKupovniKurs.setBounds(10, 22, 108, 25);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblValuta.setBounds(139, 22, 108, 25);
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblProdajniKurs.setBounds(326, 22, 108, 25);
		}
		return lblProdajniKurs;
	}
	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setEditable(false);
			kupovni.setBounds(10, 47, 91, 31);
			kupovni.setColumns(10);
		}
		return kupovni;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setColumns(10);
			textField.setBounds(326, 47, 91, 31);
		}
		return textField;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "CHF", "USD"}));
			comboBox.setBounds(139, 52, 57, 26);
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblIznos.setBounds(10, 107, 108, 25);
		}
		return lblIznos;
	}
	private JTextField getIznos() {
		if (iznos == null) {
			iznos = new JTextField();
			iznos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			iznos.setColumns(10);
			iznos.setBounds(10, 132, 91, 31);
		}
		return iznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblVrstaTransakcije.setBounds(244, 113, 108, 25);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(244, 140, 109, 23);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(244, 162, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					iznos.setText(String.valueOf(slider.getValue()));
				}
			});
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setBounds(10, 192, 407, 45);
		}
		return slider;
	}
	private JButton getBtnIzvriZamenu() {
		if (btnIzvriZamenu == null) {
			btnIzvriZamenu = new JButton("Izvr\u0161i zamenu");
			btnIzvriZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String tip = "";
					if (rdbtnKupovina.isSelected())
						tip = "kupovina";
					else 
						tip = "prodaja";
					MenjacnicaGUI.getTextArea().append("\n");
					MenjacnicaGUI.getTextArea().append("Zamena: [Iznos: " + iznos.getText() + " Valuta: " + comboBox.getSelectedItem() + " Tip transakcije: " + tip + " ] ");
					dispose();
				}
			});
			btnIzvriZamenu.setBounds(20, 264, 115, 31);
		}
		return btnIzvriZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(308, 264, 98, 31);
		}
		return btnOdustani;
	}
}
