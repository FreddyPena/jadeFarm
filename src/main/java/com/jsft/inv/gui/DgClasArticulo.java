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
import com.jsft.inv.entity.ClasArticulo;
import com.jsft.inv.entity.ClasArticulo;
import com.jsft.inv.manager.ManejoClasArticulo;
import com.jsft.inv.tablemodel.ModeloClasArticulo;
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
public class DgClasArticulo extends javax.swing.JDialog {

    public DgClasArticulo(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    public DgClasArticulo(java.awt.Frame parent, boolean modal) {
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
        jtDescripcion = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClasArticulo = new com.jadesoft.jadelib.estandar.tablas.TableStandar<ClasArticulo>();
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
        setTitle("Registro de Clasificacion de Articulos");
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

        jXHeader1.setDescription("Registro y consulta de Clasificación de Artículos");
        jXHeader1.setDescriptionFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/icons/messenger_72.png"))); // NOI18N
        jXHeader1.setTitle("Registro Clasificación Artículos");
        jXHeader1.setTitleFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N

        jtpStandard.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N

        jXLabel2.setText("Identificador");
        jXLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtIdentificador.setDisabledTextColor(java.awt.Color.black);
        jtIdentificador.setName("45"); // NOI18N

        jXLabel3.setText("Descripción");
        jXLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jtDescripcion.setDisabledTextColor(java.awt.Color.black);
        jtDescripcion.setName("45"); // NOI18N

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
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(166, 166, 166))
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

        tbClasArticulo.setModel(new javax.swing.table.DefaultTableModel(
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
        tbClasArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClasArticuloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbClasArticulo);

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpStandard.addTab("Consulta", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jtpStandard, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tbClasArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClasArticuloMouseClicked
        objectDisplacement.setLista(tbClasArticulo.getElements());
        if (evt.getClickCount() == 2) {
            setElement(tbClasArticulo.getSelectedElement());
            if (!consultation) {
                setTablePanel(0, false);
                setToolBar(false);
                editableComponent(false);
            } else {
                dispose();
            }

        }
    }//GEN-LAST:event_tbClasArticuloMouseClicked

    private void jtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltroKeyReleased
        General.filtroTextField(cbFiltro.getSelectedItem(), jtFiltro, tbClasArticulo);
    }//GEN-LAST:event_jtFiltroKeyReleased

    public static void main(String[] args) {
        new DgClasArticulo((JDialog) null, true).setVisible(true);
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private javax.swing.JMenuItem jmpEdit;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtDescripcion;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtFiltro;
    private com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtIdentificador;
    private javax.swing.JTabbedPane jtpStandard;
    private com.jadesoft.jadelib.estandar.tablas.TableStandar<ClasArticulo> tbClasArticulo;
    // End of variables declaration//GEN-END:variables
    private KeyEventDespachador eventDispatcher;
    private ClasArticulo clasarticulo;
    private DesplazamientoObject<ClasArticulo> objectDisplacement;
    private boolean consultation;
    private boolean changeDisplacement = true;
    ManejoFiltro filtro = new ManejoFiltro();

    protected void setColumnaWith(int Column, int width) {
        tbClasArticulo.getColumnModel().getColumn(Column).setPreferredWidth(width);
    }

    protected void setTablePanel(int panel, boolean status) {
        jtpStandard.setSelectedIndex(panel);
        jtpStandard.setEnabledAt(0, !status);
        jtpStandard.setEnabledAt(1, status);
    }

    private void initComp() {
        setGlassPane(new jGlassPane());
        tbClasArticulo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbClasArticulo.doLayout();
        tbClasArticulo.setModelStandar(new ModeloClasArticulo());
        tbClasArticulo.setElements(ManejoClasArticulo.getInstance().findAll());
        setColumnaWith(0, 150);
        setColumnaWith(1, 348);
        filtro.agregarFiltro(0, "Identificador");
        filtro.agregarFiltro(1, "Descripción");
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
        clasarticulo = null;
        setDisplacement(true);
        cleanField();
    }

    private void cleanField() {
        jtIdentificador.setText("");
        jtDescripcion.setText("");
    }

    private void consultation() {
        setTablePanel(1, true);
        setToolBar(true);
        clean();
        fireTableDataChanged();
    }

    private void edit() {
        if (tbClasArticulo.getSelectedElement() != null) {
            setDisplacement(true);
            objectDisplacement.setLista(tbClasArticulo.getElements());
            setElement(tbClasArticulo.getSelectedElement());
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

        b = jtpStandard.getSelectedIndex() == 0 && clasarticulo != null;
        btDelete.setEnabled(b);
    }

    public void setDisplacement(boolean b) {
        btBack.setEnabled(b);
        btNext.setEnabled(b);
        btLast.setEnabled(b);
        btFirts.setEnabled(b);
    }

    private void delete() {
        if (clasarticulo != null) {
            int men = JOptionPane.showConfirmDialog(this, "Desea eliminar el nuevo registro?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.YES_OPTION) {
//                if (ManejoClasArticulo.getInstance().findDelete(clasarticulo) != null) {
//                    JOptionPane.showMessageDialog(null, "Existen artículos relacionados a esta ClasArticulo. No se puede borrar!", "Aviso",
//                            JOptionPane.WARNING_MESSAGE);
//                    return;
//                }
                ManejoClasArticulo.getInstance().delete(clasarticulo);
            }
            clean();
            setTablePanel(0, false);
            setToolBar(false);
            fireTableDataChanged();
            editableComponent(true);
        }
    }

    private void print() {
        if (clasarticulo != null) {
            //codigo de imprimir
        }
    }

    private void select() {
        if (changeDisplacement) {
            objectDisplacement = new DesplazamientoObject<>(tbClasArticulo.getElements());
            changeDisplacement = false;
        }
        setElement(tbClasArticulo.getSelectedElement());
    }

    protected void setElements() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                getGlassPane().setVisible(true);
                tbClasArticulo.setElements(ManejoClasArticulo.getInstance().findAll());
                getGlassPane().setVisible(false);
            }
        };
        new Thread(run).start();
    }

    private void save() {
        if (!validateField()) {
            return;
        }

        int men = JOptionPane.showConfirmDialog(this, clasarticulo == null ? "Desea guardar el nuevo registro?"
                : "Desea guardar los cambios?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (men == JOptionPane.NO_OPTION) {
            return;
        }

        if (clasarticulo == null) {
            clasarticulo = new ClasArticulo();
        }

        clasarticulo.setDescripcion(jtDescripcion.getText());
        clasarticulo.setIdentificador(jtIdentificador.getText());

        ManejoClasArticulo.getInstance().create(clasarticulo);
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
        General.filtroTextField(cbFiltro.getSelectedItem(), jtFiltro, tbClasArticulo);
    }

    public void setSelectEnable(boolean enable) {
        consultation = enable;
    }

    public ClasArticulo getSelected() {
        return clasarticulo;
    }

    private void disposeConsultation() {
        if (consultation && clasarticulo != null) {
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
        } else if (jtDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Descripción no puede estar en blanco.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            jtDescripcion.requestFocus();
            return false;
        }
        return true;
    }

    private void setElement(ClasArticulo clasarticulo) {
        selectRow();
        if (clasarticulo != null) {
            this.clasarticulo = clasarticulo;
            jtIdentificador.setText(clasarticulo.getIdentificador());
            jtDescripcion.setText(clasarticulo.getDescripcion());
            editableComponent(false);

            //  objectDisplacement.setRegistroActual(clasarticulo);           
        }
    }

    private void selectRow() {

        if (clasarticulo != null) {
            objectDisplacement.setRegistroActual(clasarticulo);
            if (jtpStandard.getSelectedIndex() == 1) {

                int row = 0;
                for (ClasArticulo f : tbClasArticulo.getElements()) {
                    if (f.equals(clasarticulo)) {
                        tbClasArticulo.changeSelection(row, 1, false, false);
                        return;
                    }
                    row++;
                }
                return;
            }
        }

        if (jtpStandard.getSelectedIndex() == 1 && tbClasArticulo.getSelectedRow() == -1) {
            tbClasArticulo.changeSelection(0, 1, false, false);
            objectDisplacement.setLista(tbClasArticulo.getElements());
            return;
        }

    }

    public void editableComponent(boolean editable) {
        jtIdentificador.setEditable(editable);
    }
}
