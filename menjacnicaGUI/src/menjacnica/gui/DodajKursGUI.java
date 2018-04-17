package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblifra;
	private JLabel lblNaziv;
	private JTextField sifra;
	private JTextField naziv;
	private JLabel lblProdajniKurs;
	private JTextField prodajni;
	private JTextField kupovni;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JTextField srednji;
	private JTextField skraceni;
	private JLabel lblSkraeniNaziv;
	private JButton odustani;
	private JButton dodaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getSifra());
		contentPane.add(getNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getProdajni());
		contentPane.add(getKupovni());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getSrednji());
		contentPane.add(getSkraceni());
		contentPane.add(getLblSkraeniNaziv());
		contentPane.add(getOdustani());
		contentPane.add(getDodaj());
		setLocationRelativeTo(null);
	}

	private JLabel getLblifra() {
		if (lblifra == null) {
			lblifra = new JLabel("\u0160ifra");
			lblifra.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblifra.setBounds(10, 24, 63, 32);
		}
		return lblifra;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNaziv.setBounds(285, 24, 63, 32);
		}
		return lblNaziv;
	}

	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setBounds(10, 55, 144, 25);
			sifra.setColumns(10);
		}
		return sifra;
	}

	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setColumns(10);
			naziv.setBounds(285, 57, 136, 25);
		}
		return naziv;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblProdajniKurs.setBounds(10, 93, 144, 32);
		}
		return lblProdajniKurs;
	}

	private JTextField getProdajni() {
		if (prodajni == null) {
			prodajni = new JTextField();
			prodajni.setColumns(10);
			prodajni.setBounds(10, 124, 144, 25);
		}
		return prodajni;
	}

	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setColumns(10);
			kupovni.setBounds(285, 126, 136, 25);
		}
		return kupovni;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblKupovniKurs.setBounds(285, 93, 136, 32);
		}
		return lblKupovniKurs;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSrednjiKurs.setBounds(10, 172, 144, 32);
		}
		return lblSrednjiKurs;
	}

	private JTextField getSrednji() {
		if (srednji == null) {
			srednji = new JTextField();
			srednji.setColumns(10);
			srednji.setBounds(10, 203, 144, 25);
		}
		return srednji;
	}

	private JTextField getSkraceni() {
		if (skraceni == null) {
			skraceni = new JTextField();
			skraceni.setColumns(10);
			skraceni.setBounds(285, 205, 136, 25);
		}
		return skraceni;
	}

	private JLabel getLblSkraeniNaziv() {
		if (lblSkraeniNaziv == null) {
			lblSkraeniNaziv = new JLabel("Skra\u0107eni naziv");
			lblSkraeniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSkraeniNaziv.setBounds(285, 172, 136, 32);
		}
		return lblSkraeniNaziv;
	}

	private JButton getOdustani() {
		if (odustani == null) {
			odustani = new JButton("Odustani");
			odustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			odustani.setBounds(285, 241, 136, 23);
		}
		return odustani;
	}

	private void dodaj() {
		try {
			Kurs k = new Kurs();

			k.setNaziv(naziv.getText());
			k.setSkraceni(skraceni.getText());
			k.setKupovni(Double.parseDouble(kupovni.getText()));
			k.setSrednji(Double.parseDouble(srednji.getText()));
			k.setProdajni(Double.parseDouble(prodajni.getText()));
			k.setSifra(Integer.parseInt(sifra.getText()));
			MenjacnicaGUI.getTextArea().append(k.toString());
			dispose();
			

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, e2.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

	private JButton getDodaj() {
		if (dodaj == null) {
			dodaj = new JButton("Dodaj");
			dodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dodaj();
				}
			});
			dodaj.setBounds(10, 241, 136, 23);
		}
		return dodaj;
	}
}
