/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Cuadrante.Cuadrante;
import Cuadrante.CuadranteMuro;
import Cuadrante.CuadranteInicioFin;
import Cuadrante.CuadranteNoSeleccionado;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Grupo IApp A*
 */
public class Ventana_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Principal
     */
    int cont=0;
    String [] elementos={"(0;0)","(0;1)","(0;2)","(0;3)","(1;0)","(1;1)","(1;2)","(1;3)","(2;0)","(2;1)","(2;2)","(2;3)","(3;0)","(3;1)","(3;2)","(3;3)"};
    ArrayList<CuadranteInicioFin> lstCIF=null;
    ArrayList<CuadranteMuro> lstM=null;
    ArrayList<CuadranteNoSeleccionado> lstNull=null;
    public Ventana_Principal() {
        initComponents();
        insertImage();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/icon.png"));
        setIconImage(icon);
        this.setTitle("IApp A* V1.0");
        this.setLocationRelativeTo(null);
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
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        bnt32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IApp A*");

        btnProcesar.setBackground(new java.awt.Color(255, 255, 255));
        btnProcesar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(0, 153, 51));
        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn13.setBackground(new java.awt.Color(255, 255, 255));
        btn13.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn13.setText("(1;3)");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn20.setBackground(new java.awt.Color(255, 255, 255));
        btn20.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn20.setText("(2;0)");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setBackground(new java.awt.Color(255, 255, 255));
        btn21.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn21.setText("(2;1)");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setBackground(new java.awt.Color(255, 255, 255));
        btn22.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn22.setText("(2;2)");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setBackground(new java.awt.Color(255, 255, 255));
        btn23.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn23.setText("(2;3)");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn31.setBackground(new java.awt.Color(255, 255, 255));
        btn31.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn31.setText("(3;1)");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn30.setBackground(new java.awt.Color(255, 255, 255));
        btn30.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn30.setText("(3;0)");
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        bnt32.setBackground(new java.awt.Color(255, 255, 255));
        bnt32.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        bnt32.setText("(3;2)");
        bnt32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt32ActionPerformed(evt);
            }
        });

        btn33.setBackground(new java.awt.Color(255, 255, 255));
        btn33.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn33.setText("(3;3)");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn00.setBackground(new java.awt.Color(255, 255, 255));
        btn00.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn00.setText("(0;0)");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn01.setBackground(new java.awt.Color(255, 255, 255));
        btn01.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn01.setText("(0;1)");
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn02.setBackground(new java.awt.Color(255, 255, 255));
        btn02.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn02.setText("(0;2)");
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn03.setBackground(new java.awt.Color(255, 255, 255));
        btn03.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn03.setText("(0;3)");
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(255, 255, 255));
        btn10.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn10.setText("(1;0)");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(255, 255, 255));
        btn11.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn11.setText("(1;1)");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(255, 255, 255));
        btn12.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btn12.setText("(1;2)");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(bnt32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // Código de buscar la respuesta.
        Manhattan obj= new Manhattan();
        
        ArrayList<CuadranteInicioFin> listaInicioFin=Proceso.lstCIF;
        ArrayList<CuadranteMuro> listaMuros = Proceso.lstCM;
        ArrayList<CuadranteNoSeleccionado> cuadranteNoS = Proceso.lstNS;

        
        //Heuristico con manhatan a punto inicial
        int manhattan=obj.distanciaPuntos(listaInicioFin.get(0), listaInicioFin.get(1));
        listaInicioFin.get(0).setHeuristico(manhattan);
         
        //Agregando heuristicos a puntos que no han sido seleccionados
        for (CuadranteNoSeleccionado elemento : lstNull()) {
            manhattan=obj.distanciaPuntos2(elemento, listaInicioFin.get(1));
            elemento.setHeuristico(manhattan);
        }
        
        
        Proceso objProceso=new Proceso();
        System.out.println("ELEMENTOS CRUZ");
        //Se obtiene array de elementos adyacentes de la presente coordenada
        //Se envia como parametro una cadena con la coordenada Ej: (2;1)
        
        String coordenadaInicial=listaInicioFin.get(0).getCoordenada();
        System.out.println(listaInicioFin.get(0).getCoordenada()+" heuristico: "+listaInicioFin.get(0).getHeuristico());
        int i=2;
        boolean pass=false;
        boolean pass2=false;
        boolean pass3=false;
        String cAlternativa="";
        
        while(i<10){
            System.out.println("Rutina 1");
        ArrayList<Cuadrante> pcuadrante = new ArrayList<Cuadrante>();
        ArrayList<Cuadrante> cuadrante= objProceso.getCruz(coordenadaInicial);
        for (CuadranteNoSeleccionado cuadranteNoS1 : cuadranteNoS) {
            for (int j = 0; j < cuadrante.size(); j++) {
                
               if(!pass){
                    if(cuadrante.get(j).getCoordenada().equals(cuadranteNoS1.getCoordenada())  ){
                     System.out.println("cuadrante: "+cuadrante.get(j).getCoordenada()+" noS: "+cuadranteNoS1.getCoordenada()+" Heuristico: "+cuadranteNoS1.getHeuristico());
                     pcuadrante.add(cuadranteNoS1);
                    }

                    if(cuadrante.get(j).getCoordenada().equals(listaInicioFin.get(1).getCoordenada())){
                        System.out.println("Finalizo, encontro la solución");
                        pass=true;
                    }
               }
               
            } 
        }
        
        if(!pass){
        int aux=0;
        
        for (int j = 0; j < pcuadrante.size(); j++) {
            Cuadrante get = pcuadrante.get(j);
            if(j==0){
                aux=get.getHeuristico();
                coordenadaInicial=get.getCoordenada();
            }
            if(j>0){
   
                if(aux==get.getHeuristico()){
                pass2=true;
                cAlternativa=get.getCoordenada();
                
                }

                if(aux>get.getHeuristico()){
                    aux=get.getHeuristico();
                    coordenadaInicial=get.getCoordenada();
                }
 
            }
        }
        
        System.out.println("Cuadrante escojido: "+coordenadaInicial+" menor por heuristico es: "+aux);
        pintarSolucion(coordenadaInicial,java.awt.Color.GREEN);
        System.out.println("Coordenada Objetivo: "+listaInicioFin.get(1).getCoordenada());
        
        
        }
        
        if(pass2 && !pass3){       
                pintarSolucion(cAlternativa,java.awt.Color.ORANGE);
                System.out.println("Camino alternativo: "+cAlternativa);
                subRutina(cAlternativa);
                pass2=false;
                pass3=true;
        }
        
        
        i++;
        System.out.println("............");
        }
        
        
    }//GEN-LAST:event_btnProcesarActionPerformed
    
    public void subRutina(String co){
        ArrayList<CuadranteInicioFin> listaInicioFin=Proceso.lstCIF;
        ArrayList<CuadranteMuro> listaMuros = Proceso.lstCM;
        ArrayList<CuadranteNoSeleccionado> cuadranteNoS = Proceso.lstNS;
        Proceso objProceso=new Proceso();
        String coordenadaInicial=co;
        
        
        int i=2;
        boolean pass=false;
        
        
         
        while(i<10){
        System.out.println("Rutina 2");
        ArrayList<Cuadrante> pcuadrante = new ArrayList<Cuadrante>();
        ArrayList<Cuadrante> cuadrante= objProceso.getCruz(coordenadaInicial);
        for (CuadranteNoSeleccionado cuadranteNoS1 : cuadranteNoS) {
            for (int j = 0; j < cuadrante.size(); j++) {
                
               if(!pass){
                    if(cuadrante.get(j).getCoordenada().equals(cuadranteNoS1.getCoordenada())  ){
                     System.out.println("cuadrante: "+cuadrante.get(j).getCoordenada()+" noS: "+cuadranteNoS1.getCoordenada()+" Heuristico: "+cuadranteNoS1.getHeuristico());
                     pcuadrante.add(cuadranteNoS1);
                    }

                    if(cuadrante.get(j).getCoordenada().equals(listaInicioFin.get(1).getCoordenada())){
                        System.out.println("Finalizo, encontro la solución");
                        pass=true;
                    }
               }
               
            } 
        }
        
        if(!pass){
        int aux=0;
        
        for (int j = 0; j < pcuadrante.size(); j++) {
            Cuadrante get = pcuadrante.get(j);
            if(j==0){
                aux=get.getHeuristico();
                coordenadaInicial=get.getCoordenada();
            }
            if(j>0){
                if(aux>get.getHeuristico()){
                    aux=get.getHeuristico();
                    coordenadaInicial=get.getCoordenada();
                }
                
                
                
            }
        }
        
        System.out.println("Cuadrante escojido: "+coordenadaInicial+" menor por heuristico es: "+aux);
        pintarSolucion(coordenadaInicial,java.awt.Color.ORANGE);
        System.out.println("Coordenada Objetivo: "+listaInicioFin.get(1).getCoordenada());
        System.out.println("............");
        
        }
        
        i++;
        }
    }
    
    public void pintarSolucion(String co, java.awt.Color color){
    if(co.equals("(0;0)"))
        btn00.setBackground(color); 
    if(co.equals("(0;1)"))
        btn01.setBackground(color);
    if(co.equals("(0;2)"))
        btn02.setBackground(color);
    if(co.equals("(0;3)"))
        btn03.setBackground(color);
    if(co.equals("(1;0)"))
        btn10.setBackground(color);
    if(co.equals("(1;1)"))
        btn11.setBackground(color);
    if(co.equals("(1;2)"))
        btn12.setBackground(color);
    if(co.equals("(1;3)"))
        btn13.setBackground(color);
    if(co.equals("(2;0)"))
        btn20.setBackground(color);
    if(co.equals("(2;1)"))
        btn21.setBackground(color);
    if(co.equals("(2;2)"))
        btn22.setBackground(color);
    if(co.equals("(2;3)"))
        btn23.setBackground(color);
    if(co.equals("(3;0)"))
        btn30.setBackground(color);
    if(co.equals("(3;1)"))
        btn31.setBackground(color);
    if(co.equals("(3;2)"))
        bnt32.setBackground(color);
    if(co.equals("(3;3)"))
        btn33.setBackground(color);

    }
    
    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        cont++;
        changeColor(btn00);
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        cont++;
        changeColor(btn01);
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        cont++;
        changeColor(btn02);
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        cont++;
        changeColor(btn03);
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        cont++;
        changeColor(btn10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        cont++;
        changeColor(btn11);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        cont++;
        changeColor(btn12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        cont++;
        changeColor(btn13);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        cont++;
        changeColor(btn20);
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        cont++;
        changeColor(btn21);
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        cont++;
        changeColor(btn22);
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        cont++;
        changeColor(btn23);
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        cont++;
        changeColor(btn30);
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        cont++;
        changeColor(btn31);
    }//GEN-LAST:event_btn31ActionPerformed

    private void bnt32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt32ActionPerformed
        cont++;
        changeColor(bnt32);
    }//GEN-LAST:event_bnt32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        cont++;
        changeColor(btn33);
    }//GEN-LAST:event_btn33ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cont=0;
        cleanButtons(btn00);    
        cleanButtons(btn01);
        cleanButtons(btn02);
        cleanButtons(btn03);
        cleanButtons(btn10);
        cleanButtons(btn11);
        cleanButtons(btn12);
        cleanButtons(btn13);
        cleanButtons(btn20);
        cleanButtons(btn21);
        cleanButtons(btn22);
        cleanButtons(btn23);
        cleanButtons(btn30);
        cleanButtons(btn31);
        cleanButtons(bnt32);
        cleanButtons(btn33);
        Proceso.lstCIF.clear();
        Proceso.lstCM.clear();
        Proceso.lstNS.clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cleanButtons(JButton btn)
    {
        btn.setBackground(java.awt.Color.WHITE);        
    }
    public void changeColor(JButton btn)
    {
        Proceso obj=new Proceso();
        /*System.out.println("ELEMENTOS CRUZ");
        //Se obtiene array de elementos adyacentes de la presente coordenada
        //Se envia como parametro una cadena con la coordenada Ej: (2;1)
        for (Cuadrante cuadrante : obj.getCruz(btn.getText())) {
            System.out.println(cuadrante.getCoordenada());
        }
        System.out.println("............");
        */
        if(cont<=2)
        {
            if(cont==1)
            {
                btn.setBackground(java.awt.Color.GREEN); 
            }else
            {
                btn.setBackground(java.awt.Color.BLUE); 
            }
            lstCIF= obj.setLstCI(obj.setCIF(btn.getText()));
        }else
        {
            if(btn.getBackground().toString().trim().equals("java.awt.Color[r=0,g=255,b=0]"))
            {
                btn.setBackground(java.awt.Color.GREEN);        
            }else
            {
                btn.setBackground(java.awt.Color.RED);       
                lstM= obj.setLstCF(obj.setCM(btn.getText()));
            }
        }
    }
    public ArrayList<CuadranteNoSeleccionado> lstNull()
    {
        ArrayList<String> lstAll=new ArrayList <String>();
        lstAll.add("(0;0)");lstAll.add("(0;1)");lstAll.add("(0;2)");lstAll.add("(0;3)");
        lstAll.add("(1;0)");lstAll.add("(1;1)");lstAll.add("(1;2)");lstAll.add("(1;3)");
        lstAll.add("(2;0)");lstAll.add("(2;1)");lstAll.add("(2;2)");lstAll.add("(2;3)");
        lstAll.add("(3;0)");lstAll.add("(3;1)");lstAll.add("(3;2)");lstAll.add("(3;3)");
        ArrayList<Integer> pos=new ArrayList <Integer>();
        for (int i = 0; i < lstM.size(); i++)		
        {	
            for (int j = 0; j < elementos.length; j++) {
                if(lstM.get(i).getCoordenada().equals(elementos[j]))
                {
                   pos.add(j);
                }
            }
        }
        for (int i = 0; i < lstCIF.size(); i++)		
        {	
            for (int j = 0; j < elementos.length; j++) {
                if(lstCIF.get(i).getCoordenada().equals(elementos[j]))
                {
                   pos.add(j);
                }
            }
        }
        Collections.sort(pos);
        int i=0;
        for (Integer item : pos) {
            if(i==0)
            {
                lstAll.remove(Integer.parseInt(item.toString()));
            }else{
                lstAll.remove(Integer.parseInt(item.toString())-i);
            }
            i++;
        }
        
        Proceso obj=new Proceso();
        
        for (String item: lstAll) {
            lstNull= obj.setLstNS(obj.setNS(item));
        }
        return lstNull;
    }
    
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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }
    public void insertImage()
    {
        ImagePanel Imagen = new ImagePanel();
        panel1.add(Imagen);
        panel1.repaint();
    }
   
    public class ImagePanel extends JPanel 
    {
        public ImagePanel()
        {
            //Se crea un método cuyo parámetro debe ser un objeto Graphics
            this.setSize(465,470);
        }
        @Override
        public void paint(Graphics grafico)
        {
            Dimension height = getSize();
            //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/Img/img2.jpg")); 
            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt32;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
