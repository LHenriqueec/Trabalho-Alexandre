package br.com.projecao.evento.model;

public class Endereco {

    private String quadra;
    private int numCasa;
    private String bairro;
    private String cidade;
    private String cep;

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("Quadra: ").append(quadra)
                .append(" Nº Casa: ").append(numCasa)
                .append(" Bairro: ").append(bairro)
                .append(" Cidade: ").append(cidade)
                .append(" Cep: ").append(cep).append("\n\n");

        return buff.toString();
    }
}
