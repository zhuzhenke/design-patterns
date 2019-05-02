package com.design.pattern.composite;

import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/5/2
 */
public class CompositeTest {

    @Test
    public void testComposite() {
        //menu
        Menu allMenu = new Menu("All Menu");
        Menu breakfastMenu = new Menu("Breakfast Menu");
        Menu lunchMenu = new Menu("Lunch Menu");
        Menu dinnerMenu = new Menu("Dinner Menu");

        //add menu
        allMenu.add(breakfastMenu);
        allMenu.add(lunchMenu);
        allMenu.add(dinnerMenu);

        //menu item
        MenuItem beefPattyMenuItem = new MenuItem("beef patty", 200L);
        MenuItem soyMilkMenuItem = new MenuItem("soy milk", 100L);
        breakfastMenu.add(beefPattyMenuItem);
        breakfastMenu.add(soyMilkMenuItem);

        MenuItem pepperPorkMenuItem = new MenuItem("Fried pork with pepper", 1200L);
        MenuItem kelpRibsSoupMenuItem = new MenuItem("Kelp ribs soup", 1400L);
        lunchMenu.add(pepperPorkMenuItem);
        lunchMenu.add(kelpRibsSoupMenuItem);


        MenuItem lobstersMenuItem = new MenuItem("Lobsters", 1200L);
        MenuItem rackOfLambMenuItem = new MenuItem("rack of lamb", 1200L);
        dinnerMenu.add(lobstersMenuItem);
        dinnerMenu.add(rackOfLambMenuItem);


        //print
        allMenu.print();

    }
}
