package EjerNueve;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Interfaz extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtPrimerTrimestre;
    private JTextField txtSegundoTrimestre;
    private JTextField txtTercerTrimestre;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;
    private JLabel txtTittle;
    private JButton btnCalcular;
    private JLabel lblNota;
    private JLabel lblNotaTrimestreDos;
    private JLabel lblNotaTrimestreTres;
    
    public Interfaz() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtPrimerTrimestre = new JTextField();
        txtPrimerTrimestre.setForeground(new Color(128, 0, 128));
        txtPrimerTrimestre.setBounds(25, 51, 86, 30);
        contentPane.add(txtPrimerTrimestre);
        txtPrimerTrimestre.setColumns(10);

        txtSegundoTrimestre = new JTextField();
        txtSegundoTrimestre.setForeground(new Color(128, 0, 128));
        txtSegundoTrimestre.setBounds(180, 51, 86, 30);
        contentPane.add(txtSegundoTrimestre);
        txtSegundoTrimestre.setColumns(10);

        txtTercerTrimestre = new JTextField();
        txtTercerTrimestre.setForeground(new Color(128, 0, 128));
        txtTercerTrimestre.setBounds(324, 51, 86, 30);
        contentPane.add(txtTercerTrimestre);
        txtTercerTrimestre.setColumns(10);

        etiNotaFinal = new JLabel("NotaFinal:");
        etiNotaFinal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        etiNotaFinal.setBounds(98, 140, 121, 30);
        contentPane.add(etiNotaFinal);

        etiResultado = new JLabel("Resultado:");
        etiResultado.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        etiResultado.setBounds(257, 140, 140, 30);
        contentPane.add(etiResultado);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setForeground(new Color(128, 0, 128));
        btnCalcular.setBackground(new Color(192, 192, 192));
        btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnCalcular.setBounds(177, 194, 89, 38);
        contentPane.add(btnCalcular);
        
        txtTittle = new JLabel("Nota Estudiantes");
        txtTittle.setForeground(new Color(128, 0, 128));
        txtTittle.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        txtTittle.setBounds(180, 11, 109, 14);
        contentPane.add(txtTittle);
        
        lblNota = new JLabel("Nota Trimestre Uno");
        lblNota.setForeground(new Color(128, 0, 128));
        lblNota.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNota.setBounds(25, 92, 100, 30);
        contentPane.add(lblNota);
        
        lblNotaTrimestreDos = new JLabel("Nota Trimestre Dos");
        lblNotaTrimestreDos.setForeground(new Color(128, 0, 128));
        lblNotaTrimestreDos.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNotaTrimestreDos.setBounds(180, 92, 109, 30);
        contentPane.add(lblNotaTrimestreDos);
        
        lblNotaTrimestreTres = new JLabel("Nota Trimestre Tres");
        lblNotaTrimestreTres.setForeground(new Color(128, 0, 128));
        lblNotaTrimestreTres.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNotaTrimestreTres.setBounds(324, 92, 100, 30);
        contentPane.add(lblNotaTrimestreTres);


        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          
                double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
                double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
                double nota3 = Double.parseDouble(txtTercerTrimestre.getText());

            
                double notaMedia = (nota1 + nota2 + nota3) / 3;

               
                etiNotaFinal.setText("NotaFinal: " + notaMedia);

              
                if (notaMedia < 5) {
                    etiResultado.setText("Resultado: SUSPENSO");
                    etiResultado.setForeground(Color.RED);
                    etiNotaFinal.setForeground(Color.RED);
                } else {
                    etiResultado.setText("Resultado: APROBADO");
                    etiResultado.setForeground(Color.BLACK);
                    etiNotaFinal.setForeground(Color.BLACK);

                }
            }
        });
    }
}
