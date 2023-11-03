package EjerSeis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAchicar;
	private JButton btnAgrandar;
	private JButton btnCentro;
	private JButton btnEsquina;
	private JLabel etiNombre;
	private JLabel lblTitle;

	
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("Eventos del mouse y posicionamiento");
		lblTitle.setBackground(new Color(255, 128, 192));
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		lblTitle.setBounds(100, 11, 238, 14);
		lblTitle.setOpaque(true);
		contentPane.add(lblTitle);
		
		etiNombre = new JLabel("Mari Morita");
		etiNombre.setForeground(new Color(0, 0, 0));
		etiNombre.setBackground(new Color(255, 193, 224));
		etiNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		etiNombre.setBounds(180, 36, 69, 23);
		etiNombre.setOpaque(true);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBackground(new Color(255, 193, 224));
		btnEsquina.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		btnEsquina.setBounds(27, 99, 89, 23);
		contentPane.add(btnEsquina);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		
		btnCentro = new JButton("Centro");
		btnCentro.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		btnCentro.setBackground(new Color(255, 193, 224));
		btnCentro.setBounds(310, 99, 89, 23);
		contentPane.add(btnCentro);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		btnAchicar.setBackground(new Color(255, 193, 224));
		btnAchicar.setBounds(310, 198, 89, 23);
		contentPane.add(btnAchicar);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		btnAgrandar.setBackground(new Color(255, 193, 224));
		btnAgrandar.setBounds(27, 198, 89, 23);
		contentPane.add(btnAgrandar);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnEsquina) {
			etiNombre.setLocation(0, 0);
		}else if(e.getSource()==btnCentro) {
			etiNombre.setLocation(175, 120);
		}
		if(e.getSource()==btnAgrandar) {
			etiNombre.setSize(94, 34);
		}else if (e.getSource()==btnAchicar) {
			etiNombre.setSize(79, 14);
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==btnEsquina) {
			btnEsquina.setSize(99, 30);
		}else if(e.getSource()==btnCentro) {
			btnCentro.setSize(99, 30);
		}else if(e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(99, 30);
		}else if(e.getSource()==btnAchicar) {
			btnAchicar.setSize(99, 30);
		}
	}


	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==btnEsquina) {
			btnEsquina.setSize(89, 23);
		}else if(e.getSource()==btnCentro) {
			btnCentro.setSize(89, 23);
		}else if(e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(89, 23);
		}else if(e.getSource()==btnAchicar) {
			btnAchicar.setSize(89, 23);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	

}
