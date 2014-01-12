/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.views;

import com.js.controller.component.ComponentObject;
import com.js.controller.displacement.Displacement;
import com.js.controller.keyevent.KeyEventDispatcherJS;
import com.js.swing.table.filter.FilterTable;
import com.js.swing.table.filter.FilterTableController;
import com.js.exception.BussinessException;
import com.js.inv.tablesmodel.ModelArticulo;
import com.js.inv.tablesmodel.ModelArticuloPresentacion;
import com.js.shared.factory.FactoryObject;
import com.js.shared.factory.FactoryObjectImpl;
import com.js.shared.models.InvArticulo;
import com.js.shared.models.InvArticuloPresentacion;
import com.js.shared.models.InvClasificacion;
import com.js.shared.models.InvFamilia;
import com.js.shared.models.InvIngredienteActivo;
import com.js.shared.models.InvMarca;
import com.js.shared.models.InvPresentacion;
import com.js.shared.models.InvRenglon;
import com.js.swing.button.JButtonJS;
import com.js.swing.panel.JGlassPaneJS;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;

/**
 *
 * @author JADESOFT
 */
public class VwArticulo extends javax.swing.JDialog {

    public VwArticulo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initComp();
    }

    public VwArticulo(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initComp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        jToolBar1 = new javax.swing.JToolBar();
        btNew = new com.js.swing.button.JButtonJS();
        btEdit = new com.js.swing.button.JButtonJS();
        btSave = new com.js.swing.button.JButtonJS();
        btConsultation = new com.js.swing.button.JButtonJS();
        btPrint = new com.js.swing.button.JButtonJS();
        btDelete = new com.js.swing.button.JButtonJS();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btFirts = new com.js.swing.button.JButtonJS();
        btBack = new com.js.swing.button.JButtonJS();
        btNext = new com.js.swing.button.JButtonJS();
        btLast = new com.js.swing.button.JButtonJS();
        jtpStandard = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jPanel3 = new javax.swing.JPanel();
        jlCBarra = new javax.swing.JLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        jXLabel13 = new org.jdesktop.swingx.JXLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPresentacion = new com.js.swing.table.JTableJS<InvArticuloPresentacion>();
        jLabel2 = new javax.swing.JLabel();
        cbPresentacion = new com.js.swing.combobox.JComboBoxJS<InvPresentacion>();
        jtCBarraPresen = new com.js.swing.textfield.JTextFieldJS();
        jtCosto = new com.js.swing.textfield.JTextFieldJS();
        jtMargenP1 = new com.js.swing.textfield.JTextFieldJS();
        jtPrecio1 = new com.js.swing.textfield.JTextFieldJS();
        jtMargenP2 = new com.js.swing.textfield.JTextFieldJS();
        jtPrecio2 = new com.js.swing.textfield.JTextFieldJS();
        jtMargenP3 = new com.js.swing.textfield.JTextFieldJS();
        jtPrecio3 = new com.js.swing.textfield.JTextFieldJS();
        btPresentationAdd = new com.js.swing.button.JButtonJS();
        btPresentationDelete = new com.js.swing.button.JButtonJS();
        jPanel6 = new javax.swing.JPanel();
        jXLabel14 = new org.jdesktop.swingx.JXLabel();
        btFamilyMore = new com.js.swing.button.JButtonJS();
        jXLabel16 = new org.jdesktop.swingx.JXLabel();
        btMakeMore = new com.js.swing.button.JButtonJS();
        btModelMore = new com.js.swing.button.JButtonJS();
        jXLabel17 = new org.jdesktop.swingx.JXLabel();
        btLineMore = new com.js.swing.button.JButtonJS();
        jXLabel18 = new org.jdesktop.swingx.JXLabel();
        jXLabel19 = new org.jdesktop.swingx.JXLabel();
        btclassificationMore = new com.js.swing.button.JButtonJS();
        jXLabel20 = new org.jdesktop.swingx.JXLabel();
        jtCampoClave = new com.js.swing.textfield.JTextFieldJS();
        cbRenglon = new com.js.swing.combobox.JComboBoxJS<InvRenglon>();
        cbClasificacion = new com.js.swing.combobox.JComboBoxJS<InvClasificacion>();
        cbModelo = new com.js.swing.combobox.JComboBoxJS();
        cbMarca = new com.js.swing.combobox.JComboBoxJS<InvMarca>();
        cbFamilia = new com.js.swing.combobox.JComboBoxJS<InvFamilia>();
        jPanel5 = new javax.swing.JPanel();
        ckPermiteVenc = new javax.swing.JCheckBox();
        ckPermiteDesc = new javax.swing.JCheckBox();
        ckVentaDetalle = new javax.swing.JCheckBox();
        ckExentoItbis = new javax.swing.JCheckBox();
        PManejoPrecios = new javax.swing.JPanel();
        rbMBeneficio = new javax.swing.JRadioButton();
        rbPDirecto = new javax.swing.JRadioButton();
        ckActivo = new javax.swing.JCheckBox();
        jXLabel15 = new org.jdesktop.swingx.JXLabel();
        btIngActiveMore = new com.js.swing.button.JButtonJS();
        btManufacturerMore = new com.js.swing.button.JButtonJS();
        cbIngActivo = new com.js.swing.combobox.JComboBoxJS<InvIngredienteActivo>();
        cbFabricante = new com.js.swing.combobox.JComboBoxJS();
        jtCBarra = new com.js.swing.textfield.JTextFieldJS();
        jtDescripcion = new com.js.swing.textfield.JTextFieldJS();
        jXLabel22 = new org.jdesktop.swingx.JXLabel();
        jtReferencia = new com.js.swing.textfield.JTextFieldJS();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbArticulos = new com.js.swing.table.JTableJS<InvArticulo>();
        jXLabel21 = new org.jdesktop.swingx.JXLabel();
        cbFilter = new com.js.swing.combobox.JComboBoxJS<FilterTable>();
        jtFilter = new com.js.swing.textfield.JTextFieldSearchJS();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Artículos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jXHeader1.setDescription("Registro y consulta de Artículos");
        jXHeader1.setDescriptionFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/messenger_72.png"))); // NOI18N
        jXHeader1.setTitle("Registro Artículos");
        jXHeader1.setTitleFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/document_40.png"))); // NOI18N
        btNew.setToolTipText("Nuevo [Ctrl + I]");
        btNew.setFocusable(false);
        btNew.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btNew.setJsPermission(com.js.swing.others.Permission.NEW);
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btNew);

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/edit_40.png"))); // NOI18N
        btEdit.setToolTipText("Editar [Ctrl + M]");
        btEdit.setFocusable(false);
        btEdit.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btEdit.setJsPermission(com.js.swing.others.Permission.EDIT);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        jToolBar1.add(btEdit);

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/diskette_40.png"))); // NOI18N
        btSave.setToolTipText("Guardar [Ctrl + S]");
        btSave.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btSave.setJsPermission(com.js.swing.others.Permission.SAVE);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);

        btConsultation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_40.png"))); // NOI18N
        btConsultation.setToolTipText("Buscar [Ctrl + Q]");
        btConsultation.setFocusable(false);
        btConsultation.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btConsultation.setJsPermission(com.js.swing.others.Permission.CONSULTATION);
        btConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultationActionPerformed(evt);
            }
        });
        jToolBar1.add(btConsultation);

        btPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/print_40.png"))); // NOI18N
        btPrint.setToolTipText("Imprimir [Ctrl + P]");
        btPrint.setFocusable(false);
        btPrint.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btPrint.setJsPermission(com.js.swing.others.Permission.PRINT);
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });
        jToolBar1.add(btPrint);

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/trash_can_40.png"))); // NOI18N
        btDelete.setToolTipText("Borrar [Ctrl + D]");
        btDelete.setFocusable(false);
        btDelete.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btDelete.setJsPermission(com.js.swing.others.Permission.DELETE);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btDelete);
        jToolBar1.add(jSeparator3);

        btFirts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/first_40.png"))); // NOI18N
        btFirts.setToolTipText("Primer Registro [Ctrl + F]");
        btFirts.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btFirts.setJsPermission(com.js.swing.others.Permission.DISPLACEMENT);
        btFirts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFirtsActionPerformed(evt);
            }
        });
        jToolBar1.add(btFirts);

        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/previous_40.png"))); // NOI18N
        btBack.setToolTipText("Registro Anterior [Ctrl + B]");
        btBack.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btBack.setJsPermission(com.js.swing.others.Permission.DISPLACEMENT);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        jToolBar1.add(btBack);

        btNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/next_40.png"))); // NOI18N
        btNext.setToolTipText("Registro Siguiente [Ctrl + N]");
        btNext.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btNext.setJsPermission(com.js.swing.others.Permission.DISPLACEMENT);
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        jToolBar1.add(btNext);

        btLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/last_40.png"))); // NOI18N
        btLast.setToolTipText("Último Registro [Ctrl + L]");
        btLast.setJsDirectory(com.js.swing.others.Directory.INVENTARIO);
        btLast.setJsPermission(com.js.swing.others.Permission.DISPLACEMENT);
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });
        jToolBar1.add(btLast);

        jtpStandard.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel5.setText("Código de Barra:");
        jXLabel5.setFocusable(false);
        jXLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jlCBarra.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jlCBarra.setText("Código de Barras");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jlCBarra)
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlCBarra)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jXLabel6.setText("Descripción:");
        jXLabel6.setFocusable(false);
        jXLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel7.setText("Ingrediente Activo:");
        jXLabel7.setFocusable(false);
        jXLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jTabbedPane2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N

        jXLabel8.setText("Presentación:");
        jXLabel8.setFocusable(false);
        jXLabel8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel9.setText("Código de Barra:");
        jXLabel9.setFocusable(false);
        jXLabel9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel10.setText("Precios");
        jXLabel10.setFocusable(false);
        jXLabel10.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel13.setText("Costo");
        jXLabel13.setFocusable(false);
        jXLabel13.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        tbPresentacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPresentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPresentacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbPresentacionMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tbPresentacion);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("%");

        jtCosto.setForeground(new java.awt.Color(49, 94, 150));
        jtCosto.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jtCosto.setJsLength(12);
        jtCosto.setJsType(com.js.swing.others.TypeJTextFieldJS.FORMAT_NUMBER);
        jtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCostoKeyReleased(evt);
            }
        });

        jtMargenP1.setForeground(new java.awt.Color(49, 94, 150));
        jtMargenP1.setToolTipText("Procentaje 1");
        jtMargenP1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jtMargenP1.setJsLength(12);
        jtMargenP1.setJsType(com.js.swing.others.TypeJTextFieldJS.FORMAT_NUMBER);
        jtMargenP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMargenP1KeyReleased(evt);
            }
        });

        jtPrecio1.setForeground(new java.awt.Color(49, 94, 150));
        jtPrecio1.setToolTipText("Precio 1");
        jtPrecio1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jtPrecio1.setJsLength(12);
        jtPrecio1.setJsType(com.js.swing.others.TypeJTextFieldJS.FORMAT_NUMBER);

        jtMargenP2.setForeground(new java.awt.Color(49, 94, 150));
        jtMargenP2.setToolTipText("Procentaje 2");
        jtMargenP2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jtMargenP2.setJsLength(12);
        jtMargenP2.setJsType(com.js.swing.others.TypeJTextFieldJS.FORMAT_NUMBER);
        jtMargenP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMargenP2KeyReleased(evt);
            }
        });

        jtPrecio2.setForeground(new java.awt.Color(49, 94, 150));
        jtPrecio2.setToolTipText("Precio 3");
        jtPrecio2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jtPrecio2.setJsLength(12);
        jtPrecio2.setJsType(com.js.swing.others.TypeJTextFieldJS.FORMAT_NUMBER);

        jtMargenP3.setForeground(new java.awt.Color(49, 94, 150));
        jtMargenP3.setToolTipText("Procentaje 3");
        jtMargenP3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jtMargenP3.setJsLength(12);
        jtMargenP3.setJsType(com.js.swing.others.TypeJTextFieldJS.FORMAT_NUMBER);
        jtMargenP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMargenP3KeyReleased(evt);
            }
        });

        jtPrecio3.setForeground(new java.awt.Color(49, 94, 150));
        jtPrecio3.setToolTipText("Precio 3");
        jtPrecio3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jtPrecio3.setJsLength(12);
        jtPrecio3.setJsType(com.js.swing.others.TypeJTextFieldJS.FORMAT_NUMBER);

        btPresentationAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/add_20.png"))); // NOI18N
        btPresentationAdd.setIconTextGap(0);
        btPresentationAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPresentationAddActionPerformed(evt);
            }
        });

        btPresentationDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/delete_20.png"))); // NOI18N
        btPresentationDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPresentationDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jtCBarraPresen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btPresentationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                .addComponent(btPresentationDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jXLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtMargenP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtMargenP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                        .addComponent(jtMargenP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtPrecio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jXLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtPrecio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtPrecio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCBarraPresen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMargenP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMargenP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jtPrecio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMargenP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btPresentationDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPresentationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Presentaciones", jPanel4);

        jXLabel14.setText("Familia:");
        jXLabel14.setFocusable(false);
        jXLabel14.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        btFamilyMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        btFamilyMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFamilyMoreActionPerformed(evt);
            }
        });

        jXLabel16.setText("Marca:");
        jXLabel16.setFocusable(false);
        jXLabel16.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        btMakeMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        btMakeMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMakeMoreActionPerformed(evt);
            }
        });

        btModelMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        btModelMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModelMoreActionPerformed(evt);
            }
        });

        jXLabel17.setText("Modelo:");
        jXLabel17.setFocusable(false);
        jXLabel17.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        btLineMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        btLineMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLineMoreActionPerformed(evt);
            }
        });

        jXLabel18.setText("Renglón:");
        jXLabel18.setFocusable(false);
        jXLabel18.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jXLabel19.setText("Clasificación:");
        jXLabel19.setFocusable(false);
        jXLabel19.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        btclassificationMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        btclassificationMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclassificationMoreActionPerformed(evt);
            }
        });

        jXLabel20.setText("Campo Clave:");
        jXLabel20.setFocusable(false);
        jXLabel20.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRenglon, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCampoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFamilyMore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMakeMore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModelMore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLineMore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btclassificationMore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(264, 264, 264))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFamilyMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMakeMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModelMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLineMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRenglon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btclassificationMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCampoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Agrupaciones", jPanel6);

        ckPermiteVenc.setText("Este artículo permite vencimiento.");
        ckPermiteVenc.setName(""); // NOI18N
        ckPermiteVenc.setRequestFocusEnabled(false);

        ckPermiteDesc.setText("Este artículo permite descuento.");

        ckVentaDetalle.setText("Usar venta al detalle.");

        ckExentoItbis.setText("Exento de ITBIS");

        PManejoPrecios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cálculo Precios"));

        buttonGroup1.add(rbMBeneficio);
        rbMBeneficio.setSelected(true);
        rbMBeneficio.setText("Margen Beneficio");
        rbMBeneficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMBeneficioActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPDirecto);
        rbPDirecto.setText("Precio Directo");
        rbPDirecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPDirectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PManejoPreciosLayout = new javax.swing.GroupLayout(PManejoPrecios);
        PManejoPrecios.setLayout(PManejoPreciosLayout);
        PManejoPreciosLayout.setHorizontalGroup(
            PManejoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PManejoPreciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PManejoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPDirecto)
                    .addComponent(rbMBeneficio))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        PManejoPreciosLayout.setVerticalGroup(
            PManejoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PManejoPreciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMBeneficio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPDirecto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ckActivo.setSelected(true);
        ckActivo.setText("Activo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckPermiteVenc)
                            .addComponent(ckPermiteDesc)
                            .addComponent(ckVentaDetalle)
                            .addComponent(ckExentoItbis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PManejoPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ckActivo))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PManejoPrecios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ckPermiteVenc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckPermiteDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckVentaDetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckExentoItbis)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckActivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Configuración", jPanel5);

        jXLabel15.setText("Fabricante:");
        jXLabel15.setFocusable(false);
        jXLabel15.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        btIngActiveMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        btIngActiveMore.setToolTipText("");
        btIngActiveMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngActiveMoreActionPerformed(evt);
            }
        });

        btManufacturerMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        btManufacturerMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManufacturerMoreActionPerformed(evt);
            }
        });

        jtCBarra.setRequestFocusEnabled(false);

        jtDescripcion.setRequestFocusEnabled(false);

        jXLabel22.setText("Referencia:");
        jXLabel22.setFocusable(false);
        jXLabel22.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        jtReferencia.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jXLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbIngActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btIngActiveMore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btManufacturerMore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btIngActiveMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btManufacturerMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIngActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtpStandard.addTab("Registro", jPanel2);

        tbArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbArticulos);

        jXLabel21.setText("Criterio");
        jXLabel21.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        jtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFilterKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtpStandard.addTab("Consulta", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        newElement();
    }//GEN-LAST:event_btNewActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        edit();
    }//GEN-LAST:event_btEditActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        save();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultationActionPerformed
        consultation();
    }//GEN-LAST:event_btConsultationActionPerformed

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        print();
    }//GEN-LAST:event_btPrintActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btFirtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFirtsActionPerformed
        setElement(displacement.getFirst());
    }//GEN-LAST:event_btFirtsActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        setElement(displacement.getPrevious());
    }//GEN-LAST:event_btBackActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        setElement(displacement.getNext());
    }//GEN-LAST:event_btNextActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        setElement(displacement.getLast());
    }//GEN-LAST:event_btLastActionPerformed

    private void btPresentationAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPresentationAddActionPerformed
        addPresentation();
    }//GEN-LAST:event_btPresentationAddActionPerformed

    private void jtMargenP1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMargenP1KeyReleased
        if (jtMargenP1.getText().trim().isEmpty()) {
            jtPrecio1.setText(calculatePrice(Double.valueOf(jtCosto.getText().trim())));
        } else if (!jtMargenP1.getText().isEmpty() && !jtCosto.getText().isEmpty()) {
            jtPrecio1.setText(calculatePriceByMargin(Double.valueOf(jtMargenP1.getText().trim()), Double.valueOf(jtCosto.getText().trim())));
        }
    }//GEN-LAST:event_jtMargenP1KeyReleased

    private void jtCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCostoKeyReleased
        if (jtCosto.getText().trim().isEmpty()) {
            ComponentObject.clean(jtPrecio1, jtPrecio2, jtPrecio3);
        } else {
            jtPrecio1.setText(calculatePrice(Double.valueOf(jtCosto.getText().trim())));
            jtPrecio2.setText(calculatePrice(Double.valueOf(jtCosto.getText().trim())));
            jtPrecio3.setText(calculatePrice(Double.valueOf(jtCosto.getText().trim())));
        }

    }//GEN-LAST:event_jtCostoKeyReleased

    private void jtMargenP2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMargenP2KeyReleased
        if (jtMargenP2.getText().trim().isEmpty()) {
            jtPrecio2.setText(calculatePrice(Double.valueOf(jtCosto.getText().trim())));
        } else if (!jtMargenP2.getText().isEmpty() && !jtCosto.getText().isEmpty()) {
            jtPrecio2.setText(calculatePriceByMargin(Double.valueOf(jtMargenP2.getText().trim()), Double.valueOf(jtCosto.getText().trim())));
        }
    }//GEN-LAST:event_jtMargenP2KeyReleased

    private void jtMargenP3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMargenP3KeyReleased
        if (jtMargenP3.getText().trim().isEmpty()) {
            jtPrecio3.setText(calculatePrice(Double.valueOf(jtCosto.getText().trim())));
        } else if (!jtMargenP3.getText().isEmpty() && !jtCosto.getText().isEmpty()) {
            jtPrecio3.setText(calculatePriceByMargin(Double.valueOf(jtMargenP3.getText().trim()), Double.valueOf(jtCosto.getText().trim())));
        }
    }//GEN-LAST:event_jtMargenP3KeyReleased

    private void rbMBeneficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMBeneficioActionPerformed
        setEditablePrice(false);
    }//GEN-LAST:event_rbMBeneficioActionPerformed

    private void rbPDirectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPDirectoActionPerformed
        setEditablePrice(true);
        ComponentObject.clean(jtMargenP1, jtMargenP2, jtMargenP3);
    }//GEN-LAST:event_rbPDirectoActionPerformed

    private void btMakeMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMakeMoreActionPerformed
        KeyEventDispatcherJS.remove();
        VwMarca vwMarca = new VwMarca(this, true);
        vwMarca.setSelectEnable(true);
        vwMarca.setVisible(true);
        if (vwMarca.getChange()) {
            try {
                cbMarca.setElements(FactoryObject.getInstance().getMarcaController().findAll());
            } catch (BussinessException ex) {
                Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cbMarca.setSelectedItem(vwMarca.getSelected());
        keyEvents();
    }//GEN-LAST:event_btMakeMoreActionPerformed

    private void btFamilyMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFamilyMoreActionPerformed
        KeyEventDispatcherJS.remove();
        VwFamilia vwFamilia = new VwFamilia(this, true);
        vwFamilia.setSelectEnable(true);
        vwFamilia.setVisible(true);
        if (vwFamilia.getChange()) {
            try {
                cbFamilia.setElements(FactoryObject.getInstance().getFamiliaController().findAll());
            } catch (BussinessException ex) {
                Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cbFamilia.setSelectedItem(vwFamilia.getSelected());
        keyEvents();
    }//GEN-LAST:event_btFamilyMoreActionPerformed

    private void btModelMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModelMoreActionPerformed

    }//GEN-LAST:event_btModelMoreActionPerformed

    private void btLineMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLineMoreActionPerformed
        KeyEventDispatcherJS.remove();
        VwRenglon vwRenglon = new VwRenglon(this, true);
        vwRenglon.setSelectEnable(true);
        vwRenglon.setVisible(true);
        if (vwRenglon.getChange()) {
            try {
                cbRenglon.setElements(FactoryObject.getInstance().getRenglonController().findAll());
            } catch (BussinessException ex) {
                Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cbRenglon.setSelectedItem(vwRenglon.getSelected());
        keyEvents();
    }//GEN-LAST:event_btLineMoreActionPerformed

    private void btclassificationMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclassificationMoreActionPerformed
        KeyEventDispatcherJS.remove();
        VwClasArticulo vwClasArticulo = new VwClasArticulo(this, true);
        vwClasArticulo.setSelectEnable(true);
        vwClasArticulo.setVisible(true);
        if (vwClasArticulo.getChange()) {
            try {
                cbClasificacion.setElements(FactoryObject.getInstance().getClasArticuloController().findAll());
            } catch (BussinessException ex) {
                Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cbClasificacion.setSelectedItem(vwClasArticulo.getSelected());
        keyEvents();
    }//GEN-LAST:event_btclassificationMoreActionPerformed

    private void btIngActiveMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngActiveMoreActionPerformed
        KeyEventDispatcherJS.remove();
        VwIngrActivo vwIngrActivo = new VwIngrActivo(this, true);
        vwIngrActivo.setSelectEnable(true);
        vwIngrActivo.setVisible(true);
        if (vwIngrActivo.getChange()) {
            try {
                cbIngActivo.setElements(FactoryObject.getInstance().getIngrActivoController().findAll());
            } catch (BussinessException ex) {
                Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cbIngActivo.setSelectedItem(vwIngrActivo.getSelected());
        keyEvents();
    }//GEN-LAST:event_btIngActiveMoreActionPerformed

    private void btManufacturerMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManufacturerMoreActionPerformed

    }//GEN-LAST:event_btManufacturerMoreActionPerformed

    private void tbArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbArticulosMouseClicked
        displacement.setDisplacement(tbArticulos.getElements());
        if (evt.getClickCount() == 2) {
            try {
                element = FactoryObject.getInstance().getArticuloController().get(tbArticulos.getSelectedElement().getCodigo());
            } catch (BussinessException ex) {
                Logger.getLogger(VwArticulo.class.getName()).log(Level.SEVERE, null, ex);
            }
            //  element.setPresentaciones(ManejoArticuloPresentacion.getInstance().listItemPresentation(element));
            setElement(element);
            if (!consultation) {
                setToolBarAndPanel(0, false);
            } else {
                dispose();
            }
        }
    }//GEN-LAST:event_tbArticulosMouseClicked

    private void tbPresentacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPresentacionMouseClicked
        articuloPresentacion = tbPresentacion.getSelectedElement();
        index = tbPresentacion.getSelectedRow();
        if (evt.getClickCount() == 2) {
            setPrice(articuloPresentacion);
            //changePresentation = true;
        }
    }//GEN-LAST:event_tbPresentacionMouseClicked

    private void btPresentationDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPresentationDeleteActionPerformed
        tbPresentacion.removeElement(articuloPresentacion);
    }//GEN-LAST:event_btPresentationDeleteActionPerformed

    private void tbPresentacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPresentacionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPresentacionMouseEntered

    private void jtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFilterKeyReleased
        tbArticulos.filterJTable(cbFilter.getSelectedItem(), jtFilter);
    }//GEN-LAST:event_jtFilterKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        /* Create and display the dialog */
        VwArticulo articulo = new VwArticulo(new Frame(), true);
        articulo.setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PManejoPrecios;
    private com.js.swing.button.JButtonJS btBack;
    private com.js.swing.button.JButtonJS btConsultation;
    private com.js.swing.button.JButtonJS btDelete;
    private com.js.swing.button.JButtonJS btEdit;
    private com.js.swing.button.JButtonJS btFamilyMore;
    private com.js.swing.button.JButtonJS btFirts;
    private com.js.swing.button.JButtonJS btIngActiveMore;
    private com.js.swing.button.JButtonJS btLast;
    private com.js.swing.button.JButtonJS btLineMore;
    private com.js.swing.button.JButtonJS btMakeMore;
    private com.js.swing.button.JButtonJS btManufacturerMore;
    private com.js.swing.button.JButtonJS btModelMore;
    private com.js.swing.button.JButtonJS btNew;
    private com.js.swing.button.JButtonJS btNext;
    private com.js.swing.button.JButtonJS btPresentationAdd;
    private com.js.swing.button.JButtonJS btPresentationDelete;
    private com.js.swing.button.JButtonJS btPrint;
    private com.js.swing.button.JButtonJS btSave;
    private com.js.swing.button.JButtonJS btclassificationMore;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.js.swing.combobox.JComboBoxJS<InvClasificacion> cbClasificacion;
    private com.js.swing.combobox.JComboBoxJS cbFabricante;
    private com.js.swing.combobox.JComboBoxJS<InvFamilia> cbFamilia;
    private com.js.swing.combobox.JComboBoxJS<FilterTable> cbFilter;
    private com.js.swing.combobox.JComboBoxJS<InvIngredienteActivo> cbIngActivo;
    private com.js.swing.combobox.JComboBoxJS<InvMarca> cbMarca;
    private com.js.swing.combobox.JComboBoxJS cbModelo;
    private com.js.swing.combobox.JComboBoxJS<InvPresentacion> cbPresentacion;
    private com.js.swing.combobox.JComboBoxJS<InvRenglon> cbRenglon;
    private javax.swing.JCheckBox ckActivo;
    private javax.swing.JCheckBox ckExentoItbis;
    private javax.swing.JCheckBox ckPermiteDesc;
    private javax.swing.JCheckBox ckPermiteVenc;
    private javax.swing.JCheckBox ckVentaDetalle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel13;
    private org.jdesktop.swingx.JXLabel jXLabel14;
    private org.jdesktop.swingx.JXLabel jXLabel15;
    private org.jdesktop.swingx.JXLabel jXLabel16;
    private org.jdesktop.swingx.JXLabel jXLabel17;
    private org.jdesktop.swingx.JXLabel jXLabel18;
    private org.jdesktop.swingx.JXLabel jXLabel19;
    private org.jdesktop.swingx.JXLabel jXLabel20;
    private org.jdesktop.swingx.JXLabel jXLabel21;
    private org.jdesktop.swingx.JXLabel jXLabel22;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private javax.swing.JLabel jlCBarra;
    private com.js.swing.textfield.JTextFieldJS jtCBarra;
    private com.js.swing.textfield.JTextFieldJS jtCBarraPresen;
    private com.js.swing.textfield.JTextFieldJS jtCampoClave;
    private com.js.swing.textfield.JTextFieldJS jtCosto;
    private com.js.swing.textfield.JTextFieldJS jtDescripcion;
    private com.js.swing.textfield.JTextFieldSearchJS jtFilter;
    private com.js.swing.textfield.JTextFieldJS jtMargenP1;
    private com.js.swing.textfield.JTextFieldJS jtMargenP2;
    private com.js.swing.textfield.JTextFieldJS jtMargenP3;
    private com.js.swing.textfield.JTextFieldJS jtPrecio1;
    private com.js.swing.textfield.JTextFieldJS jtPrecio2;
    private com.js.swing.textfield.JTextFieldJS jtPrecio3;
    private com.js.swing.textfield.JTextFieldJS jtReferencia;
    private javax.swing.JTabbedPane jtpStandard;
    private javax.swing.JRadioButton rbMBeneficio;
    private javax.swing.JRadioButton rbPDirecto;
    private com.js.swing.table.JTableJS<InvArticulo> tbArticulos;
    private com.js.swing.table.JTableJS<InvArticuloPresentacion> tbPresentacion;
    // End of variables declaration//GEN-END:variables
    private InvArticulo element;
    private Displacement<InvArticulo> displacement;
    private boolean consultation;
    private InvArticuloPresentacion articuloPresentacion;
    private List<InvArticuloPresentacion> lArticuloPresentacion = new ArrayList<>();
    private List<InvArticulo> lArticulo = new ArrayList<>();
    private int index;
    private static final double ITBIS = 18.00;

    private void initComp() {
        FactoryObject factory = new FactoryObjectImpl();
        FactoryObject.setInstance(factory);

        setGlassPane(new JGlassPaneJS());
        tbArticulos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbArticulos.doLayout();
        tbArticulos.setModelJS(new ModelArticulo());
        tbArticulos.columnWidth(new Integer[]{200, 300, 150, 200});

        tbPresentacion.setModelJS(new ModelArticuloPresentacion());

        setElements();
        keyEvents();

        FilterTableController filtro = new FilterTableController();
        filtro.setlFilterTable(new String[]{"Referencia", "Descripción", "Código Barra", "Ing. Activo"});
        cbFilter.setElements(filtro.getlFilterTable());
        cbFilter.setSelectedIndex(0);

        displacement = FactoryObject.getInstance().getDisplacement();

        jtpStandard.setSelectedIndex(1);
        jtpStandard.setEnabledAt(0, false);
        jtpStandard.setEnabledAt(1, true);
        ComponentObject.disabled(btSave, btConsultation, btDelete, btFirts, btLast, btBack, btNext);
        fillComponent();
    }

    private void clean() {
        this.element = null;
        ComponentObject.clean(jtReferencia, jtCBarra, jtDescripcion, cbIngActivo,
                cbRenglon, cbClasificacion, cbMarca, cbFamilia, cbModelo, cbFabricante);
        tbPresentacion.setModelJS(new ModelArticuloPresentacion());
        cleanPresentation();
        loadConfig();
        jtReferencia.requestFocus();
    }

    private void loadConfig() {
        ComponentObject.selected(ckActivo, rbMBeneficio);
        ComponentObject.notSelected(ckExentoItbis, ckPermiteDesc, ckPermiteVenc, ckVentaDetalle);
        setEditablePrice(false);
    }

    private void cleanPresentation() {
        ComponentObject.clean(jtCBarraPresen, jtCosto, jtMargenP1, jtMargenP2, jtMargenP3,
                jtPrecio1, jtPrecio2, jtPrecio3);
    }

    private void setToolBarAndPanel(int panel, boolean b) {
        jtpStandard.setSelectedIndex(panel);
        jtpStandard.setEnabledAt(0, !b);
        jtpStandard.setEnabledAt(1, b);
        //ToolBar
        btConsultation.setEnabled(!b);
        btSave.setEnabled(!b);
        btNew.setEnabled(b);
        btEdit.setEnabled(b);
        b = jtpStandard.getSelectedIndex() == 0 && this.element != null;
        btDelete.setEnabled(b);
    }

    private void consultation() {
        setToolBarAndPanel(1, true);
        setDisplacement(false);
        clean();
        fireTableDataChanged();
    }

    private void edit() {
        if (tbArticulos.getSelectedElement() != null) {
            setDisplacement(true);
            displacement.setDisplacement(tbArticulos.getElements());
            setElement(tbArticulos.getSelectedElement());
            setToolBarAndPanel(0, false);
        }
    }

    private void newElement() {
        setToolBarAndPanel(0, false);
        clean();
    }

    public void setDisplacement(boolean b) {
        if (b) {
            ComponentObject.enabled(btFirts, btLast, btBack, btNext);
        } else {
            ComponentObject.disabled(btFirts, btLast, btBack, btNext);
        }
    }

    private void delete() {
        if (this.element != null) {
            int men = JOptionPane.showConfirmDialog(this,
                    "Desea eliminar el registro?", null,
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (men == JOptionPane.NO_OPTION) {
                return;
            }

            try {
                FactoryObject.getInstance().getArticuloController().delete(this.element.getCodigo());
            } catch (BussinessException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar borrar este regsitro", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VwAlmacen.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            tbArticulos.removeElement(this.element);
            clean();
            setToolBarAndPanel(1, true);
            fireTableDataChanged();
            setDisplacement(false);

        }
    }

    private void print() {
        if (element != null) {
            //codigo de imprimir
        }
    }

    protected void setElements() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                getGlassPane().setVisible(true);
                try {
                    tbArticulos.setElements(FactoryObject.getInstance().getArticuloController().findAll());
                } catch (BussinessException ex) {
                    JOptionPane.showMessageDialog(null, "Error al intentar recorrer los regsitros", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(VwAlmacen.class.getName()).log(Level.SEVERE, null, ex);
                }
                getGlassPane().setVisible(false);
            }
        };
        new Thread(run).start();
    }

    private void save() {
        if (!ComponentObject.validate(jtReferencia, jtDescripcion, cbIngActivo,
                cbFamilia, cbRenglon, cbMarca, cbClasificacion)) {
            return;
        }

        int men = JOptionPane.showConfirmDialog(this, this.element == null ? "Desea guardar el nuevo registro?"
                : "Desea guardar los cambios?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (men == JOptionPane.NO_OPTION) {
            return;
        }

        InvArticulo copyElement = this.element;
        if (this.element == null) {
            this.element = new InvArticulo();
        }

        this.element.setDescripcion(jtDescripcion.getText().trim());
        this.element.setReferencia(jtReferencia.getText().trim());
        this.element.setCodigoBarra(jtCBarra.getText().trim());
        this.element.setIngredienteActivo(cbIngActivo.getSelectedItem());
        this.element.setFamilia(cbFamilia.getSelectedItem());
        this.element.setMarca(cbMarca.getSelectedItem());
        this.element.setRenglon(cbRenglon.getSelectedItem());
        this.element.setClasificacion(cbClasificacion.getSelectedItem());
        this.element.setActivo(ckActivo.isSelected());
        //this.element.setFabricante(index);        
        //    element.setPermiteDescuento(ckPermiteDesc.isSelected());
        this.element.setPermiteVencimiento(ckPermiteVenc.isSelected());
        this.element.setExentoItbis(ckExentoItbis.isSelected());
        this.element.setVentaDetallado(ckVentaDetalle.isSelected());
        this.element.setInvArticuloPresentacionList(tbPresentacion.getElements());

        if (copyElement == null || !this.element.equals(copyElement)) {
            try {
                FactoryObject.getInstance().getArticuloController().saveOrUpdate(this.element);
            } catch (BussinessException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar guardar este regsitro", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VwAlmacen.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            if (copyElement == null) {
                tbArticulos.addElement(this.element);
            }
            clean();
            fireTableDataChanged();
            setToolBarAndPanel(1, true);
            setDisplacement(false);
        }
    }

    private void fireTableDataChanged() {
        jtFilter.setText("");
        tbArticulos.filterJTable(cbFilter.getSelectedItem(), jtFilter);
    }

    public void setSelectEnable(boolean enable) {
        consultation = enable;
    }

    public InvArticulo getSelected() {
        return this.element;
    }

    private void exit() {
        int men = JOptionPane.showConfirmDialog(this, "Desea salir?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (men == JOptionPane.YES_OPTION) {
            KeyEventDispatcherJS.remove();
            dispose();
        }
    }

    private void setElement(InvArticulo element) {
        if (element != null) {
            this.element = element;
            jtReferencia.setText(element.getReferencia());
            jtCBarra.setText(element.getCodigoBarra());
            jtDescripcion.setText(element.getDescripcion());
            cbIngActivo.setSelectedItem(element.getIngredienteActivo());
            //  cbFabricante.setSelectedItem(element.getFabricante());
            tbPresentacion.setElements(element.getInvArticuloPresentacionList());
            cbRenglon.setSelectedItem(element.getRenglon());
            cbClasificacion.setSelectedItem(element.getClasificacion());
            cbFamilia.setSelectedItem(element.getFamilia());
            cbMarca.setSelectedItem(element.getMarca());
            ckActivo.setSelected(element.getActivo());
            ckPermiteVenc.setSelected(element.getPermiteVencimiento());
            ckExentoItbis.setSelected(element.getExentoItbis());
            ckVentaDetalle.setSelected(element.getVentaDetallado());
            displacement.setCurrent(element);
        }
    }

    private void fillComponent() {
        try {
            cbIngActivo.setElements(FactoryObject.getInstance().getIngrActivoController().findAll());
            cbRenglon.setElements(FactoryObject.getInstance().getRenglonController().findAll());
            cbClasificacion.setElements(FactoryObject.getInstance().getClasArticuloController().findAll());
            cbPresentacion.setElements(FactoryObject.getInstance().getPresentacionController().findAll());
            cbMarca.setElements(FactoryObject.getInstance().getMarcaController().findAll());
            cbFamilia.setElements(FactoryObject.getInstance().getFamiliaController().findAll());
        } catch (BussinessException ex) {
            Logger.getLogger(VwArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbModelo.setElements(new ArrayList());
        cbFabricante.setElements(new ArrayList());
    }

    private void addPresentation() {
        if (this.articuloPresentacion == null) {
            this.articuloPresentacion = new InvArticuloPresentacion();
        }
        this.articuloPresentacion.setPresentacion(cbPresentacion.getSelectedItem());
        this.articuloPresentacion.setCodigoBarra(jtCBarraPresen.getText().trim());
        this.articuloPresentacion.setCosto(Double.parseDouble(jtCosto.getText().trim()));
        this.articuloPresentacion.setPocentaje1(Double.parseDouble(jtMargenP1.getText().trim()));
        this.articuloPresentacion.setPorcentaje2(Double.parseDouble(jtMargenP2.getText().trim()));
        this.articuloPresentacion.setPorcentaje3(Double.parseDouble(jtMargenP3.getText().trim()));
        this.articuloPresentacion.setPrecio1(Double.parseDouble(jtPrecio1.getText().trim()));
        this.articuloPresentacion.setPrecio2(Double.parseDouble(jtPrecio2.getText().trim()));
        this.articuloPresentacion.setPrecio3(Double.parseDouble(jtPrecio3.getText().trim()));

        tbPresentacion.addElement(this.articuloPresentacion);
        cleanPresentation();
    }

    private void setEditablePrice(boolean option) {
        jtPrecio1.setEditable(option);
        jtPrecio2.setEditable(option);
        jtPrecio3.setEditable(option);
        jtMargenP1.setEditable(!option);
        jtMargenP2.setEditable(!option);
        jtMargenP3.setEditable(!option);
    }

    private String calculatePriceByMargin(Double margin, Double cost) {
        Double price = null;
        Double costItbis;
        if (cost == null || cost == 0 || margin == 0) {
            price = cost;
        } else if (ckExentoItbis.isSelected()) {
            price = cost * (1 + (margin / 100));
        } else if (!ckExentoItbis.isSelected()) {
            costItbis = cost * (1 + (ITBIS / 100));
            price = costItbis * (1 + (margin / 100));
        }
        return String.valueOf(price);
    }

    private String calculatePrice(Double cost) {
        Double price = 0.00;
        if (ckExentoItbis.isSelected()) {
            price = cost;
        } else if (!ckExentoItbis.isSelected()) {
            price = cost * (1 + (ITBIS / 100));
        }
        return String.valueOf(price);
    }

    private void setPrice(InvArticuloPresentacion present) {

        if (present != null) {
            cbPresentacion.setSelectedItem(present.getPresentacion());
            jtCBarraPresen.setText(present.getCodigoBarra().trim());
            jtCosto.setText(present.getCosto() + "");
            jtMargenP1.setText(present.getPocentaje1() + "");
            jtMargenP2.setText(present.getPorcentaje2() + "");
            jtMargenP3.setText(present.getPorcentaje3() + "");
            jtPrecio1.setText(present.getPrecio1() + "");
            jtPrecio2.setText(present.getPrecio2() + "");
            jtPrecio3.setText(present.getPrecio3() + "");
        }
    }

    private void keyEvents() {
        KeyEventDispatcherJS.set(new KeyEventDispatcherJS());
        KeyEventDispatcherJS.add();
        KeyStroke[] keyStrokes = new KeyStroke[]{
            KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK),
            KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_DOWN_MASK)
        };
        JButtonJS[] buttons = new JButtonJS[]{btSave, btDelete, btNew, btPrint,
            btConsultation, btEdit, btFirts, btBack, btNext, btLast};

        int ks = 0;
        for (final JButtonJS bt : buttons) {
            KeyEventDispatcherJS.get().addActionMap(
                    keyStrokes[ks++], new AbstractAction() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (bt.isEnabled()) {
                                bt.doClick();
                            }
                        }
                    });
        }
    }
}
