package Maquinas;

import util.Leitura;
import util.ManipuladorArquivo;
import util.Dados.Dados;
import util.Dados.ListaDinamica;

public class AutomatoFinito {
    
    public static void Simular(Leitura leitura, String filenameOutput) throws Exception {
        
        ManipuladorArquivo.delete(filenameOutput);
        ManipuladorArquivo.criarArquivo(filenameOutput);
        Integer estadoAtual = leitura.getEstadoInicial();
        ListaDinamica lista = new ListaDinamica();
        
        //Insere as specs em uma lista
        for (int i = 3; i < leitura.getSpecs().length; i++) {
            String alfabeto[] = leitura.getSpecs()[i].split(",");
            Dados dados = new Dados(Integer.parseInt(alfabeto[0]), Integer.parseInt(alfabeto[2]), alfabeto[1].charAt(0));
            lista.insere(dados);                                                                                             
        }
        
        //Percorre o input
        for (int i = 0; i < leitura.getInput().length ; i++) {
            for (int j = 0; j < leitura.getInput()[i].length(); j++) {
                
                Character c = leitura.getInput()[i].charAt(j);
                estadoAtual = lista.Comparar(c, estadoAtual); //Metodo que troca de estados caso a palavra seja encontrada
                
                
            }
            if(estadoAtual == leitura.getEstadoFinal()){          
                ManipuladorArquivo.escreverArquivo("output.txt", "A; " + leitura.getInput()[i] + "\n");
            } else{                                    
                ManipuladorArquivo.escreverArquivo("output.txt", "R; " + leitura.getInput()[i] + "\n");
            }

            estadoAtual = leitura.getEstadoInicial();
        }

    }
}

       
        
    

        
        
           


        



    





       

        


