package Maquinas;

import util.ManipuladorArquivo;
import util.Dados.Dados;
import util.Dados.ListaDinamica;
import util.Leitura;

public class AutomatoPilha {
    
    public static void Simular(Leitura leitura, String filenameOutput)throws Exception {
        
        ManipuladorArquivo.delete(filenameOutput);
        ManipuladorArquivo.criarArquivo(filenameOutput);
        Integer estadoAtual = leitura.getEstadoInicial();
        ListaDinamica lista = new ListaDinamica();
        
        for (int i = 3; i < leitura.getSpecs().length; i++) {
            String alfabeto[] = leitura.getSpecs()[i].replace(",", "troca").replace(";", "troca").split("troca");
            
            Dados dados = new Dados(Integer.parseInt(alfabeto[0]), Integer.parseInt(alfabeto[4]), alfabeto[1].charAt(0), alfabeto[2].charAt(0), alfabeto[3].charAt(0));
            lista.insere(dados);                                                                                             
        }


        //lista.InicioPilha();
        lista.imprime();
        //System.exit(0);

        for (int i = 0; i < leitura.getInput().length ; i++) {
            for (int j = 0; j < leitura.getInput()[i].length(); j++) {
            
                Character c = leitura.getInput()[i].charAt(j);
                estadoAtual = lista.CompararPilha(c, estadoAtual);//Metodo que troca de estados caso a palavra seja encontrada
                System.out.println("Estado atual: " + estadoAtual);
            
            
            
            
            }
            if(estadoAtual == leitura.getEstadoFinal() && lista.getPilha().isEmpty()){          
                
                ManipuladorArquivo.escreverArquivo("output.txt", "A; " + leitura.getInput()[i] + " "+ lista.getPilha().size() + "\n");
            } else{                                    
                ManipuladorArquivo.escreverArquivo("output.txt", "R; " + leitura.getInput()[i] + " "+ lista.getPilha().size() + "\n");
            }
            
            estadoAtual = leitura.getEstadoInicial();
            //lista.InicioPilha();
        
        
        }
        



    }


    
}
