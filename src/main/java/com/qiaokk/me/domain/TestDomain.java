package com.qiaokk.me.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017/10/2 20:21
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */
@Entity
@Table(name = "test")
public class TestDomain {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public TestDomain() {
    }

    public TestDomain(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
