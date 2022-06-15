package com.ironion.filter;

import java.util.List;

/**
 * @author ironion
 * @date 2022/6/14 18:55
 */
public class OrCriteria implements Criteria {
    Criteria criteria;
    Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> list1 = criteria.meetCriteria(persons);
        List<Person> list2 = otherCriteria.meetCriteria(persons);
        list1.addAll(list2);
        return list1;
    }
}
