package util.Dados;

import java.util.Stack;

public class ListaDinamica {
    private No inicio;
    private No fim;
    Stack<Character> pilha = new Stack<Character>();
    

    public Stack<Character> getPilha() {
        return pilha;
    }

    public void setPilha(Stack<Character> pilha) {
        this.pilha = pilha;
    }

    public void insere(Dados valor){
        No novo = new No(valor);
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }else{
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public void InicioPilha(){
        pilha.clear();
        pilha.push('_');
    }

    public No busca(Dados valor){
        No aux = inicio;
        while (aux != null){
            if(aux.getDados() == valor){
                return aux;
            }
            aux = aux.getProximo();
        }
        return null;
    }

    public Integer Comparar(Character a, Integer EstadoAtual){
        No aux = inicio;
        while (aux != null){
            if(aux.getDados().getPalavra() == a && aux.getDados().getEstadoInicial() == EstadoAtual){
                return aux.getDados().getEstadoFinal();
            }
            aux = aux.getProximo();
        }
        return null;
    }

    public Integer CompararPilha(Character a, Integer EstadoAtual){
        //pilha.clear();
        //System.out.println(pilha.peek());
        //System.out.println(pilha.size());
        No aux = inicio;
        while (aux != null){
            if(aux.getDados().getPalavra() == a && aux.getDados().getEstadoInicial() == EstadoAtual){
                System.out.println(" " + a + pilha);
                
                if(!pilha.isEmpty() && aux.getDados().getPop() == pilha.peek()){                    
                    //System.out.println(" " + a + pilha);
                    pilha.pop();                    
                } 


                if(aux.getDados().getPush() == '_'){
                    return aux.getDados().getEstadoFinal();
                }

                if(pilha.isEmpty() && aux.getDados().getPalavra() == '_'){
                    return null;                

                }


                pilha.push(aux.getDados().getPush());
                
                
                if(pilha.isEmpty() && aux.getDados().getPalavra() == '_'){
                    return aux.getDados().getEstadoFinal();                 
                }
                
                while(aux.getDados().getPop() == 'Z' && pilha.peek() == '_'){
                    pilha.pop();
                }                

                return aux.getDados().getEstadoFinal();
                       
            }

            aux = aux.getProximo();
        }
        return null;
    }
    


    public void imprime(){
        No aux = inicio;
        while (aux != null){
            System.out.println(aux.getDados());
            aux = aux.getProximo();
        }
    }


}
