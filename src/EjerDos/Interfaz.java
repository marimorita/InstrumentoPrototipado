package EjerDos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textTexto;
	private JLabel etiTexto1;
	private JLabel lblTittle; 
	private JLabel etiTexto2;
	private	JButton btnTraspasa1;
	private JButton btnTraspasa2;

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(197, 197, 226));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto1 = new JLabel("  ");
		etiTexto1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		etiTexto1.setForeground(new Color(128, 128, 255));
		etiTexto1.setBounds(38, 104, 116, 78);
		contentPane.add(etiTexto1);
		
		lblTittle = new JLabel("Pasar info componentes graficos");
		lblTittle.setBounds(99, 23, 239, 20);
		lblTittle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblTittle.setForeground(new Color(128, 128, 255));
		contentPane.add(lblTittle);
		
		etiTexto2 = new JLabel("  ");
		etiTexto2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		etiTexto2.setForeground(new Color(128, 128, 255));
		etiTexto2.setBounds(295, 104, 116, 78);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnTraspasa1.setBackground(new Color(187, 187, 255));
		btnTraspasa1.setForeground(new Color(128, 128, 255));
		btnTraspasa1.setBounds(38, 193, 99, 23);
		contentPane.add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);	

		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnTraspasa2.setBackground(new Color(187, 187, 255));
		btnTraspasa2.setForeground(new Color(128, 128, 255));
		btnTraspasa2.setBounds(308, 193, 103, 23);
		contentPane.add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
		
		textTexto = new JTextField();
		textTexto.setForeground(new Color(128, 128, 255));
		textTexto.setBounds(170, 82, 115, 23);
		contentPane.add(textTexto);
		textTexto.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTraspasa1){
			etiTexto1.setText(textTexto.getText());
		}else if(e.getSource()==btnTraspasa2) {
			etiTexto2.setText(textTexto.getText());
		}
				
	}
}
