package util;

public class Leitura {
    private String specs[];
    private String input[];
    private Integer estadoInicial;
    private Integer estadoFinal;
    private String alfabeto[];
    private String tipo;

    /*public static void main(String[] args) throws Exception {
        String specs[] = ManipuladorArquivo.lerArquivo("AFD.txt").split(System.getProperty("line.separator"));
        for (int i = 0; i < specs.length; i++) {
            //System.out.println(specs[i]);
        }
    
    
    */



    public Leitura(String filenameSpecs, String filenameInput) throws Exception{        
        specs = ManipuladorArquivo.lerArquivo(filenameSpecs).split("[\\r\\n]+");
        input = ManipuladorArquivo.lerArquivo(filenameInput).split("[\\r\\n]+");
        tipo = specs[0];
        estadoInicial = Integer.parseInt(specs[1]);        
        estadoFinal = Integer.parseInt(specs[2]);
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public String[] getSpecs() {
        return specs;
    }

    public String[] getInput() {
        return input;
    }

    public Integer getEstadoInicial() {
        return estadoInicial;
    }

    public Integer getEstadoFinal() {
        return estadoFinal;
    }

    public String[] getAlfabeto() {
        return alfabeto;
    }

    public void setSpecs(String[] specs) {
        this.specs = specs;
    }

    public void setInput(String[] input) {
        this.input = input;
    }

    public void setEstadoInicial(Integer estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public void setEstadoFinal(Integer estadoFinal) {
        this.estadoFinal = estadoFinal;
    }   

    public void setAlfabeto(String[] alfabeto) {
        this.alfabeto = alfabeto;
    }
}
