package com.company.firstMvc.data;

import com.company.firstMvc.Spittle;

import java.util.List;

public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);

}
