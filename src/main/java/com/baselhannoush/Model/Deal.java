package com.baselhannoush.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "deals", uniqueConstraints = @UniqueConstraint(columnNames = {"dealUniqueId"}))
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dealUniqueId", nullable = false)
    private String dealUniqueId;

    @Column(name = "fromCurrency", nullable = false)
    private String fromCurrency;

    @Column(name = "toCurrency", nullable = false)
    private String toCurrency;

    @Column(name = "dealTimestamp", nullable = false)
    private LocalDateTime dealTimestamp;

    @Column(name = "dealAmount", nullable = false)
    private Double dealAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDealUniqueId() {
        return dealUniqueId;
    }

    public void setDealUniqueId(String dealUniqueId) {
        this.dealUniqueId = dealUniqueId;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public LocalDateTime getDealTimestamp() {
        return dealTimestamp;
    }

    public void setDealTimestamp(LocalDateTime dealTimestamp) {
        this.dealTimestamp = dealTimestamp;
    }

    public Double getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Double dealAmount) {
        this.dealAmount = dealAmount;
    }
}
