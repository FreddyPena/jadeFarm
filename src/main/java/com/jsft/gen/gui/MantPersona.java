/*
 * Formulario para mantenimiento de Empleado, Cliente, Suplidor, Etc
 * sistema jadeLab
 */
package com.jsft.gen.gui;

import com.jadesoft.jadelib.estandar.panel.jGlassPane;
import com.jadesoft.jadelib.generales.DesplazamientoObject;
import com.jadesoft.jadelib.generales.KeyEventDespachador;
import com.jsft.gen.entity.Persona;
import com.jsft.gen.entity.PersonaTipoPersona;
import com.jsft.gen.entity.TipoPersona;
import com.jsft.gen.gui.Paneles.PnCliente;
import com.jsft.gen.gui.Paneles.PnSuplidor;
import com.jsft.gen.manager.ManejoPersona;
import com.jsft.gen.manager.ManejoTipoPersona;
import com.jsft.gen.tablemodel.ModeloPersona;
import com.jsft.gen.tablemodel.ModeloPersonaTipos;
import com.jsft.gen.utlis.TipoIdentificacion;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;

/**
 *
 * @author hector ventura
 */
public class MantPersona extends javax.swing.JDialog {

    public MantPersona(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    public MantPersona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmpEdit = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btNew = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btConsultation = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btFirts = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        jtabGeneral = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jtpElements = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        cbTipoDocumento = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<TipoIdentificacion>();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        txtDocumento = new javax.swing.JFormattedTextField();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtFax = new javax.swing.JFormattedTextField();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        txtMovil = new javax.swing.JFormattedTextField();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        txtPaginaWeb = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        txtCorreo = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        dpFechaRegistro = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextPane();
        jXLabel14 = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jXLabel19 = new org.jdesktop.swingx.JXLabel();
        txtTelefono2 = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        spTipoPersona = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chHabilitado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cbTipoPersona = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<TipoPersona>();
        txtLimiteCredito = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        txtCuenta = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        btnRemover = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jXLabel13 = new org.jdesktop.swingx.JXLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPersonaTipo = new com.jadesoft.jadelib.estandar.tablas.TableStandar<PersonaTipoPersona>();
        jXLabel24 = new org.jdesktop.swingx.JXLabel();
        jXLabel25 = new org.jdesktop.swingx.JXLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jXLabel15 = new org.jdesktop.swingx.JXLabel();
        textFieldStandar4 = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        ftDocumento4 = new javax.swing.JFormattedTextField();
        jXLabel16 = new org.jdesktop.swingx.JXLabel();
        jXLabel17 = new org.jdesktop.swingx.JXLabel();
        textFieldStandar5 = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        cbTipoEntidad = new javax.swing.JComboBox();
        jXLabel21 = new org.jdesktop.swingx.JXLabel();
        txtNombre = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel22 = new org.jdesktop.swingx.JXLabel();
        jXLabel23 = new org.jdesktop.swingx.JXLabel();
        txtApellido = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jPanel7 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbPersonas = new com.jadesoft.jadelib.estandar.tablas.TableStandar<Persona>();
        jSearchTextField1 = new com.jadesoft.jadelib.estandar.textField.JSearchTextField();

        jmpEdit.setText("Editar");
        jmpEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmpEditActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmpEdit);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
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

        btNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/document_40.png"))); // NOI18N
        btNew.setToolTipText("Nuevo [Ctrl + I]");
        btNew.setFocusable(false);
        btNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btNew);

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/edit_40.png"))); // NOI18N
        btEdit.setToolTipText("Editar [Ctrl + M]");
        btEdit.setFocusable(false);
        btEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        jToolBar1.add(btEdit);

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/diskette_40.png"))); // NOI18N
        btSave.setToolTipText("Guardar [Ctrl + S]");
        btSave.setEnabled(false);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);

        btConsultation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_40.png"))); // NOI18N
        btConsultation.setToolTipText("Buscar [Ctrl + Q]");
        btConsultation.setEnabled(false);
        btConsultation.setFocusable(false);
        btConsultation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsultation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultationActionPerformed(evt);
            }
        });
        jToolBar1.add(btConsultation);

        btPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/print_40.png"))); // NOI18N
        btPrint.setToolTipText("Imprimir [Ctrl + P]");
        btPrint.setFocusable(false);
        btPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });
        jToolBar1.add(btPrint);

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/trash_can_40.png"))); // NOI18N
        btDelete.setToolTipText("Borrar [Ctrl + D]");
        btDelete.setEnabled(false);
        btDelete.setFocusable(false);
        btDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btDelete);
        jToolBar1.add(jSeparator3);

        btFirts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/first_40.png"))); // NOI18N
        btFirts.setToolTipText("Primer Registro [Ctrl + F]");
        btFirts.setEnabled(false);
        btFirts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFirtsActionPerformed(evt);
            }
        });
        jToolBar1.add(btFirts);

        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/previous_40.png"))); // NOI18N
        btBack.setToolTipText("Registro Anterior [Ctrl + B]");
        btBack.setEnabled(false);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        jToolBar1.add(btBack);

        btNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/next_40.png"))); // NOI18N
        btNext.setToolTipText("Registro Siguiente [Ctrl + N]");
        btNext.setEnabled(false);
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        jToolBar1.add(btNext);

        btLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/last_40.png"))); // NOI18N
        btLast.setToolTipText("Último Registro [Ctrl + L]");
        btLast.setEnabled(false);
        btLast.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });
        jToolBar1.add(btLast);

        jXHeader1.setDescription("Registro y Consulta de Clientes, Suplidores y Aseguradoras");
        jXHeader1.setDescriptionFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/messenger_72.png"))); // NOI18N
        jXHeader1.setTitle("Registro Entidad");
        jXHeader1.setTitleFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N

        jXLabel4.setText("Tipo Documento:");
        jXLabel4.setFocusable(false);
        jXLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RNC", "Cédula", "Pasaporte" }));

        jXLabel5.setText("Documento:");
        jXLabel5.setFocusable(false);
        jXLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel7.setText("Teléfono 1:");
        jXLabel7.setFocusable(false);
        jXLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel8.setText("Fax:");
        jXLabel8.setFocusable(false);
        jXLabel8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jXLabel9.setText("Móvil:");
        jXLabel9.setFocusable(false);
        jXLabel9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        try {
            txtMovil.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jXLabel10.setText("Correo Electrónico:");
        jXLabel10.setFocusable(false);
        jXLabel10.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        txtPaginaWeb.setForeground(new java.awt.Color(0, 0, 255));
        txtPaginaWeb.setName("45"); // NOI18N

        jXLabel11.setText("Página Web:");
        jXLabel11.setFocusable(false);
        jXLabel11.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        txtCorreo.setName("45"); // NOI18N

        dpFechaRegistro.setEditable(false);

        txtNota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("SansSerif", 1, 13))); // NOI18N
        jScrollPane4.setViewportView(txtNota);

        jXLabel14.setText("Fecha Registro:");
        jXLabel14.setFocusable(false);
        jXLabel14.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        txtDireccion.setColumns(20);
        txtDireccion.setLineWrap(true);
        txtDireccion.setRows(3);
        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("SansSerif", 1, 13))); // NOI18N
        jScrollPane1.setViewportView(txtDireccion);

        jXLabel19.setText("Teléfono 2:");
        jXLabel19.setFocusable(false);
        jXLabel19.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        try {
            txtTelefono2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jXLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jXLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(4, 4, 4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jXLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jXLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtMovil, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFax, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                    .addComponent(dpFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dpFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jtpElements.addTab("Datos Generales", jPanel1);

        spTipoPersona.setDividerSize(0);

        btnAgregar.setText("+");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Entidades:");

        chHabilitado.setSelected(true);
        chHabilitado.setText("Activo");
        chHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chHabilitadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Motivo:");

        cbTipoPersona.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente", "Suplidor", "Ars" }));
        cbTipoPersona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoPersonaItemStateChanged(evt);
            }
        });

        txtLimiteCredito.setName("45"); // NOI18N

        txtCuenta.setName("45"); // NOI18N

        btnRemover.setText("-");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Suspender Crédito a este cliente.");

        jXLabel13.setText("Tipo Entidad :");
        jXLabel13.setFocusable(false);
        jXLabel13.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        tbPersonaTipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPersonaTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPersonaTipoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbPersonaTipo);

        jXLabel24.setText("Cuenta :");
        jXLabel24.setFocusable(false);
        jXLabel24.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel25.setText("Lím. Crédito :");
        jXLabel25.setFocusable(false);
        jXLabel25.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jXLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jXLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jXLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chHabilitado))
                                    .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chHabilitado)
                    .addComponent(cbTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnRemover)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        spTipoPersona.setLeftComponent(jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpElements.addTab("Datos Específicos", jPanel3);

        jXLabel15.setText("Nombre:");
        jXLabel15.setFocusable(false);
        jXLabel15.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        textFieldStandar4.setName("45"); // NOI18N

        try {
            ftDocumento4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jXLabel16.setText("Teléfono:");
        jXLabel16.setFocusable(false);
        jXLabel16.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel17.setText("Extensión:");
        jXLabel17.setFocusable(false);
        jXLabel17.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        textFieldStandar5.setName("5"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ftDocumento4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldStandar5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldStandar4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(346, 346, 346))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textFieldStandar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftDocumento4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldStandar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jtpElements.addTab("Contactos", jPanel4);

        cbTipoEntidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FISICA", "JURIDICA" }));

        jXLabel21.setText("Tipo Entidad:");
        jXLabel21.setFocusable(false);
        jXLabel21.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        txtNombre.setName("45"); // NOI18N

        jXLabel22.setText("Nombre:");
        jXLabel22.setFocusable(false);
        jXLabel22.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jXLabel23.setText("Apellido:");
        jXLabel23.setFocusable(false);
        jXLabel23.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        txtApellido.setName("45"); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 13))); // NOI18N

        txtCodigo.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setText("00000901");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jXLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtpElements, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jXLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jXLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jXLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpElements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtabGeneral.addTab("Registro", jPanel5);

        tbPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPersonasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbPersonas);

        jSearchTextField1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSearchTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSearchTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtabGeneral.addTab("Consulta", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXHeader1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jtabGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtabGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        save();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btFirtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFirtsActionPerformed
        setElement(objectDisplacement.getPrimero());
    }//GEN-LAST:event_btFirtsActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        setElement(objectDisplacement.getSiguiente());
    }//GEN-LAST:event_btNextActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        setElement(objectDisplacement.getAnterior());
    }//GEN-LAST:event_btBackActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        setElement(objectDisplacement.getUltimo());
    }//GEN-LAST:event_btLastActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(eventDispatcher);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        newElement();
    }//GEN-LAST:event_btNewActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        print();
    }//GEN-LAST:event_btPrintActionPerformed

    private void btConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultationActionPerformed
        consultation();
    }//GEN-LAST:event_btConsultationActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        edit();
    }//GEN-LAST:event_btEditActionPerformed

    private void jmpEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmpEditActionPerformed
        edit();
    }//GEN-LAST:event_jmpEditActionPerformed

    private void chHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chHabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chHabilitadoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarTipoPersona();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tbPersonaTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPersonaTipoMouseClicked
        if (evt.getClickCount() == 2 && tbPersonaTipo.getSelectedElement() != null) {
            ptp = tbPersonaTipo.getSelectedElement();

            cbTipoPersona.setSelectedItem(ptp.getTipoPesona());
            txtCuenta.setText(ptp.getAuxiliar());
            chHabilitado.setSelected(ptp.getHabilitado());
            txtLimiteCredito.setText(ptp.getLimite().toString());

        }
    }//GEN-LAST:event_tbPersonaTipoMouseClicked

    private void tbPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPersonasMouseClicked

        if (evt.getClickCount() == 2) {
            if (tbPersonas.getSelectedElement() != null) {
                setElement(tbPersonas.getSelectedElement());
            }
        }
    }//GEN-LAST:event_tbPersonasMouseClicked

    private void cbTipoPersonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoPersonaItemStateChanged
        actualizarTipoPersona();
    }//GEN-LAST:event_cbTipoPersonaItemStateChanged

    public static void main(String[] args) {
        new MantPersona((JDialog) null, true).setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btConsultation;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btFirts;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrint;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRemover;
    private com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<TipoIdentificacion> cbTipoDocumento;
    private javax.swing.JComboBox cbTipoEntidad;
    private com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<TipoPersona> cbTipoPersona;
    private javax.swing.JCheckBox chHabilitado;
    private org.jdesktop.swingx.JXDatePicker dpFechaRegistro;
    private javax.swing.JFormattedTextField ftDocumento4;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private com.jadesoft.jadelib.estandar.textField.JSearchTextField jSearchTextField1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel13;
    private org.jdesktop.swingx.JXLabel jXLabel14;
    private org.jdesktop.swingx.JXLabel jXLabel15;
    private org.jdesktop.swingx.JXLabel jXLabel16;
    private org.jdesktop.swingx.JXLabel jXLabel17;
    private org.jdesktop.swingx.JXLabel jXLabel19;
    private org.jdesktop.swingx.JXLabel jXLabel21;
    private org.jdesktop.swingx.JXLabel jXLabel22;
    private org.jdesktop.swingx.JXLabel jXLabel23;
    private org.jdesktop.swingx.JXLabel jXLabel24;
    private org.jdesktop.swingx.JXLabel jXLabel25;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private javax.swing.JMenuItem jmpEdit;
    private javax.swing.JTabbedPane jtabGeneral;
    private javax.swing.JTabbedPane jtpElements;
    private javax.swing.JSplitPane spTipoPersona;
    private com.jadesoft.jadelib.estandar.tablas.TableStandar<PersonaTipoPersona> tbPersonaTipo;
    private com.jadesoft.jadelib.estandar.tablas.TableStandar<Persona> tbPersonas;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar textFieldStandar4;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar textFieldStandar5;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar txtApellido;
    private javax.swing.JTextField txtCodigo;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar txtCorreo;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar txtCuenta;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JFormattedTextField txtDocumento;
    private javax.swing.JFormattedTextField txtFax;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar txtLimiteCredito;
    private javax.swing.JFormattedTextField txtMovil;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar txtNombre;
    private javax.swing.JTextPane txtNota;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar txtPaginaWeb;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JFormattedTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
    private KeyEventDespachador eventDispatcher;
    private Persona persona;
    private DesplazamientoObject<Persona> objectDisplacement;
    private boolean consultation;
    private boolean changeDisplacement = true;
    private PersonaTipoPersona ptp;
    // =====
    private PnCliente pnCliente;
    private PnSuplidor pnSuplidor;

    protected void setColumnaWith(int Column, int width) {
        tbPersonaTipo.getColumnModel().getColumn(Column).setPreferredWidth(width);
    }

    protected void setTablePanel(int panel, boolean status) {
        jtabGeneral.setSelectedIndex(panel);
        jtabGeneral.setEnabledAt(0, !status);
        jtabGeneral.setEnabledAt(1, status);
    }

    private void initComp() {
        setGlassPane(new jGlassPane());

        dpFechaRegistro.setDate(new Date());
        dpFechaRegistro.setFormats("dd/MM/yyyy");

        tbPersonaTipo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbPersonaTipo.doLayout();
        keyEvents();
        objectDisplacement = new DesplazamientoObject<>();
        //jtFiltro.requestFocus();

        cbTipoDocumento.setElements(Arrays.asList(TipoIdentificacion.values()));
        DefaultComboBoxModel model;
        model = new DefaultComboBoxModel(ManejoTipoPersona.getInstancia().findAll().toArray());
        cbTipoPersona.setModel(model);

        tbPersonaTipo.setModel(new ModeloPersonaTipos());
        setColumnaWith(0, 80);
        setColumnaWith(1, 70);
        setColumnaWith(2, 200);

        tbPersonas.setModel(new ModeloPersona());

        //
        pnCliente = new PnCliente();
        pnSuplidor = new PnSuplidor();

        btNew.doClick();
    }

    private void clean() {

        persona = null;
        setDisplacement(false);

        txtApellido.setText("");
        txtNombre.setText("");
        txtNota.setText("");
        txtTelefono.setText("(   )   -    ");
        txtTelefono2.setText("(   )   -    ");
        txtFax.setText("(   )   -    ");
        txtMovil.setText("(   )   -    ");
        txtCorreo.setText("");
        txtPaginaWeb.setText("");
        txtDireccion.setText("");
        txtDocumento.setText("");

        dpFechaRegistro.setDate(new Date());

        tbPersonaTipo.clearTable();

        pnCliente.clear();
        limpiarCamposTipoPersona();

    }

    private void consultation() {
        setTablePanel(1, true);
        setToolBar(true);
        clean();
    }

    private void edit() {
        if (tbPersonaTipo.getSelectedElement() != null) {
            setDisplacement(true);
            //setElement(tbElements.getSelectedElement());
            setTablePanel(1, true);
            setToolBar(false);

        }
    }

    private void newElement() {
        setTablePanel(0, false);
        setToolBar(false);


        clean();
    }

    private void setToolBar(boolean b) {
        btConsultation.setEnabled(!b);
        btSave.setEnabled(!b);
//        btNew.setEnabled(b);
        //btSelect.setEnabled(b);
        btEdit.setEnabled(b);

        b = jtpElements.getSelectedIndex() == 1 && persona != null;
        btDelete.setEnabled(b);
    }

    public void setDisplacement(boolean b) {
        btBack.setEnabled(b);
        btNext.setEnabled(b);
        btLast.setEnabled(b);
        btFirts.setEnabled(b);
    }

    private void delete() {
        if (persona != null) {
            int men = JOptionPane.showConfirmDialog(this, "Desea eliminar el nuevo registro??", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.YES_OPTION) {
            }
            clean();
            setTablePanel(0, false);
            setToolBar(true);
            fireTableDataChanged();
        }
    }

    private void print() {
        if (persona != null) {
        }
    }

    private void select() {
        if (changeDisplacement) {
            objectDisplacement = new DesplazamientoObject<>(tbPersonaTipo.getElements());
            changeDisplacement = false;
        }
        //setElement(tbElements.getSelectedElement());
    }

//    private void setElements() {
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                getGlassPane().setVisible(true);
//
//                getGlassPane().setVisible(false);
//            }
//        };
//        new Thread(run).start();
//    }
    private boolean validateField() {
        if (txtNombre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Debes especificar Nombre de la entidad");
            return false;
        }

        if (cbTipoDocumento.getSelectedIndex() == -1
                || txtDocumento.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Se debe especificar tipo Documento (Cedula, RNC, Pasaporte)");
            return false;
        }

        if (tbPersonaTipo.getElements().isEmpty()) {
            int opc = JOptionPane.showConfirmDialog(this,
                    "No se le ha agragado a esta entidad,"
                    + "\n tipo de Persona, desea Continua ?", "Advertencia",
                    JOptionPane.YES_NO_OPTION);

            if (opc == JOptionPane.NO_OPTION) {
                return false;
            }
        }

        return true;
    }

    private void save() {
        if (!validateField()) {
            return;
        }

        int men = JOptionPane.showConfirmDialog(this, persona == null ? "Desea guardar el nuevo registro?"
                : "Desea guardar los cambios?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (men != JOptionPane.OK_OPTION) {
            return;
        }

        if (persona == null) {
            persona = new Persona();
            persona.setFechaRegistro(new Date());
        }

        persona.setNombre(txtNombre.getText());
        persona.setApellido(txtApellido.getText());
        persona.setDireccion(txtDireccion.getText());

        persona.setFechaRegistro(dpFechaRegistro.getDate());
        persona.setIdentificacion(txtDocumento.getText());

        short tipoIdentificacion = (short) cbTipoDocumento.getSelectedItem()
                .getTipoIdentificacion();
        persona.setTipoIdentificacion(tipoIdentificacion);

        persona.setCorreo(txtCorreo.getText());
        persona.setFax(txtFax.getText());
        persona.setTelefono(txtTelefono.getText());
        persona.setTelefono2(txtTelefono2.getText());
        persona.setDireccionWeb(txtPaginaWeb.getText());
        persona.setTipoEntidad((short) 1);
        persona.setHabilitado(true);
        persona.setNota(txtNota.getText());

        pnCliente.getFields(persona);


        for (PersonaTipoPersona ptp : tbPersonaTipo.getElements()) {
            ptp.setPersona(persona);
        }

        persona.setPersonaTipoPersonaList(tbPersonaTipo.getElements());
        ManejoPersona.getInstancia().create(persona);

        changeDisplacement = true;
        clean();
        fireTableDataChanged();
        setTablePanel(0, false);
        setToolBar(true);
    }

    private void setElement(Persona per) {

        if (per != null) {
            persona = ManejoPersona.getInstancia().find(per.getCodigo());

            txtNombre.setText(persona.getNombre());
            txtApellido.setText(persona.getApellido());
            txtCodigo.setText(persona.getCodigo().toString());

            txtDocumento.setText(persona.getIdentificacion());
            txtTelefono.setText(persona.getTelefono());
            txtTelefono2.setText(persona.getTelefono2());

            txtFax.setText(persona.getFax());

            txtCorreo.setText(persona.getCorreo());
            txtPaginaWeb.setText(persona.getDireccionWeb());
            tbPersonaTipo.setElements(persona.getPersonaTipoPersonaList());

            txtDireccion.setText(persona.getDireccion());
            txtNota.setText(persona.getNota());

//            txtMovil.setText(persona.get);
            cbTipoDocumento.setSelectedItem(getTipoIdentificacion((int) persona.getTipoIdentificacion()));

            pnCliente.setFields(persona);

            setTablePanel(0, false);
            setToolBar(false);

        }
    }

    private TipoIdentificacion getTipoIdentificacion(Integer tipo) {
        for (TipoIdentificacion ti : TipoIdentificacion.values()) {
            if (ti.getTipoIdentificacion() == tipo) {
                return ti;
            }
        }
        return TipoIdentificacion.CEDULA;
    }

    private void fireTableDataChanged() {
        tbPersonas.getModelStandar().update();
//        jtFiltro.setText("");
//        General.filtroTextField(cbFiltro.getSelectedItem(), jtFiltro, tbElements);
    }

    public Persona getSelected() {
        return persona;
    }

    private void disposeConsultation() {
        if (consultation && persona != null) {
            dispose();
        }
    }

    private void exit() {
        int men = JOptionPane.showConfirmDialog(this, "Desea salir?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (men == JOptionPane.YES_OPTION) {
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
//                if (btCancel.isEnabled()) {
//                    clean();
//                }
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

        KeyStroke select = KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(select, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (btSelect.isEnabled()) {
//                    disposeConsultation();
//                }
            }
        });

        KeyStroke delete = KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(delete, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btDelete.isEnabled()) {
                    delete();
                }
            }
        });

        KeyStroke newElement = KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(newElement, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btNew.isEnabled()) {
                    newElement();
                }
            }
        });

        KeyStroke print = KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(print, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (btSelect.isEnabled()) {
//                    print();
//                }
            }
        });
        KeyStroke consultatio = KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(consultatio, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btConsultation.isEnabled()) {
                    consultation();
                }
            }
        });

        KeyStroke edit = KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(edit, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btEdit.isEnabled()) {
                    edit();
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

    private void actualizarTipoPersona() {
        TipoPersona tp = cbTipoPersona.getSelectedItem();

        if (tp != null) {
            if (tp.getCodigo() == 1) {
                spTipoPersona.setRightComponent(new JScrollPane(pnCliente));
            } else if (tp.getCodigo() == 2) {
                spTipoPersona.setRightComponent(new JScrollPane(pnSuplidor));
            } else {
                spTipoPersona.setRightComponent(new JPanel());
            }
        }
    }

    private void agregarTipoPersona() {
        boolean existe = true;
        if (ptp == null) {
            ptp = new PersonaTipoPersona();
            existe = false;
        }

        if (cbTipoPersona.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar tipo de entidad");
            return;
        }

        ptp.setAuxiliar(txtCuenta.getText());
        ptp.setLimite(Double.parseDouble(txtLimiteCredito.getText()));
        ptp.setTipoPersona(cbTipoPersona.getSelectedItem());
        ptp.setHabilitado(chHabilitado.isSelected());

        if (!existe) {
            tbPersonaTipo.addElement(ptp);
        } else {
            tbPersonaTipo.fireTableDataChanged();
        }

        limpiarCamposTipoPersona();

    }

    private void limpiarCamposTipoPersona() {
        txtCuenta.setText("");
        txtLimiteCredito.setText("0.00");
        cbTipoPersona.setSelectedIndex(-1);
        chHabilitado.setSelected(true);
        ptp = null;

        spTipoPersona.setRightComponent(new JPanel());
    }
}