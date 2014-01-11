/*
 * Formulario para mantenimiento de Empleado
 * sistema jadeLab
 */
package com.js.inv.views;

import com.js.controller.component.ComponentObject;
import com.js.exception.BussinessException;
import com.js.controller.displacement.Displacement;
import com.js.controller.keyevent.KeyEventDispatcherJS;
import com.js.swing.table.filter.FilterTable;
import com.js.swing.table.filter.FilterTableController;
import com.js.inv.tablesmodel.ModelRenglon;
import com.js.shared.factory.FactoryObject;
import com.js.shared.factory.FactoryObjectImpl;
import com.js.shared.models.InvRenglon;
import com.js.swing.panel.JGlassPaneJS;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import com.js.swing.button.JButtonJS;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;

/**
 *
 * @author JADESOFT
 */
public class VwRenglon extends javax.swing.JDialog {

    public VwRenglon(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    public VwRenglon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        jtpStandard = new javax.swing.JTabbedPane();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jtIdentificador = new com.js.swing.textfield.JTextFieldJS();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jtDescripcion = new com.js.swing.textfield.JTextFieldJS();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbElements = new com.js.swing.table.JTableJS<InvRenglon>();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        cbFilter = new com.js.swing.combobox.JComboBoxJS<FilterTable>();
        jtFilter = new com.js.swing.textfield.JTextFieldSearchJS();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        jXHeader1.setDescription("Registro y consulta de Renglon");
        jXHeader1.setDescriptionFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/messenger_72.png"))); // NOI18N
        jXHeader1.setTitle("Registro Renglon");
        jXHeader1.setTitleFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N

        jtpStandard.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N

        jXLabel2.setText("Identificador");
        jXLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtIdentificador.setDisabledTextColor(java.awt.Color.black);
        jtIdentificador.setJsLength(6);

        jXLabel3.setText("Descripción");
        jXLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtDescripcion.setDisabledTextColor(java.awt.Color.black);

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jtpStandard.addTab("Registro", jXPanel1);

        tbElements.setModel(new javax.swing.table.DefaultTableModel(
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
        tbElements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbElementsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbElements);

        jXLabel5.setText("Criterio");
        jXLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/zoom_20.png"))); // NOI18N
        jtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFilterKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtpStandard.addTab("Consulta", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jXHeader1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
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

    private void tbElementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbElementsMouseClicked
        if (evt.getClickCount() == 2) {
            if (!consultation) {
                edit();
            } else {
                this.element = tbElements.getSelectedElement();
                dispose();
            }
        }
    }//GEN-LAST:event_tbElementsMouseClicked

    private void jtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFilterKeyReleased
        tbElements.filterJTable(cbFilter.getSelectedItem(), jtFilter);
    }//GEN-LAST:event_jtFilterKeyReleased

    public static void main(String[] args) {

        new VwRenglon((JDialog) null, true).setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.js.swing.button.JButtonJS btBack;
    private com.js.swing.button.JButtonJS btConsultation;
    private com.js.swing.button.JButtonJS btDelete;
    private com.js.swing.button.JButtonJS btEdit;
    private com.js.swing.button.JButtonJS btFirts;
    private com.js.swing.button.JButtonJS btLast;
    private com.js.swing.button.JButtonJS btNew;
    private com.js.swing.button.JButtonJS btNext;
    private com.js.swing.button.JButtonJS btPrint;
    private com.js.swing.button.JButtonJS btSave;
    private com.js.swing.combobox.JComboBoxJS<FilterTable> cbFilter;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private com.js.swing.textfield.JTextFieldJS jtDescripcion;
    private com.js.swing.textfield.JTextFieldSearchJS jtFilter;
    private com.js.swing.textfield.JTextFieldJS jtIdentificador;
    private javax.swing.JTabbedPane jtpStandard;
    private com.js.swing.table.JTableJS<InvRenglon> tbElements;
    // End of variables declaration//GEN-END:variables
    private InvRenglon element;
    private Displacement<InvRenglon> displacement;
    private boolean consultation;
    private boolean change;

    private void initComp() {
        FactoryObject factory = new FactoryObjectImpl();
        FactoryObject.setInstance(factory);

        setGlassPane(new JGlassPaneJS());
        tbElements.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbElements.doLayout();
        tbElements.setModelJS(new ModelRenglon());
        tbElements.columnWidth(new Integer[]{150, 325});

        setElements();
        keyEvents();

        FilterTableController filtro = new FilterTableController();
        filtro.setlFilterTable(new String[]{"Identificador", "Descripción"});
        cbFilter.setElements(filtro.getlFilterTable());
        cbFilter.setSelectedIndex(0);

        displacement = FactoryObject.getInstance().getDisplacement();

        jtpStandard.setSelectedIndex(1);
        jtpStandard.setEnabledAt(0, false);
        jtpStandard.setEnabledAt(1, true);
        ComponentObject.disabled(btSave, btConsultation, btDelete, btFirts, btLast, btBack, btNext);
    }

    private void clean() {
        this.element = null;
        ComponentObject.clean(jtDescripcion, jtIdentificador);
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
        if (tbElements.getSelectedElement() != null) {
            setDisplacement(true);
            displacement.setDisplacement(tbElements.getElements());
            setElement(tbElements.getSelectedElement());
            setToolBarAndPanel(0, false);
        }
    }

    private void newElement() {
        setToolBarAndPanel(0, false);
        clean();
    }

    private void setDisplacement(boolean b) {
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
                FactoryObject.getInstance().getRenglonController().delete(this.element.getCodigo());
            } catch (BussinessException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar borrar este regsitro", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VwRenglon.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            change = true;
            tbElements.removeElement(this.element);
            clean();
            setToolBarAndPanel(1, true);
            fireTableDataChanged();
            setDisplacement(false);
        }
    }

    private void print() {
        if (this.element != null) {
            //codigo de imprimir
        }
    }

    private void setElements() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                getGlassPane().setVisible(true);
                try {
                    tbElements.setElements(FactoryObject.getInstance().getRenglonController().findAll());
                } catch (BussinessException ex) {
                    JOptionPane.showMessageDialog(null, "Error al intentar recorrer los regsitros", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(VwRenglon.class.getName()).log(Level.SEVERE, null, ex);
                }
                getGlassPane().setVisible(false);
            }
        };
        new Thread(run).start();
    }

    private void save() {
        if (!ComponentObject.validate(jtIdentificador, jtDescripcion)) {
            return;
        }

        int men = JOptionPane.showConfirmDialog(this, this.element == null ? "Desea guardar el nuevo registro?"
                : "Desea guardar los cambios?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (men == JOptionPane.NO_OPTION) {
            return;
        }

        InvRenglon copyElement = this.element;
        if (this.element == null) {
            this.element = new InvRenglon();
        }

        this.element.setDescripcion(jtDescripcion.getText());
        this.element.setIdentificador(jtIdentificador.getText());

        try {
            FactoryObject.getInstance().getRenglonController().saveOrUpdate(this.element);
        } catch (BussinessException ex) {
            JOptionPane.showMessageDialog(this, "Error al intentar guardar este regsitro", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(VwRenglon.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        if (copyElement == null) {
            tbElements.addElement(this.element);
        }
        change = true;
        clean();
        fireTableDataChanged();
        setToolBarAndPanel(1, true);
        setDisplacement(false);
    }

    private void fireTableDataChanged() {
        jtFilter.setText("");
        tbElements.filterJTable(cbFilter.getSelectedItem(), jtFilter);
    }

    public void setSelectEnable(boolean enable) {
        consultation = enable;
    }

    public InvRenglon getSelected() {
        return this.element;
    }

    public boolean getChange() {
        return change;
    }

    private void exit() {
        int men = JOptionPane.showConfirmDialog(this, "Desea salir?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (men == JOptionPane.YES_OPTION) {
            KeyEventDispatcherJS.remove();
            dispose();
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

    private void setElement(InvRenglon element) {
        if (element != null) {
            this.element = element;
            jtIdentificador.setText(element.getIdentificador());
            jtDescripcion.setText(element.getDescripcion());
            displacement.setCurrent(element);
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
}
