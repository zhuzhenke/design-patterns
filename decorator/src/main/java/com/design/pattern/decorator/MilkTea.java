package com.design.pattern.decorator;

/**
 * @author zhuzhenke
 * @date 2019/4/20
 */
public abstract class MilkTea {
    /**
     * return description
     *
     * @return description
     */
    public abstract String getDescription();

    /**
     * return cost
     * unit:cent
     *
     * @return cost
     */
    public abstract Long cost();


}
