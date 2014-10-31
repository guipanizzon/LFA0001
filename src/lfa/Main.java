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
    
  
    automato.adicionaGramaticaGreibach("S->aBB");
    automato.adicionaGramaticaGreibach("S->vD");
     
    automato.conversaoGreibachAP();
 

    
    
    
    
    

/*

//M1 = ({a, b}, {q0, q1, qf}, δ1, q0, {qf}, {B})
//L1={aˆnbˆn / n>=0}
automato.addEstados("q0,q1,q2,q3,q4");
automato.addEstadoInicial("q0");
automato.addAlfabeto("ab");
automato.addAlfabetoPilha("B");
//automato.addTransicao("q0,&,&,q1,&");
//automato.addTransicao("q0,a,&,q4,&");


δ1(q0, a,&) = {(q0, B)}
δ1(q0, b, B) = {(q1,&)}
δ1(q0, &, &) = {(qf ,&)}
δ1(q1, b, B) = {(q1,&)}
δ1(q1, ?, ?) = {(qf ,&)}


automato.addTransicao("q0,a,&,q1,B");
automato.addTransicao("q1,b,B,q2,&");
automato.addTransicao("q2,c,&,q1,B");







//automato.addTransicao("q1,b,&,q2,&");
//automato.addTransicao("q2,c,&,q3,&");



//automato.pilha.push("b");

  
automato.addTransicao("q0,b,B,qf,&");
automato.addTransicao("q1,&,&,q1,&");
automato.addTransicao("q1,?,?,qf,&");

automato.addEstadosFinais("q0,q1"); 
automato.addPalavra("abc");
automato.getSextupla();
automato.getPalavra();

    System.out.print("\n---------------------");

System.out.println("\nInício do reconhecimento...");
automato.iniciar();
*/

}







}








