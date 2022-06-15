package com.ironion.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ironion
 * @date 2022/6/14 18:55
 */
public class MaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        //filter male
        return persons.parallelStream()
                .filter(p -> "male".equalsIgnoreCase(p.getGender())).collect(Collectors.toList());
    }
}
