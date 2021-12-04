package com.huaxing.congroller;

import com.huaxing.pojo.Items;
import com.huaxing.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("/findById")
    public String findById(Integer id, Model model){
        Items items = itemsService.findById(id);
        model.addAttribute("msg",items);
        return "items";
    }
}
