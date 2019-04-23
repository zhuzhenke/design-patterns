package com.design.pattern.template;

/**
 * @author zhuzhenke
 * @date 2019/4/24
 */
public class CookFishAction extends AbstractCookAction {

    @Override
    public boolean needSoySauce(){
        return false;
    }

    @Override
    public void putCookThings() {
        System.out.println("put a fresh fish");
    }

    @Override
    public void putCondiments() {
        System.out.println("put Chopped green onion,put ginger on fish");
    }
}
