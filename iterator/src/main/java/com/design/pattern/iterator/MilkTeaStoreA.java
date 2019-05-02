package com.design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhuzhenke
 * @date 2019/5/2
 */
public class MilkTeaStoreA {
    List<MilkTea> milkTeas = new ArrayList<>();

    public void addMilkTea(MilkTea milkTea) {
        milkTeas.add(milkTea);
    }

    int position = 0;

    public Iterator<MilkTea> iterator() {
        List<MilkTea> milkTeaList = milkTeas;
        position = 0;
        return new Iterator<MilkTea>() {

            @Override
            public boolean hasNext() {
                return milkTeaList.size() > position;
            }

            @Override
            public MilkTea next() {
                if (milkTeaList.size() <= position) {
                    return null;
                }
                MilkTea milkTea = milkTeaList.get(position);
                position++;
                return milkTea;
            }
        };
    }
}
