
package model.bean;

public class Produto {
    
    private int id;
    private String nome;
    private int qtd;
    private double valor;
    private Loja codlojaproprietaria;
    
    public Produto(){
        
    }

    public Produto(String nome, int qtd, double valor, Loja codlojaproprietaria) {
        this.nome = nome;
        this.qtd = qtd;
        this.valor = valor;
        this.codlojaproprietaria = codlojaproprietaria;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Loja getCodlojaproprietaria() {
        return codlojaproprietaria;
    }

    public void setCodlojaproprietaria(Loja codlojaproprietaria) {
        this.codlojaproprietaria = codlojaproprietaria;
    }
    
    

}
