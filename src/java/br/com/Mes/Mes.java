package br.com.Mes;

public class Mes {
    private int id;
    private String Mes;

    public Mes() {
    }

    public Mes(int id, String Mes) {
        this.id = id;
        this.Mes = Mes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }
}