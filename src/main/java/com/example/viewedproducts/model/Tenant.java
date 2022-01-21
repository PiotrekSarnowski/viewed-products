package com.example.viewedproducts.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tenant")
public class Tenant {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "environment")
    private String environment;

    @Column(name = "data_center")
    private String dataCenter;

    @OneToMany(mappedBy="config")
    @JsonIgnore
    private List<PWA> pwas;

    public Tenant() { }

    public Tenant(Long id, String name, String environment, String dataCenter, List<PWA> pwas) {
        this.id = id;
        this.name = name;
        this.environment = environment;
        this.dataCenter = dataCenter;
        this.pwas = pwas;
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

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public List<PWA> getPwas() {
        return pwas;
    }

    public void setPwas(List<PWA> pwas) {
        this.pwas = pwas;
    }
}
