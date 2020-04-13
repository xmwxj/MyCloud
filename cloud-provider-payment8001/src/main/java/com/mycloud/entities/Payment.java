package com.mycloud.entities;

import java.io.Serializable;

/**
 * @author Nansen
 * @create 2020/4/11 14:14
 */
public class Payment implements Serializable {
    private Long id;
    private String serial;

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
