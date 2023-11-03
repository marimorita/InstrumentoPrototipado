package EjerCuatro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Interfaz extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnDesactivar;
	private JButton btnAceptar;
	private JButton btnActivar;
	private JLabel txtFrase;
	private String frase, nombre, ciudad;
	private JLabel txtIdNombre;
	private JLabel lblCiudad;

	
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 169, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Desactivar componentes graficos");
		lblTitle.setForeground(new Color(255, 128, 0));
		lblTitle.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblTitle.setBounds(103, 23, 231, 20);
		contentPane.add(lblTitle);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(new Color(255, 128, 0));
		txtNombre.setBackground(new Color(255, 255, 255));
		txtNombre.setFont(new Font("Rockwell", Font.BOLD, 12));
		txtNombre.setBounds(78, 104, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtFrase = new JLabel("");
		txtFrase.setForeground(new Color(255, 128, 0));
		txtFrase.setFont(new Font("Rockwell", Font.BOLD, 12));
		txtFrase.setBounds(103, 53, 231, 36);
		contentPane.add(txtFrase);
		
		btnActivar = new JButton("Activar");
		btnActivar.setForeground(new Color(255, 128, 0));
		btnActivar.setFont(new Font("Rockwell", Font.BOLD, 12));
		btnActivar.setBackground(new Color(255, 193, 164));
		btnActivar.setBounds(68, 150, 89, 23);
		contentPane.add(btnActivar);
		btnActivar.addActionListener(this);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(210, 105, 0));
		btnAceptar.setFont(new Font("Rockwell", Font.BOLD, 12));
		btnAceptar.setBackground(new Color(255, 193, 164));
		btnAceptar.setBounds(167, 150, 89, 23);
		contentPane.add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setForeground(new Color(210, 105, 0));
		btnDesactivar.setFont(new Font("Rockwell", Font.BOLD, 12));
		btnDesactivar.setBackground(new Color(255, 193, 164));
		btnDesactivar.setBounds(266, 150, 105, 23);
		contentPane.add(btnDesactivar);
		btnDesactivar.addActionListener(this);
		
		txtCiudad = new JTextField();
		txtCiudad.setForeground(new Color(255, 128, 0));
		txtCiudad.setFont(new Font("Rockwell", Font.BOLD, 12));
		txtCiudad.setColumns(10);
		txtCiudad.setBackground(new Color(255, 255, 255));
		txtCiudad.setBounds(285, 104, 86, 20);
		contentPane.add(txtCiudad);
		
		txtIdNombre = new JLabel("Nombre:");
		txtIdNombre.setFont(new Font("Rockwell", Font.BOLD, 12));
		txtIdNombre.setForeground(new Color(255, 128, 0));
		txtIdNombre.setBounds(22, 107, 62, 14);
		contentPane.add(txtIdNombre);
		
		lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setForeground(new Color(255, 128, 0));
		lblCiudad.setFont(new Font("Rockwell", Font.BOLD, 11));
		lblCiudad.setBounds(239, 108, 44, 14);
		contentPane.add(lblCiudad);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAceptar) {
			nombre=txtNombre.getText();
			ciudad=txtCiudad.getText();
			frase="Usted es " +nombre+ " y su ciudad es "+ciudad;
			txtFrase.setText(frase);
		}
		if(e.getSource()==btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}else if(e.getSource()==btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
	    }
	}

}