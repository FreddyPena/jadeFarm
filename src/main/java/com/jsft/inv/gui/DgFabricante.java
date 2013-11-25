/*
 * Formulario para mantenimiento de Empleado
 * sistema jadeLab
 */
package com.jsft.inv.gui;

import com.jadesoft.jadelib.estandar.panel.jGlassPane;
import com.jadesoft.jadelib.generales.DesplazamientoObject;
import com.jadesoft.jadelib.generales.Filtro;
import com.jadesoft.jadelib.generales.General;
import com.jadesoft.jadelib.generales.KeyEventDespachador;
import com.jadesoft.jadelib.generales.ManejoFiltro;
import com.jsft.inv.entity.Fabricante;
import com.jsft.inv.manager.ManejoFabricante;
import com.jsft.inv.tablemodel.ModeloFabricante;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;

/**
 *
 * @author yiyi
 */
public class DgFabricante extends javax.swing.JDialog {

    public DgFabricante(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    public DgFabricante(java.awt.Frame parent, boolean modal) {
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
        jtpStandard = new javax.swing.JTabbedPane();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jtIdentificador = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jtNombre = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jtpElements = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        ftRNC = new javax.swing.JFormattedTextField();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        ftTelefono1 = new javax.swing.JFormattedTextField();
        ftFax = new javax.swing.JFormattedTextField();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        ftMovil = new javax.swing.JFormattedTextField();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        jtPaginaWeb = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        jtCorreo = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel18 = new org.jdesktop.swingx.JXLabel();
        jtExt1 = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaNota = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDireccion = new javax.swing.JTextArea();
        jXLabel19 = new org.jdesktop.swingx.JXLabel();
        ftTelefono2 = new javax.swing.JFormattedTextField();
        jXLabel20 = new org.jdesktop.swingx.JXLabel();
        jtExt2 = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel22 = new org.jdesktop.swingx.JXLabel();
        jtContacto = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        ftTelContacto = new javax.swing.JFormattedTextField();
        jXLabel23 = new org.jdesktop.swingx.JXLabel();
        jtExtContacto = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel24 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jtReferencia = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFabricante = new com.jadesoft.jadelib.estandar.tablas.TableStandar<Fabricante>();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jtFiltro = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        cbFiltro = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro>();

        jmpEdit.setText("Editar");
        jmpEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmpEditActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmpEdit);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro Fabricantes");
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

        jXHeader1.setDescription("Registro y consulta de Fabricantes");
        jXHeader1.setDescriptionFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/messenger_72.png"))); // NOI18N
        jXHeader1.setTitle("Registro Fabricantes");
        jXHeader1.setTitleFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N

        jtpStandard.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N

        jXLabel2.setText("Identificador");
        jXLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtIdentificador.setDisabledTextColor(java.awt.Color.black);
        jtIdentificador.setName("45"); // NOI18N

        jXLabel3.setText("Nombre");
        jXLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtNombre.setDisabledTextColor(java.awt.Color.black);
        jtNombre.setName("45"); // NOI18N

        jXLabel7.setText("RNC:");
        jXLabel7.setFocusable(false);
        jXLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel8.setText("Teléfono 1:");
        jXLabel8.setFocusable(false);
        jXLabel8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel9.setText("Fax:");
        jXLabel9.setFocusable(false);
        jXLabel9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        try {
            ftTelefono1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftFax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jXLabel10.setText("Móvil:");
        jXLabel10.setFocusable(false);
        jXLabel10.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        try {
            ftMovil.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jXLabel11.setText("Correo Electrónico:");
        jXLabel11.setFocusable(false);
        jXLabel11.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jtPaginaWeb.setForeground(new java.awt.Color(0, 0, 255));
        jtPaginaWeb.setName("45"); // NOI18N

        jXLabel12.setText("Página Web:");
        jXLabel12.setFocusable(false);
        jXLabel12.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jtCorreo.setName("45"); // NOI18N

        jXLabel18.setText("Ext.:");
        jXLabel18.setFocusable(false);
        jXLabel18.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jtExt1.setName("5"); // NOI18N

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nota:"));
        jScrollPane4.setViewportView(jtaNota);

        jtaDireccion.setColumns(20);
        jtaDireccion.setLineWrap(true);
        jtaDireccion.setRows(3);
        jtaDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("SansSerif", 1, 13))); // NOI18N
        jScrollPane1.setViewportView(jtaDireccion);

        jXLabel19.setText("Teléfono 2:");
        jXLabel19.setFocusable(false);
        jXLabel19.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        try {
            ftTelefono2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jXLabel20.setText("Ext.:");
        jXLabel20.setFocusable(false);
        jXLabel20.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jtExt2.setName("5"); // NOI18N

        jXLabel22.setText("Contacto:");
        jXLabel22.setFocusable(false);
        jXLabel22.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jtContacto.setName("45"); // NOI18N

        try {
            ftTelContacto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jXLabel23.setText("Ext:");
        jXLabel23.setFocusable(false);
        jXLabel23.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jtExtContacto.setName("5"); // NOI18N

        jXLabel24.setText("Teléfono:");
        jXLabel24.setFocusable(false);
        jXLabel24.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jXLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ftTelContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jXLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtExtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ftFax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(ftTelefono2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(ftMovil, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jXLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtExt2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ftTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ftRNC, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jXLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtExt1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPaginaWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jXLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ftRNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(ftTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtExt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(ftTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtExt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jXLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jXLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftTelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtExtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jXLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jtPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpElements.addTab("Datos Generales", jPanel1);

        jXLabel6.setText("Referencia");
        jXLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtReferencia.setDisabledTextColor(java.awt.Color.black);
        jtReferencia.setName("45"); // NOI18N

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtpElements, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpElements, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpStandard.addTab("Registro", jXPanel1);

        tbFabricante.setModel(new javax.swing.table.DefaultTableModel(
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
        tbFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFabricanteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbFabricante);

        jXLabel4.setText("Búsqueda");
        jXLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtFiltro.setName("67"); // NOI18N
        jtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltroKeyReleased(evt);
            }
        });

        jXLabel5.setText("Criterio");
        jXLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpStandard.addTab("Consulta", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
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

    private void tbFabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFabricanteMouseClicked
        objectDisplacement.setLista(tbFabricante.getElements());
        if (evt.getClickCount() == 2) {
            setElement(tbFabricante.getSelectedElement());
            setTablePanel(0, false);
            setToolBar(false);
            editableComponent(false);
        }
    }//GEN-LAST:event_tbFabricanteMouseClicked

    private void jtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltroKeyReleased
        General.filtroTextField(cbFiltro.getSelectedItem(), jtFiltro, tbFabricante);
    }//GEN-LAST:event_jtFiltroKeyReleased

    public static void main(String[] args) {
        new DgFabricante((JDialog) null, true).setVisible(true);
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
    private com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro> cbFiltro;
    private javax.swing.JFormattedTextField ftFax;
    private javax.swing.JFormattedTextField ftMovil;
    private javax.swing.JFormattedTextField ftRNC;
    private javax.swing.JFormattedTextField ftTelContacto;
    private javax.swing.JFormattedTextField ftTelefono1;
    private javax.swing.JFormattedTextField ftTelefono2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel18;
    private org.jdesktop.swingx.JXLabel jXLabel19;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel20;
    private org.jdesktop.swingx.JXLabel jXLabel22;
    private org.jdesktop.swingx.JXLabel jXLabel23;
    private org.jdesktop.swingx.JXLabel jXLabel24;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private javax.swing.JMenuItem jmpEdit;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtContacto;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtCorreo;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtExt1;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtExt2;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtExtContacto;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtFiltro;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtIdentificador;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtNombre;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtPaginaWeb;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtReferencia;
    private javax.swing.JTextArea jtaDireccion;
    private javax.swing.JTextPane jtaNota;
    private javax.swing.JTabbedPane jtpElements;
    private javax.swing.JTabbedPane jtpStandard;
    private com.jadesoft.jadelib.estandar.tablas.TableStandar<Fabricante> tbFabricante;
    // End of variables declaration//GEN-END:variables
    private KeyEventDespachador eventDispatcher;
    private Fabricante fabricante;
    private DesplazamientoObject<Fabricante> objectDisplacement;
    private boolean consultation;
    private boolean changeDisplacement = true;

    protected void setColumnaWith(int Column, int width) {
        tbFabricante.getColumnModel().getColumn(Column).setPreferredWidth(width);
    }

    protected void setTablePanel(int panel, boolean status) {
        jtpStandard.setSelectedIndex(panel);
        jtpStandard.setEnabledAt(0, !status);
        jtpStandard.setEnabledAt(1, status);
    }

    private void initComp() {
        setGlassPane(new jGlassPane());
        tbFabricante.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbFabricante.doLayout();
        tbFabricante.setModelStandar(new ModeloFabricante());
        tbFabricante.setElements(ManejoFabricante.getInstance().findAll());
        setColumnaWith(0, 100);
        setColumnaWith(1, 250);
        setColumnaWith(2, 100);
        setColumnaWith(3, 250);
        ManejoFiltro filtro = new ManejoFiltro();
        filtro.agregarFiltro(0, "Identificador");
        filtro.agregarFiltro(1, "Nombre");
        filtro.agregarFiltro(2, "RNC");
        cbFiltro.setElements(filtro.getLists());
        cbFiltro.setSelectedIndex(0);
        keyEvents();
        setDisplacement(true);
        objectDisplacement = new DesplazamientoObject<>();
        jtFiltro.requestFocus();
        setTablePanel(1, true);
        setToolBar(true);
        editableComponent(true);
    }

    private void clean() {
        fabricante = null;
        setDisplacement(true);
        cleanField();
    }

    private void cleanField() {
        jtIdentificador.setText("");
        jtNombre.setText("");
        ftRNC.setText("");
        jtReferencia.setText("");
        jtaDireccion.setText("");
        ftTelefono1.setText("");
        jtExt1.setText("");
        ftTelefono2.setText("");
        jtExt2.setText("");
        ftFax.setText("");
        ftMovil.setText("");
        jtContacto.setText("");
        ftTelContacto.setText("");
        jtExtContacto.setText("");
        jtaNota.setText("");
        jtCorreo.setText("");
        jtPaginaWeb.setText("");
    }

    private void consultation() {
        setTablePanel(1, true);
        setToolBar(true);
        clean();
        fireTableDataChanged();
    }

    private void edit() {
        if (tbFabricante.getSelectedElement() != null) {
            setDisplacement(true);
            objectDisplacement.setLista(tbFabricante.getElements());
            setElement(tbFabricante.getSelectedElement());
            setTablePanel(0, false);
            setToolBar(false);
            editableComponent(false);
        }
    }

    private void newElement() {
        setTablePanel(0, false);
        setToolBar(false);
        clean();
        editableComponent(true);
    }

    private void setToolBar(boolean b) {
        btConsultation.setEnabled(!b);
        btSave.setEnabled(!b);
        //btNew.setEnabled(b);
        btEdit.setEnabled(b);

        b = jtpStandard.getSelectedIndex() == 0 && fabricante != null;
        btDelete.setEnabled(b);
    }

    public void setDisplacement(boolean b) {
        btBack.setEnabled(b);
        btNext.setEnabled(b);
        btLast.setEnabled(b);
        btFirts.setEnabled(b);
    }

    private void delete() {
        if (fabricante != null) {
            int men = JOptionPane.showConfirmDialog(this, "Desea eliminar el nuevo registro?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.YES_OPTION) {
                if (ManejoFabricante.getInstance().findDelete(fabricante) != null) {
                    JOptionPane.showMessageDialog(null, "Existen artículos relacionados a este Fabricante. No se puede borrar!", "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                ManejoFabricante.getInstance().delete(fabricante);
            }
            clean();
            setTablePanel(0, false);
            setToolBar(false);
            fireTableDataChanged();
            editableComponent(true);
        }
    }

    private void print() {
        if (fabricante != null) {
            //codigo de imprimir
        }
    }

    private void select() {
        if (changeDisplacement) {
            objectDisplacement = new DesplazamientoObject<>(tbFabricante.getElements());
            changeDisplacement = false;
        }
        setElement(tbFabricante.getSelectedElement());
    }

    protected void setElements() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                getGlassPane().setVisible(true);
                tbFabricante.setElements(ManejoFabricante.getInstance().findAll());
                getGlassPane().setVisible(false);
            }
        };
        new Thread(run).start();
    }

    private void save() {
        if (!validateField()) {
            return;
        }

        int men = JOptionPane.showConfirmDialog(this, fabricante == null ? "Desea guardar el nuevo registro?"
                : "Desea guardar los cambios?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (men == JOptionPane.NO_OPTION) {
            return;
        }

        if (fabricante == null) {
            fabricante = new Fabricante();
        }

        fabricante.setIdentificador(jtIdentificador.getText().trim());
        fabricante.setNombre(jtNombre.getText().trim());
        fabricante.setRnc(ftRNC.getText().trim());
        fabricante.setReferenciaFabricante(jtReferencia.getText().trim());
        fabricante.setDireccion(jtaDireccion.getText().trim());
        fabricante.setTelefono1(ftTelefono1.getText().trim());
        fabricante.setExttel1(jtExt1.getText().trim());
        fabricante.setTelefono2(ftTelefono2.getText().trim());
        fabricante.setExttel2(jtExt2.getText().trim());
        fabricante.setFax(ftFax.getText().trim());
        fabricante.setMovil(ftMovil.getText().trim());
        fabricante.setContacto(jtContacto.getText().trim());
        fabricante.setTelefonoContacto(ftTelContacto.getText().trim());
        fabricante.setExtContacto(jtExtContacto.getText().trim());
        fabricante.setNota(jtaNota.getText().trim());
        fabricante.setCorreo(jtCorreo.getText().trim());
        fabricante.setPaginaweb(jtPaginaWeb.getText().trim());
        ManejoFabricante.getInstance().create(fabricante);
        changeDisplacement = true;
        clean();
        fireTableDataChanged();
        setTablePanel(1, true);
        setToolBar(true);
        editableComponent(true);
    }

    private void fireTableDataChanged() {
        setElements();
        jtFiltro.setText("");
        General.filtroTextField(cbFiltro.getSelectedItem(), jtFiltro, tbFabricante);
    }

    public void setSelectEnable(boolean enable) {
        consultation = enable;
    }

    public Fabricante getSelected() {
        return fabricante;
    }

    private void disposeConsultation() {
        if (consultation && fabricante != null) {
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
                if (btNew.isEnabled()) {
                    btNew.doClick();
                }
            }
        });

        KeyStroke save = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(save, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btSave.isEnabled()) {
                    btSave.doClick();
                }
            }
        });

//        KeyStroke select = KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
//        eventDispatcher.addactionMap(select, new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (btSelect.isEnabled()) {
//                    disposeConsultation();
//                }
//            }
//        });

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
                if (btPrint.isEnabled()) {
                    btPrint.doClick();
                }
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

    private boolean validateField() {
        if (jtIdentificador.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Identificador no puede estar en blanco.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            jtIdentificador.requestFocus();
            return false;
        } else if (jtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Descripción no puede estar en blanco.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            jtNombre.requestFocus();
            return false;
        }
        return true;
    }

    private void setElement(Fabricante fabricante) {
        selectRow();
        if (fabricante != null) {
            this.fabricante = fabricante;
            jtIdentificador.setText(fabricante.getIdentificador());
            jtNombre.setText(fabricante.getNombre());
            ftRNC.setText(fabricante.getRnc());
            jtReferencia.setText(fabricante.getReferenciaFabricante());
            jtaDireccion.setText(fabricante.getDireccion());
            ftTelefono1.setText(fabricante.getTelefono1());
            jtExt1.setText(fabricante.getExttel1());
            ftTelefono2.setText(fabricante.getTelefono2());
            jtExt2.setText(fabricante.getExttel2());
            ftFax.setText(fabricante.getFax());
            ftMovil.setText(fabricante.getMovil());
            jtContacto.setText(fabricante.getContacto());
            ftTelContacto.setText(fabricante.getTelefonoContacto());
            jtExtContacto.setText(fabricante.getExtContacto());
            jtaNota.setText(fabricante.getNota());
            jtCorreo.setText(fabricante.getCorreo());
            jtPaginaWeb.setText(fabricante.getPaginaweb());
            editableComponent(false);
            //  objectDisplacement.setRegistroActual(fabricante);           
        }
    }

    private void selectRow() {

        if (fabricante != null) {
            objectDisplacement.setRegistroActual(fabricante);
            if (jtpStandard.getSelectedIndex() == 1) {
                int row = 0;
                for (Fabricante f : tbFabricante.getElements()) {
                    if (f.equals(fabricante)) {
                        tbFabricante.changeSelection(row, 1, false, false);
                        return;
                    }
                    row++;
                }
                return;
            }
        }

        if (jtpStandard.getSelectedIndex() == 1 && tbFabricante.getSelectedRow() == -1) {
            tbFabricante.changeSelection(0, 1, false, false);
            objectDisplacement.setLista(tbFabricante.getElements());
        }
    }

    public void editableComponent(boolean editable) {
        jtIdentificador.setEditable(editable);
    }

    private void fillComponent() {
    }
}
