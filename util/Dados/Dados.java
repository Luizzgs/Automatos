package util.Dados;

public class Dados {
    private Integer estadoInicial;
    private Integer estadoFinal;
    private Character palavra;
    private Character pop;    
    private Character push;




    public Dados(Integer estadoInicial, Integer estadoFinal, Character palavra) {
        this.estadoInicial = estadoInicial;
        this.estadoFinal = estadoFinal;
        this.palavra = palavra;
    }
    
    public Dados(Integer estadoInicial, Integer estadoFinal, Character palavra, Character pop, Character push) {
        this.estadoInicial = estadoInicial;
        this.estadoFinal = estadoFinal;
        this.palavra = palavra;
        this.pop = pop;
        this.push = push;

    }



    //Getters and Setters
    public Integer getEstadoInicial() {
        return estadoInicial;
    }
    public Character getPalavra() {
        return palavra;
    }
    public Integer getEstadoFinal() {
        return estadoFinal;
    }
    public void setEstadoFinal(Integer estadoFinal) {
        this.estadoFinal = estadoFinal;
    }
    public void setEstadoInicial(Integer estadoInicial) {
        this.estadoInicial = estadoInicial;
    }
    public void setPalavra(Character palavra) {
        this.palavra = palavra;
    }
    public Character getPop() {
        return pop;
    }

    public void setPop(Character pop) {
        this.pop = pop;
    }

    public Character getPush() {
        return push;
    }

    public void setPush(Character push) {
        this.push = push;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Dados [estadoInicial=" + estadoInicial + ", estadoFinal=" + estadoFinal + ", palavra=" + palavra +  ", pop=" + pop + ", push=" + push +"]";
    }
    
}
