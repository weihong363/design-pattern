package com.ironion.iterator;

/**
 * @author ironion
 * @date 2022/6/24 18:05
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        nameRepository.setNames(new String[]{"张三","李四","王五","赵六"});
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
