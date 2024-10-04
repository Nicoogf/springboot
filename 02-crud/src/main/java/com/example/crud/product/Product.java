package com.example.crud.product;
import java.time.LocalDate;

public class Product {
    private Long id;
    private String name;
    private float precio;
    private LocalDate fecha;
    private int antiguedad;

    public Product(Long id, String name, float precio, int antiguedad, LocalDate fecha) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.antiguedad = antiguedad;
        this.fecha = fecha;
    }

    public Product() {
    }

    public Product(String name, float precio, LocalDate fecha, int antiguedad) {
        this.name = name;
        this.precio = precio;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
