/*
 * Panel perteneciente a los datos especificos de clientes
 */
package com.jsft.gen.gui.Paneles;

import com.jsft.gen.entity.Persona;

/**
 *
 * @author oxirisg
 * @author hector ventura
 */
public class PnCliente extends javax.swing.JPanel {

    public PnCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXLabel13 = new org.jdesktop.swingx.JXLabel();
        cbSexo = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        cbEstadoCivil = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar();
        jPanel2 = new javax.swing.JPanel();
        chExentoItbis = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbListaPrecio = new javax.swing.JComboBox();
        txtPorcientoDescuento = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel16 = new org.jdesktop.swingx.JXLabel();
        cbAseguradora = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar();
        jLabel6 = new javax.swing.JLabel();
        txtPoliza = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(773, 354));

        jXLabel13.setText("Sexo:");
        jXLabel13.setFocusable(false);
        jXLabel13.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No especificado", "Masculino", "Femenino" }));

        jXLabel12.setText("Estado Civil:");
        jXLabel12.setFocusable(false);
        jXLabel12.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No especificado", "Soltero", "Casado" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tributación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 13))); // NOI18N

        chExentoItbis.setText("Exento de ITBIS.");

        jLabel2.setText("Regimen perteneciente:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chExentoItbis)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(chExentoItbis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descuentos y Precios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 13))); // NOI18N

        jLabel3.setText("% Descuento:");

        jLabel4.setText("Lista de Precios por defecto:");

        cbListaPrecio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lista de Precio 1 (Defecto)", "Lista de Precio 2", "Lista de Precio 3" }));

        txtPorcientoDescuento.setName("45"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPorcientoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbListaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPorcientoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(cbListaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jXLabel16.setText("Aseguradora:");
        jXLabel16.setFocusable(false);
        jXLabel16.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        cbAseguradora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Seleccione-" }));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setText("No. de Póliza:");

        txtPoliza.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jXLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jXLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAseguradora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPoliza)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAseguradora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar cbAseguradora;
    private com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar cbEstadoCivil;
    private javax.swing.JComboBox cbListaPrecio;
    private com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar cbSexo;
    private javax.swing.JCheckBox chExentoItbis;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel13;
    private org.jdesktop.swingx.JXLabel jXLabel16;
    private javax.swing.JTextField txtPoliza;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar txtPorcientoDescuento;
    // End of variables declaration//GEN-END:variables

    public void clear() {
        cbSexo.setSelectedIndex(0);
        cbAseguradora.setSelectedIndex(0);
        cbEstadoCivil.setSelectedIndex(0);
        cbListaPrecio.setSelectedIndex(0);
        chExentoItbis.setSelected(false);
        txtPoliza.setText("");
        txtPorcientoDescuento.setText("0.00");

    }

    public void setFields(final Persona persona) {
        txtPoliza.setText(persona.getPoliza());
        txtPorcientoDescuento.setText(persona.getPorsientoDescuento().toString());
        cbEstadoCivil.setSelectedItem(persona.getEstadoCivil());
        chExentoItbis.setSelected(persona.getExcentoItbis());
        cbSexo.setSelectedItem(persona.getSexo());
        cbListaPrecio.setSelectedIndex(persona.getPrecioListaDefecto()-1);

    }

    public void getFields(final Persona persona) {
        Double porcientoDescuento = 0.00;

        try {
            porcientoDescuento = Double.parseDouble(txtPorcientoDescuento.getText());
        } catch (Exception ex) {
        }

        persona.setPoliza(txtPoliza.getText());
        persona.setPorsientoDescuento(porcientoDescuento);
        persona.setEstadoCivil(cbEstadoCivil.getSelectedItem().toString());
        persona.setPrecioListaDefecto((short) (cbListaPrecio.getSelectedIndex() + 1));
        
        System.out.println((short) (cbListaPrecio.getSelectedIndex() + 1));
        persona.setExcentoItbis(chExentoItbis.isSelected());
        persona.setRegimenPerteneciente(Short.parseShort("2"));
        persona.setSexo(cbSexo.getSelectedItem().toString());
    }
}
