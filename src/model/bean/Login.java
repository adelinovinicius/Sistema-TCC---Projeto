
package model.bean;

public class Login {
    
    private int id;
    private String usuario;
    private String senha;
    private int codidfornecedor;
    private int codidloja;

    public int getCodidfornecedor() {
        return codidfornecedor;
    }

    public void setCodidfornecedor(int codidfornecedor) {
        this.codidfornecedor = codidfornecedor;
    }

    public int getCodidloja() {
        return codidloja;
    }

    public void setCodidloja(int codidloja) {
        this.codidloja = codidloja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
      
}
