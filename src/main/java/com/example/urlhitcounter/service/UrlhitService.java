package com.example.urlhitcounter.service;

import com.example.urlhitcounter.model.Visitors;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Component
@Service
public class UrlhitService {
    private static int count = 0;
    private static HashMap<String,Integer> hm = new HashMap<>();

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UrlhitService.count = count;
    }

    public static HashMap<String, Integer> getHm() {
        return hm;
    }

    public static void setHm(HashMap<String, Integer> hm) {
        UrlhitService.hm = hm;
    }

    public Visitors visitcount() {
        Visitors visitors = new Visitors(++count);
        return visitors;
    }

    public String countview(String name) {
//        int newcount = 0;
     hm.put(name,hm.getOrDefault(name,0)+1);
//         newcount++;
      return name+": "+hm.get(name);
    }

}
