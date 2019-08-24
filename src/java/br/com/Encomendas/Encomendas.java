package br.com.Encomendas;


public class Encomendas {
    private int id;
    private String recebeu;
    private String destinatario;
    private String remetente;
    private String cod_rastreio;
    private String dt_chegada;
    private int id_mes;
    private String dt_retirada;
    private String dt_cadastro;

    public Encomendas() {
    }

    public Encomendas(int id, String recebeu, String destinatario, String remetente, String cod_rastreio, String dt_chegada, int id_mes, String dt_retirada, String dt_cadastro) {
        this.id = id;
        this.recebeu = recebeu;
        this.destinatario = destinatario;
        this.remetente = remetente;
        this.cod_rastreio = cod_rastreio;
        this.dt_chegada = dt_chegada;
        this.id_mes = id_mes;
        this.dt_retirada = dt_retirada;
        this.dt_cadastro = dt_cadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecebeu() {
        return recebeu;
    }

    public void setRecebeu(String recebeu) {
        this.recebeu = recebeu;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getCod_rastreio() {
        return cod_rastreio;
    }

    public void setCod_rastreio(String cod_rastreio) {
        this.cod_rastreio = cod_rastreio;
    }

    public String getDt_chegada() {
        return dt_chegada;
    }

    public void setDt_chegada(String dt_chegada) {
        this.dt_chegada = dt_chegada;
    }

    public int getId_mes() {
        return id_mes;
    }

    public void setId_mes(int id_mes) {
        this.id_mes = id_mes;
    }

    public String getDt_retirada() {
        return dt_retirada;
    }

    public void setDt_retirada(String dt_retirada) {
        this.dt_retirada = dt_retirada;
    }

    public String getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(String dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }   
}






