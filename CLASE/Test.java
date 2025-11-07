package CLASE;

public class Test {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Test::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        javax.swing.JFrame frame = new javax.swing.JFrame("Formulario simple");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridBagLayout());
        gbc.insets = new java.awt.Insets(5, 5, 5, 5);
        gbc.anchor = java.awt.GridBagConstraints.WEST;

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new javax.swing.JLabel("Nombre:"), gbc);
        gbc.gridx = 1; gbc.fill = java.awt.GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        javax.swing.JTextField nombreField = new javax.swing.JTextField(20);
        panel.add(nombreField, gbc);

        gbc.gridy = 1; gbc.gridx = 0; gbc.weightx = 0; gbc.fill = java.awt.GridBagConstraints.NONE;
        panel.add(new javax.swing.JLabel("Email:"), gbc);
        gbc.gridx = 1; gbc.fill = java.awt.GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        javax.swing.JTextField emailField = new javax.swing.JTextField(20);
        panel.add(emailField, gbc);

        javax.swing.JButton enviar = new javax.swing.JButton("Enviar");
        gbc.gridy = 2; gbc.gridx = 0; gbc.gridwidth = 2; gbc.fill = java.awt.GridBagConstraints.NONE; gbc.anchor = java.awt.GridBagConstraints.CENTER; gbc.weightx = 0;
        panel.add(enviar, gbc);

        enviar.addActionListener(e -> {
            String nombre = nombreField.getText().trim();
            String email = emailField.getText().trim();
            javax.swing.JOptionPane.showMessageDialog(frame, "Enviado:\nNombre: " + nombre + "\nEmail: " + email);
        });

        frame.getContentPane().add(panel, java.awt.BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
