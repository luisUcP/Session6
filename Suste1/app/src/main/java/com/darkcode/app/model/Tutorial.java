package com.darkcode.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Cerveceria")
    private String Cerveceria;

    @Column(name = "Departamento")
    private String departamento;

    @Column(name = "Nomenclatura")
    private String nomenclatura;

    @Column(name = "Marca")
    private String marca;

    @Column(name = "Stock")
    private int stock;

    public Tutorial(String cerveceria, String departamento, String nomenclatura, String marca, int stock) {
        this.Cerveceria = cerveceria;
        this.departamento = departamento;
        this.nomenclatura = nomenclatura;
        this.marca = marca;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getCerveceria() {
        return Cerveceria;
    }

    public void setCerveceria(String cerveceria) {
        Cerveceria = cerveceria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", Cerveceria=" + Cerveceria + ", departamento=" + departamento
                + ", nomenclatura=" + nomenclatura + ", marca=" + marca + ", stock=" + stock + "]";
    }

    
    
    
}
