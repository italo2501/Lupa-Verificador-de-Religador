/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import model.Altere;
import model.AltereModel;

/**
 *
 * @author italo.francis
 */
public class SerialRelForm extends javax.swing.JFrame {

    //private static String caminho = "C:\\Users\\italo.francis\\Desktop\\TesteColeta.txt";
    AltereModel altereModel = new AltereModel();
    List<Altere> listaAltere = new ArrayList<>();
    List<Altere> listaCSV = new ArrayList<>();
    List<Altere> listaParametro = new ArrayList<>();

    public SerialRelForm() {
        initComponents();

         this.setIconImage((new javax.swing.ImageIcon(getClass().getResource("/images/religador.png")).getImage()));
        
        
        txtTable.setModel(altereModel);
       
       //******************** Centralizando cabeçalho das colunas  ********************//
       JTableHeader header =  txtTable.getTableHeader();
       DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
       centralizado.setHorizontalAlignment(SwingConstants.CENTER);
             
       //******************** Centralizando celulas das colunas ********************//
         centralizado.setHorizontalAlignment(SwingConstants.CENTER);
         txtTable.getColumnModel().getColumn(0).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(1).setCellRenderer(centralizado);  
         txtTable.getColumnModel().getColumn(2).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(3).setCellRenderer(centralizado); 
         txtTable.getColumnModel().getColumn(4).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(5).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(6).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(7).setCellRenderer(centralizado);  
         txtTable.getColumnModel().getColumn(8).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(9).setCellRenderer(centralizado); 
         txtTable.getColumnModel().getColumn(10).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(11).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(12).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(13).setCellRenderer(centralizado); 
         txtTable.getColumnModel().getColumn(14).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(15).setCellRenderer(centralizado);
         txtTable.getColumnModel().getColumn(16).setCellRenderer(centralizado);
          
          
         
         
         
        txtTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        txtTable.getColumnModel().getColumn(1).setPreferredWidth(120);
        txtTable.getColumnModel().getColumn(2).setPreferredWidth(70);
        txtTable.getColumnModel().getColumn(3).setPreferredWidth(70);
        txtTable.getColumnModel().getColumn(4).setPreferredWidth(60);
        txtTable.getColumnModel().getColumn(5).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(6).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(7).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(8).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(9).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(10).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(11).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(12).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(13).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(14).setPreferredWidth(50);
        txtTable.getColumnModel().getColumn(15).setPreferredWidth(150);
        txtTable.getColumnModel().getColumn(16).setPreferredWidth(120);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTxt = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        btnCSV = new javax.swing.JButton();
        btnProcessar = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtextAerros = new javax.swing.JTextArea();
        jcoletaText = new javax.swing.JLabel();
        jLabelColeta = new javax.swing.JLabel();
        jCsv = new javax.swing.JLabel();
        jLabelCsv = new javax.swing.JLabel();
        jcoletaText2 = new javax.swing.JLabel();
        jLabelFalha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lupa Verifica Serial Religador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnTxt.setBackground(new java.awt.Color(255, 255, 255));
        btnTxt.setForeground(new java.awt.Color(51, 51, 51));
        btnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-txt-50.png"))); // NOI18N
        btnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTxtActionPerformed(evt);
            }
        });

        txtTable.setAutoCreateRowSorter(true);
        txtTable.setForeground(new java.awt.Color(0, 0, 0));
        txtTable.setModel(new javax.swing.table.DefaultTableModel(
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
        txtTable.setAlignmentX(1.0F);
        txtTable.setAlignmentY(1.0F);
        txtTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        txtTable.setColumnSelectionAllowed(true);
        txtTable.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        txtTable.setGridColor(new java.awt.Color(255, 255, 255));
        txtTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        txtTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtTable);
        txtTable.getAccessibleContext().setAccessibleName("");

        btnCSV.setBackground(new java.awt.Color(255, 255, 255));
        btnCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-csv-50.png"))); // NOI18N
        btnCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVActionPerformed(evt);
            }
        });

        btnProcessar.setBackground(new java.awt.Color(255, 255, 255));
        btnProcessar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-process-52.png"))); // NOI18N
        btnProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-erase-50.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        JtextAerros.setColumns(20);
        JtextAerros.setRows(5);
        jScrollPane2.setViewportView(JtextAerros);

        jcoletaText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcoletaText.setText("Coletas:");

        jLabelColeta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelColeta.setText("0");

        jCsv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCsv.setText("CSV:");

        jLabelCsv.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelCsv.setText("0");

        jcoletaText2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcoletaText2.setText("Falhas:");

        jLabelFalha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelFalha.setText("0");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lupa logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jcoletaText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCsv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcoletaText2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFalha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcoletaText2)
                            .addComponent(jLabelFalha)
                            .addComponent(jCsv)
                            .addComponent(jLabelCsv)
                            .addComponent(jLabelColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcoletaText)))
                    .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTxtActionPerformed

        String line = null;
        List<String> listaSerial = new ArrayList<>();
        List<String> listaMAC = new ArrayList<>();
        List<String> listaSerialRel = new ArrayList<>();
        List<String> listaTPFonte = new ArrayList<>();
        List<String> listaTPCarga = new ArrayList<>();
        List<String> listaCIX1 = new ArrayList<>();
        List<String> listaCIX2 = new ArrayList<>();
        List<String> listaCIX3 = new ArrayList<>();
        List<String> listaCIXN = new ArrayList<>();
        List<String> listaCUX1 = new ArrayList<>();
        List<String> listaCUX2 = new ArrayList<>();
        List<String> listaCUX3 = new ArrayList<>();
        List<String> listaCUX4 = new ArrayList<>();
        List<String> listaCUX5 = new ArrayList<>();
        List<String> listaCUX6 = new ArrayList<>();
        List<String> listaRtc = new ArrayList<>();
        List<String> listadate = new ArrayList<>();

        boolean valida = false;
        JFileChooser arqPDF = new JFileChooser();// criaS janela de busca
        arqPDF.setDialogTitle("Selecionar arquivo txt"); // Titulo da janela de busca

        arqPDF.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("document", "txt");

        arqPDF.setFileFilter(filter);
        int retorno = arqPDF.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {

            File arquivo = arqPDF.getSelectedFile();

            String caminho = String.valueOf(arquivo);

            try {
                FileReader fileReader = new FileReader(caminho);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {

                    if (line.contains("Uptime:")) {

                        String date = line.replaceAll("Uptime: ", "");
                        listadate.add(date);

                    }

                    if (line.contains("Numero do ponto:")) {

                        String serial = line.replaceAll("[\\sA-Za-z:]", "");
                        listaSerial.add(serial);

                    }
                    if (line.contains("Endereco MAC:")) {

                        String mac = line.replaceAll("Endereco MAC: ", "");
                        listaMAC.add(mac);
                        // System.out.println(mac);
                    }

                    if (line.contains("Data atual (RTC)")) {

                        String rtc = line.replaceAll("[A-Za-z()]", "").replaceAll("   :", "");
                        listaRtc.add(rtc);
                    }

                    if (line.contains("Serial:")) {

                        String serialRel = line.replaceAll("[\\sA-Za-z:]", "");
                        listaSerialRel.add(serialRel);
                        //  System.out.println(serialRel);
                    }

                    if (line.contains("TP Fonte:")) {

                        String tpFonte = line.replaceAll("TP Fonte: [0-9][0-9][0-9][0-9][0-9]V:[0-9]V", "").replaceAll("[A-Ta-t:, ]", "");
                        listaTPFonte.add(tpFonte);
                    }

                    if (line.contains("TP Carga:")) {

                        String tpCarga = line.replaceAll("TP Carga: [0-9][0-9][0-9][0-9][0-9]V:[0-9]V", "").replaceAll("[A-Ta-t:, ]", "");
                        listaTPCarga.add(tpCarga);
                    }

                    if (line.contains("CIX1 :")) {

                        String cix1 = line.replaceAll("V \\/ 1.000000 kA ", "").replaceAll("CIX1 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "");

                        float flou = Float.parseFloat(cix1);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);
                        listaCIX1.add(valorFormatado);
                    }

                    if (line.contains("CIX2 :")) {

                        String cix2 = line.replaceAll("V \\/ 1.000000 kA ", "").replaceAll("CIX2 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "");
                        float flou = Float.parseFloat(cix2);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);

                        listaCIX2.add(valorFormatado);
                    }

                    if (line.contains("CIX3 :")) {

                        String cix3 = line.replaceAll("V \\/ 1.000000 kA ", "").replaceAll("CIX3 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "");
                        float flou = Float.parseFloat(cix3);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);
                        listaCIX3.add(valorFormatado);
                    }

                    if (line.contains("CIXN :")) {

                        String cixn = line.replaceAll("V \\/ 1.000000 kA ", "").replaceAll("CIXN : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "");
                        float flou = Float.parseFloat(cixn);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);

                        listaCIXN.add(valorFormatado);
                    } else if (line.contains("CIX4 :")) {

                        String cixn = line.replaceAll("V \\/ 1.000000 kA ", "").replaceAll("CIX4 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "");
                        float flou = Float.parseFloat(cixn);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);

                        listaCIXN.add(valorFormatado);

                    }

                    if (line.contains("CUX1 :")) {

                        String cux1 = line.replaceAll("V \\/ 1.000000 kV ", "").replaceAll("CUX1 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "").replaceAll("[0-9][0-9].[0-9][0-9][0-9]%", "");
                        float flou = Float.parseFloat(cux1);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);
                        listaCUX1.add(valorFormatado);

                    }

                    if (line.contains("CUX2 :")) {

                        String cux2 = line.replaceAll("V \\/ 1.000000 kV ", "").replaceAll("CUX2 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "").replaceAll("[0-9][0-9].[0-9][0-9][0-9]%", "");
                        float flou = Float.parseFloat(cux2);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);
                        listaCUX2.add(valorFormatado);

                    }

                    if (line.contains("CUX3 :")) {

                        String cux3 = line.replaceAll("V \\/ 1.000000 kV ", "").replaceAll("CUX3 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "").replaceAll("[0-9][0-9].[0-9][0-9][0-9]%", "");
                        float flou = Float.parseFloat(cux3);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);

                        listaCUX3.add(valorFormatado);

                    }

                    if (line.contains("CUX4 :")) {

                        String cux4 = line.replaceAll("V \\/ 1.000000 kV ", "").replaceAll("CUX4 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "").replaceAll("[0-9][0-9].[0-9][0-9][0-9]%", "");
                        float flou = Float.parseFloat(cux4);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);
                        listaCUX4.add(valorFormatado);

                    }

                    if (line.contains("CUX5 :")) {

                        String cux5 = line.replaceAll("V \\/ 1.000000 kV ", "").replaceAll("CUX5 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "").replaceAll("[0-9][0-9].[0-9][0-9][0-9]%", "");
                        float flou = Float.parseFloat(cux5);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);
                        listaCUX5.add(valorFormatado);

                    }

                    if (line.contains("CUX6 :")) {

                        String cux6 = line.replaceAll("V \\/ 1.000000 kV ", "").replaceAll("CUX6 : ", "").replaceAll("[0-9][0-9][0-9].[0-9][0-9][0-9]%", "").replaceAll("[()]", "").replaceAll("[0-9][0-9].[0-9][0-9][0-9]%", "");
                        float flou = Float.parseFloat(cux6);
                        String valorFormatado = new DecimalFormat("0.0000").format(flou);
                        listaCUX6.add(valorFormatado);

                    }

                }

                for (int i = 0; i < listaSerial.size(); i++) {
                    Altere altere = new Altere();

                    try {
                        altere.setNumSerie(listaSerial.get(i));
                    } catch (Exception e) {
                        altere.setNumSerie("Null");
                        JOptionPane.showMessageDialog(null, "Faltando Número de serie!");
                    }

                    try {
                        altere.setMAC(listaMAC.get(i));
                    } catch (Exception e) {
                        altere.setMAC("Null");
                        JOptionPane.showMessageDialog(null, "Faltando Endereco MAC!");
                    }

                    try {
                        altere.setNumRel(listaSerialRel.get(i));
                    } catch (Exception e) {
                        altere.setNumRel("Null");
                        JOptionPane.showMessageDialog(null, "Faltando Serial do religador!");
                    }

                    try {
                        altere.setTpFonte(listaTPFonte.get(i));
                    } catch (Exception e) {
                        altere.setTpFonte("Null");
                        JOptionPane.showMessageDialog(null, "Faltando TP Fonte!");
                    }

                    try {
                        altere.setTpCarga(listaTPCarga.get(i));
                    } catch (Exception e) {
                        altere.setTpCarga("Null");
                        JOptionPane.showMessageDialog(null, "Faltando TP Carga!");
                    }

                    try {
                        altere.setCIX1(listaCIX1.get(i));
                    } catch (Exception e) {
                        altere.setCIX1("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CIX1!");

                    }

                    try {
                        altere.setCIX2(listaCIX2.get(i));
                    } catch (Exception e) {
                        altere.setCIX2("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CIX2!");
                    }

                    try {
                        altere.setCIX3(listaCIX3.get(i));
                    } catch (Exception e) {
                        altere.setCIX3("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CIX3!");
                    }

                    try {
                        altere.setCIXN(listaCIXN.get(i));
                    } catch (Exception e) {
                        altere.setCIXN("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CIXN!");
                    }

                    try {
                        altere.setCUX1(listaCUX1.get(i));
                    } catch (Exception e) {
                        altere.setCUX1("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CUX1!");
                    }

                    try {
                        altere.setCUX2(listaCUX2.get(i));
                    } catch (Exception e) {
                        altere.setCUX2("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CUX2!");
                    }

                    try {
                        altere.setCUX3(listaCUX3.get(i));
                    } catch (Exception e) {
                        altere.setCUX3("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CUX3!");
                    }

                    try {
                        altere.setCUX4(listaCUX4.get(i));
                    } catch (Exception e) {
                        altere.setCUX4("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CUX4!");
                    }

                    try {
                        altere.setCUX5(listaCUX5.get(i));
                    } catch (Exception e) {
                        altere.setCUX5("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CUX5!");
                    }

                    try {
                        altere.setCUX6(listaCUX6.get(i));
                    } catch (Exception e) {
                        altere.setCUX6("Null");
                        JOptionPane.showMessageDialog(null, "Faltando CUX6!");
                    }

                    try {
                        altere.setRtc(listaRtc.get(i));
                    } catch (Exception e) {
                        altere.setRtc("Null");
                        JOptionPane.showMessageDialog(null, "Faltando data atual (RTC)");
                    }

                    try {
                        altere.setDate(listadate.get(i));
                    } catch (Exception e) {
                        altere.setDate("Null");
                        JOptionPane.showMessageDialog(null, "Faltando Uptime!");
                    }

                    if (!listaAltere.contains(altere)) {
                        listaAltere.add(i, altere);

                        Collections.sort(listaAltere);

                        valida = true;
                    } else {

                        JOptionPane.showMessageDialog(null, "Arquivo já selecionado!");
                        break;
                    }
                }

                if (valida == true) {

                    for (int i = 0; i < listaAltere.size(); i++) {
                        Altere get = listaAltere.get(i);

                        altereModel.addRow(get);
                    }

                }

            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {
                Logger.getLogger(SerialRelForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            String qtd = String.valueOf(listaAltere.size());

            jLabelColeta.setText(qtd);

            for (int i = 0; i < listaAltere.size(); i++) {
                Altere get = listaAltere.get(i);
                System.out.println("Coleta: " + get);
            }

    }//GEN-LAST:event_btnTxtActionPerformed
    }
    private void btnCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVActionPerformed

        String line = null;
        List<String> listaSerial = new ArrayList<>();
        List<String> listaMAC = new ArrayList<>();
        List<String> listaSerialRel = new ArrayList<>();
        String[] CSV;
        JFileChooser arqCSV = new JFileChooser();// cria janela de busca

        arqCSV.setDialogTitle("Selecionar arquivo CSV"); // Titulo da janela de busca

        arqCSV.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("arquivo CSV", "csv"); // define o tipo de arquivo

        arqCSV.setFileFilter(filter);
        int retorno = arqCSV.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {

            File arquivo = arqCSV.getSelectedFile();

            String caminho = String.valueOf(arquivo);

            BufferedReader br = null;
            String linha = "";
            String csvDivisor = ";";
            try {

                br = new BufferedReader(new FileReader(caminho));
                while ((linha = br.readLine()) != null) {

                    CSV = linha.split(csvDivisor);

                    String serial = CSV[0].replaceAll("[\\s]", "");
                    listaSerial.add(serial);
                    
                    String MAC = CSV[1];
                    listaMAC.add(MAC);

                    String serialRel = CSV[2];
                    listaSerialRel.add(serialRel);
                    

                }

            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                    }
                }
            }

            for (int i = 0; i < listaSerial.size(); i++) {

                Altere altereCSV = new Altere();

                altereCSV.setNumSerie(listaSerial.get(i));
                altereCSV.setMAC(listaMAC.get(i));
                altereCSV.setNumRel(listaSerialRel.get(i));

                if (!listaCSV.contains(altereCSV)) {
                    listaCSV.add(i, altereCSV);

                } else {

                    JOptionPane.showMessageDialog(null, "Arquivo já selecionado!");
                    break;
                }

            }

            String qtd = String.valueOf(listaCSV.size());

            jLabelCsv.setText(qtd);

        }

        for (int i = 0; i < listaCSV.size(); i++) {
            Altere get = listaCSV.get(i);
            System.out.println(get);

        }

    }//GEN-LAST:event_btnCSVActionPerformed

    private void btnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessarActionPerformed
        List<Altere> listaRenagade = new ArrayList<>();
        int qtdfalha = 0;

        if (listaAltere.isEmpty() && listaCSV.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Nenhum arquivo selecionado!");

        } else if (listaCSV.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor, selecione o arquivo CSV!");

        } else if (listaAltere.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor, selecione o arquivo de coleta! ");
        } else {

            for (int i = 0; i < listaAltere.size(); i++) {
                Altere atere = listaAltere.get(i);

                if (listaCSV != null && listaCSV.contains(atere)) {
                    System.out.println("Aprovado no teste: " + listaAltere.get(i));

                } else {

                    System.out.println("Reprovado no teste : " + listaAltere.get(i));
                    String erro = String.valueOf(listaAltere.get(i).getNumSerie());
                    qtdfalha++;

                    JtextAerros.append(erro + "\n");
                }
            }

            String convFalhas = String.valueOf(qtdfalha);

            jLabelFalha.setText(convFalhas);

            if (listaCSV.containsAll(listaAltere) == true) {

                btnProcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-process-50(3).png"))); // NOI18N
                btnProcessar.setOpaque(true);
                btnProcessar.setBackground(Color.green);

            } else {
                
                btnProcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-process-50_1.png"))); // NOI18N
                btnProcessar.setOpaque(true);
                btnProcessar.setBackground(Color.red);
                
                for (int i = 0; i < listaRenagade.size(); i++) {
                    String falha = String.valueOf(listaRenagade.get(i));
                    JtextAerros.setText(falha);
                }
            }

        }

    }//GEN-LAST:event_btnProcessarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        listaAltere.removeAll(listaAltere);
        listaCSV.removeAll(listaCSV);
        btnProcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-process-52.png"))); // NOI18N
        btnProcessar.setOpaque(false);
        altereModel.removeRow();
        JtextAerros.setText(null);
        jLabelColeta.setText("0");
        jLabelCsv.setText("0");
        jLabelFalha.setText("0");
        ///adaada

    }//GEN-LAST:event_btnLimparActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SerialRelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerialRelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerialRelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerialRelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerialRelForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JtextAerros;
    private javax.swing.JButton btnCSV;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JToggleButton btnProcessar;
    private javax.swing.JToggleButton btnTxt;
    private javax.swing.JLabel jCsv;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelColeta;
    private javax.swing.JLabel jLabelCsv;
    private javax.swing.JLabel jLabelFalha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jcoletaText;
    private javax.swing.JLabel jcoletaText2;
    private javax.swing.JTable txtTable;
    // End of variables declaration//GEN-END:variables
}
