package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhuzhenke
 * @date 2019/5/2
 */
public class Menu extends MenuComponent {
    List<MenuComponent> menuComponentList = new ArrayList<>();

    private String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("menu name is " + name);

        Iterator<MenuComponent> iterator = menuComponentList.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }
}
