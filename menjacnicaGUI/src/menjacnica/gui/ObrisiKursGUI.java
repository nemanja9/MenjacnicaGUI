package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField sifra;
	private JTextField naziv;
	private JLabel label_1;
	private JTextField kupovni;
	private JLabel label_2;
	private JTextField prodajni;
	private JLabel label_3;
	private JTextField srednji;
	private JButton obrisi;
	private JLabel label_4;
	private JTextField skraceni;
	private JButton button_1;
	private JLabel label_5;
	private JCheckBox obrisano;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setResizable(false);
		setTitle("Obri\u0161i kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getSifra());
		contentPane.add(getNaziv());
		contentPane.add(getLabel_1());
		contentPane.add(getKupovni());
		contentPane.add(getLabel_2());
		contentPane.add(getProdajni());
		contentPane.add(getLabel_3());
		contentPane.add(getSrednji());
		contentPane.add(getObrisi());
		contentPane.add(getLabel_4());
		contentPane.add(getSkraceni());
		contentPane.add(getButton_1());
		contentPane.add(getLabel_5());
		contentPane.add(getObrisano());
		setLocationRelativeTo(null);
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\u0160ifra");
			label.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label.setBounds(10, 0, 63, 32);
		}
		return label;
	}
	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setColumns(10);
			sifra.setBounds(10, 31, 144, 25);
		}
		return sifra;
	}
	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setColumns(10);
			naziv.setBounds(285, 33, 136, 25);
		}
		return naziv;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Naziv");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label_1.setBounds(285, 0, 63, 32);
		}
		return label_1;
	}
	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setColumns(10);
			kupovni.setBounds(285, 102, 136, 25);
		}
		return kupovni;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Kupovni kurs");
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label_2.setBounds(285, 69, 136, 32);
		}
		return label_2;
	}
	private JTextField getProdajni() {
		if (prodajni == null) {
			prodajni = new JTextField();
			prodajni.setColumns(10);
			prodajni.setBounds(10, 100, 144, 25);
		}
		return prodajni;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Prodajni kurs");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label_3.setBounds(10, 69, 144, 32);
		}
		return label_3;
	}
	private JTextField getSrednji() {
		if (srednji == null) {
			srednji = new JTextField();
			srednji.setColumns(10);
			srednji.setBounds(10, 179, 144, 25);
		}
		return srednji;
	}
	private JButton getObrisi() {
		if (obrisi == null) {
			obrisi = new JButton("Obri\u0161i");
			obrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						Kurs k = new Kurs();

						k.setNaziv(naziv.getText());
						k.setSkraceni(skraceni.getText());
						k.setKupovni(Double.parseDouble(kupovni.getText()));
						k.setSrednji(Double.parseDouble(srednji.getText()));
						k.setProdajni(Double.parseDouble(prodajni.getText()));
						k.setSifra(Integer.parseInt(sifra.getText()));
						MenjacnicaGUI.getTextArea().append("\n");
						MenjacnicaGUI.getTextArea().append("Obrisan " + k.toString());
						dispose();
						

					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e2.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			obrisi.setEnabled(false);
			obrisi.setBounds(10, 237, 136, 23);
		}
		return obrisi;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Srednji kurs");
			label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label_4.setBounds(10, 148, 144, 32);
		}
		return label_4;
	}
	private JTextField getSkraceni() {
		if (skraceni == null) {
			skraceni = new JTextField();
			skraceni.setColumns(10);
			skraceni.setBounds(285, 181, 136, 25);
		}
		return skraceni;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Odustani");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			button_1.setBounds(285, 237, 136, 23);
		}
		return button_1;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Skra\u0107eni naziv");
			label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label_5.setBounds(285, 148, 136, 32);
		}
		return label_5;
	}
	private JCheckBox getObrisano() {
		if (obrisano == null) {
			obrisano = new JCheckBox("Zaista obri\u0161i kurs");
			obrisano.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						obrisi.setEnabled(obrisano.isSelected());
						
						
					
				}
			});
			obrisano.setBounds(6, 211, 170, 23);
		}
		return obrisano;
	}
}
