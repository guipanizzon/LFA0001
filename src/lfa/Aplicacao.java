/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfa;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.swing.JOptionPane;

import javax.swing.text.BadLocationException;

public class Aplicacao extends javax.swing.JFrame {
    ArrayList<String> arrayListAlfabeto = new ArrayList<String>();
    ArrayList<String> ArrayListConjuntoEstados = new ArrayList<String>();
    ArrayList<String> ArrayListConjuntoEstadosFinais= new ArrayList<String>();
    ArrayList<String> ArrayListAlfabetoPilha = new ArrayList<String>();
    ArrayList<String> arrayListFuncaoPrograma = new ArrayList<String>();
  
    ArrayList<String> arrayTest = new ArrayList<String>();
   
    private Stack pilha;
    String palavra;
    char[] vetorPalavra;
    String estadoAtual;
    String estadoInicial;

    String simboloFita;
    String simboloTopoPilha;
    String estadoSeguinte;
    String gravarNaPilha;
    String[] vetorTransicao;
    String fatoracao;
    
    Map<String, List<String>> adjacencias;
    List<String> estadosConjunto;
    
    
    
    
    String epsilon = "&";
      public Aplicacao(Stack pilha) {
          this.pilha=pilha;
        initComponents();

    }

      
      
      
      
      
      
      
      
      
      
      
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        conjuntoEstados = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        simbolosAlfabeto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        simbolosAlfabetoPilha = new javax.swing.JTextArea();
        estadoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        simboloInicioPilhaText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        conjuntoEstadosFinais = new javax.swing.JTextArea();
        runButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        funcaoPrograma = new javax.swing.JTextArea();
        palavraText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Conjunto finito de estados");

        conjuntoEstados.setColumns(20);
        conjuntoEstados.setRows(5);
        conjuntoEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conjuntoEstadosMouseExited(evt);
            }
        });
        conjuntoEstados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                conjuntoEstadosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(conjuntoEstados);

        simbolosAlfabeto.setColumns(20);
        simbolosAlfabeto.setRows(5);
        jScrollPane2.setViewportView(simbolosAlfabeto);

        jLabel2.setText("Alfabeto (Símbolos de entrada)");

        jLabel3.setText("Alfabeto finito da pilha");

        simbolosAlfabetoPilha.setColumns(20);
        simbolosAlfabetoPilha.setRows(5);
        jScrollPane3.setViewportView(simbolosAlfabetoPilha);

        estadoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoTextFieldActionPerformed(evt);
            }
        });
        estadoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estadoTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setText("Estado inicial");

        simboloInicioPilhaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simboloInicioPilhaTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Símbolo de início da pilha");

        conjuntoEstadosFinais.setColumns(20);
        conjuntoEstadosFinais.setRows(5);
        conjuntoEstadosFinais.setBorder(javax.swing.BorderFactory.createTitledBorder("Conjunto de estados finais"));
        jScrollPane5.setViewportView(conjuntoEstadosFinais);

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        funcaoPrograma.setColumns(20);
        funcaoPrograma.setRows(5);
        funcaoPrograma.setBorder(javax.swing.BorderFactory.createTitledBorder("Função Programa"));
        jScrollPane6.setViewportView(funcaoPrograma);

        jLabel6.setText("Palavra a ser analisada:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(168, 168, 168)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(simboloInicioPilhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(estadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(palavraText)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(estadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(simboloInicioPilhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palavraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addComponent(runButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoTextFieldActionPerformed

    private void simboloInicioPilhaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simboloInicioPilhaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simboloInicioPilhaTextActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        // TODO add your handling code her
  if(conjuntoEstados.getText().equals("")){
      JOptionPane.showMessageDialog(null, "Preencha o campo conjunto finito de estados" );
  }else{
      if(simbolosAlfabeto.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Alfabeto (símbolos de entrada)"); 
      }else{
          if(simbolosAlfabetoPilha.getText().equals("")){
              JOptionPane.showMessageDialog(null, "Alfabeto finito da pilha"); 
          }else{
              if(funcaoPrograma.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Função programa"); 
              }else{
                  if(estadoTextField.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Estado inicial"); 
                  }else{
                      if(conjuntoEstadosFinais.getText().equals("")){
                          JOptionPane.showMessageDialog(null, "Conjunto de estados finais");
                      }else{
                          adicionaConjuntoEstados();
                          adicionaAlfabeto();
                          adicionaAlfabetoPilha();
                          addFuncaoPrograma();                   
                          addSimboloInicialPilha();
                          addEstadoInicial();
                          adicionaConjuntoEstadosFinais();
                          addPalavra();
                        
                          
                        }
                    }
               }
            }
        }
    }
         
  
    }//GEN-LAST:event_runButtonActionPerformed

    private void conjuntoEstadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conjuntoEstadosKeyTyped
       // TODO add your handling code here:
    }//GEN-LAST:event_conjuntoEstadosKeyTyped

    private void conjuntoEstadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conjuntoEstadosMouseExited
         
        
    }//GEN-LAST:event_conjuntoEstadosMouseExited

    private void estadoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadoTextFieldKeyTyped
      // TODO add your handling code here:
    }//GEN-LAST:event_estadoTextFieldKeyTyped
        
    
    public void alteraConteudo(){
                                    ArrayListConjuntoEstados.clear();
                                    ArrayListConjuntoEstadosFinais.clear();
                                    arrayListAlfabeto.clear();
                                    arrayListFuncaoPrograma.clear();
                                   
                                    ArrayListAlfabetoPilha.clear();
                                    
    }
   
      
     
        
      
        
    
        
        
                

        
        

    
    
    public void addSimboloInicialPilha(){
        String simboloInicialPilha= simboloInicioPilhaText.getText();  

        if(simboloInicialPilha.length()>0){
              
            pilha.push(simboloInicialPilha);
           
            for(int i=0; i<pilha.size(); i++){
                System.out.println(pilha.get(i));
                
            }
            
        
        
        }
    
    }
    public void addPalavra(){
       palavra=palavraText.getText();
       vetorPalavra=palavra.toCharArray();
       
       for (int i = 0; i < vetorPalavra.length; i++) {
            System.out.print(vetorPalavra[i]);
        }
     
    }
    
    public void addEstadoInicial(){
        System.out.println("Estado inicial: ");
        estadoInicial=estadoTextField.getText();
        
        
        System.out.println(estadoInicial);
        System.out.println("\n-----------------");
        
    }
    
     public void adicionaConjuntoEstadosFinais() {
        int quant = conjuntoEstadosFinais.getLineCount();
     // vetorConjuntoEstados=new String[quant];

        for (int i = 0; i < quant; i++) {
            try {
                int inicio = conjuntoEstadosFinais.getLineStartOffset(i);
                int fim = conjuntoEstadosFinais.getLineEndOffset(i);
                String linha = conjuntoEstadosFinais.getText(inicio, fim - inicio);
                ArrayListConjuntoEstadosFinais.add(linha);

              //  JOptionPane.showMessageDialog(null, "Linha " + (i + 1) + " = " + linha);
            } catch (BadLocationException ble) {
                // possiveis erros são tratados aqui
            }
        }
        System.out.println("Conjunto de estados finais: ");
        for (String estadosFinais : ArrayListConjuntoEstadosFinais) {
            System.out.print(estadosFinais);
        }
        System.out.println("\n-----------------");

    }

    public void adicionaConjuntoEstados() {
        int quant = conjuntoEstados.getLineCount();
     // vetorConjuntoEstados=new String[quant];

        for (int i = 0; i < quant; i++) {
            try {
                int inicio = conjuntoEstados.getLineStartOffset(i);
                int fim = conjuntoEstados.getLineEndOffset(i);
                String linha = conjuntoEstados.getText(inicio, fim - inicio);
                
                ArrayListConjuntoEstados.add(linha);
                

              //  JOptionPane.showMessageDialog(null, "Linha " + (i + 1) + " = " + linha);
            } catch (BadLocationException ble) {
                // possiveis erros são tratados aqui
            }
        }
        System.out.println("Conjunto finito de estados: ");
        for (String vetorConjuntoEstado : ArrayListConjuntoEstados) {
            System.out.print(vetorConjuntoEstado);
        }
        System.out.println("-----------------");

    }

    public void adicionaAlfabeto() {
        int quant = simbolosAlfabeto.getLineCount();

        for (int i = 0; i < quant; i++) {
            try {
                int inicio = simbolosAlfabeto.getLineStartOffset(i);
                int fim = simbolosAlfabeto.getLineEndOffset(i);
                String linha = simbolosAlfabeto.getText(inicio, fim - inicio);
                arrayListAlfabeto.add(linha);

                // JOptionPane.showMessageDialog(null, "Linha " + (i + 1) + " = " + linha);
            } catch (BadLocationException ble) {
                // possiveis erros são tratados aqui
            }
        }
         System.out.println("Alfabeto(símbolos de entrada):");
        for (String vetorAlfabeto1 : arrayListAlfabeto) {
            System.out.print(vetorAlfabeto1);
        }
          System.out.println("\n-----------------");

    }

    public void adicionaAlfabetoPilha() {
        int quant = simbolosAlfabetoPilha.getLineCount();
       // vetorAlfabetoPilha=new String[quant];

        for (int i = 0; i < quant; i++) {
            try {
                int inicio = simbolosAlfabetoPilha.getLineStartOffset(i);
                int fim = simbolosAlfabetoPilha.getLineEndOffset(i);
                String linha = simbolosAlfabetoPilha.getText(inicio, fim - inicio);
                ArrayListAlfabetoPilha.add(linha);
                // JOptionPane.showMessageDialog(null, "Linha " + (i + 1) + " = " + linha);
            } catch (BadLocationException ble) {
                // possiveis erros são tratados aqui
            }
        }
        System.out.println("Alfabeto finito da pilha:");
        for (String vetorAlfabetoPilha1 : ArrayListAlfabetoPilha) {
            System.out.print(vetorAlfabetoPilha1);
        }
          System.out.println("\n-----------------");

    }

    public void addFuncaoPrograma() {
        int quant = funcaoPrograma.getLineCount();
        //vetorFuncaoPrograma=new String[quant];
        for (int i = 0; i < quant; i++) {
            try {
                int inicio = funcaoPrograma.getLineStartOffset(i);
                int fim = funcaoPrograma.getLineEndOffset(i);
                String linha = funcaoPrograma.getText(inicio, fim - inicio);
                arrayListFuncaoPrograma.add(linha);
                // JOptionPane.showMessageDialog(null, "Linha " + (i + 1) + " = " + linha);
            } catch (BadLocationException ble) {
                JOptionPane.showMessageDialog(null, "As transições devem ser da forma (x,x,x)=(x,x)");
                
            }
        }

        for (int i = 0; i < arrayListFuncaoPrograma.size(); i++) {
            fatoracao = arrayListFuncaoPrograma.get(i);
            String aux1, aux2, aux3;
            aux1 = fatoracao.replace("(", "");
            aux2 = aux1.replace(")", "");
            aux3 = aux2.replace("=", ",");
            vetorTransicao = aux3.split(",");
            
            estadoAtual = vetorTransicao[0];
            simboloFita = vetorTransicao[1];
            simboloTopoPilha = vetorTransicao[2];
            estadoSeguinte = vetorTransicao[3];
            gravarNaPilha = vetorTransicao[4];
            
        }
    }
    
    
    
  
    /* public void ExemploSubstring(){
   
     String url = "www.tiexpert.net";
     String dominio = url.substring(4);
     String site = url.substring(url.indexOf('.') + 1, url.lastIndexOf('.'));
     System.out.println("Análise da string:");
     System.out.println("Domínio: " + dominio);
     System.out.println("Site: " + site);
     }
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea conjuntoEstados;
    private javax.swing.JTextArea conjuntoEstadosFinais;
    private javax.swing.JTextField estadoTextField;
    private javax.swing.JTextArea funcaoPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField palavraText;
    private javax.swing.JButton runButton;
    private javax.swing.JTextField simboloInicioPilhaText;
    private javax.swing.JTextArea simbolosAlfabeto;
    private javax.swing.JTextArea simbolosAlfabetoPilha;
    // End of variables declaration//GEN-END:variables

 
}
