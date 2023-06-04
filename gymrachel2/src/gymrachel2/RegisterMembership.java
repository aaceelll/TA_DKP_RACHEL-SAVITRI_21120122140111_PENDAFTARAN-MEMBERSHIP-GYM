/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymrachel2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hatephysics
 */
public class RegisterMembership extends javax.swing.JFrame {

NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    private String Nama;
    private String Email;
    private String Notelepon;
    private String Alamat;
    private String Harga;
    /**
     * Creates new form RegisterMembership
     */
public RegisterMembership() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Aktivasi Membership Gym Rachel");
        setSize(1200, 700);
        setMinimumSize(new Dimension(500, 429));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtHarga.setEditable(false);
        txtarea.setEditable(false);
        jCombojenispaket.setEnabled(false);
        validasibutton.setEnabled(false);
        pack();
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public String getNama() {
        return Nama;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getEmail() {
        return Email;
    }
    public void setNotelepon(String Notelepon) {
        this.Notelepon = Notelepon;
    }
    public String getNotelepon() {
        return Notelepon;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    public String getAlamat() {
        return Alamat;
    }
    public void setHarga(String Harga) {
        this.Harga = Harga;
    }
    public String getHarga() {
        return Harga;
    }

public class poptext {
    String nama = txtNama.getText(); String email = txtEmail.getText(); String telepon = txtNotelepon.getText(); String alamat = txtAlamat.getText();
    String pilihan = (String) jCombojenispaket.getSelectedItem(); String Harga = txtHarga.getText();
        private void validasi() {
            txtarea.setText( "Halo " + nama + "\n" + email + "\n" + telepon + "\n" + alamat + "\n\nSilahkan Pilih Paket yang Anda Inginkan");
            }
        private void aktivasi() {
        txtarea.setText( "Halo " + nama + "\n" + email + "\n" + telepon + "\n" + alamat + "\n\nAnda memilih paket: " + pilihan + "\nDengan Harga Rp" + Harga + "\n\n Selamat Aktivasi Membership Anda Berhasil" );
}
}  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnkelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCombojenispaket = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aktivasiButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextPane();
        txtNama = new javax.swing.JTextField();
        rdlaki = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rdperempuan = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        validasibutton = new javax.swing.JButton();
        txtNotelepon = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("No. Telepon");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(400, 16));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Jenis Kelamin");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(400, 16));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Nama");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setPreferredSize(new java.awt.Dimension(400, 16));

        jCombojenispaket.setMaximumRowCount(6);
        jCombojenispaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Paket", "Reguler-umum", "Reguler-pelajar", "Reguler-couple", "Reguler-group (5)", "Class-zumba 10x", "Class-aerobic, FBC" }));
        jCombojenispaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombojenispaketActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Jenis Paket");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setPreferredSize(new java.awt.Dimension(400, 16));

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Harga");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setPreferredSize(new java.awt.Dimension(400, 16));

        aktivasiButton.setBackground(new java.awt.Color(102, 102, 102));
        aktivasiButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aktivasiButton.setForeground(new java.awt.Color(0, 0, 153));
        aktivasiButton.setText("Aktivasi");
        aktivasiButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aktivasiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aktivasiButtonMouseClicked(evt);
            }
        });
        aktivasiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktivasiButtonActionPerformed(evt);
            }
        });

        txtarea.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(txtarea);

        btnkelamin.add(rdlaki);
        rdlaki.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        rdlaki.setForeground(new java.awt.Color(255, 255, 255));
        rdlaki.setText("Laki-laki");
        rdlaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlakiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Alamat");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 16));

        btnkelamin.add(rdperempuan);
        rdperempuan.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        rdperempuan.setForeground(new java.awt.Color(255, 255, 255));
        rdperempuan.setText("Perempuan");
        rdperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdperempuanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AKTIVASI MEMBERSHIP");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(400, 16));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Masukan Data Anda");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(400, 16));

        jLabel10.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Email");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setPreferredSize(new java.awt.Dimension(400, 16));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("GYM RACHEL");
        jLabel9.setAutoscrolls(true);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setPreferredSize(new java.awt.Dimension(400, 16));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymrachel2/rsz_workout.png"))); // NOI18N

        validasibutton.setBackground(new java.awt.Color(102, 102, 102));
        validasibutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        validasibutton.setForeground(new java.awt.Color(0, 0, 153));
        validasibutton.setText("Validasi");
        validasibutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        validasibutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validasibuttonMouseClicked(evt);
            }
        });
        validasibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validasibuttonActionPerformed(evt);
            }
        });

        txtNotelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoteleponKeyTyped(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(102, 102, 102));
        resetButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(0, 0, 153));
        resetButton.setText("Reset");
        resetButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addGap(75, 75, 75))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdlaki)
                                .addGap(18, 18, 18)
                                .addComponent(rdperempuan))
                            .addComponent(txtNama)
                            .addComponent(txtAlamat)
                            .addComponent(jCombojenispaket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHarga)
                            .addComponent(validasibutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNotelepon)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aktivasiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNotelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdlaki)
                            .addComponent(rdperempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validasibutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCombojenispaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aktivasiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCombojenispaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombojenispaketActionPerformed
        String daftarharga = (String) jCombojenispaket.getSelectedItem();
        switch (daftarharga) {
            case "Reguler-umum" :
                txtHarga.setText(nf.format(100000));
                break;
            case "Reguler-pelajar":
               txtHarga.setText(nf.format(150000));
                break;
            case "Reguler-couple":
                txtHarga.setText(nf.format(200000));
                break;
            case "Reguler-group (5)":
                txtHarga.setText(nf.format(250000));
                break;
            case "Class-zumba 10x":
                txtHarga.setText(nf.format(300000));
                break;
            case "Class-aerobic, FBC":
                txtHarga.setText(nf.format(350000));
                break;
            case "Pilih Paket":
                txtHarga.setText("");
                break;        
    };
    }//GEN-LAST:event_jCombojenispaketActionPerformed

    private void rdlakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlakiActionPerformed

    }//GEN-LAST:event_rdlakiActionPerformed
  
    private void aktivasiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aktivasiButtonMouseClicked
        poptext aktiv = new poptext();
        if(txtNama.getText().isEmpty() || txtEmail.getText().isEmpty()||txtNotelepon.getText().isEmpty() || txtAlamat.getText().isEmpty() || btnkelamin.isSelected(null))   {
            JOptionPane.showMessageDialog(null, "Mohon Isi Semua Data");
        } 
        else if(jCombojenispaket.getSelectedItem().equals("Pilih Paket")){
            JOptionPane.showMessageDialog(null, "Mohon Pilih Paket Anda");            
        }
        else  {
            aktiv.aktivasi();
            aktivasiButton.setEnabled(false);
            jCombojenispaket.setEnabled(false);
            }                    
    }//GEN-LAST:event_aktivasiButtonMouseClicked

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void rdperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdperempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdperempuanActionPerformed

    private void validasibuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validasibuttonMouseClicked
        if(txtNama.getText().isEmpty() || txtEmail.getText().isEmpty()||txtNotelepon.getText().isEmpty() || txtAlamat.getText().isEmpty() || btnkelamin.isSelected(null))   {
            JOptionPane.showMessageDialog(null, "Mohon Isi Semua Data");
        } 
        else if (!txtEmail.getText().contains("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Email tidak valid");
        }
        else {
            jCombojenispaket.setEnabled(true);
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jCombojenispaket.getModel();
                if (rdperempuan.isSelected()) {
                    model.removeElement("Reguler-couple");
                    model.removeElement("Reguler-umum");
                
                } else if (rdlaki.isSelected()) {
                    model.removeElement("Class-zumba 10x");
                    model.removeElement("Class-aerobic, FBC");
                }
            validasibutton.setEnabled(true);
            poptext valid = new poptext();
            valid.validasi();
        }      
    }//GEN-LAST:event_validasibuttonMouseClicked

    private void txtNoteleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoteleponKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }        
    }//GEN-LAST:event_txtNoteleponKeyTyped

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        txtNama.setText("");
        txtEmail.setText("");
        txtNotelepon.setText("");
        txtAlamat.setText("");
        jCombojenispaket.setSelectedIndex(0);
        txtHarga.setText("");
        txtarea.setText("");
        btnkelamin.clearSelection();     
        jCombojenispaket.setEnabled(false);
    }//GEN-LAST:event_resetButtonMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resetButtonMouseClicked(null);
        resetComboBox();
        rdlaki.setEnabled(true);
        rdperempuan.setEnabled(true);
        aktivasiButton.setEnabled(true);
    }//GEN-LAST:event_resetButtonActionPerformed
    public void resetComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Pilih Paket");
        model.addElement("Reguler-umum");
        model.addElement("Reguler-pelajar");
        model.addElement("Reguler-couple");
        model.addElement("Reguler-group (5)");
        model.addElement("Class-zumba 10x");
        model.addElement("Class-aerobic, FBC");
        jCombojenispaket.setModel(model);
    }
    private void validasibuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validasibuttonActionPerformed
        if (!rdlaki.isSelected()){
            rdlaki.setEnabled(false);
    }                                              
        if (!rdperempuan.isSelected()){
            rdperempuan.setEnabled(false);
        }
    }//GEN-LAST:event_validasibuttonActionPerformed

    private void aktivasiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktivasiButtonActionPerformed
        if (!rdlaki.isSelected()){
            rdlaki.setEnabled(false);
    }//GEN-LAST:event_aktivasiButtonActionPerformed
        if (!rdperempuan.isSelected()){
            rdperempuan.setEnabled(false);
    }
    /**
     * @param args the command line arguments
     */
    }public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RegisterMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterMembership().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aktivasiButton;
    private javax.swing.ButtonGroup btnkelamin;
    private javax.swing.JComboBox<String> jCombojenispaket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdlaki;
    private javax.swing.JRadioButton rdperempuan;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNotelepon;
    private javax.swing.JTextPane txtarea;
    private javax.swing.JButton validasibutton;
    // End of variables declaration//GEN-END:variables
}
