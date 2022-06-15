package com.ironion.filter;


import java.util.List;

/**
 * @author ironion
 * @date 2022/6/14 18:30
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
