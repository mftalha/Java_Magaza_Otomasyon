
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talha
 */
public class kullanici extends javax.swing.JFrame {

    public Statement st=null;
    public Connection c=null;
    public ResultSet rs=null;
    PreparedStatement ps=null;
    /**
     * Creates new form kullanici
     */
    public kullanici() {
        initComponents();
        jLabel7.setVisible(false);
        ara();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mağaza");
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı Adı", "pass", "id", "ad", "soy_ad", "yetki", "maas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(0);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(2).setMinWidth(0);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(3).setMinWidth(0);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(4).setMinWidth(0);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(6).setMinWidth(0);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setText("Şifre");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Müdür", "Çalışan" }));

        jButton2.setText("Güncellestir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Kayıt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ad");

        jLabel4.setText("Soy Ad");

        jLabel5.setText("Maas");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ara();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tablo =(DefaultTableModel) jTable1.getModel();
        jTextField2.setText(tablo.getValueAt(jTable1.getSelectedRow(), 0).toString());
        //jPasswordField1.setText(tablo.getValueAt(jTable1.getSelectedRow(), 1).toString());
        //jPasswordField2.setText(tablo.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField3.setText(tablo.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jTextField4.setText(tablo.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jTextField5.setText(tablo.getValueAt(jTable1.getSelectedRow(), 6).toString());
        String yetki =tablo.getValueAt(jTable1.getSelectedRow(), 5).toString();
        jLabel7.setText(tablo.getValueAt(jTable1.getSelectedRow(), 2).toString());
        
        
        if(yetki.equals("Admin"))
            jComboBox1.setSelectedIndex(0);
        else if(yetki.equals("Müdür"))
            jComboBox1.setSelectedIndex(1);
        else if(yetki.equals("Çalışan"))
            jComboBox1.setSelectedIndex(2);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String kullanici =jTextField2.getText();
        String pass1=jPasswordField1.getText();
        String pass2=jPasswordField2.getText();
        String ad=jTextField3.getText();
        String soyad=jTextField4.getText();
        String maas=jTextField5.getText();
        String yetki=jComboBox1.getSelectedItem().toString();
        
        
        if(kullanici.isEmpty())
            jLabel6.setText("Kullanıcı Adı Kısmı Boş bırakılamaz");
        else if(pass1.isEmpty() || pass2.isEmpty())
            jLabel6.setText("Şifre Alanı boş bırakılamaz");
        else if(ad.isEmpty())
            jLabel6.setText("Ad Alanı boş bırakılamaz");
        else if(!pass1.equals(pass2))
            jLabel6.setText("Şifre'ler uyuşmuyor");
        else if(soyad.isEmpty())
            jLabel6.setText("SoyAd Alanı boş bırakılamaz");
        else if(maas.isEmpty())
            jLabel6.setText("maas Alanı boş bırakılamaz");
        else
        {
            if(pass1.equals(pass2))
            {
                try
                {
                 Class.forName("com.mysql.jdbc.Driver");
                 String url="jdbc:mysql://"+database.host+":"+database.port+"/"+database.database_adı+"?useUnicode=true&characterEncoding=utf8";
                 c=DriverManager.getConnection(url,database.kullanici_adi,database.parola);
                 st=c.createStatement();
                 
                 String query="insert into kullanici (kullanici_adi,pass,g_ad,g_soy_ad,yetki,maas)values ('"+kullanici+"','"+pass1+"','"+ad+"','"+soyad+"','"+yetki+"',"+maas+")";
                 ps=c.prepareStatement(query);
                 ps.executeUpdate();
                 
                 jTextField2.setText("");
                 jPasswordField1.setText("");
                 jPasswordField2.setText("");
                 jTextField3.setText("");
                 jTextField4.setText("");
                 jTextField5.setText("");
                 jComboBox1.setSelectedIndex(0);
                 jLabel6.setText("");
                 ara();
                }
                catch(Exception e)
                {
                    jLabel6.setText("Girdiginiz Kullanıcı Adı Mevcut");
                    //JOptionPane.showMessageDialog(null, "kullanici kayıt butonu hata","SQL BİLDİRİMİ",-1);
                }              
            }
            else
                JOptionPane.showMessageDialog(null, "Şifreler uyusmuyor","PC BİLDİRİMİ",-1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String kullanici=jTextField2.getText();
        String pass1 =jPasswordField1.getText();
        String pass2 =jPasswordField2.getText();
        String ad=jTextField3.getText();
        String soy_ad=jTextField4.getText();
        String maas=jTextField5.getText();
        String yetki =jComboBox1.getSelectedItem().toString();
        String id=jLabel7.getText();
        
        if(kullanici.isEmpty())
            jLabel6.setText("Kullanıcı Adı Kısmı Boş bırakılamaz");
        else if(pass1.isEmpty() || pass2.isEmpty())
            jLabel6.setText("Şifre Alanı boş bırakılamaz");
        else if(!pass1.equals(pass2))
            jLabel6.setText("Şifre'ler uyuşmuyor");
        else if(ad.isEmpty())
            jLabel6.setText("Ad Alanı boş bırakılamaz");
        else if(soy_ad.isEmpty())
            jLabel6.setText("SoyAd Alanı boş bırakılamaz");
        else if(maas.isEmpty())
            jLabel6.setText("maas Alanı boş bırakılamaz");
        else
        {
            try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://"+database.host+":"+database.port+"/"+database.database_adı+"?useUnicode=true&characterEncoding=utf8";
            c=DriverManager.getConnection(url,database.kullanici_adi,database.parola);
            st=c.createStatement();
            
            String query="update kullanici set kullanici_adi = '"+kullanici+"' ,pass = '"+pass1+"', g_ad ='"+ad+"' ,g_soy_ad ='"+soy_ad+"',yetki ='"+yetki+"',maas ="+maas+" where id='"+id+"'";
            ps=c.prepareStatement(query);
            ps.executeUpdate();
            ara();
            
            jTextField2.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jComboBox1.setSelectedIndex(0);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "kullanici güncelle butonu hata","SQL BİLDİRİMİ",-1);
        }
        }
        
                
                
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id=jLabel7.getText();
        if(id.isEmpty())
            jLabel6.setText("Silinecek Çalışanı Seçin");
        else
        {
            try
            {
              Class.forName("com.mysql.jdbc.Driver");
              String url="jdbc:mysql://"+database.host+":"+database.port+"/"+database.database_adı+"?useUnicode=true&characterEncoding=utf8";
              c=DriverManager.getConnection(url,database.kullanici_adi,database.parola);
              st=c.createStatement();
              
              String query="delete from kullanici where id="+id+"";
              ps=c.prepareStatement(query);
              ps.executeUpdate();
              
            jTextField2.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jComboBox1.setSelectedIndex(0);
              
              ara();
              
            }
            
            
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "kullanici ,sil butonunda hata","SQL BİLDİRİMİ",-1);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char al=evt.getKeyChar();
        if(((al < '0') || (al > '9') && al != '\b'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici().setVisible(true);
            }
        });
    }

    public void ara()
    {
        DefaultTableModel tablo =(DefaultTableModel) jTable1.getModel();
        int rows = tablo.getRowCount();
        for(int i=rows-1;i>=0;i--)
        {
            tablo.removeRow(i);
        }
        String kullanıcı=jTextField1.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://"+database.host+":"+database.port+"/"+database.database_adı+"?useUnicode=true&characterEncoding=utf8";
            c=DriverManager.getConnection(url, database.kullanici_adi, database.parola);
            st=c.createStatement();
            
            String query="Select * from kullanici where kullanici_adi like'%"+kullanıcı+"%'";
            rs=st.executeQuery(query);
            while(rs.next())
            {
                String kullanici=rs.getString("kullanici_adi");
                String sifre =rs.getString("pass");
                String id=rs.getString("id");
                String ad=rs.getString("g_ad");
                String soyad=rs.getString("g_soy_ad");
                String yetki =rs.getString("yetki");
                String maas=rs.getString("maas");
                
                tablo.addRow(new Object[] {kullanici,sifre,id,ad,soyad,yetki,maas});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "kullanicı ara butonunda hata", "SQL BİLDİRİMİ", -1);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
