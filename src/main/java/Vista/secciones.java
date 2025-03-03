
package Vista;

import com.Vista.secciones.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import Pedido.Factura.PedidoModal;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class secciones extends javax.swing.JFrame {


    public secciones() {
        initComponents();
        iniMesas();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    /*private void toggleBarra() {
    int targetWidth = Barra.isVisible() ? 0 : 250;
    new Thread(() -> {
        try {
            int step = Barra.isVisible() ? -10 : 10;
            int width = Barra.getWidth();
            while ((step < 0 && width > targetWidth) || (step > 0 && width < targetWidth)) {
                width += step;
                Barra.setPreferredSize(new Dimension(width, getHeight()));
                Barra.revalidate();
                Thread.sleep(10);
            }
            Barra.setVisible(targetWidth > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
   
}
*/
    private void iniMesas(){
        inicio(new Mesas());
    }
    
    private void inicio(JPanel in){
        in.setPreferredSize(null); 
        in.setSize(Principal.getWidth(), Principal.getHeight());
        Principal.setLayout(new BorderLayout());
        Principal.removeAll();
        Principal.add(in, BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BarraDespliege = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        BotonMesas = new javax.swing.JButton();
        BotonGestion = new javax.swing.JButton();
        panelGestion = new javax.swing.JPanel();
        BotonGastos = new javax.swing.JButton();
        BotonMobiliario = new javax.swing.JButton();
        BotonUsuarios = new javax.swing.JButton();
        BotonMenu = new javax.swing.JButton();
        BotonVentas = new javax.swing.JButton();
        Principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        BarraDespliege.setBackground(new java.awt.Color(204, 204, 204));
        BarraDespliege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarraDespliegeMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra-de-navegacion.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("RESTAURANTE Y ASADERO SAUSALITO");

        javax.swing.GroupLayout BarraDespliegeLayout = new javax.swing.GroupLayout(BarraDespliege);
        BarraDespliege.setLayout(BarraDespliegeLayout);
        BarraDespliegeLayout.setHorizontalGroup(
            BarraDespliegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraDespliegeLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(414, 414, 414)
                .addComponent(jLabel3)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        BarraDespliegeLayout.setVerticalGroup(
            BarraDespliegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraDespliegeLayout.createSequentialGroup()
                .addGroup(BarraDespliegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Barra.setBackground(new java.awt.Color(58, 179, 28));
        Barra.setPreferredSize(new java.awt.Dimension(915, 448));

        BotonMesas.setBackground(new java.awt.Color(58, 179, 28));
        BotonMesas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonMesas.setForeground(new java.awt.Color(255, 255, 255));
        BotonMesas.setText("Mesas");
        BotonMesas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonMesas.setBorderPainted(false);
        BotonMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMesas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMesas.setIconTextGap(10);
        BotonMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMesasActionPerformed(evt);
            }
        });

        BotonGestion.setBackground(new java.awt.Color(58, 179, 28));
        BotonGestion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonGestion.setForeground(new java.awt.Color(255, 255, 255));
        BotonGestion.setText("Gestion Del Restaurante");
        BotonGestion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonGestion.setBorderPainted(false);
        BotonGestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGestion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonGestion.setIconTextGap(10);
        BotonGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGestionMouseClicked(evt);
            }
        });
        BotonGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGestionActionPerformed(evt);
            }
        });

        panelGestion.setBackground(new java.awt.Color(58, 179, 28));
        panelGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGestionMouseClicked(evt);
            }
        });

        BotonGastos.setBackground(new java.awt.Color(58, 179, 28));
        BotonGastos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonGastos.setForeground(new java.awt.Color(255, 255, 255));
        BotonGastos.setText("Gastos");
        BotonGastos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonGastos.setBorderPainted(false);
        BotonGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGastos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonGastos.setIconTextGap(10);
        BotonGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGastosActionPerformed(evt);
            }
        });

        BotonMobiliario.setBackground(new java.awt.Color(58, 179, 28));
        BotonMobiliario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonMobiliario.setForeground(new java.awt.Color(255, 255, 255));
        BotonMobiliario.setText("Mobiliario");
        BotonMobiliario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonMobiliario.setBorderPainted(false);
        BotonMobiliario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMobiliario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMobiliario.setIconTextGap(10);
        BotonMobiliario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMobiliarioActionPerformed(evt);
            }
        });

        BotonUsuarios.setBackground(new java.awt.Color(58, 179, 28));
        BotonUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BotonUsuarios.setText("Usuarios");
        BotonUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonUsuarios.setBorderPainted(false);
        BotonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonUsuarios.setIconTextGap(10);
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });

        BotonMenu.setBackground(new java.awt.Color(58, 179, 28));
        BotonMenu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonMenu.setForeground(new java.awt.Color(255, 255, 255));
        BotonMenu.setText("Menú");
        BotonMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonMenu.setBorderPainted(false);
        BotonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMenu.setIconTextGap(10);
        BotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuActionPerformed(evt);
            }
        });

        BotonVentas.setBackground(new java.awt.Color(58, 179, 28));
        BotonVentas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonVentas.setForeground(new java.awt.Color(255, 255, 255));
        BotonVentas.setText("Ventas");
        BotonVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonVentas.setBorderPainted(false);
        BotonVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonVentas.setIconTextGap(10);
        BotonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGestionLayout = new javax.swing.GroupLayout(panelGestion);
        panelGestion.setLayout(panelGestionLayout);
        panelGestionLayout.setHorizontalGroup(
            panelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonMobiliario, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGestionLayout.setVerticalGroup(
            panelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionLayout.createSequentialGroup()
                .addComponent(BotonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonMobiliario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelGestion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BotonMesas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BarraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(720, 720, 720))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BotonMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BarraDespliege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BarraDespliege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMesasActionPerformed
        inicio(new Mesas());
       
    }//GEN-LAST:event_BotonMesasActionPerformed

    private void BotonGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGestionActionPerformed
                                        
        panelGestion.setVisible(!panelGestion.isVisible()); // Alterna la visibilidad del panel
        //panelGestion.setLayout(new BoxLayout(panelGestion, BoxLayout.PAGE_AXIS));
        //setLayout(new FlowLayout());
        
    }//GEN-LAST:event_BotonGestionActionPerformed

    private void BotonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentasActionPerformed
        inicio(new Ventas());
    }//GEN-LAST:event_BotonVentasActionPerformed

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        inicio(new Menu());
    }//GEN-LAST:event_BotonMenuActionPerformed

    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        inicio(new Usuarios());
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonMobiliarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMobiliarioActionPerformed
        inicio(new Mobiliario());
    }//GEN-LAST:event_BotonMobiliarioActionPerformed

    private void BotonGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGastosActionPerformed
        inicio(new Gastos());
    }//GEN-LAST:event_BotonGastosActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       // toggleBarra();
        if(Barra.isVisible()){
            Barra.setVisible(false);

        }else{
            Barra.setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void BarraDespliegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraDespliegeMouseClicked
     
    }//GEN-LAST:event_BarraDespliegeMouseClicked

    private void BotonGestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGestionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGestionMouseClicked

    private void panelGestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGestionMouseClicked
        panelGestion.setVisible(!panelGestion.isVisible());
        panelGestion.revalidate(); // Recalcula el tamaño del panel
        panelGestion.repaint();  
    }//GEN-LAST:event_panelGestionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightOwlIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secciones().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel BarraDespliege;
    private javax.swing.JButton BotonGastos;
    private javax.swing.JButton BotonGestion;
    private javax.swing.JButton BotonMenu;
    private javax.swing.JButton BotonMesas;
    private javax.swing.JButton BotonMobiliario;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVentas;
    private javax.swing.JPanel PanelPrincipal;
    public static javax.swing.JPanel Principal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelGestion;
    // End of variables declaration//GEN-END:variables
}
