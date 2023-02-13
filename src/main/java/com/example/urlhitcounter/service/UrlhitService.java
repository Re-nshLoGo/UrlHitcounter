package com.example.urlhitcounter.service;

import com.example.urlhitcounter.model.Visitors;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Component
@Service
public class UrlhitService {
    private static HashMap<String,Integer> hm = new HashMap<>();

    public Visitors visitcount(String name) {
        int count=hm.getOrDefault(name,0)+1;
        hm.put(name,count);

        Visitors visit=new Visitors(count,name);
        return visit;
    }


}
