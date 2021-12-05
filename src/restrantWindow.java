

//waseem abu jabal   120213949
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class restrantWindow extends javax.swing.JFrame {
     int chickenNum,meatNum,waterNum,juiceNum;
    double chickenPrice,meatPrice,waterPrice,juicePrice;
    final double CHICKEN_COST = 4.0, MEAT_COST = 4.0,WATER_COST = 1.0,JUICE_COST =3.0;
    double subtotal,vat,total;
    int customercounter;
    PrintWriter output;
    

   
    public restrantWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        chickencounter = new javax.swing.JSpinner();
        chickenchees = new javax.swing.JCheckBox();
        chickenPricelabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        meatcounter = new javax.swing.JSpinner();
        meatchees = new javax.swing.JCheckBox();
        meatPricelabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        watercounter = new javax.swing.JSpinner();
        waterPricelabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        juicecounter = new javax.swing.JSpinner();
        juicePricelabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        subtotallabel = new javax.swing.JLabel();
        vatlabel = new javax.swing.JLabel();
        totallabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        calculateBill = new javax.swing.JButton();
        saveBill = new javax.swing.JButton();
        newBill = new javax.swing.JButton();
        Billnumlabel = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("نظام ادارة المطاعم");

        jLabel2.setText("تطوير فريق نادي البرمجة نسخة 1.0");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المأكولات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("شاورما دجاج");

        chickencounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chickencounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickencounterStateChanged(evt);
            }
        });

        chickenchees.setText("جبنة");
        chickenchees.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        chickenchees.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        chickenchees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickencheesActionPerformed(evt);
            }
        });

        chickenPricelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chickenPricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickenPricelabel.setText("0.0شيكل");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("شاورما لحم");

        meatcounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatcounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatcounterStateChanged(evt);
            }
        });

        meatchees.setText("جبنة");
        meatchees.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        meatchees.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        meatchees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatcheesActionPerformed(evt);
            }
        });

        meatPricelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        meatPricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        meatPricelabel.setText("0.0شيكل");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chickenPricelabel)
                        .addGap(18, 18, 18)
                        .addComponent(chickenchees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chickencounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(meatPricelabel)
                        .addGap(18, 18, 18)
                        .addComponent(meatchees)
                        .addGap(18, 18, 18)
                        .addComponent(meatcounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chickencounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chickenchees)
                    .addComponent(chickenPricelabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(meatcounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meatchees)
                    .addComponent(meatPricelabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المشروبات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ماء");

        watercounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        watercounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                watercounterStateChanged(evt);
            }
        });

        waterPricelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        waterPricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        waterPricelabel.setText("0.0شيكل");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(" عصير");

        juicecounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        juicecounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                juicecounterStateChanged(evt);
            }
        });

        juicePricelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        juicePricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        juicePricelabel.setText("0.0شيكل");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(juicePricelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(juicecounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addComponent(waterPricelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(watercounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(watercounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterPricelabel)
                    .addComponent(jLabel9)
                    .addComponent(juicecounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juicePricelabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        subtotallabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subtotallabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotallabel.setText("المجموع: 0.0شيكل");

        vatlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vatlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vatlabel.setText("الضريبة: 0.0شيكل");

        totallabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totallabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totallabel.setText("الاجمالي: 0.0شيكل");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtotallabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vatlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totallabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtotallabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vatlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totallabel)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        calculateBill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calculateBill.setText("حساب");
        calculateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBillActionPerformed(evt);
            }
        });

        saveBill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveBill.setText("حفظ الفاتورة");
        saveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBillActionPerformed(evt);
            }
        });

        newBill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newBill.setText("فاتورة جديدة");
        newBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculateBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(newBill, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(calculateBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBill)
                    .addComponent(newBill))
                .addGap(0, 194, Short.MAX_VALUE))
        );

        Billnumlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Billnumlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Billnumlabel.setText("رقم الفاتورة:0");

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("خروج");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Billnumlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Billnumlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBillActionPerformed
        subtotal = chickenPrice+meatPrice+waterPrice+juicePrice;
        subtotallabel.setText("المجموع"+subtotal+"شيكل");
        vat=subtotal*0.05;
        vat = vat * 100;
        vat = (double)((int)vat);
        vat = vat / 100;
        vatlabel.setText("الضريبة"+vat+"شيكل");
        total = subtotal+vat;
      totallabel .setText("الاجمالي"+total+"شيكل");
        
        
    }//GEN-LAST:event_calculateBillActionPerformed

    private void saveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBillActionPerformed
        try {
            if (total!=0) {
                   output=new PrintWriter("billNo."+customercounter+".txt");
                    output.println("رقم الفاتورة"+customercounter);
                    
                            if (chickenNum!=0) {
                                output.print(chickenNum+"شاورما دجاج");
                                        if (chickenchees.isSelected()) {
                                    output.println("مع الجبنة");
                                }
                                
                    
                }
            }
           
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(restrantWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveBillActionPerformed

    private void newBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBillActionPerformed
        if (total!=0) {
            
            
            chickencounter.setValue(0);
           meatcounter.setValue(0);
            watercounter.setValue(0);
            juicecounter.setValue(0);
            
            chickenchees.setSelected(false);
            meatchees.setSelected(false);
            subtotallabel.setText("المجموع:0.0شيكل");
            vatlabel.setText("الضريبة:0.0شيكل");
            totallabel.setText("الاجمالي:0.0شيكل");
            subtotal=0;
            vat=0;
            total=0;
            customercounter++;
            
            
            
                    
            
        }
        
        
        
        
    }//GEN-LAST:event_newBillActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void chickencounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickencounterStateChanged
        chickenNum=(Integer)chickencounter.getValue();
  chickenPrice = CHICKEN_COST * chickenNum;
  chickenPricelabel.setText(chickenPrice+"شيكل");
  
        
        
        
        
    }//GEN-LAST:event_chickencounterStateChanged

    private void meatcounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatcounterStateChanged
        meatNum=(Integer)meatcounter.getValue();
       meatPrice = MEAT_COST * meatNum;
       meatPricelabel.setText(meatPrice+"شيكل");
        
        
        
        
    }//GEN-LAST:event_meatcounterStateChanged

    private void watercounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_watercounterStateChanged
        waterNum=(Integer)watercounter.getValue();
      waterPrice = WATER_COST * waterNum;
       waterPricelabel.setText(waterPrice+"شيكل");
        
        
    }//GEN-LAST:event_watercounterStateChanged

    private void juicecounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_juicecounterStateChanged
        juiceNum=(Integer)juicecounter.getValue();
      juicePrice = JUICE_COST * juiceNum;
      juicePricelabel.setText(juicePrice+"شيكل");
        
        
        
    }//GEN-LAST:event_juicecounterStateChanged

    private void chickencheesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickencheesActionPerformed
         if (chickenchees.isSelected()) {
            chickenPrice +=chickenNum;
        } else{
            chickenPrice -=chickenNum;
        }
        
        chickenPricelabel.setText(chickenPrice+"شيكل");
        
        
        
        
    }//GEN-LAST:event_chickencheesActionPerformed

    private void meatcheesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatcheesActionPerformed
          if (meatchees.isSelected()) {
            meatPrice +=meatNum;
        } else{
            meatPrice -=meatNum;
        }
        
        meatPricelabel.setText(meatPrice+"شيكل");
        
        
        
    }//GEN-LAST:event_meatcheesActionPerformed

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
            java.util.logging.Logger.getLogger(restrantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restrantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restrantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restrantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restrantWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Billnumlabel;
    private javax.swing.JButton calculateBill;
    private javax.swing.JLabel chickenPricelabel;
    private javax.swing.JCheckBox chickenchees;
    private javax.swing.JSpinner chickencounter;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel juicePricelabel;
    private javax.swing.JSpinner juicecounter;
    private javax.swing.JLabel meatPricelabel;
    private javax.swing.JCheckBox meatchees;
    private javax.swing.JSpinner meatcounter;
    private javax.swing.JButton newBill;
    private javax.swing.JButton saveBill;
    private javax.swing.JLabel subtotallabel;
    private javax.swing.JLabel totallabel;
    private javax.swing.JLabel vatlabel;
    private javax.swing.JLabel waterPricelabel;
    private javax.swing.JSpinner watercounter;
    // End of variables declaration//GEN-END:variables
}
