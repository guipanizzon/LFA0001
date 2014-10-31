package lfa;

import java.util.Stack;

public class Main {
    
public static void main(String args[]){
    
 final Stack pilha=null;
  /*   java.awt.EventQueue.invokeLater(new Runnable() {
         
          @Override
            public void run() {
                 
                new Aplicacao(pilha).setVisible(true);
            }
        });
    
     
  */
     
     
        

Automato automato = new Automato(pilha);
 
     
  //  P = {S → aB  aSB, B → b}
    
    automato.addVariavelInicial("S");
    automato.adicionaGramaticaGreibach("S->a");
    automato.adicionaGramaticaGreibach("S->vDDDD");
    automato.adicionaGramaticaGreibach("B->bFFFF");
    automato.adicionaGramaticaGreibach("B->bFFFF");
    automato.adicionaGramaticaGreibach("C->aFFFF");
    automato.getGramatica();
    automato.addPalavra("a,b");
    automato.conversaoAP();

    automato.getPalavra();
    automato.incluiTransicoes();


automato.addEstadosFinais("q0,q1"); 
automato.addPalavra("abc");
    

    automato.getSextupla();
System.out.println("\nInício do reconhecimento...");
automato.iniciar();
      


}







}








