package lfa;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class Automato {
    public String estadoInicial;
    public String estadoCorrente;
    public ArrayList<String> estados = new ArrayList<>();
    public ArrayList<String> estadosFinais = new ArrayList<>();
    public ArrayList<String> palavra = new ArrayList<>();
    public String[] alfabeto;
    public String[] alfabetoPilha;
    ArrayList<ProducoesAP> funcaoPrograma = new ArrayList<>();
    HashMap<String,String> transicoesSimbolo =  new HashMap<>();
    String epsilon="&";
    Map<String,ArrayList<String>> possiveisTransicoes = new HashMap<>();
    ArrayList<String> palavraReserva= new ArrayList<>();
    
    ArrayList<ProducoesGramatica> gramatica = new ArrayList<>();
    
    List<String> adjacencias= new ArrayList<>();
    Stack pilha;
    
   
    public Automato(Stack pilha) {
        
        this.pilha=pilha;
        this.pilha=new Stack();
        
     
               
    }

     public void addTransicao(String novaTransicao){
         String[] aux=null;
         aux=novaTransicao.split(",");
         
         ProducoesAP trans = new ProducoesAP();
         
         trans.estadoAtual=    aux[0];
         trans.simboloFita=    aux[1];
         trans.simboloPilha=   aux[2];
         trans.estadoSeguinte= aux[3];
         trans.gravaNaPilha=   aux[4];
         
         funcaoPrograma.add(trans); 
         
         
     }

    public void addEstadoInicial(String estado){
        this.estadoInicial=estado;
       
   }  
    
    public void addEstadosFinais(String estado){
        String[] aux;
        aux=estado.split(",");
      
        for (int i = 0; i < aux.length; i++) {
                estadosFinais.add(aux[i]);
              
        }  
    }
    
    public void addAlfabeto(String alfabeto1){
        String[] aux;     
        aux=alfabeto1.split(",");
        alfabeto= new String[aux.length];
        for (int i = 0; i < aux.length; i++) {
            alfabeto[i]=aux[i];
           
        }
    }
    
    public void addAlfabetoPilha(String alfabetoPilha){
        String[]aux;
        aux=alfabetoPilha.split(",");
        this.alfabetoPilha = new String[aux.length];
        
            for (int i = 0; i < aux.length; i++) {
                this.alfabetoPilha[i]=aux[i];
                
        }
    }
    
 /*   public void adicionar(String leFita, String lePilha, String gravaPilha){
        if(leFita.equals("&") && lePilha.equals("&") && gravaPilha.equals("&")){
        }else{
            if(leFita.equals("&") && gravaPilha.equals("&")){
        }
    }
 
}
    */
    
     public void addPalavra(String palavra1){
        String aux[];
        aux=palavra1.split("");

        for(int i=0; i<aux.length; i++){
            this.palavra.add(i, aux[i]);
             
        }  
       
     }
   
     
     public int verificaAlfabeto(String verifica[]){
         if(alfabeto.length <=0){
             return 0;
         }
         return 1;
     }

    public void getSextupla(){
        /*("P=(Q,Σ,Γ,δ,q0,F), sendo:"
                + "\n-Q: conjunto finito de estados \n" +
"-Σ: alfabeto (simbolos de entrada) \n" +
"-Γ: alfabeto finito a pilha \n" +
"-δ: função de transição - δ: Q x (Σ ∪λ } ) x Γ→Q x Γ* \n" +
"-q0 : estado inicial \n" +
"-F: o conjunto de estados finais. ");
                */
        
       
         System.out.print("P=({");
         
         for(int i=0; i<estados.size(); i++){
             System.out.print(estados.get(i)+",");
         }
         
         
         System.out.printf("},{");
      
          for(int i=0; i< alfabeto.length; i++){
              System.out.printf(alfabeto[i]+",");            
          }
          System.out.print("},{");
          
          for(int i=0; i<alfabetoPilha.length; i++){
              System.out.print(alfabetoPilha[i]+",");
          }
          System.out.print("},δ,"+estadoInicial+",{");
          
          for (int i=0; i<estadosFinais.size(); i++){
              System.out.print(estadosFinais.get(i)+",");
          }
          System.out.print("})");
          System.out.println("\nSendo δ:");
          
          for(int i=0; i<funcaoPrograma.size(); i++){
    	  System.out.print("("+funcaoPrograma.get(i).estadoAtual+" ");
    	  System.out.print(funcaoPrograma.get(i).simboloFita+" ");
    	  System.out.print(funcaoPrograma.get(i).simboloPilha+")={");
    	  System.out.print(funcaoPrograma.get(i).estadoSeguinte+" ");
    	  System.out.print(funcaoPrograma.get(i).gravaNaPilha+"}");
    	  System.out.println();
      }
         

    } 
    
    
    
    
    
 
     
     public boolean verificarTopoPilha(String simbolo){
         if(pilha.peek()==simbolo){
             pilha.push(simbolo);
             return true;
         }
         return false;
     }
     
   
     
       public String lerDaFita(int posicao){
           String simbolo=null;
  
           simbolo=palavra.get(posicao);
           
           return simbolo;

       }
       
     public boolean existeEstado(String estadoCorrente){
         for(int i=0; i<funcaoPrograma.size(); i++){
             if(funcaoPrograma.get(i).estadoAtual.equals(estadoCorrente)){
                 return true;   
             } 
        }
     return false;    
     }
     
     public void addEstados(String novoEstado){
         String[] auxiliar;
        auxiliar = novoEstado.split(",");
        for(int i=0; i<auxiliar.length; i++){
          estados.add(auxiliar[i]);
        }
     }
     
     public boolean verificaEstadoFinal(String verificarEstado){
       if(estadosFinais.contains(verificarEstado))
           return true;
       
       return false;
}


     public boolean verificaPalavra(){
       return palavra.size()<=0;
     }
     
     
     public void iniciar(){
         
     int topoPilha;
        topoPilha = 0;
     int topoFita=0;
     String simboloFita;
       
     String[] vetAuxiliar;
     int condicao=-1;
 int tamanho= palavra.size();
 

   estadoCorrente = estadoInicial; 
         verificaPalavraVazia(estadoCorrente);
      
            
           for(int i=0; i<tamanho; i++){
               System.out.println("ver:"+palavra.size());
            simboloFita=lerDaFita(topoFita);
            
         System.out.print("Estado '"+estadoCorrente+"' existe? ");
         if(existeEstado(estadoCorrente)){
             System.out.println("Sim!");
         }else{
             System.out.println("Estado inicial inválido! ");
            System.exit(0);
         }
          
           exibirPilha();
          
        vetAuxiliar=constroiTransicoes(simboloFita, estadoCorrente);
       // if(vetAuxiliar.length>=0){
        
                System.out.println("Variavel de condicao:"+condicao);
               try {
                   condicao=verificaTransicao(vetAuxiliar,simboloFita);
               } catch (Exception e) {
                  System.out.println("Palavra rejeitada!"); //possíveis mudanças
                 System.exit(0);
               }
               
               
          
            System.out.println("Lendo o símbolo '"+simboloFita+"' da fita"); 
       
        
             System.out.println("Transição do estado "+estadoCorrente+" para o estado "+vetAuxiliar[3]);
             System.out.println("Usando a transição: ("+simboloFita+","+vetAuxiliar[1]+","+vetAuxiliar[2]+")");
             
      //  }
             

        switch(condicao){
            
           case 0:
               this.estadoCorrente=vetAuxiliar[3];
           break;
               
           case 1:

               pilha.push(vetAuxiliar[2]);
               estadoCorrente=vetAuxiliar[3];  
               palavra.remove(topoFita);
              
           break;   
           
           case 2:
               pilha.pop();
               estadoCorrente=vetAuxiliar[3];
               palavra.remove(topoFita);

           break;
   
        
        }
 
             System.out.println("Estado atual:" +estadoCorrente);
             System.out.println("variável de condição:"+condicao);
             if(palavra.size()>0){
             System.out.print("Fita no momento:");
             getPalavra();

            }else{
                 System.out.println("Fita no momento: vazia");
             }
         exibirPilha();
         condicaoDeParada(estadoCorrente);
       
         
     }
           
           }
     
    
       public String[] constroiTransicoes(String simboloFita, String estadoCorrente){
         String novaTransicao;
         String simboloDesejadoPilha;
         String simboloDesejadoGravarNaPilha;
         String simboloDesejadoFita;
     
          String[] x = new String[4];

         for(int i=0; i<funcaoPrograma.size(); i++){
             
  
             if(funcaoPrograma.get(i).estadoAtual.equals(estadoCorrente) && funcaoPrograma.get(i).simboloFita.equals(simboloFita)){
                 novaTransicao=funcaoPrograma.get(i).estadoSeguinte;
                 simboloDesejadoPilha=funcaoPrograma.get(i).simboloPilha;
                 simboloDesejadoFita=funcaoPrograma.get(i).simboloFita;
                 simboloDesejadoGravarNaPilha=funcaoPrograma.get(i).gravaNaPilha;
                 x[0]=simboloDesejadoFita;
                 x[1]=simboloDesejadoPilha;
                 x[2]=simboloDesejadoGravarNaPilha;
                 x[3]=novaTransicao;
                 }else{
           
                 
             }
         }

            return x;
    
         }
 
     
      public int verificaTransicao(String[] aux,String simboloFita){
   
             if(aux[0].equals(simboloFita) && aux[1].equals(epsilon)){
       
                 return 1;
         }else{
            if(aux[0].equals(simboloFita) && aux[1].equals(pilha.peek()) && aux[2].equals(epsilon)){
                return 2;
            }
             }
             return 4;
         }          
   


public void condicaoDeParada(String estado1){
        
         boolean verificaFinal = verificaEstadoFinal(estadoCorrente);
         boolean verificaFita = verificaPalavra();
        System.out.println(verificaFinal);
         System.out.println(verificaFita);
         
         if((verificaFinal && verificaFita)==true){
             System.out.println("Palavra Aceita");
            // System.exit(0);
           
         }else{
             System.out.println("Palavra Rejeitada");
         //   System.exit(0);
         }
             
}

public void getPalavra(){
    for(int i=0; i<palavra.size(); i++){
         System.out.print(palavra.get(i));
    }
}

public void exibirPilha(){
    boolean teste;
    try {
         teste=pilha.empty();
         if(teste==true){
       System.out.println("Pilha vazia");
   }else{
             System.out.println("\nElemento no topo da pilha:"+pilha.peek());
            
   }
        
    } catch (Exception e) {
        System.out.println("Erro:"+e);
    }
   
   
}

public void verificaPalavraVazia(String estado2){
    if(palavra.get(0).equals("") && verificaEstadoFinal(estado2)){
        System.out.println("Palavra aceita, pois '"+estadoInicial+"' pertence ao conjunto de estados finais");
        System.exit(0);

    }
    
}


public void adicionaGramaticaGreibach(String regra){
  
    ProducoesGramatica producoes = new ProducoesGramatica();
    String aux[]=null;
    aux=regra.split("->");
           System.out.println("lado esquerdo:"+aux[0]);
    System.out.println("lado direito"+aux[1]);

    System.out.println("tamanho variavel vetor aux:"+aux.length);
    producoes.variavel=aux[0];
    producoes.derivacao=aux[1];

    gramatica.add(producoes);
    System.out.println("quantidade de producoes da gramatica:"+gramatica.size());
    System.out.println("tamanho gramatica"+gramatica.size());

    
    
    
}


public void conversaoGreibachAP(){
       
  ProducoesAP transicoes = new ProducoesAP();
  

  for(int i=0; i<gramatica.size();i++){
      String lerDaPilha=gramatica.get(i).variavel;
      String lerDaFita=gramatica.get(i).derivacao.substring(0,1);
      String gravaNaPilha=gramatica.get(i).derivacao.substring(1);
      transicoes.estadoAtual="q1";
      transicoes.estadoSeguinte="qf";
      transicoes.simboloFita=lerDaFita;
      transicoes.simboloPilha=lerDaPilha;
      transicoes.gravaNaPilha=gravaNaPilha;
      if(transicoes.gravaNaPilha.equals(""))
          transicoes.gravaNaPilha="&";
            funcaoPrograma.add(transicoes);
 
  }
  
  
  
    
        
       
  

}
  
    
}


  
     



