package com.design.pattern.composite;

/**
 * @author zhuzhenke
 * @date 2019/5/2
 */
public class MenuItem extends MenuComponent {

    private String name;
    private Long price;

    public MenuItem(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }
}
