/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package editor;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Renato
 */
public class frmP extends javax.swing.JFrame {
int ultimo =0;
 JFileChooser fc= new JFileChooser();
 clsArchivos arch = new clsArchivos();
    /**
     * Creates new form frmP
     */
    public frmP() {
        initComponents();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tarea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbLongitudtxt = new javax.swing.JLabel();
        lbTotalpalabras = new javax.swing.JLabel();
        lbPrimeraLetra = new javax.swing.JLabel();
        lbUltimoLetraTexto = new javax.swing.JLabel();
        lbLetraCentral = new javax.swing.JLabel();
        lbPrimeraPalabra = new javax.swing.JLabel();
        lbPalabraCentral = new javax.swing.JLabel();
        lbUltimaPalabra = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lba = new javax.swing.JLabel();
        lbe = new javax.swing.JLabel();
        lbi = new javax.swing.JLabel();
        lbo = new javax.swing.JLabel();
        lbu = new javax.swing.JLabel();
        lbimpar = new javax.swing.JLabel();
        lbpar = new javax.swing.JLabel();
        txtfich = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MANEJO DE CADENAS");

        TArea1.setColumns(20);
        TArea1.setRows(5);
        jScrollPane1.setViewportView(TArea1);

        jLabel2.setText("Ingrese un texto o abra un archivo");

        jButton1.setText("Procesar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tarea2.setBackground(new java.awt.Color(0, 0, 0));
        Tarea2.setColumns(20);
        Tarea2.setForeground(new java.awt.Color(255, 255, 255));
        Tarea2.setRows(5);
        Tarea2.setEnabled(false);
        jScrollPane2.setViewportView(Tarea2);

        jLabel3.setText("Longitud de Texto............");

        jLabel4.setText("Total de palabras..............");

        jLabel5.setText("Primer letra del Texto......");

        jLabel6.setText("Ultima letra de Texto.......");

        jLabel7.setText("Letra central del Texto....");

        jLabel8.setText("Primera palabra..............");

        jLabel9.setText("Palabra central...............");

        jLabel10.setText("Ultima Palabra...............");

        lbLongitudtxt.setForeground(new java.awt.Color(255, 0, 0));
        lbLongitudtxt.setText("**");

        lbTotalpalabras.setForeground(new java.awt.Color(255, 0, 0));
        lbTotalpalabras.setText("**");

        lbPrimeraLetra.setForeground(new java.awt.Color(255, 0, 0));
        lbPrimeraLetra.setText("**");

        lbUltimoLetraTexto.setForeground(new java.awt.Color(255, 0, 0));
        lbUltimoLetraTexto.setText("**");

        lbLetraCentral.setForeground(new java.awt.Color(255, 0, 0));
        lbLetraCentral.setText("**");

        lbPrimeraPalabra.setForeground(new java.awt.Color(255, 0, 0));
        lbPrimeraPalabra.setText("**");

        lbPalabraCentral.setForeground(new java.awt.Color(255, 0, 0));
        lbPalabraCentral.setText("**");

        lbUltimaPalabra.setForeground(new java.awt.Color(255, 0, 0));
        lbUltimaPalabra.setText("**");

        jLabel11.setText("Repeticiones de \"A\",\"a\", \"á\"");

        jLabel12.setText("Repeticiones de \"E\",\"e\", \"é\"");

        jLabel13.setText("Repeticiones de \"O\",\"o\", \"ó\"");

        jLabel14.setText("Repeticiones de \"I\",\"i\", \"í\"");

        jLabel15.setText("Palabras con cantidad de Caracteres par");

        jLabel16.setText("Repeticiones de \"U\",\"u\", \"ú\"");

        jLabel17.setText("Palabras con cantidad de caracteres impar");

        lba.setForeground(new java.awt.Color(255, 0, 0));
        lba.setText("**");

        lbe.setForeground(new java.awt.Color(255, 0, 0));
        lbe.setText("**");

        lbi.setForeground(new java.awt.Color(255, 0, 0));
        lbi.setText("**");

        lbo.setForeground(new java.awt.Color(255, 0, 0));
        lbo.setText("**");

        lbu.setForeground(new java.awt.Color(255, 0, 0));
        lbu.setText("**");

        lbimpar.setForeground(new java.awt.Color(255, 0, 0));
        lbimpar.setText("**");

        lbpar.setForeground(new java.awt.Color(255, 0, 0));
        lbpar.setText("**");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("CLAVE MURCIELAGO");

        jMenu1.setText("Archivo ");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Gurdar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem3.setText("Guardar como");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Copiar");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Cortar");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Pegar");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Buscar");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("Remplazar");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTotalpalabras)
                                .addGap(60, 60, 60)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbUltimaPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPalabraCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPrimeraPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbLetraCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbUltimoLetraTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPrimeraLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbLongitudtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lba)
                                    .addComponent(lbimpar)
                                    .addComponent(lbpar)
                                    .addComponent(lbu)
                                    .addComponent(lbo)
                                    .addComponent(lbi)
                                    .addComponent(lbe)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfich, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbLongitudtxt)
                    .addComponent(jLabel11)
                    .addComponent(lba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbTotalpalabras)
                    .addComponent(jLabel12)
                    .addComponent(lbe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPrimeraLetra)
                            .addComponent(jLabel14)
                            .addComponent(lbi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUltimoLetraTexto)
                            .addComponent(jLabel13)
                            .addComponent(lbo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLetraCentral)
                            .addComponent(jLabel16)
                            .addComponent(lbu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPrimeraPalabra)
                            .addComponent(jLabel15)
                            .addComponent(lbpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPalabraCentral)
                            .addComponent(jLabel17)
                            .addComponent(lbimpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUltimaPalabra)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*-----------------------------------------------FUNCIONES---DEL---PIRMER---MODULO-------------------------------------------------------*/
    public void LongitudTexto(){
    String texto = this.TArea1.getText();
    this.lbLongitudtxt.setText(""+texto.length());
    }
    // total de palabras
     public void TotalPalabras(){
         String texto = this.TArea1.getText();
         String [] palabra ;
         palabra = texto.trim().split(" +");
         this.lbTotalpalabras.setText(""+palabra.length);
         ultimo =Integer.parseInt(this.lbLongitudtxt.getText());
    }
     // primera letra del texto
      public void PrimeraLetra(){
    String texto = this.TArea1.getText();
    char letra=' ' ;
        letra = texto.charAt(0);
        lbPrimeraLetra.setText(""+letra);
    }
     // ultima letra
      public void UltimaLetra(){
    String texto = this.TArea1.getText();
    char letra=' ' ;
        if(texto.charAt(texto.length()-1)=='.'){
             letra= texto.charAt(texto.length()-2);
             this.lbUltimoLetraTexto.setText(""+letra);
        }else{
            letra= texto.charAt(texto.length()-1);
            this.lbUltimoLetraTexto.setText(""+letra);
        }  
    }
      // letra central
      public void LetraCentral(){
    String texto = this.TArea1.getText();
    char letra=' ' ;
            letra= texto.charAt((texto.length()-1)/2);
            lbLetraCentral.setText(""+letra);

    }
      // primera palabra
       public void PrimeraPalabra(){
    String texto = this.TArea1.getText();
    String palabra = "";
    for (int i=0;i<=texto.length()-1;i++){
        if(texto.charAt(i)==' '){
        break;
        }else{
        palabra = ""+palabra+texto.charAt(i);
        }
    }
        lbPrimeraPalabra.setText(""+palabra);

    }
       // ultima palabra
              public void UltimaPalabra(){
    String texto = this.TArea1.getText();
    String palabra = "";
    if(texto.charAt(texto.length()-1)=='.'){
         for (int i=texto.length()-2;i>=0;i--){
        if(texto.charAt(i)==' '){
        break;
        }else{
        palabra = ""+texto.charAt(i)+palabra;
        }
    }
    }else{
     for (int i=texto.length()-1;i>=0;i--){
        if(texto.charAt(i)==' '){
        break;
        }else{
        palabra = ""+texto.charAt(i)+palabra;
        }
    }
    }
        lbUltimaPalabra.setText(""+palabra);
    }
    // Palabra cental ----------------------------------------------------------------------------PENDIENTE----------------------------------------------------------------------------------------------
              public void PalabraCentral(){
                  int contador=0;
                  String texto = this.TArea1.getText();
                  String contructor_de_palabras=" ";
                    int Npalabras = Integer.parseInt(this.lbTotalpalabras.getText());
                  String [] palabras = new String [Npalabras]; 
                    
                   for (int i =0; i<=texto.length()-1;i++){
                       if(texto.charAt(i)==' '){
                   palabras[contador]=contructor_de_palabras ;
                   contructor_de_palabras=" ";
                   contador++;
                   }else{    
                       contructor_de_palabras=""+contructor_de_palabras+texto.charAt(i);
                       } 
                   }
                   
                    lbPalabraCentral.setText(""+palabras[(Npalabras)/2]);
              }
    /*-----------------------------------------------FUNCIONES---DEL---SEGUNDO---MODULO-------------------------------------------------------*/ 
              public void ConteoBocales(){
                   String texto = this.TArea1.getText();
                   int a=0,e=0,i=0,o=0,u=0;
                  for(int j =0; j<=texto.length()-1;j++){
                        if(texto.charAt(j)=='a'||texto.charAt(j)=='A'||texto.charAt(j)=='á'){
                        a++;
                         }else if(texto.charAt(j)=='e'||texto.charAt(j)=='E'||texto.charAt(j)=='é'){
                             e++;    
                         }else if(texto.charAt(j)=='i'||texto.charAt(j)=='I'||texto.charAt(j)=='í'){
                             i++;    
                         }else if(texto.charAt(j)=='o'||texto.charAt(j)=='O'||texto.charAt(j)=='ó'){
                             o++;    
                         }else if(texto.charAt(j)=='u'||texto.charAt(j)=='U'||texto.charAt(j)=='ú'){
                             u++;    
                         }
                  }
              //mostrar contreo
              lba.setText(""+a);lbe.setText(""+e);lbi.setText(""+i);lbo.setText(""+o);lbu.setText(""+u);
              }
              // contidades de palabras par e impar
              public void ParImpar(){
               String texto = this.TArea1.getText();
               int par=0,impar=0,contador1=0;
               //
                int contador=0;
                  String contructor_de_palabras="";
                    int Npalabras = Integer.parseInt(this.lbTotalpalabras.getText());
                  String [] palabras = new String [Npalabras]; 
                    
                   for (int i =0; i<texto.length()-1;i++){
                      
                       if(texto.charAt(i)==' '){
                         palabras[contador]=contructor_de_palabras ;
                   //
                         if(contador1%2==0){
                             par++;
                             contador1=0;
                         }else{
                            impar++;
                            contador1=0;
                         }
                  
                   contructor_de_palabras="";
                   contador++;
                   }else{
                           
                       contructor_de_palabras=""+contructor_de_palabras+texto.charAt(i);
                         contador1++;
                       }
                        
                   }
                    lbpar.setText(""+par);
                    lbimpar.setText(""+impar);
              }
              // clave murcielago
              public void Murci(){
               String texto = this.TArea1.getText();
               String texto1="";
               
               for(int i = 0; i<=texto.length()-1;i++){
                   if(texto.charAt(i)=='M'||texto.charAt(i)=='m'){
                   texto1=""+texto1+'0';
                   }else if(texto.charAt(i)=='U'||texto.charAt(i)=='u'||texto.charAt(i)=='ú'){
                       texto1=""+texto1+'1';
                   }else if(texto.charAt(i)=='r'||texto.charAt(i)=='R'){
                       texto1=""+texto1+'2';
                   }else if(texto.charAt(i)=='C'||texto.charAt(i)=='c'){
                       texto1=""+texto1+'3';
                   }else if(texto.charAt(i)=='I'||texto.charAt(i)=='i'||texto.charAt(i)=='í'){
                       texto1=""+texto1+'4';
                   }else if(texto.charAt(i)=='E'||texto.charAt(i)=='e'||texto.charAt(i)=='é'){
                       texto1=""+texto1+'5';
                   }else if(texto.charAt(i)=='L'||texto.charAt(i)=='l'){
                       texto1=""+texto1+'6';
                   }else if(texto.charAt(i)=='A'||texto.charAt(i)=='a'||texto.charAt(i)=='á'){
                       texto1=""+texto1+'7';
                   }else if(texto.charAt(i)=='G'||texto.charAt(i)=='g'){
                       texto1=""+texto1+'8';
                   }else if(texto.charAt(i)=='O'||texto.charAt(i)=='o'||texto.charAt(i)=='ó'){
                       texto1=""+texto1+'9';
                   }else{
                   texto1=""+texto1+texto.charAt(i);
                   }
               }
              
               Tarea2.setText(""+texto1);
              }
              
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LongitudTexto();
        TotalPalabras();
        PrimeraLetra();
         UltimaLetra();
         LetraCentral();
         PrimeraPalabra();
         UltimaPalabra();
         PalabraCentral();
         //segundo modulo
         ConteoBocales();
         ParImpar();
         Murci();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
          JFileChooser fch = new  JFileChooser();
      
        int selc = fch.showSaveDialog(this);
        
        if(selc == JFileChooser.APPROVE_OPTION){
        
            File fichero = fch.getSelectedFile();
            this.txtfich.setText(fichero.getAbsolutePath());
        try(FileWriter fw = new FileWriter(fichero)){
            fw.write(TArea1.getText());
        
        }catch(IOException el ){
        el.printStackTrace();
        }
        
        }   
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      JFileChooser fch = new  JFileChooser();
      FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT","txt");
      fch.setFileFilter(filtro);
        int selc = fch.showOpenDialog(this);
        
        if(selc == JFileChooser.APPROVE_OPTION){
        File fichero = fch.getSelectedFile();
        this.txtfich.setText(fichero.getAbsolutePath());
        try(FileReader fr = new FileReader(fichero)){
        String cadena ="";
        int valor = fr.read();
        while(valor != -1){
        cadena = cadena + (char)valor;
        valor = fr.read();
        }
        this.TArea1.setText(cadena);
        }catch(IOException el ){
        el.printStackTrace();
        }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      String fichero= this.txtfich.getText();
      String texto = this.TArea1.getText();
        arch.borrar(""+fichero);
        arch.escribir(""+fichero,""+texto);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TArea1;
    private javax.swing.JTextArea Tarea2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbLetraCentral;
    private javax.swing.JLabel lbLongitudtxt;
    private javax.swing.JLabel lbPalabraCentral;
    private javax.swing.JLabel lbPrimeraLetra;
    private javax.swing.JLabel lbPrimeraPalabra;
    private javax.swing.JLabel lbTotalpalabras;
    private javax.swing.JLabel lbUltimaPalabra;
    private javax.swing.JLabel lbUltimoLetraTexto;
    private javax.swing.JLabel lba;
    private javax.swing.JLabel lbe;
    private javax.swing.JLabel lbi;
    private javax.swing.JLabel lbimpar;
    private javax.swing.JLabel lbo;
    private javax.swing.JLabel lbpar;
    private javax.swing.JLabel lbu;
    private javax.swing.JTextField txtfich;
    // End of variables declaration//GEN-END:variables
}
