package com.jsft.sys.gui.consultaStandar;

import com.jadesoft.jadelib.estandar.panel.jGlassPane;
import com.jadesoft.jadelib.generales.Filtro;
import com.jadesoft.jadelib.generales.ManejoFiltro;
import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.jadesoft.jadelib.generales.General;
import com.jadesoft.jadelib.generales.KeyEventDespachador;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

/**
 *
 * @author yiyi
 */
public abstract class DgConsultaStandar<T> extends javax.swing.JDialog {

    public DgConsultaStandar(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initComp();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        JtxtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbFiltro = new com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro>();
        jLabel3 = new javax.swing.JLabel();
        dpFechaFin = new org.jdesktop.swingx.JXDatePicker();
        dpFechaIni = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btCancel = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btSelect = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btUpdate = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbElements = new com.jadesoft.jadelib.estandar.tablas.TableStandar<T>();
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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 0, 14))); // NOI18N

        JtxtFiltro.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        JtxtFiltro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtxtFiltroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtxtFiltroFocusLost(evt);
            }
        });
        JtxtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JtxtFiltroKeyReleased(evt);
            }
        });

        jLabel1.setText("Criterio");

        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Fin");

        dpFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpFechaFinActionPerformed(evt);
            }
        });

        dpFechaIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpFechaIniActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Ini.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JtxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(dpFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(dpFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator1);

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/cancelar.png"))); // NOI18N
        btCancel.setToolTipText("Cancelar [Ctrl + C]");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancel);

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/editar.png"))); // NOI18N
        btEdit.setToolTipText("Editar [Ctrl + M]");
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
        jToolBar1.add(jSeparator5);

        btUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jadesoft/jadeOther/imagenes/actualizar.png"))); // NOI18N
        btUpdate.setToolTipText("Actualizar [Ctrl + U]");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        jToolBar1.add(btUpdate);
        jToolBar1.add(jSeparator3);

        tbElements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jScrollPane1.setViewportView(tbElements);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtxtFiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtxtFiltroFocusGained
        JtxtFiltro.selectAll();
        General.gainedFocus(JtxtFiltro);
    }//GEN-LAST:event_JtxtFiltroFocusGained

    private void JtxtFiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtxtFiltroFocusLost
        General.lostFocus(JtxtFiltro);
    }//GEN-LAST:event_JtxtFiltroFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(eventDispatcher);
    }//GEN-LAST:event_formWindowClosed

    private void JtxtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtxtFiltroKeyReleased
        setElements();
        General.filtroTextField(cbFiltro.getSelectedItem(), JtxtFiltro, tbElements);
    }//GEN-LAST:event_JtxtFiltroKeyReleased

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        clean();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(eventDispatcher);
        edit();
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(eventDispatcher);
    }//GEN-LAST:event_btEditActionPerformed

    private void btSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectActionPerformed
        select(true);
    }//GEN-LAST:event_btSelectActionPerformed

    private void tbElementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbElementsMouseClicked
        select(false);
        if (evt.getClickCount() > 1) {
            this.dispose();
        }
    }//GEN-LAST:event_tbElementsMouseClicked

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        JtxtFiltro.requestFocus();
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void dpFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpFechaFinActionPerformed
        setElements();
        JtxtFiltro.requestFocus();
    }//GEN-LAST:event_dpFechaFinActionPerformed

    private void dpFechaIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpFechaIniActionPerformed
        setElements();
        JtxtFiltro.requestFocus();
    }//GEN-LAST:event_dpFechaIniActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        setElements();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
    }//GEN-LAST:event_formWindowClosing
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtxtFiltro;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btSelect;
    private javax.swing.JButton btUpdate;
    protected com.jadesoft.jadelib.estandar.combobox.ComboBoxStandar<Filtro> cbFiltro;
    protected org.jdesktop.swingx.JXDatePicker dpFechaFin;
    protected org.jdesktop.swingx.JXDatePicker dpFechaIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    protected com.jadesoft.jadelib.estandar.tablas.TableStandar<T> tbElements;
    // End of variables declaration//GEN-END:variables
    private KeyEventDespachador eventDispatcher;
    protected T element;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private int tipo = 1;

    protected void setColumnaWith(int Column, int width) {
        tbElements.getColumnModel().getColumn(Column).setPreferredWidth(width);
    }

    public List<T> getElementsList() {
        return tbElements.getElements();
    }

    public T getSelectedElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    private void clean() {
        this.element = null;
        JtxtFiltro.setText("");
        General.filtroTextField(cbFiltro.getSelectedItem(), JtxtFiltro, tbElements);
        dpFechaFin.setDate(new Date());
        JtxtFiltro.requestFocus();
    }

    private void initComp() {
        setGlassPane(new jGlassPane());
        keyEvents();
        JtxtFiltro.requestFocus();
        dpFechaFin.setFormats(format);
        dpFechaIni.setFormats(format);
        dpFechaFin.setDate(new Date());
    }

    protected void setModel(TableModelStandar<T> model) {
        tbElements.setModelStandar(model);
    }

    protected void setManejoFiltro(ManejoFiltro mf) {
        cbFiltro.setElements(mf.getLists());
    }

    protected abstract void edit();

    protected abstract List<T> findAll();

    private void select(boolean b) {
        if (tbElements.getSelectedRow() > -1) {
            element = tbElements.getSelectedElement();
            if (b) {
                dispose();
            }
        } else {
            element = null;
        }
    }

    public void setEditEnable(boolean editar) {
        btEdit.setEnabled(editar);
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

        KeyStroke edit = KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(edit, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btEdit.isEnabled()) {
                    edit();
                }
            }
        });

        KeyStroke select = KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(select, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btSelect.isEnabled()) {
                    select(true);
                }
            }
        });

        KeyStroke update = KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK);
        eventDispatcher.addactionMap(update, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btUpdate.isEnabled()) {
                    setElements();
                }
            }
        });

    }

    private void setElements() {
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
        setElements();
    }
}
