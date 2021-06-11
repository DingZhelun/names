package com.zxd8813.name.controller;

import com.alibaba.fastjson.JSONObject;
import com.zxd8813.name.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/name")
public class nameController {
    @Autowired
    private NameService nameService;

    @RequestMapping(value = "/nameList", method = RequestMethod.GET)
    public JSONObject getNameList(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        return nameService.getNameList(pageNum, pageSize);
    }

    @RequestMapping(value = "searchRoom",method = RequestMethod.POST)
    public JSONObject searchRoom(@RequestBody JSONObject request){
        return nameService.searchRoom(request);
    }
}