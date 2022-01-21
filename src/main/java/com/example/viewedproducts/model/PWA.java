package com.example.viewedproducts.model;

import javax.persistence.*;

@Entity
@Table(name = "pwa")
public class PWA {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Lob
    @Column(name = "rules", length = 100000)
    private String rules;

    @Lob
    @Column(name = "theme", length = 100000)
    private String theme;

    @Column(name = "bundle_id", unique=true)
    private String bundleId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name="tenant_id", nullable=false)
    private Tenant tenant;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name="config_id", nullable=false)
    private Config config;

    public PWA() { }

    public PWA(Long id, String rules, String theme, String bundleId, Stylesheet stylesheet, Tenant tenant, Config config) {
        this.id = id;
        this.rules = rules;
        this.theme = theme;
        this.bundleId = bundleId;
        this.tenant = tenant;
        this.config = config;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
