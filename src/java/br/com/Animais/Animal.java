
package br.com.Animais;

public class Animal {
    private String nome;
    private String sexo;
    private String especie;
    private String raca;
    private String porte;
    private String cor;
    private String obs;
    private String dtCadastro;
    private int id;
    private int idApartamento;
    
    public Animal(int id, int idApartamento, String nome, String sexo, String especie, String raca, String porte, String cor, String obs, String dtCadastro) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.especie = especie;
        this.raca = raca;
        this.porte = porte;
        this.cor = cor;
        this.obs = obs;
        this.idApartamento = idApartamento;
        this.dtCadastro = dtCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(int idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
}
