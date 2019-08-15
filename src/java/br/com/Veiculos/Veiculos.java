package br.com.Veiculos;

public class Veiculos {
    private int id_veiculo;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int id_apartamento;
    private String dt_cadastro;
    private int id_cadastro;

    public Veiculos() {
    }

    public Veiculos(int id_veiculo, String placa, String marca, String modelo, int ano, String cor, int id_apartamento, String dt_cadastro, int id_cadastro) {
        this.id_veiculo = id_veiculo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.id_apartamento = id_apartamento;
        this.dt_cadastro = dt_cadastro;
        this.id_cadastro = id_cadastro;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId_apartamento() {
        return id_apartamento;
    }

    public void setId_apartamento(int id_apartamento) {
        this.id_apartamento = id_apartamento;
    }

    public String getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(String dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    public int getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(int id_cadastro) {
        this.id_cadastro = id_cadastro;
    }    
}