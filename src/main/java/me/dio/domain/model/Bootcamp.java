package me.dio.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "tb_bootcamp")
public class Bootcamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private int xp;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Course> concluidos;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Course> pendentes;

    @Override
    public String toString() {
        return "Bootcamp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", xp=" + xp +
                ", concluidos=" + concluidos +
                ", pendentes=" + pendentes +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public List<Course> getConcluidos() {
        return concluidos;
    }

    public void setConcluidos(List<Course> concluidos) {
        this.concluidos = concluidos;
    }

    public List<Course> getPendentes() {
        return pendentes;
    }

    public void setPendentes(List<Course> pendentes) {
        this.pendentes = pendentes;
    }
}
