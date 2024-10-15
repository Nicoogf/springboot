package org.example;

public class Coche {

    private Integer id ;
    private String modelo ;
    private String fabricante ;
    private Integer numCilindros ;
    private Double numCv ;

    public Coche(Integer id, String modelo, String fabricante, Integer numCilindros, Double numCv) {
        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.numCilindros = numCilindros;
        this.numCv = numCv;
    }

    public Double getNumCv() {
        return numCv;
    }

    public void setNumCv(Double numCv) {
        this.numCv = numCv;
    }

    public Integer getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(Integer numCilindros) {
        this.numCilindros = numCilindros;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
