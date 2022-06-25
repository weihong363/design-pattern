package com.ironion.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ironion
 * @date 2022/6/25 09:51
 */
public class CareTaker {

    private List<Memento> mementoList;

    public void add(Memento memento){
        if (null == mementoList){
            mementoList = new ArrayList<>();
        }
        mementoList.add(memento);
    }

    public Memento get(int index){
        return null == mementoList ? null : mementoList.get(index);
    }
}
