package com.huaxing.service.impl;

import com.huaxing.dao.ItemsDao;
import com.huaxing.pojo.Items;
import com.huaxing.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
