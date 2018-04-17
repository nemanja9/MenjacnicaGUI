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
import javax.swing.JOptionPane;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;

import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JMenuBar menuBar;
	private JMenu mnDatoteka;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private static JTextArea textArea;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObriiKurs;
	private JMenuItem mntmIzvriZamenu;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;

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

		// addWindowListener(new WindowAdapter() {
		// });

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlaz();
			}
		});

		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(MenjacnicaGUI.class.getResource("/resources/icons/Beta-0imggifzpj.407x350.jpg")));
		setTitle("Menja\u010Dnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 593, 392);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel_1(), BorderLayout.EAST);
		contentPane.add(getPanel_1_1(), BorderLayout.SOUTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

	private JPanel getPanel_1() {
		if (panel == null) {
			panel = new JPanel();
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[] { 0, 0 };
			gbl_panel.rowHeights = new int[] { 0, 0, 0, 0 };
			gbl_panel.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
			gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
			panel.setLayout(gbl_panel);
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton.gridx = 0;
			gbc_btnNewButton.gridy = 0;
			panel.add(getButton_1(), gbc_btnNewButton);
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton_1.gridx = 0;
			gbc_btnNewButton_1.gridy = 1;
			panel.add(getButton_2(), gbc_btnNewButton_1);
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnNewButton_2.gridx = 0;
			gbc_btnNewButton_2.gridy = 2;
			panel.add(getButton_3(), gbc_btnNewButton_2);
		}
		return panel;
	}

	private JButton getButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj kurs");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dd = new DodajKursGUI();
					dd.setVisible(true);
				}
			});
		}
		return btnNewButton;
	}

	private JButton getButton_2() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Obrisi kurs");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI dd = new ObrisiKursGUI();
					dd.setVisible(true);
				}
			});
		}
		return btnNewButton_1;
	}

	private JButton getButton_3() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Izvrsi zamenu");
		}
		return btnNewButton_2;
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnDatoteka());
			menuBar.add(getMnHelp());
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

	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
			mntmOpen.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
				}
			});
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					JFileChooser fc = new JFileChooser();
					fc.setDialogTitle("Izaberite fajl: ");
					fc.showOpenDialog(fc);
					if (fc.getSelectedFile() != null) {
						MenjacnicaGUI.getTextArea().append("\n");
						textArea.append("Uèitan fajl: " + fc.getSelectedFile().getAbsolutePath());
					}
				}
			});
		}
		return mntmOpen;
	}

	private void izlaz() {
		int opcija = JOptionPane.showConfirmDialog(null, "Da li zelite da izadjete?", "Izlazak",
				JOptionPane.YES_NO_CANCEL_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					JFileChooser fc = new JFileChooser();
					fc.setDialogTitle("Izaberite fajl: ");
					fc.showSaveDialog(fc);
					if (fc.getSelectedFile() != null) {
						MenjacnicaGUI.getTextArea().append("\n");
						textArea.append("Saèuvan fajl: " + fc.getSelectedFile().getAbsolutePath());
					}
				}
			});
			mntmSave.setIcon(
					new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}

	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izlaz();

				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}

	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GroupLayout gl_panel_1 = new GroupLayout(panel_1);
			gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(
					getScrollPane_1(), Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE));
			gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
					.addComponent(getScrollPane_1(), GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE));
			panel_1.setLayout(gl_panel_1);
		}
		return panel_1;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}

	private JTable getTable_1() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
					new Object[][] {
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
					new String[] { "\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" }));
			addPopup(table, getPopupMenu());
		}
		return table;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getTextArea());
		}
		return scrollPane_1;
	}

	public static JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}

	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObriiKurs());
			popupMenu.add(getMntmIzvriZamenu());
		}
		return popupMenu;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dd = new DodajKursGUI();
					dd.setVisible(true);
				}
			});
		}
		return mntmDodajKurs;
	}

	private JMenuItem getMntmObriiKurs() {
		if (mntmObriiKurs == null) {
			mntmObriiKurs = new JMenuItem("Obri\u0161i kurs");
			mntmObriiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI dd = new ObrisiKursGUI();
					dd.setVisible(true);
				}
			});
		}
		return mntmObriiKurs;
	}

	private JMenuItem getMntmIzvriZamenu() {
		if (mntmIzvriZamenu == null) {
			mntmIzvriZamenu = new JMenuItem("Izvr\u0161i zamenu");
		}
		return mntmIzvriZamenu;
	}

	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}

	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					JOptionPane.showMessageDialog(null, "Aplikacija menjaènica, autor Nemanja Jurišiæ", "O aplikaciji",
							JOptionPane.INFORMATION_MESSAGE);

				}
			});
		}
		return mntmAbout;
	}
}
