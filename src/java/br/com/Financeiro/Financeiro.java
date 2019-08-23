package br.com.Financeiro;

public class Financeiro {
    private int id;
    private int idUnidade;
    private int idMes;
    private double valor;
    private String status;

    public Financeiro() {
    }

    public Financeiro(int id, int idUnidade, int idMes, double valor, String status) {
        this.id = id;
        this.idUnidade = idUnidade;
        this.idMes = idMes;
        this.valor = valor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}






