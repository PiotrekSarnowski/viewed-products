package com.example.viewedproducts.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "config")
public class Config {
    private Long id;
    private String name;
    private String rules;
    private String theme;

    private List<PWA> pwas;

    public Config(Long id, String name, String rules, String theme, List<PWA> pwas) {
        this.id = id;
        this.name = name;
        this.rules = rules;
        this.theme = theme;
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

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<PWA> getPwas() {
        return pwas;
    }

    public void setPwas(List<PWA> pwas) {
        this.pwas = pwas;
    }

    public Config() {
    }

}
