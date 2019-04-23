package com.design.pattern.template;

/**
 * @author zhuzhenke
 * @date 2019/4/24
 */
public class CookPorkAction extends AbstractCookAction {
    @Override
    public void putCookThings() {
        System.out.println("put Chopped pork");
    }

    @Override
    public void putCondiments() {
        System.out.println("put Oyster Sauce on pork");
    }
}
