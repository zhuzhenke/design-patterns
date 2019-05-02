package com.design.pattern.composite;

/**
 * @author zhuzhenke
 * @date 2019/5/2
 */
public abstract class MenuComponent {

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public Long getPrice() {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

}
