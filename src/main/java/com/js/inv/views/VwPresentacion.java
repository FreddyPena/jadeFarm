/*
 * Formulario para mantenimiento de Empleado
 * sistema jadeLab
 */
package com.js.inv.views;

import com.jadesoft.jadedao.exception.BussinessException;
import com.jadesoft.jadelib.displacement.Displacement;
import com.jadesoft.jadelib.estandar.panel.jGlassPane;
import com.jadesoft.jadelib.generales.Filtro;
import com.jadesoft.jadelib.generales.FiltroController;
import com.js.inv.tablesmodel.ModelAlmacen;
import com.js.inv.tablesmodel.ModelPresentacion;
import com.js.shared.factory.FactoryObject;
import com.js.shared.factory.FactoryObjectImpl;
import com.js.shared.models.InvAlmacen;
import com.js.shared.models.InvPresentacion;
import com.js.shared.models.InvUnidad;
import java.awt.Event;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;

/**
 *
 * @author JADESOFT
 */
public class VwPresentacion extends javax.swing.JDialog {

    public VwPresentacion(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    public VwPresentacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jtDescripcion = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jtFactor = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jtUnidadIdent = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jtUnidadDesc = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        btUnidadBuscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFamilia = new com.jadesoft.jadelib.estandar.tablas.TableStandar<InvPresentacion>();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        cbFiltro = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro>();
        jtFiltro = new com.jadesoft.jadelib.estandar.textField.JSearchTextField();

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

        jXHeader1.setDescription("Registro y consulta de Presentación");
        jXHeader1.setDescriptionFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/messenger_72.png"))); // NOI18N
        jXHeader1.setTitle("Registro Presentación");
        jXHeader1.setTitleFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N

        jtpStandard.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N

        jXLabel2.setText("Identificador");
        jXLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtIdentificador.setDisabledTextColor(java.awt.Color.black);
        jtIdentificador.setName("45"); // NOI18N
        jtIdentificador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdentificadorFocusLost(evt);
            }
        });

        jXLabel3.setText("Descripción");
        jXLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtDescripcion.setDisabledTextColor(java.awt.Color.black);
        jtDescripcion.setName("45"); // NOI18N

        jXLabel4.setText("Factor:");
        jXLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtFactor.setDisabledTextColor(java.awt.Color.black);
        jtFactor.setName("SoloNumero"); // NOI18N

        jXLabel6.setText("Unidad:");
        jXLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtUnidadIdent.setDisabledTextColor(java.awt.Color.black);
        jtUnidadIdent.setName("10"); // NOI18N
        jtUnidadIdent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtUnidadIdentKeyReleased(evt);
            }
        });

        jtUnidadDesc.setEditable(false);
        jtUnidadDesc.setDisabledTextColor(java.awt.Color.black);
        jtUnidadDesc.setName("45"); // NOI18N

        btUnidadBuscar.setText("...");
        btUnidadBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUnidadBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtFactor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtUnidadIdent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtUnidadDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btUnidadBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtUnidadIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtUnidadDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUnidadBuscar))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jtpStandard.addTab("Registro", jXPanel1);

        tbFamilia.setModel(new javax.swing.table.DefaultTableModel(
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
        tbFamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFamiliaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbFamilia);

        jXLabel5.setText("Criterio");
        jXLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        jtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtpStandard.addTab("Consulta", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        save();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btFirtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFirtsActionPerformed
        setElement(displacement.getFirst());
    }//GEN-LAST:event_btFirtsActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        setElement(displacement.getNext());
    }//GEN-LAST:event_btNextActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        setElement(displacement.getPrevious());
    }//GEN-LAST:event_btBackActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        setElement(displacement.getLast());
    }//GEN-LAST:event_btLastActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(FactoryObject.getInstance().getKeyEventDespachador());
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

    private void tbFamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFamiliaMouseClicked
        if (evt.getClickCount() == 2) {
            if (!consultation) {
                edit();
            } else {
                this.presentacion = tbFamilia.getSelectedElement();
                dispose();
            }
        }
    }//GEN-LAST:event_tbFamiliaMouseClicked

    private void jtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltroKeyReleased
        tbFamilia.filterJTable(cbFiltro.getSelectedItem(), jtFiltro);
    }//GEN-LAST:event_jtFiltroKeyReleased

    private void jtIdentificadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdentificadorFocusLost
//        UniqueKeyHibernate<InvFamilia> uniqueKey = new UniqueKeyHibernate<>();
//        uniqueKey.setHQL(InvFamilia.class, "identificador", jtIdentificador.getText());
//        if (uniqueKey.getDuplicated()) {
//            JOptionPane.showMessageDialog(this, "El identificador ya existe", "Aviso",
//                    JOptionPane.WARNING_MESSAGE);
//            jtIdentificador.requestFocus();
//        }
    }//GEN-LAST:event_jtIdentificadorFocusLost

    private void btUnidadBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUnidadBuscarActionPerformed
        VwUnidad vwUnidad = new VwUnidad(this, true);
        vwUnidad.setSelectEnable(true);
        vwUnidad.setVisible(true);
        setUnidad(vwUnidad.getSelected());
    }//GEN-LAST:event_btUnidadBuscarActionPerformed

    private void jtUnidadIdentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtUnidadIdentKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            InvUnidad iu = null;
            try {
                iu = FactoryObject.getInstance().getUnidadController().find(jtUnidadIdent.getText().trim());
            } catch (BussinessException ex) {
                JOptionPane.showMessageDialog(this, "Error al buscar el regsitro", "ERROR", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (iu != null) {
                setUnidad(iu);
            } else {
                JOptionPane.showMessageDialog(this, "El registro no fue encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                jtUnidadDesc.setText(null);
                this.unidad = null;
            }
        }
    }//GEN-LAST:event_jtUnidadIdentKeyReleased

    public static void main(String[] args) {

        new VwPresentacion((JDialog) null, true).setVisible(true);

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
    private javax.swing.JButton btUnidadBuscar;
    private com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro> cbFiltro;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtDescripcion;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtFactor;
    private com.jadesoft.jadelib.estandar.textField.JSearchTextField jtFiltro;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtIdentificador;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtUnidadDesc;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtUnidadIdent;
    private javax.swing.JTabbedPane jtpStandard;
    private com.jadesoft.jadelib.estandar.tablas.TableStandar<InvPresentacion> tbFamilia;
    // End of variables declaration//GEN-END:variables
    private InvPresentacion presentacion;
    private Displacement<InvPresentacion> displacement;
    private boolean consultation;
    private InvUnidad unidad;

    private void initComp() {
        FactoryObject factory = new FactoryObjectImpl();
        FactoryObject.setInstance(factory);

        setGlassPane(new jGlassPane());
        tbFamilia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbFamilia.doLayout();
        tbFamilia.setModelStandar(new ModelPresentacion());
        tbFamilia.columnWidth(new Integer[]{100, 200, 80, 200});

        setElements();
        keyEvents();

        FiltroController filtro = new FiltroController();
        filtro.setFiltros(new String[]{"Identificador", "Descripción", "Factor", "Unidad"});
        cbFiltro.setElements(filtro.getFiltros());
        cbFiltro.setSelectedIndex(0);

        displacement = FactoryObject.getInstance().getDisplacement();

        jtpStandard.setSelectedIndex(1);
        jtpStandard.setEnabledAt(0, false);
        jtpStandard.setEnabledAt(1, true);
    }

    private void clean() {
        this.presentacion = null;
        this.unidad = null;
        jtIdentificador.setText("");
        jtDescripcion.setText("");
        jtFactor.setText("");
        jtUnidadDesc.setText("");
        jtUnidadIdent.setText("");
        jtIdentificador.requestFocus();
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
        b = jtpStandard.getSelectedIndex() == 0 && this.presentacion != null;
        btDelete.setEnabled(b);
    }

    private void consultation() {
        setToolBarAndPanel(1, true);
        setDisplacement(false);
        clean();
        fireTableDataChanged();
    }

    private void edit() {
        if (tbFamilia.getSelectedElement() != null) {
            setDisplacement(true);
            displacement.setDisplacement(tbFamilia.getElements());
            setElement(tbFamilia.getSelectedElement());
            setToolBarAndPanel(0, false);
        }
    }

    private void newElement() {
        setToolBarAndPanel(0, false);
        clean();
    }

    private void setDisplacement(boolean b) {
        btBack.setEnabled(b);
        btNext.setEnabled(b);
        btLast.setEnabled(b);
        btFirts.setEnabled(b);
    }

    private void delete() {
        if (this.presentacion != null) {
            int men = JOptionPane.showConfirmDialog(this,
                    "Desea eliminar el registro?", null,
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (men == JOptionPane.NO_OPTION) {
                return;
            }

            try {
                FactoryObject.getInstance().getPresentacionController().delete(this.presentacion.getCodigo());
            } catch (BussinessException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar borrar este regsitro", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            tbFamilia.removeElement(this.presentacion);
            clean();
            setToolBarAndPanel(1, true);
            fireTableDataChanged();
        }
    }

    private void print() {
        if (this.presentacion != null) {
            //codigo de imprimir
        }
    }

    private void setElements() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                getGlassPane().setVisible(true);
                try {
                    tbFamilia.setElements(FactoryObject.getInstance().getPresentacionController().findAll());
                } catch (BussinessException ex) {
                    JOptionPane.showMessageDialog(null, "Error al intentar recorrer los regsitros", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                getGlassPane().setVisible(false);
            }
        };
        new Thread(run).start();
    }

    private void save() {
        if (!validateField()) {
            return;
        }

        int men = JOptionPane.showConfirmDialog(this, this.presentacion == null ? "Desea guardar el nuevo registro?"
                : "Desea guardar los cambios?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (men == JOptionPane.NO_OPTION) {
            return;
        }

        InvPresentacion copyElement = this.presentacion;
        if (this.presentacion == null) {
            this.presentacion = new InvPresentacion();
        }

        this.presentacion.setDescripcion(jtDescripcion.getText());
        this.presentacion.setIdentificador(jtIdentificador.getText());
        this.presentacion.setFactor(Double.parseDouble(jtFactor.getText()));
        this.presentacion.setUnidad(this.unidad);

        if (copyElement == null || !this.presentacion.equals(copyElement)) {
            try {
                FactoryObject.getInstance().getPresentacionController().saveOrUpdate(this.presentacion);
            } catch (BussinessException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar guardar este regsitro", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VwPresentacion.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            tbFamilia.addElement(this.presentacion);
        }

        clean();
        fireTableDataChanged();
        setToolBarAndPanel(1, true);
    }

    private void fireTableDataChanged() {
        jtFiltro.setText("");
        tbFamilia.filterJTable(cbFiltro.getSelectedItem(), jtFiltro);
    }

    public void setSelectEnable(boolean enable) {
        consultation = enable;
    }

    public InvPresentacion getSelected() {
        return this.presentacion;
    }

    private void exit() {
        int men = JOptionPane.showConfirmDialog(this, "Desea salir?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (men == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    private void keyEvents() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(FactoryObject.getInstance().getKeyEventDespachador());
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
        JButton[] buttons = new JButton[]{btSave, btDelete, btNew, btPrint,
            btConsultation, btEdit, btFirts, btBack, btNext, btLast};

        int ks = 0;
        for (final JButton bt : buttons) {
            FactoryObject.getInstance().getKeyEventDespachador().addactionMap(
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

    private boolean validateField() {
        if (jtIdentificador.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Identificador no puede estar en blanco.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            jtIdentificador.requestFocus();
            return false;
        } else if (jtDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Descripción no puede estar en blanco.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            jtDescripcion.requestFocus();
            return false;
        } else if (jtFactor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Factor no puede estar en blanco.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            jtFactor.requestFocus();
            return false;
        } else if (this.unidad == null) {
            JOptionPane.showMessageDialog(this, "Unidad no puede estar en blanco.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            btUnidadBuscar.requestFocus();
            return false;
        }
        return true;
    }

    private void setElement(InvPresentacion presentacion) {
        if (presentacion != null) {
            this.presentacion = presentacion;
            jtIdentificador.setText(presentacion.getIdentificador());
            jtDescripcion.setText(presentacion.getDescripcion());
            jtFactor.setText(presentacion.getFactor() + "");
            setUnidad(presentacion.getUnidad());
            displacement.setCurrent(presentacion);
        }
    }

//    private void selectRow() {
//
//        if (familia != null) {
//            objectDisplacement.setRegistroActual(familia);
//            if (jtpStandard.getSelectedIndex() == 1) {
//
//                int row = 0;
//                for (InvFamilia f : tbFamilia.getElements()) {
//                    if (f.equals(familia)) {
//                        tbFamilia.changeSelection(row, 1, false, false);
//                        return;
//                    }
//                    row++;
//                }
//                return;
//            }
//        }
//
//        if (jtpStandard.getSelectedIndex() == 1 && tbFamilia.getSelectedRow() == -1) {
//            tbFamilia.changeSelection(0, 1, false, false);
//            objectDisplacement.setLista(tbFamilia.getElements());
//        }
//
//    }
    private void setUnidad(InvUnidad unidad) {
        if (unidad != null) {
            this.unidad = unidad;
            jtUnidadIdent.setText(unidad.getIdentificador());
            jtUnidadDesc.setText(unidad.getDescripcion());
        }
    }
}
