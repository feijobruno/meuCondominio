package br.com.Visitas;

public class Visitas {
    private int id;
    private String tipoVisita;
    private String nome;
    private String rg;
    private int destino;
    private String dtCadastro;
    private int id_mes;

    public Visitas() {
    }

    public Visitas(int id, String tipoVisita, String nome, String rg, int destino, String dtCadastro, int id_mes) {
        this.id = id;
        this.tipoVisita = tipoVisita;
        this.nome = nome;
        this.rg = rg;
        this.destino = destino;
        this.dtCadastro = dtCadastro;
        this.id_mes = id_mes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoVisita() {
        return tipoVisita;
    }

    public void setTipoVisita(String tipoVisita) {
        this.tipoVisita = tipoVisita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public int getId_mes() {
        return id_mes;
    }

    public void setId_mes(int id_mes) {
        this.id_mes = id_mes;
    }
}






