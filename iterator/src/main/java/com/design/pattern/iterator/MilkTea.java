package com.design.pattern.iterator;

import lombok.Data;

/**
 * @author zhuzhenke
 * @date 2019/5/2
 */
@Data
public class MilkTea {
    private String name;
    private String describe;

    public MilkTea(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }


    public void printDetails() {
        System.out.println("MilkTea{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                '}');
    }
}
