package com.ironion.composite;

/**
 * @author ironion
 * @date 2022/6/15 15:37
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee a = new Employee("a","dept1",1000);
        Employee b = new Employee("b","dept2",2000);
        a.add(new Employee("张三","dept1",100));
        a.add(new Employee("李四","dept1",100));
        a.add(new Employee("王五","dept1",100));
        b.add(new Employee("sss","dept2",100));
        b.add(new Employee("eee","dept2",100));
        System.out.println(a.getSubordinates());
        System.out.println(b.getSubordinates());
        Employee employee = a.getSubordinates().get(2);
        a.remove(employee);
        b.add(employee);
        System.out.println(a.getSubordinates());
        System.out.println(b.getSubordinates());
    }
}
