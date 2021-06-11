package com.zxd8813.name.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxd8813.name.dao.NameDao;
import com.zxd8813.name.model.Name;
import com.zxd8813.name.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "NameService")
public class NameServiceImpl implements NameService {
    @Autowired
    private NameDao nameDao;

    @Override
    public JSONObject getNameList(int pageNum, int pageSize) {
        JSONObject result = new JSONObject();
        try {
            PageHelper.startPage(pageNum, pageSize);
            PageInfo<Name> pageInfo = new PageInfo(nameDao.getNameList());

            result.put("code", "0");
            result.put("msg", "operation success！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query error！");
        }
        return result;
    }

    @Override
    public JSONObject searchRoom(JSONObject request) {
        JSONObject result = new JSONObject();
        try {
            int pageNum = request.getInteger("pageNum");
            int pageSize = request.getInteger("pageSize");
            PageInfo<Name> pageInfo = new PageInfo(nameDao.searchRoom(request));

            result.put("code", "0");
            result.put("msg", "operation success！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query error！");
        }
        return result;
    }

    @Override
    public JSONObject searchState(JSONObject request) {
        JSONObject result = new JSONObject();
        try {
            int pageNum = request.getInteger("pageNum");
            int pageSize = request.getInteger("pageSize");
            PageInfo<Name> pageInfo = new PageInfo(nameDao.searchState(request));

            result.put("code", "0");
            result.put("msg", "operation success！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query error！");
        }
        return result;
    }

    @Override
    public JSONObject searchName(JSONObject request) {
        JSONObject result = new JSONObject();
        try {
            int pageNum = request.getInteger("pageNum");
            int pageSize = request.getInteger("pageSize");
            PageInfo<Name> pageInfo = new PageInfo(nameDao.searchName(request));

            result.put("code", "0");
            result.put("msg", "operation success！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query error！");
        }
        return result;
    }

}
