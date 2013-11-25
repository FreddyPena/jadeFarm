/*
 * Formulario para mantenimiento de Empleado
 * sistema jadeLab
 */
package com.jsft.gen.gui;

import com.jadesoft.jadelib.estandar.panel.jGlassPane;
import com.jadesoft.jadelib.generales.Filtro;
import com.jadesoft.jadelib.generales.ManejoFiltro;
import com.jadesoft.jadelib.generales.DesplazamientoObject;
import com.jadesoft.jadelib.generales.General;
import com.jadesoft.jadelib.generales.KeyEventDespachador;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;

/**
 *
 * @author yiyi
 * @param <T>
 */
public abstract class MantStandarTres<T> extends javax.swing.JDialog {

    public MantStandarTres(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    public MantStandarTres(java.awt.Frame parent, boolean modal) {
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
        btCancel = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btConsultation = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btSelect = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btFirts = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtpElements = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtDescripcion = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jtIdentificador = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbElements = new com.jadesoft.jadelib.estandar.tablas.TableStandar<T>();
        cbFiltro = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro>();
        jtFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiNew = new javax.swing.JMenuItem();
        jmiCancel = new javax.swing.JMenuItem();
        jmiSave = new javax.swing.JMenuItem();
        jmiConsultation = new javax.swing.JMenuItem();
        jmiDelete = new javax.swing.JMenuItem();
        jmiEdit = new javax.swing.JMenuItem();
        jmiSelect = new javax.swing.JMenuItem();
        jmiPrint = new javax.swing.JMenuItem();

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
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/new.png"))); // NOI18N
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
        btSave.setEnabled(false);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);

        btConsultation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/consulta.png"))); // NOI18N
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

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/borrar.png"))); // NOI18N
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

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/editar.png"))); // NOI18N
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

        btSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/aplicar.png"))); // NOI18N
        btSelect.setToolTipText("Seleccionar [Ctrl + E]");
        btSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectActionPerformed(evt);
            }
        });
        jToolBar1.add(btSelect);

        btPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/imprimir.png"))); // NOI18N
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
        jToolBar1.add(jSeparator3);

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
        btNext.setToolTipText("Registro Siguiente [Ctrl + N]");
        btNext.setEnabled(false);
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        jToolBar1.add(btNext);

        btLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/final.png"))); // NOI18N
        btLast.setToolTipText("Último Registro [Ctrl + L]");
        btLast.setEnabled(false);
        btLast.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });
        jToolBar1.add(btLast);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(java.awt.Color.white);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Identificador");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Descripción");

        jtDescripcion.setName("100"); // NOI18N

        jtIdentificador.setName("7"); // NOI18N
        jtIdentificador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdentificadorFocusLost(evt);
            }
        });
        jtIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIdentificadorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jtpElements.addTab("Registro", jPanel3);

        jPanel2.setBackground(java.awt.Color.white);

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
        tbElements.setComponentPopupMenu(jPopupMenu1);
        tbElements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbElementsMouseClicked(evt);
            }
        });
        tbElements.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbElementsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbElements);

        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        jtFiltro.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jtFiltro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtFiltroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtFiltroFocusLost(evt);
            }
        });
        jtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltroKeyReleased(evt);
            }
        });

        jLabel2.setText("Criterio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpElements.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpElements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpElements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jmiNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmiNew.setText("Nuevo");
        jmiNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewActionPerformed(evt);
            }
        });
        jMenu1.add(jmiNew);

        jmiCancel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jmiCancel.setText("Cancelar");
        jmiCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCancelActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCancel);

        jmiSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiSave.setText("Guardar");
        jmiSave.setEnabled(false);
        jmiSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSave);

        jmiConsultation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmiConsultation.setText("Buscar");
        jmiConsultation.setEnabled(false);
        jmiConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultationActionPerformed(evt);
            }
        });
        jMenu1.add(jmiConsultation);

        jmiDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmiDelete.setText("Borrar");
        jmiDelete.setEnabled(false);
        jmiDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeleteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiDelete);

        jmiEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmiEdit.setText("Editar");
        jmiEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEdit);

        jmiSelect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmiSelect.setText("Seleccionar");
        jmiSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSelectActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSelect);

        jmiPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmiPrint.setText("Imprimir");
        jmiPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrintActionPerformed(evt);
            }
        });
        jMenu1.add(jmiPrint);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        cleanElement();
        fireTableDataChanged();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        saveElemen();
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

    private void btSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectActionPerformed
        disposeConsultation();
    }//GEN-LAST:event_btSelectActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(eventDispatcher);
    }//GEN-LAST:event_formWindowClosed

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        jtFiltro.requestFocus();
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void jtFiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtFiltroFocusGained
        jtFiltro.selectAll();
        General.gainedFocus(jtFiltro);
    }//GEN-LAST:event_jtFiltroFocusGained

    private void jtFiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtFiltroFocusLost
        General.lostFocus(jtFiltro);
    }//GEN-LAST:event_jtFiltroFocusLost

    private void jtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltroKeyReleased
        General.filtroTextField(cbFiltro.getSelectedItem(), jtFiltro, tbElements);
    }//GEN-LAST:event_jtFiltroKeyReleased

    private void tbElementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbElementsMouseClicked
        selectElement();
        if (evt.getClickCount() > 1) {
            disposeConsultation();
        }
    }//GEN-LAST:event_tbElementsMouseClicked

    private void tbElementsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbElementsKeyReleased
        selectElement();
    }//GEN-LAST:event_tbElementsKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        newElement();
    }//GEN-LAST:event_btNewActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        deleteElement();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        printElements();
    }//GEN-LAST:event_btPrintActionPerformed

    private void btConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultationActionPerformed
        consultationElement();
    }//GEN-LAST:event_btConsultationActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        editElement();
    }//GEN-LAST:event_btEditActionPerformed

    private void jmiNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewActionPerformed
        newElement();
    }//GEN-LAST:event_jmiNewActionPerformed

    private void jmiCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCancelActionPerformed
        cleanElement();
    }//GEN-LAST:event_jmiCancelActionPerformed

    private void jmiSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSaveActionPerformed
        saveElemen();
    }//GEN-LAST:event_jmiSaveActionPerformed

    private void jmiConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultationActionPerformed
        consultationElement();
    }//GEN-LAST:event_jmiConsultationActionPerformed

    private void jmiDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeleteActionPerformed
        deleteElement();
    }//GEN-LAST:event_jmiDeleteActionPerformed

    private void jmiEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditActionPerformed
        editElement();
    }//GEN-LAST:event_jmiEditActionPerformed

    private void jmiSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSelectActionPerformed
        disposeConsultation();
    }//GEN-LAST:event_jmiSelectActionPerformed

    private void jmiPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrintActionPerformed
        printElements();
    }//GEN-LAST:event_jmiPrintActionPerformed

    private void jmpEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmpEditActionPerformed
        editElement();
    }//GEN-LAST:event_jmpEditActionPerformed

    private void jtIdentificadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdentificadorFocusLost
        if (element == null) {
            if (identifier(jtIdentificador.getText()) != null) {
                JOptionPane.showMessageDialog(this, "Este Identificador ya existe");
                jtIdentificador.requestFocus();
            }
        }
    }//GEN-LAST:event_jtIdentificadorFocusLost

    private void jtIdentificadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdentificadorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtDescripcion.requestFocus();
        }
    }//GEN-LAST:event_jtIdentificadorKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btConsultation;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btFirts;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrint;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSelect;
    private com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro> cbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmiCancel;
    private javax.swing.JMenuItem jmiConsultation;
    private javax.swing.JMenuItem jmiDelete;
    private javax.swing.JMenuItem jmiEdit;
    private javax.swing.JMenuItem jmiNew;
    private javax.swing.JMenuItem jmiPrint;
    private javax.swing.JMenuItem jmiSave;
    private javax.swing.JMenuItem jmiSelect;
    private javax.swing.JMenuItem jmpEdit;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtDescripcion;
    private javax.swing.JTextField jtFiltro;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtIdentificador;
    private javax.swing.JTabbedPane jtpElements;
    protected com.jadesoft.jadelib.estandar.tablas.TableStandar<T> tbElements;
    // End of variables declaration//GEN-END:variables
    private KeyEventDespachador eventDispatcher;
    protected T element;
    protected DesplazamientoObject<T> objectDisplacement;
    private boolean consultation;
    private boolean saveExit;
    protected boolean changeDisplacement = true;
    private boolean exit;

    public boolean isExit() {
        return exit;
    }

    protected void setColumnaWith(int Column, int width) {
        tbElements.getColumnModel().getColumn(Column).setPreferredWidth(width);
    }

    private void setTablePanel(int panel, boolean status) {
        jtpElements.setSelectedIndex(panel);
        jtpElements.setEnabledAt(0, !status);
        jtpElements.setEnabledAt(1, status);
    }

    private void initComp() {
        setGlassPane(new jGlassPane());
        setTablePanel(1, true);
        tbElements.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbElements.doLayout();
        keyEvents();
        objectDisplacement = new DesplazamientoObject<>();
        ManejoFiltro mf = new ManejoFiltro();
        mf.agregarFiltro(0, "Identificador");
        mf.agregarFiltro(1, "Descripción");
        mf.agregarFiltro(2, "Tipo");
        setManejoFiltro(mf);
        cbFiltro.setSelectedIndex(1);
        jtFiltro.requestFocus();
    }

    private void cleanElement() {
        element = null;
        setDisplacement(false);
        if (jtpElements.getSelectedIndex() == 0) {
            jtDescripcion.setText("");
            jtIdentificador.setText("");
            jtIdentificador.requestFocus();
        } else {
            jtFiltro.setText(null);
            jtFiltro.requestFocus();
        }
    }

    private void consultationElement() {
        setTablePanel(1, true);
        setToolBar(true);
        cleanElement();
    }

    private void editElement() {
        if (tbElements.getSelectedElement() != null) {
            setDisplacement(true);
            setElement(tbElements.getSelectedElement());
            setTablePanel(0, false);
            setToolBar(false);

        }
    }

    private void newElement() {
        setTablePanel(0, false);
        setToolBar(false);
        cleanElement();
    }

    private void setToolBar(boolean b) {
        btConsultation.setEnabled(!b);
        btSave.setEnabled(!b);
        btNew.setEnabled(b);
        btSelect.setEnabled(b);
        btEdit.setEnabled(b);

        jmiConsultation.setEnabled(!b);
        jmiSave.setEnabled(!b);
        jmiNew.setEnabled(b);
        jmiSelect.setEnabled(b);
        jmiEdit.setEnabled(b);

        b = jtpElements.getSelectedIndex() == 0 && element != null;
        btDelete.setEnabled(b);
        jmiDelete.setEnabled(b);
    }

    public void setDisplacement(boolean b) {
        btBack.setEnabled(b);
        btNext.setEnabled(b);
        btLast.setEnabled(b);
        btFirts.setEnabled(b);
    }

    private void deleteElement() {
        if (element != null) {
            int men = JOptionPane.showConfirmDialog(this, "Desea eliminar el nuevo registro??", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.YES_OPTION) {
                deleteElement(element);
            }
            cleanElement();
            setTablePanel(1, true);
            setToolBar(true);
            fireTableDataChanged();
        }
    }

    private void printElements() {
        if (element != null) {
            printElements(element);
        }
    }

    private void setManejoFiltro(ManejoFiltro mf) {
        cbFiltro.setElements(mf.getLists());
    }

    private void selectElement() {
        if (changeDisplacement) {
            objectDisplacement = new DesplazamientoObject<>(tbElements.getElements());
            changeDisplacement = false;
        }
        setElement(tbElements.getSelectedElement());
    }

    private boolean validateFields() {
        if (jtIdentificador.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Debes especificar un Identificador");
            jtIdentificador.requestFocus();
            return false;
        }
        if (jtDescripcion.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Debes especificar la Descripción");
            jtDescripcion.requestFocus();
            return false;
        }
        return true;
    }

    protected abstract void saveElement();

    protected abstract void setElement(T element);

    protected abstract List<T> findAll();

    protected abstract void deleteElement(T element);

    protected abstract void printElements(T element);

    protected abstract T identifier(String identifier);

    protected void setElements() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                getGlassPane().setVisible(true);
                tbElements.setElements(findAll());
                getGlassPane().setVisible(false);
            }
        };
        new Thread(run).start();
    }

    private void saveElemen() {
        if (!validateFields()) {
            saveExit = false;
            return;
        }
        if (!saveExit) {
            int men = JOptionPane.showConfirmDialog(this, element == null ? "Desea guardar el nuevo registro?"
                    : "Desea guardar los cambios?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.NO_OPTION) {
                cleanElement();
                return;
            } else if (men == JOptionPane.CANCEL_OPTION) {
                return;
            }
        }
        saveElement();
        changeDisplacement = true;
        cleanElement();
        fireTableDataChanged();
        setTablePanel(1, true);
        setToolBar(true);
    }

    private void fireTableDataChanged() {
        setElements();
        jtFiltro.setText("");
        General.filtroTextField(cbFiltro.getSelectedItem(), jtFiltro, tbElements);
    }

    public void setSelectEnable(boolean enable) {
        btSelect.setEnabled(enable);
        consultation = enable;
    }

    public T getSelected() {
        return element;
    }

    private void disposeConsultation() {
        if (consultation && element != null) {
            dispose();
        }
    }

    private void exit() {
        if (jtDescripcion.getText().length() > 0 || element != null) {
            int men = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.YES_OPTION) {
                saveExit = true;
                saveElemen();
                if (saveExit) {
                    dispose();
                }
            } else if (men == JOptionPane.NO_OPTION) {
                exit = true;
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
                    cleanElement();
                }
            }
        });

        KeyStroke save = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(save, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btSave.isEnabled()) {
                    saveElemen();
                }
            }
        });

        KeyStroke select = KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(select, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btSelect.isEnabled()) {
                    disposeConsultation();
                }
            }
        });

        KeyStroke delete = KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(delete, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btDelete.isEnabled()) {
                    deleteElement();
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
                if (btSelect.isEnabled()) {
                    printElements();
                }
            }
        });
        KeyStroke consultatio = KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(consultatio, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btConsultation.isEnabled()) {
                    consultationElement();
                }
            }
        });

        KeyStroke edit = KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(edit, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btEdit.isEnabled()) {
                    editElement();
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
