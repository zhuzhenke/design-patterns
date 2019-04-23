package com.design.pattern.template;

import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/24
 */
public class TemplatePatternTest {
    @Test
    public void testCook() {

        AbstractCookAction cookAction = new CookFishAction();
        System.out.println("cook fish......");
        cookAction.cook();

        cookAction = new CookPorkAction();
        System.out.println("cook pork......");
        cookAction.cook();
    }
}
