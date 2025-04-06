

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.DropMode;

public class Test extends JFrame {
	private JTextField islem;
	private JTextField islem2;
	private double cevap,sayi;
	int operasyon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	
	public void addInput(String str) {
		islem.setText(islem.getText() + str);
		
	}

	public void hesaplama() {
		switch(operasyon) {
		case 1 :
			cevap = sayi + Double.parseDouble(islem.getText());
			islem.setText(Double.toString(cevap));
			break;
		case 2 :
			cevap = sayi - Double.parseDouble(islem.getText());
			islem.setText(Double.toString(cevap));
			break;
		case 3 :
			cevap = sayi * Double.parseDouble(islem.getText());
			islem.setText(Double.toString(cevap));
			break;
		case 4 :
			cevap = sayi / Double.parseDouble(islem.getText());
			islem.setText(Double.toString(cevap));
			break;
			
		}
	}
	
	public Test() {
		setTitle("Hesap Makinesi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 569);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel anaPanel = new JPanel();
		anaPanel.setBackground(new Color(0, 0, 0));
		anaPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(135, 206, 235), new Color(135, 206, 235), new Color(135, 206, 235), new Color(135, 206, 235)));
		getContentPane().add(anaPanel);
		anaPanel.setLayout(null);
		
		
		
		JButton bolme = new JButton("\u00F7");
		bolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(islem.getText());
				operasyon = 4;
				islem.setText("");
				islem2.setText(sayi + e.getActionCommand());
			}
		});
		bolme.setForeground(Color.WHITE);
		bolme.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 14));
		bolme.setBackground(Color.BLACK);
		bolme.setBounds(335, 220, 69, 49);
		anaPanel.add(bolme);
		
		JButton carpma = new JButton("\u00D7");
		carpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(islem.getText());
				operasyon = 3;
				islem.setText("");
				islem2.setText(sayi + e.getActionCommand());
			}
		});
		carpma.setForeground(Color.WHITE);
		carpma.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 14));
		carpma.setBackground(Color.BLACK);
		carpma.setBounds(404, 220, 69, 49);
		anaPanel.add(carpma);
		
		JButton cikarma = new JButton("-");
		cikarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(islem.getText());
				operasyon = 2;
				islem.setText("");
				islem2.setText(sayi + e.getActionCommand());
			}
		});
		cikarma.setForeground(Color.WHITE);
		cikarma.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 14));
		cikarma.setBackground(Color.BLACK);
		cikarma.setBounds(335, 268, 69, 49);
		anaPanel.add(cikarma);
		
		JButton toplama = new JButton("+");
		toplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(islem.getText());
				operasyon = 1;
				islem.setText("");
				islem2.setText(sayi + e.getActionCommand());
			}
		});
		toplama.setForeground(Color.WHITE);
		toplama.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 14));
		toplama.setBackground(Color.BLACK);
		toplama.setBounds(404, 268, 69, 49);
		anaPanel.add(toplama);
		
		JButton esittir = new JButton("=");
		esittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesaplama();
				islem2.setText("");
				
			}
		});
		esittir.setForeground(Color.WHITE);
		esittir.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 14));
		esittir.setBackground(Color.BLACK);
		esittir.setBounds(335, 421, 137, 49);
		anaPanel.add(esittir);
		
		islem = new JTextField();
		islem.setEnabled(false);
		islem.setEditable(false);
		islem.setHorizontalAlignment(SwingConstants.RIGHT);
		islem.setForeground(new Color(255, 255, 255));
		islem.setBackground(new Color(0, 0, 0));
		islem.setBounds(34, 116, 439, 71);
		anaPanel.add(islem);
		islem.setColumns(10);
		
		islem2 = new JTextField();
		islem2.setHorizontalAlignment(SwingConstants.RIGHT);
		islem2.setEditable(false);
		islem2.setEnabled(false);
		islem2.setForeground(new Color(255, 255, 255));
		islem2.setBackground(new Color(0, 0, 0));
		islem2.setBounds(249, 60, 223, 36);
		anaPanel.add(islem2);
		islem2.setColumns(15);
		
		JPanel sayilarPanel = new JPanel();
		sayilarPanel.setBackground(new Color(0, 0, 0));
		sayilarPanel.setBounds(34, 220, 253, 194);
		anaPanel.add(sayilarPanel);
		sayilarPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton sayi7 = new JButton("7");
		sayi7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
		});
		sayi7.setForeground(new Color(255, 255, 255));
		sayi7.setBackground(new Color(0, 0, 0));
		sayilarPanel.add(sayi7);
		
		JButton sayi8 = new JButton("8");
		sayi8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		sayi8.setForeground(Color.WHITE);
		sayi8.setBackground(Color.BLACK);
		sayilarPanel.add(sayi8);
		
		JButton sayi9 = new JButton("9");
		sayi9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		sayi9.setForeground(Color.WHITE);
		sayi9.setBackground(Color.BLACK);
		sayilarPanel.add(sayi9);
		
		JButton sayi6 = new JButton("6");
		sayi6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		sayi6.setForeground(Color.WHITE);
		sayi6.setBackground(Color.BLACK);
		sayilarPanel.add(sayi6);
		
		JButton sayi5 = new JButton("5");
		sayi5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		sayi5.setForeground(Color.WHITE);
		sayi5.setBackground(Color.BLACK);
		sayilarPanel.add(sayi5);
		
		JButton sayi4 = new JButton("4");
		sayi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		sayi4.setForeground(Color.WHITE);
		sayi4.setBackground(Color.BLACK);
		sayilarPanel.add(sayi4);
		
		JButton sayi3 = new JButton("3");
		sayi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		sayi3.setForeground(Color.WHITE);
		sayi3.setBackground(Color.BLACK);
		sayilarPanel.add(sayi3);
		
		JButton sayi2 = new JButton("2");
		sayi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		sayi2.setForeground(Color.WHITE);
		sayi2.setBackground(Color.BLACK);
		sayilarPanel.add(sayi2);
		
		JButton sayi1 = new JButton("1");
		sayi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		sayi1.setForeground(Color.WHITE);
		sayi1.setBackground(Color.BLACK);
		sayilarPanel.add(sayi1);
		
		JPanel sifirPanel = new JPanel();
		sifirPanel.setBackground(new Color(0, 0, 0));
		sifirPanel.setBounds(34, 412, 253, 58);
		anaPanel.add(sifirPanel);
		sifirPanel.setLayout(new BorderLayout(0, 0));
		
		JButton sayi0 = new JButton("0");
		sayi0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem.setText(islem.getText() + sayi0.getActionCommand());
			}
		});
		sayi0.setForeground(new Color(255, 255, 255));
		sayi0.setBackground(new Color(0, 0, 0));
		sifirPanel.add(sayi0);
		
		JButton btnNewButton_12_5_1_1 = new JButton(" ");
		btnNewButton_12_5_1_1.setForeground(Color.WHITE);
		btnNewButton_12_5_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnNewButton_12_5_1_1.setBackground(Color.BLACK);
		btnNewButton_12_5_1_1.setBounds(335, 328, 69, 36);
		anaPanel.add(btnNewButton_12_5_1_1);
		
		JButton btnNewButton_12_5_1_1_1 = new JButton(" ");
		btnNewButton_12_5_1_1_1.setForeground(Color.WHITE);
		btnNewButton_12_5_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnNewButton_12_5_1_1_1.setBackground(Color.BLACK);
		btnNewButton_12_5_1_1_1.setBounds(404, 328, 69, 36);
		anaPanel.add(btnNewButton_12_5_1_1_1);
		
		JButton hepsiniSilme = new JButton("C");
		hepsiniSilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem.setText("");
			}
		});
		hepsiniSilme.setForeground(Color.WHITE);
		hepsiniSilme.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		hepsiniSilme.setBackground(Color.BLACK);
		hepsiniSilme.setBounds(335, 375, 69, 36);
		anaPanel.add(hepsiniSilme);
		
		JButton silme = new JButton("Delete");
		silme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		silme.setForeground(Color.WHITE);
		silme.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		silme.setBackground(Color.BLACK);
		silme.setBounds(404, 375, 69, 36);
		anaPanel.add(silme);
	}
}
