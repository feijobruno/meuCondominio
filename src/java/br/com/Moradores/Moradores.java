package br.com.Moradores;

public class Moradores {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private String dtNascimento;
    private String telefone;
    private int apartamento;
    private int status;
    private String tipoMorador;
    private String dtCadastro;

    public Moradores() {
    }

    public Moradores(int id, String nome, String email, String cpf, String rg, String dtNascimento, String telefone, int apartamento, int status, String tipoMorador, String dtCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.dtNascimento = dtNascimento;
        this.telefone = telefone;
        this.apartamento = apartamento;
        this.status = status;
        this.tipoMorador = tipoMorador;
        this.dtCadastro = dtCadastro;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getApartamento() {
        return apartamento;
    }

    public void setApartamento(int apartamento) {
        this.apartamento = apartamento;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTipoMorador() {
        return tipoMorador;
    }

    public void setTipoMorador(String tipoMorador) {
        this.tipoMorador = tipoMorador;
    }
}






