package com.design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhuzhenke
 * @date 2019/5/2
 */
public class MilkTeaStoreB {
    int length = 1000;
    MilkTea[] milkTeas = new MilkTea[length];
    int arrayIndex = 0;

    public void addMilkTea(MilkTea milkTea) {
        if (arrayIndex >= length) {
            throw new ArrayIndexOutOfBoundsException("exceed array's length");
        }
        milkTeas[arrayIndex++] = milkTea;
    }

    int position = 0;

    public Iterator<MilkTea> iterator() {
        MilkTea[] milkTeaList = milkTeas;
        position = 0;
        return new Iterator<MilkTea>() {

            @Override
            public boolean hasNext() {
                return arrayIndex > position;
            }

            @Override
            public MilkTea next() {
                if (arrayIndex <= position) {
                    return null;
                }
                MilkTea milkTea = milkTeaList[position];
                position++;
                return milkTea;
            }
        };
    }
}
