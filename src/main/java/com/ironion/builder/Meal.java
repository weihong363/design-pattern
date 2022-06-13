package com.ironion.builder;

import com.ironion.builder.entity.Item;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author ironion
 * @date 2022/6/13 16:08
 */
public class Meal {

    private ArrayList<Item> items;

    void addItem(Item item){
        if (null == items){
            items = new ArrayList<>();
        }
        items.add(item);
    }

    float getCost(){
        AtomicReference<Float> sum = new AtomicReference<>((float) 0);
        if (null == items){
            return sum.get();
        }
        items.parallelStream().forEach(i -> sum.updateAndGet(v -> new Float((float) (v + i.price()))));
        return sum.get();
    }

    void showItems(){
        if (null != items && items.size() > 0){
            items.forEach(i ->
                    System.out.println(String.format("Item:%s, Packing:%s, Price:%f",i.name(),i.packing().pack(),i.price())));
        }
    }
}
