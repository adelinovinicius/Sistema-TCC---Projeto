
package model.bean;

public class Produto {
    
    private int id;
    private String nome;
    private int qtd;
    private double valor;
    private int codlojaproprietaria;
    private int codfornecedorproprietario;

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

    public int getCodlojaproprietaria() {
        return codlojaproprietaria;
    }

    public void setCodlojaproprietaria(int codlojaproprietaria) {
        this.codlojaproprietaria = codlojaproprietaria;
    }

    public int getCodfornecedorproprietario() {
        return codfornecedorproprietario;
    }

    public void setCodfornecedorproprietario(int codfornecedorproprietario) {
        this.codfornecedorproprietario = codfornecedorproprietario;
    }
    
    
}
