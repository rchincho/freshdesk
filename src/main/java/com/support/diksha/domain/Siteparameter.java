package com.support.diksha.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Shishir Suman
 * Date: 16/10/18
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="siteparameter")
public class Siteparameter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private String value;

    @Column(name = "description")
    private String description;

    @Column(name = "app_id")
    private Long appId;

    //default constructor
    public Siteparameter() {
    }

    public Siteparameter(String name, String value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public Siteparameter(String name, String value, String description, Long appId) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.appId = appId;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }
}
