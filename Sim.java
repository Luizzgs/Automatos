import java.io.IOException;
import Maquinas.AutomatoFinito;
import Maquinas.AutomatoPilha;
import util.Leitura;


public class Sim{
    
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws Exception{
        
        /* 
        String specs = "./specs/pilha.txt";
        String input = "inputo.txt";
        String output = "output.txt";
        */

        String specs =  args[0]; 
        String input =  args[1]; 
        String output = args[2]; 


        Leitura leitura = new Leitura(specs, input);
        
        switch (leitura.getTipo()){
            case "F":                
                System.out.println("Processando AFD...");
                AutomatoFinito.Simular(leitura, output);
                System.out.println("Processamento finalizado");
                break;
            case "P":
                System.out.println("Processando Pilha...");
                AutomatoPilha.Simular(leitura, output);
                System.out.println("Processamento finalizado");
                break;
            case "T":
                System.out.println("Processando Maquina de Turing");
                
                System.out.println("Processamento finalizado");
                break;
            default:
                System.out.println("Não foi possivel identificar o tipo de maquina");
                break;        
            }

    
    
    
    }


}