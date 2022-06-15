package com.ironion.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ironion
 * @date 2022/6/14 19:25
 */
public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        //filter single
        return persons.parallelStream()
                .filter(p -> "single".equalsIgnoreCase(p.getMaritalStatus())).collect(Collectors.toList());
    }
}
