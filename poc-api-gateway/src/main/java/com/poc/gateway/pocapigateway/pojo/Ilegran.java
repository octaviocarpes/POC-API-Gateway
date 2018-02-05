package com.poc.gateway.pocapigateway.pojo;

/**
 * Created by octaviocarpes on 2/4/18.
 */
public class Ilegran {

    private String name;
    private String role;

    public Ilegran(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
