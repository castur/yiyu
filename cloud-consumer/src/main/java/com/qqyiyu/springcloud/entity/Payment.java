package com.qqyiyu.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
    private static final long serialVersionUID = 4269505663098823712L;
    private Long id;
    private String serial;
}
