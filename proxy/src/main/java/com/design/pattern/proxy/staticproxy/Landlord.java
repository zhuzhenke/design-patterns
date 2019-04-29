package com.design.pattern.proxy.staticproxy;

/**
 * landlord/owner of the house , just wants to rent his own house to others
 * but he is busy and he is always out for business.
 * <p>
 * 房东，想要把自己的房间出租
 * 房东很忙，经常在外地出差，没有时间出租
 *
 * @author zhuzhenke
 * @date 2019/4/29
 */
public class Landlord implements RentTheHouse {

    @Override
    public void rent() {
        System.out.println("This is my(landlord) house , I want to rent the house to you");
    }

}
