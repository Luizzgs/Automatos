package util.Dados;

public class No {
    private Dados dados;
    private No proximo;

    public No (Dados dados) {
        this.dados = dados;
    }

    //Getters and Setters
    public Dados getDados() {
        return dados;
    }
    public No getProximo() {
        return proximo;
    }
    public void setDados(Dados dados) {
        this.dados = dados;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

}
