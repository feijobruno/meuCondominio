
package br.com.Funcionarios;

public class Funcionario {
    private int id;
    private int status;
    private String nome;
    private String funcao;
    private String dtAdmicao;
    private String dtDesligamento;

    public Funcionario(int id, int status, String nome, String funcao, String dtAdmicao, String dtDesligamento) {
        this.id = id;
        this.status = status;
        this.nome = nome;
        this.funcao = funcao;
        this.dtAdmicao = dtAdmicao;
        this.dtDesligamento = dtDesligamento;
    }

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDtAdmicao() {
        return dtAdmicao;
    }

    public void setDtAdmicao(String dtAdmicao) {
        this.dtAdmicao = dtAdmicao;
    }

    public String getDtDesligamento() {
        return dtDesligamento;
    }

    public void setDtDesligamento(String dtDesligamento) {
        this.dtDesligamento = dtDesligamento;
    }

    
}






