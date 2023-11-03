package EjerDiez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;
import java.awt.Font;
import java.awt.Color;

public class Interfaz extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtPalabra2;
    private JTextField txtPalabra1;
    private JLabel etiTexto;
    private JLabel lblNewLabel;

    public Interfaz() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(179, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtPalabra1 = new JTextField();
        txtPalabra1.setFont(new Font("Ravie", Font.PLAIN, 10));
        txtPalabra1.setForeground(new Color(0, 128, 255));
        txtPalabra1.setBounds(43, 74, 111, 27);
        contentPane.add(txtPalabra1);
        txtPalabra1.setColumns(10);

        txtPalabra2 = new JTextField();
        txtPalabra2.setFont(new Font("Ravie", Font.PLAIN, 10));
        txtPalabra2.setForeground(new Color(0, 128, 255));
        txtPalabra2.setBounds(274, 74, 118, 27);
        contentPane.add(txtPalabra2);
        txtPalabra2.setColumns(10);

        etiTexto = new JLabel("");
        etiTexto.setForeground(new Color(0, 128, 255));
        etiTexto.setFont(new Font("Ravie", Font.PLAIN, 11));
        etiTexto.setBounds(130, 112, 194, 36);
        contentPane.add(etiTexto);

        JButton btnConcatena = new JButton("Concatena");
        btnConcatena.setFont(new Font("Ravie", Font.PLAIN, 12));
        btnConcatena.setForeground(new Color(0, 128, 255));
        btnConcatena.setBackground(new Color(128, 255, 255));
        btnConcatena.setBounds(154, 159, 157, 27);
        contentPane.add(btnConcatena);
        
        lblNewLabel = new JLabel("Concatenar Datos ");
        lblNewLabel.setForeground(new Color(0, 128, 255));
        lblNewLabel.setFont(new Font("Ravie", Font.PLAIN, 14));
        lblNewLabel.setBounds(130, 11, 181, 25);
        contentPane.add(lblNewLabel);

        btnConcatena.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String palabra1 = txtPalabra1.getText();
                String palabra2 = txtPalabra2.getText();
                String resultado = palabra1 + " "  +   palabra2;
                etiTexto.setText(resultado);
            }
        });
    }
}

