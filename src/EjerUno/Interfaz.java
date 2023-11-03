package EjerUno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Interfaz extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCiudad;
	private JButton btnOcultarNombre;
	private JButton btnVisuNombre;
	private JLabel etiNombre;
	private JLabel etiCiudad;
	private JButton btnOcultarCiudad;
	private JButton btnVisuCiudad;
	private JLabel lblTittle;



	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 128, 192));
		contentPane.setBackground(new Color(255, 232, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTittle = new JLabel("Ocultar y visualizar");
		lblTittle.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		lblTittle.setForeground(new Color(255, 0, 128));
		lblTittle.setBounds(169, 11, 118, 27);
		contentPane.add(lblTittle);
		
		etiNombre = new JLabel("Nombre: ");
		etiNombre.setForeground(new Color(255, 0, 128));
		etiNombre.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 11));
		etiNombre.setBounds(43, 59, 51, 14);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Ciudad: ");
		etiCiudad.setForeground(new Color(255, 0, 128));
		etiCiudad.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 11));
		etiCiudad.setBounds(256, 59, 46, 14);
		contentPane.add(etiCiudad);
		
		textNombre = new JTextField();
		textNombre.setForeground(new Color(255, 128, 192));
		textNombre.setBounds(97, 57, 73, 17);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textCiudad = new JTextField();
		textCiudad.setForeground(new Color(255, 128, 192));
		textCiudad.setBounds(310, 58, 73, 17);
		contentPane.add(textCiudad);
		textCiudad.setColumns(10);
		
		btnOcultarNombre = new JButton("Ocultar nombre");
		btnOcultarNombre.setForeground(new Color(255, 0, 128));
		btnOcultarNombre.setBackground(new Color(255, 128, 192));
		btnOcultarNombre.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 10));
		btnOcultarNombre.setBounds(43, 105, 127, 23);
		contentPane.add(btnOcultarNombre);
		btnOcultarNombre.addActionListener(this);
		
		btnVisuNombre = new JButton("Visualizar nombre");
		btnVisuNombre.setForeground(new Color(255, 0, 128));
		btnVisuNombre.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 10));
		btnVisuNombre.setBackground(new Color(255, 128, 192));
		btnVisuNombre.setBounds(43, 163, 127, 23);
		contentPane.add(btnVisuNombre);
		btnVisuNombre.addActionListener(this);

		
		btnOcultarCiudad = new JButton("Ocultar ciudad");
		btnOcultarCiudad.setForeground(new Color(255, 0, 128));
		btnOcultarCiudad.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 10));
		btnOcultarCiudad.setBackground(new Color(255, 128, 192));
		btnOcultarCiudad.setBounds(256, 105, 127, 23);
		contentPane.add(btnOcultarCiudad);
		btnOcultarCiudad.addActionListener(this);

		
		btnVisuCiudad = new JButton("Visualizar ciudad");
		btnVisuCiudad.setForeground(new Color(255, 0, 128));
		btnVisuCiudad.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 10));
		btnVisuCiudad.setBackground(new Color(255, 128, 192));
		btnVisuCiudad.setBounds(256, 163, 127, 23);
		contentPane.add(btnVisuCiudad);
		btnVisuCiudad.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOcultarNombre){
			textNombre.setVisible(false);
		}else if(e.getSource()==btnVisuNombre) {
			textNombre.setVisible(true);
		}
		if (e.getSource()==btnOcultarCiudad) {
			textCiudad.setVisible(false);
		}else if(e.getSource()==btnVisuCiudad) {
			textCiudad.setVisible(true);
		}
	}
}

