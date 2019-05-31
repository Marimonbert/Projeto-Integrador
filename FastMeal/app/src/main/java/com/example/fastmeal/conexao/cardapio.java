package com.example.fastmeal.conexao;

public class cardapio {

    private int id;
    private String acompanhamento;
    private String img;
    private String prato;

    // String acompanhamento
    // String img
    // String prato


    public cardapio(int id, String nome, int id_categoria, String descrição, Double valor) {
        this.id = id;
        this.acompanhamento = acompanhamento            ;
        this.img = img;
        this.prato = prato;

    }

    public cardapio(int i, String comidas, int i_c, String des, double $) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String nome) {
        this.acompanhamento = acompanhamento;
    }
    public String getImg() {
        return img;
    }

    public void setImg(int id_categoria) {
        this.img = img;
    }

    public String getPrato() {
        return prato;
    }


    @Override
    public String toString() {
        return "cardapio{" +
                "id=" + id +
                ", acompanhamento=" + acompanhamento +
                ", img='" + img+
                ", prato=" + prato +

                '}';
    }
}



