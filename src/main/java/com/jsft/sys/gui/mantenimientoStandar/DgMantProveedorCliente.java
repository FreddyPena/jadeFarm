/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.sys.gui.mantenimientoStandar;

import com.jadesoft.jadelib.generales.DesplazamientoObject;
import com.jadesoft.jadelib.generales.General;
import com.jadesoft.jadelib.generales.KeyEventDespachador;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author yiyi
 */
public abstract class DgMantProveedorCliente<T> extends javax.swing.JDialog {

    public DgMantProveedorCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    public DgMantProveedorCliente(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btCancel = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btConsultation = new javax.swing.JButton();
        btAnnular = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btFirts = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        lbAnnular = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNombre = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jLabel4 = new javax.swing.JLabel();
        jtApellido = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jLabel5 = new javax.swing.JLabel();
        jtCedula = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jtRNC = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jtDireccion = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jLabel8 = new javax.swing.JLabel();
        jtCiudad = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jLabel9 = new javax.swing.JLabel();
        jtProvincia = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        chInstitucion = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jtLimiteCredito = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jLabel16 = new javax.swing.JLabel();
        dpFecha = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpNota = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jtCorreo = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jLabel11 = new javax.swing.JLabel();
        jtPendiente = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jtFax = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/cancelar.png"))); // NOI18N
        btCancel.setToolTipText("Cancelar [Ctrl + W]");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancel);

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/guardar1.png"))); // NOI18N
        btSave.setToolTipText("Guardar [Ctrl + S]");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);

        btConsultation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/consulta.png"))); // NOI18N
        btConsultation.setToolTipText("Buscar [Ctrl + Q]");
        btConsultation.setFocusable(false);
        btConsultation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsultation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultationActionPerformed(evt);
            }
        });
        jToolBar1.add(btConsultation);

        btAnnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/anularFactura.png"))); // NOI18N
        btAnnular.setToolTipText("Anular [Ctrl + O]");
        btAnnular.setEnabled(false);
        btAnnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnnularActionPerformed(evt);
            }
        });
        jToolBar1.add(btAnnular);
        jToolBar1.add(jSeparator1);

        btFirts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/principio.png"))); // NOI18N
        btFirts.setToolTipText("Primer Registro [Ctrl + F]");
        btFirts.setEnabled(false);
        btFirts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFirtsActionPerformed(evt);
            }
        });
        jToolBar1.add(btFirts);

        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/anterior.png"))); // NOI18N
        btBack.setToolTipText("Registro Anterior [Ctrl + B]");
        btBack.setEnabled(false);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        jToolBar1.add(btBack);

        btNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/proximo.png"))); // NOI18N
        btNext.setToolTipText("Siguiente Registro [Ctrl + N]");
        btNext.setEnabled(false);
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        jToolBar1.add(btNext);

        btLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/final.png"))); // NOI18N
        btLast.setToolTipText("Ultimo Registro [Ctrl + L]");
        btLast.setEnabled(false);
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });
        jToolBar1.add(btLast);
        jToolBar1.add(jSeparator2);

        lbAnnular.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        lbAnnular.setForeground(new java.awt.Color(255, 0, 36));
        lbAnnular.setText("ANULADA");
        jToolBar1.add(lbAnnular);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Codigo");

        lbCodigo.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        lbCodigo.setForeground(java.awt.Color.red);
        lbCodigo.setText("--");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombre");

        jtNombre.setName("45"); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Apellido");

        jtApellido.setEnabled(false);
        jtApellido.setName("45"); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cedula");

        try {
            jtCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtCedula.setEnabled(false);
        jtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCedulaFocusLost(evt);
            }
        });

        jLabel6.setText("RNC");

        try {
            jtRNC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtRNC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtRNCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtRNCFocusLost(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Direccion");

        jtDireccion.setName("100"); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Ciudad");

        jtCiudad.setName("45"); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Provincia");

        jtProvincia.setName("45"); // NOI18N

        chInstitucion.setBackground(java.awt.Color.white);
        chInstitucion.setSelected(true);
        chInstitucion.setText("Institucion");
        chInstitucion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chInstitucionItemStateChanged(evt);
            }
        });
        chInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chInstitucionActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Limite Cred.");

        jtLimiteCredito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtLimiteCredito.setText("0.00");
        jtLimiteCredito.setToolTipText("");
        jtLimiteCredito.setName("NumeroPunto"); // NOI18N

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Fecha Reg.");

        jScrollPane1.setBackground(java.awt.Color.white);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nota:"));

        jpNota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpNotaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpNotaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jpNota);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Telefono");

        try {
            jtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtTelefonoFocusLost(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Correo");

        jtCorreo.setName("45"); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Pendiente");

        jtPendiente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtPendiente.setText("0.00");
        jtPendiente.setDisabledTextColor(java.awt.Color.red);
        jtPendiente.setEnabled(false);
        jtPendiente.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jtPendiente.setName("NumeroPunto"); // NOI18N

        try {
            jtFax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtFax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtFaxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtFaxFocusLost(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Fax");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtRNC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chInstitucion)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtFax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(dpFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jtLimiteCredito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtPendiente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtTelefono, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(lbCodigo)
                    .addComponent(chInstitucion)
                    .addComponent(jLabel16)
                    .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jtPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtRNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        save();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        cancel();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultationActionPerformed
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(eventDispatcher);
        consultation();
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(eventDispatcher);
    }//GEN-LAST:event_btConsultationActionPerformed

    private void btAnnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnnularActionPerformed
        annular();
    }//GEN-LAST:event_btAnnularActionPerformed

    private void btFirtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFirtsActionPerformed
        setElement(objectDisplacement.getPrimero());
    }//GEN-LAST:event_btFirtsActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        setElement(objectDisplacement.getAnterior());
    }//GEN-LAST:event_btBackActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        setElement(objectDisplacement.getSiguiente());
    }//GEN-LAST:event_btNextActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        setElement(objectDisplacement.getUltimo());
    }//GEN-LAST:event_btLastActionPerformed

    private void jpNotaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpNotaFocusGained
        General.gainedFocus(jpNota);
        jpNota.selectAll();
    }//GEN-LAST:event_jpNotaFocusGained

    private void jpNotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpNotaFocusLost
        General.lostFocus(jpNota);
    }//GEN-LAST:event_jpNotaFocusLost

    private void chInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chInstitucionActionPerformed
    }//GEN-LAST:event_chInstitucionActionPerformed

    private void chInstitucionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chInstitucionItemStateChanged
        setInstitucion(chInstitucion.isSelected());
    }//GEN-LAST:event_chInstitucionItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        windowClosing();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(eventDispatcher);
    }//GEN-LAST:event_formWindowClosed

    private void jtCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCedulaFocusGained
        General.gainedFocus(jtCedula);
        General.selectAll(evt);
    }//GEN-LAST:event_jtCedulaFocusGained

    private void jtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCedulaFocusLost
        General.lostFocus(jtCedula);
    }//GEN-LAST:event_jtCedulaFocusLost

    private void jtRNCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtRNCFocusGained
        General.gainedFocus(jtRNC);
        General.selectAll(evt);
    }//GEN-LAST:event_jtRNCFocusGained

    private void jtRNCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtRNCFocusLost
        General.lostFocus(jtRNC);
    }//GEN-LAST:event_jtRNCFocusLost

    private void jtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTelefonoFocusGained
        General.gainedFocus(jtTelefono);
        General.selectAll(evt);
    }//GEN-LAST:event_jtTelefonoFocusGained

    private void jtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTelefonoFocusLost
        General.lostFocus(jtTelefono);
    }//GEN-LAST:event_jtTelefonoFocusLost

    private void jtFaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtFaxFocusGained
        General.gainedFocus(jtFax);
        General.selectAll(evt);
    }//GEN-LAST:event_jtFaxFocusGained

    private void jtFaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtFaxFocusLost
        General.lostFocus(jtFax);
    }//GEN-LAST:event_jtFaxFocusLost
    private void setInstitucion(boolean b) {
        jtCedula.setEnabled(!b);
        jtApellido.setEnabled(!b);
        jtRNC.setEnabled(b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btAnnular;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btConsultation;
    private javax.swing.JButton btFirts;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNext;
    protected javax.swing.JButton btSave;
    protected javax.swing.JCheckBox chInstitucion;
    protected org.jdesktop.swingx.JXDatePicker dpFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    protected javax.swing.JTextPane jpNota;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtApellido;
    protected javax.swing.JFormattedTextField jtCedula;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtCiudad;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtCorreo;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtDireccion;
    protected javax.swing.JFormattedTextField jtFax;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtLimiteCredito;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtNombre;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtPendiente;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtProvincia;
    protected javax.swing.JFormattedTextField jtRNC;
    protected javax.swing.JFormattedTextField jtTelefono;
    protected javax.swing.JLabel lbAnnular;
    protected javax.swing.JLabel lbCodigo;
    // End of variables declaration//GEN-END:variables
    protected DesplazamientoObject<T> objectDisplacement;
    protected boolean changeDisplacement = true;
    private boolean saveExit;
    protected T element;
    private KeyEventDespachador eventDispatcher;
    private boolean consultation;

    public void setConsultation(boolean consultation) {
        this.consultation = consultation;
    }

    public T getElement() {
        return element;
    }

    public boolean isConsultation() {
        return consultation;
    }

    private void initComp() {
        keyEvents();
        dpFecha.setFormats(General.getFormatoFecha());
        dpFecha.setDate(new Date());
        objectDisplacement = new DesplazamientoObject<>();
        lbAnnular.setVisible(false);
    }

    protected abstract void saveElement();

    protected abstract void setElement(T elemen);

    protected abstract void consultation();

    protected abstract void annular();

    protected void cancel() {
        element = null;
        lbAnnular.setVisible(false);
        dpFecha.setDate(new Date());
        setDisplacement(false);
        chInstitucion.setSelected(true);
        jtApellido.setText("");
        jtCedula.setText("");
        jtCiudad.setText("");
        jtTelefono.setText("");
        jtCorreo.setText("");
        jtCorreo.setText("");
        jtDireccion.setText("");
        jtLimiteCredito.setText("0.00");
        jtFax.setText("");
        jtPendiente.setText("0.00");
        jtNombre.setText("");
        jtProvincia.setText("");
        jtRNC.setText("");
        jpNota.setText("");
        btAnnular.setEnabled(false);
        btSave.setEnabled(true);
        lbCodigo.setText("--");
    }

    private boolean validateFields() {
        if (jtNombre.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Debe especificar el nombre");
            jtNombre.requestFocus();
            return false;
        }
        if (chInstitucion.isSelected()) {
            if (jtRNC.getText().length() <= 0) {
                JOptionPane.showMessageDialog(this, "Debe especificar el RNC");
                jtRNC.requestFocus();
                return false;
            }
        }

        return true;
    }

    private void save() {
        if (!validateFields()) {
            saveExit = false;
            return;
        }
        if (!saveExit) {
            int men = JOptionPane.showConfirmDialog(this, element == null ? "Desea guardar el nuevo registro"
                    : "Desea guardar los cambios", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.NO_OPTION) {
                cancel();
                return;
            } else if (men == JOptionPane.CANCEL_OPTION) {
                return;
            }
        }
        saveElement();
        if (consultation) {
            dispose();
        } else {
            changeDisplacement = true;
            cancel();
        }
    }

    public void setElementSelected(T element) {
        setElement(element);
    }

    public void setConsultationEnable(boolean b) {
        btConsultation.setEnabled(b);
    }

    /**
     * setDesplazamiento: Activo o descativa los botones de desplazamiento segun
     * la necesidad requeridad
     *
     * @param boolean b. Indica si se van activar o desactivar los botones de
     * desplazamiento
     */
    public void setDisplacement(boolean b) {
        btBack.setEnabled(b);
        btNext.setEnabled(b);
        btLast.setEnabled(b);
        btFirts.setEnabled(b);
    }

    private void windowClosing() {
        if (jtNombre.getText().length() > 0 || element != null) {
            int men = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.YES_OPTION) {
                saveExit = true;
                save();
                if (saveExit) {
                    dispose();
                }
            } else if (men == JOptionPane.NO_OPTION) {
                dispose();
            }
        } else {
            dispose();
        }
    }

    private void keyEvents() {
        eventDispatcher = new KeyEventDespachador();
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(eventDispatcher);

        KeyStroke cancel = KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(cancel, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btCancel.isEnabled()) {
                    cancel();
                }
            }
        });

        KeyStroke save = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(save, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btSave.isEnabled()) {
                    save();
                }
            }
        });

        KeyStroke inavilite = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(inavilite, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btAnnular.isEnabled()) {
                    annular();
                }
            }
        });

        KeyStroke consultation = KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(consultation, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btConsultation.isEnabled()) {
                    consultation();
                }
            }
        });

        KeyStroke firts = KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(firts, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btFirts.isEnabled()) {
                    setElement(objectDisplacement.getPrimero());
                }
            }
        });

        KeyStroke back = KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(back, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btBack.isEnabled()) {
                    setElement(objectDisplacement.getAnterior());
                }
            }
        });

        KeyStroke next = KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(next, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btNext.isEnabled()) {
                    setElement(objectDisplacement.getSiguiente());
                }
            }
        });

        KeyStroke last = KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(last, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btLast.isEnabled()) {
                    setElement(objectDisplacement.getUltimo());
                }
            }
        });
    }
}
