package com.springboot.cloud.sysadmin.organization.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Hero {
    private String name;
    private int fee;
    private Set<String> features = new HashSet<String>();

    public Hero(String name, int fee, String[] features) {
        this.setName(name);
        this.setFee(fee);
        this.setFeatures(Arrays.stream(features).collect(Collectors.toSet()));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hero) {
            Hero hero = (Hero) obj;
            return Objects.equals(this.getName(), hero.getName())
                    && Objects.equals(this.getFee(), hero.getFee());
        }
        return false;
    }

    @Override
    public String toString() {
        return "英雄：" + this.getName() + " " + "￥：" + this.getFee() + " " + "特质：" + this.getFeatures();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public Set<String> getFeatures() {
        return features;
    }

    public void setFeatures(Set<String> features) {
        this.features = features;
    }
}
