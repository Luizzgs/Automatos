package util;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ManipuladorArquivo {
    
    public static String lerArquivo(String fileName) throws Exception{
        String linhas = "";
        try{
            linhas = Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);            
        }catch(Exception e){
            System.out.println("Não foi possivel abrir o arquivo\nO programa será encerrado");
            System.exit(0);
        }
        return linhas;
        
    }

    public static void escreverArquivo(String fileName, String conteudo) throws Exception {

        try{
            Files.writeString(Paths.get(fileName), conteudo, StandardCharsets.UTF_8, StandardOpenOption.APPEND);            
        }catch(Exception e){
            System.out.println("Não foi possivel escrever o arquivo\n O programa será encerrado");
            System.exit(0);
        }
    }

    public static void delete(String fileName) throws Exception{
        try{
            Files.deleteIfExists(Paths.get(fileName));            
        }catch(Exception e){
            System.out.println("Não foi possivel deletar o arquivo");            
        }
    }

    public static void criarArquivo(String fileName) throws Exception {
        try{
            Files.createFile(Paths.get(fileName));            
        }catch(Exception e){
            System.out.println("Não foi possivel criar o arquivo");
        }
    }

} 
