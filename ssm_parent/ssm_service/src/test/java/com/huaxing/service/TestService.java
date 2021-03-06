package com.huaxing.service;

import com.huaxing.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-service.xml")
public class TestService {
    @Autowired
    private ItemsService itemsService;

    @Test
    public void testFindById(){
        Items byId = itemsService.findById(1);
        System.out.println(byId);
    }
}
