package br.com.Infracoes;

public class Infracao {

    private int id;
    private String tipoInfracao;
    private String nomeInfrator;
    private String valorMulta;
    private String dtCadastro;
    private String dtOcorrido;
    private int idApartamento;
    private int idAnimal;
    private int idMes;

    public Infracao(int id, String tipoInfracao, String nomeInfrator, String valorMulta, String dtCadastro, String dtOcorrido, int idApartamento, int idAnimal, int idMes) {
        this.id = id;
        this.tipoInfracao = tipoInfracao;
        this.nomeInfrator = nomeInfrator;
        this.valorMulta = valorMulta;
        this.idApartamento = idApartamento;
        this.dtCadastro = dtCadastro;
        this.dtOcorrido = dtOcorrido;
        this.idAnimal = idAnimal;
        this.idMes = idMes;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getDtOcorrido() {
        return dtOcorrido;
    }

    public void setDtOcorrido(String dtOcorrido) {
        this.dtOcorrido = dtOcorrido;
    }

    public String getTipoInfracao() {
        return tipoInfracao;
    }

    public void setTipoInfracao(String tipoInfracao) {
        this.tipoInfracao = tipoInfracao;
    }

    public String getNomeInfrator() {
        return nomeInfrator;
    }

    public void setNomeInfrator(String nomeInfrator) {
        this.nomeInfrator = nomeInfrator;
    }

    public String getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
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

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }

}
