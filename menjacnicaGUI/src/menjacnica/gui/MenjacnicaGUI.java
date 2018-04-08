package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnDatoteka;
	private JMenuItem mntmHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 392);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTextPane(), BorderLayout.SOUTH);
		contentPane.add(getPanel_1(), BorderLayout.EAST);
		contentPane.add(getTable(), BorderLayout.CENTER);
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
		}
		return textPane;
	}
	private JPanel getPanel_1() {
		if (panel == null) {
			panel = new JPanel();
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton.gridx = 0;
			gbc_btnNewButton.gridy = 0;
			panel.add(getButton_1(), gbc_btnNewButton);
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton_1.gridx = 0;
			gbc_btnNewButton_1.gridy = 1;
			panel.add(getButton_2(), gbc_btnNewButton_1);
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.gridx = 0;
			gbc_btnNewButton_2.gridy = 2;
			panel.add(getButton_3(), gbc_btnNewButton_2);
		}
		return panel;
	}
	private JButton getButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj kurs");
		}
		return btnNewButton;
	}
	private JButton getButton_2() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Obrisi kurs");
		}
		return btnNewButton_1;
	}
	private JButton getButton_3() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Izvrsi zamenu");
		}
		return btnNewButton_2;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnDatoteka());
			menuBar.add(getMntmHelp());
		}
		return menuBar;
	}
	private JMenu getMnDatoteka() {
		if (mnDatoteka == null) {
			mnDatoteka = new JMenu("File");
			mnDatoteka.add(getMntmOpen());
			mnDatoteka.add(getMntmSave());
			mnDatoteka.add(getMntmExit());
		}
		return mnDatoteka;
	}
	private JMenuItem getMntmHelp() {
		if (mntmHelp == null) {
			mntmHelp = new JMenuItem("Help");
		}
		return mntmHelp;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
		}
		return mntmExit;
	}
}
