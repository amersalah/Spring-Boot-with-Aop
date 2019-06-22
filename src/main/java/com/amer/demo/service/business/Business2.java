package com.amer.demo.service.business;

import com.amer.demo.aop.annotation.TrackTime;
import com.amer.demo.dal.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    @TrackTime
    public String calculateSomething(){
        //Business Logic
        return dao2.retrieveSomething();
    }

}
