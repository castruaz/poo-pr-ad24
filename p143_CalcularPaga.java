package p143_PagaTrabajador;
import javax.swing.*;
import java.awt.event.*;

public class p143_CalcularPaga extends JFrame implements ActionListener {
    JLabel lblHoras, lblPagaHora, lblTasaImpuesto, lblPagaBruta, lblImpuesto, lblPagaNeta;
    JTextField txtHoras, txtPagaHora, txtTasaImpuesto;
    JButton btnCalcular, btnSalir;

    public p143_CalcularPaga() {
        super("Calculadora paga");
        setLayout(null);

        
        lblHoras = new JLabel("Horas trabajadas:");
        lblHoras.setBounds(10, 20, 120, 30);
        add(lblHoras);

        txtHoras = new JTextField();
        txtHoras.setBounds(130, 20, 100, 30);
        add(txtHoras);

        lblPagaHora = new JLabel("Paga por hora:");
        lblPagaHora.setBounds(10, 50, 120, 30);
        add(lblPagaHora);

        txtPagaHora = new JTextField();
        txtPagaHora.setBounds(130, 50, 100, 30);
        add(txtPagaHora);

        lblTasaImpuesto = new JLabel("Tasa de impuesto (%):");
        lblTasaImpuesto.setBounds(10, 80, 120, 30);
        add(lblTasaImpuesto);

        txtTasaImpuesto = new JTextField();
        txtTasaImpuesto.setBounds(130, 80, 100, 30);
        add(txtTasaImpuesto);

        lblPagaBruta = new JLabel("Paga bruta: $0.00");
        lblPagaBruta.setBounds(10, 110, 200, 30);
        add(lblPagaBruta);

        lblImpuesto = new JLabel("Impuesto: $0.00");
        lblImpuesto.setBounds(10, 140, 200, 30);
        add(lblImpuesto);

        lblPagaNeta = new JLabel("Paga neta: $0.00");
        lblPagaNeta.setBounds(10, 170, 200, 30);
        add(lblPagaNeta);

        
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 200, 100, 40);
        add(btnCalcular);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 200, 100, 40);
        add(btnSalir);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);

        
    }

    private double calcularPagaBruta(double horas, double pagaHora) {
        return horas * pagaHora;
    }
    
    private double calcularImpuesto(double pagaBruta, double tasaImpuesto) {
        return pagaBruta * tasaImpuesto;
    }
    
    private double calcularPagaNeta(double pagaBruta, double impuesto) {
        return pagaBruta - impuesto;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            
            double horas = Double.parseDouble(txtHoras.getText());
            double pagaHora = Double.parseDouble(txtPagaHora.getText());
            double tasaImpuesto = Double.parseDouble(txtTasaImpuesto.getText()) / 100; 
    
            double pagaBruta = calcularPagaBruta(horas, pagaHora);
            double impuesto = calcularImpuesto(pagaBruta, tasaImpuesto);
            double pagaNeta = calcularPagaNeta(pagaBruta, impuesto);
    
               
            lblPagaBruta.setText(String.format("Paga bruta: $%.2f", pagaBruta));
            lblImpuesto.setText(String.format("Impuesto: $%.2f", impuesto));
            lblPagaNeta.setText(String.format("Paga neta: $%.2f", pagaNeta));

            
            
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static void main(String[] args) {
        p143_CalcularPaga app = new p143_CalcularPaga();
        app.setBounds(10, 10, 300, 280);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}