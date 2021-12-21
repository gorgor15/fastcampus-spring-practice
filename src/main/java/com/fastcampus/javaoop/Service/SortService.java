package com.fastcampus.javaoop.Service;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.List;

public class SortService {
    //의존성 주입 방법
    private Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체:"+sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
