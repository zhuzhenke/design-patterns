package com.design.pattern.template;

/**
 * @author zhuzhenke
 * @date 2019/4/24
 */
public abstract class AbstractCookAction {
    public void cook() {
        prepareMaterials();
        makeAFire();
        putPeanutOil();
        if (needSoySauce()){
            putSoySauce();
        }
        putCondiments();
        finishAndEat();
    }

    private void prepareMaterials() {
        System.out.println("prepare materials");
    }

    private void makeAFire() {
        System.out.println("make a fire");
    }

    private void putPeanutOil() {
        System.out.println("put peanut oil");
    }

    public abstract void putCookThings();

    public boolean needSoySauce() {
        return true;
    }

    private void putSoySauce() {
        System.out.println("put soy sauce");
    }

    public abstract void putCondiments();

    private void finishAndEat(){
        System.out.println("finish cooking and begin eating");
    }
}
