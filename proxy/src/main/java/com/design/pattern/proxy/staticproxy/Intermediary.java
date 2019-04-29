package com.design.pattern.proxy.staticproxy;

/**
 * intermediary , rent house for the owner/landlord of the house
 * <p>
 * 这是中介，负责将房东的房子出租出去
 *
 * @author zhuzhenke
 * @date 2019/4/29
 */
public class Intermediary implements RentTheHouse {

    private Landlord landlord;

    public Intermediary(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        System.out.println("I will rent the house to you (although it is not mine)");
        landlord.rent();
    }
}
