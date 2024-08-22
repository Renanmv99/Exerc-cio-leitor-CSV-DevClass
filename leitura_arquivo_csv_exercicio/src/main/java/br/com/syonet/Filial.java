package br.com.syonet;

import java.util.List;

public class Filial {
    private String nome;
    private String endereco;
    private String cidade;
    private String codigoPostal;
    private List<Integer> visitasMensais;
    private int visitasAnuais;
    private String geolocalizacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public List<Integer> getVisitasMensais() {
        return visitasMensais;
    }

    public void setVisitasMensais(List<Integer> visitasMensais) {
        this.visitasMensais = visitasMensais;
    }

    public int getVisitasAnuais() {
        return visitasAnuais;
    }

    public void setVisitasAnuais(int visitasAnuais) {
        this.visitasAnuais = visitasAnuais;
    }

    public String getGeolocalizacao() {
        return geolocalizacao;
    }

    public void setGeolocalizacao(String geolocalizacao) {
        this.geolocalizacao = geolocalizacao;
    }
}
