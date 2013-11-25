/*
 * Formulario para mantenimiento de Empleado
 * sistema jadeLab
 */
package com.jsft.sys.gui.mantenimientoStandar;

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
 */
public abstract class MantStandarUno<T> extends javax.swing.JDialog {

    public MantStandarUno(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    public MantStandarUno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        initComp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btCancel = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btSelect = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btFirts = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbElements = new com.jadesoft.jadelib.estandar.tablas.TableStandar<T>();
        cbFiltro = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro>();
        jtFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbAbreviatura = new javax.swing.JLabel();
        jtDescripcion = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jtAbreviatura = new com.jadesoft.jadelib.estandar.textField.TextFieldStandar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

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
        jToolBar1.add(jSeparator1);

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

        btSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/aplicar.png"))); // NOI18N
        btSelect.setToolTipText("Seleccionar [Ctrl + E]");
        btSelect.setEnabled(false);
        btSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectActionPerformed(evt);
            }
        });
        jToolBar1.add(btSelect);
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

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtFiltro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Código");

        jlCodigo.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jlCodigo.setForeground(java.awt.Color.red);
        jlCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCodigo.setText("-");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Descripción");

        lbAbreviatura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbAbreviatura.setText("Abreviatura");

        jtDescripcion.setName("45"); // NOI18N

        jtAbreviatura.setName("5"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAbreviatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtAbreviatura, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbAbreviatura)
                    .addComponent(jtAbreviatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigo)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        clean();
        fireTableDataChanged();
    }//GEN-LAST:event_btCancelActionPerformed

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
        select();
        if (evt.getClickCount() > 1) {
            disposeConsultation();
        }
    }//GEN-LAST:event_tbElementsMouseClicked

    private void tbElementsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbElementsKeyReleased
        select();
    }//GEN-LAST:event_tbElementsKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btFirts;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNext;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    protected javax.swing.JLabel jlCodigo;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtAbreviatura;
    protected com.jadesoft.jadelib.estandar.textField.TextFieldStandar jtDescripcion;
    private javax.swing.JTextField jtFiltro;
    protected javax.swing.JLabel lbAbreviatura;
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

    private void initComp() {
        setGlassPane(new jGlassPane());
        lbAbreviatura.setVisible(false);
        jtAbreviatura.setVisible(false);
        tbElements.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbElements.doLayout();
        keyEvents();
        objectDisplacement = new DesplazamientoObject<>();
        ManejoFiltro mf = new ManejoFiltro();
        mf.agregarFiltro(0, "Código");
        mf.agregarFiltro(1, "Descripción");
        setManejoFiltro(mf);
        cbFiltro.setSelectedIndex(1);
        jtDescripcion.requestFocus();
    }

    private void clean() {
        element = null;
        jlCodigo.setText("-");
        jtDescripcion.setText("");
        jtAbreviatura.setText("");
        setDisplacement(false);
    }

  

    private void setManejoFiltro(ManejoFiltro mf) {
        cbFiltro.setElements(mf.getLists());
    }

    private void select() {
        if (changeDisplacement) {
            objectDisplacement = new DesplazamientoObject<>(tbElements.getElements());
            changeDisplacement = false;
        }
        setDisplacement(true);
        setElement(tbElements.getSelectedElement());
    }

    private boolean validateFields() {
        if (jtDescripcion.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Debes especificar el Nombre");
            jtDescripcion.requestFocus();
            return false;
        }
        return true;
    }

    protected abstract void saveElement();

    protected abstract void setElement(T element);

    protected abstract List<T> findAll();

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

    private void save() {
        if (!validateFields()) {
            saveExit = false;
            return;
        }
        if (!saveExit) {
            int men = JOptionPane.showConfirmDialog(this, element == null ? "Desea guardar el nuevo registro?"
                    : "Desea guardar los cambios?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (men == JOptionPane.NO_OPTION) {
                clean();
                return;
            } else if (men == JOptionPane.CANCEL_OPTION) {
                return;
            }
        }
        saveElement();
        changeDisplacement = true;
        clean();
        fireTableDataChanged();
    }

    private void fireTableDataChanged() {
        setElements();
        jtFiltro.setText("");
        General.filtroTextField(cbFiltro.getSelectedItem(), jtFiltro, tbElements);
    }

    public void setDisplacement(boolean aFlag) {
        btBack.setEnabled(aFlag);
        btNext.setEnabled(aFlag);
        btLast.setEnabled(aFlag);
        btFirts.setEnabled(aFlag);
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
                save();
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
                    clean();
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

        KeyStroke select = KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(select, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btSelect.isEnabled()) {
                    disposeConsultation();
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
