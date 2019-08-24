package br.com.Unidades;

public class Unidades {
    private int id;
    private int status;
    private String proprietario;
    private String cpf;
    private String telefone;
    private int id_morador;
    private int id_vaga;
    private String casa;

    public Unidades(int id, int status, String proprietario, String cpf, String telefone, int id_morador, int id_vaga, String casa) {
        this.id = id;
        this.status = status;
        this.proprietario = proprietario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.id_morador = id_morador;
        this.id_vaga = id_vaga;
        this.casa = casa;
    }

    public Unidades() {
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

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId_morador() {
        return id_morador;
    }

    public void setId_morador(int id_morador) {
        this.id_morador = id_morador;
    }

    public int getId_vaga() {
        return id_vaga;
    }

    public void setId_vaga(int id_vaga) {
        this.id_vaga = id_vaga;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}






