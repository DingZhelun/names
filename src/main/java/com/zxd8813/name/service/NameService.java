package com.zxd8813.name.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface NameService {
    JSONObject getNameList(int pageNum, int pageSize);

    JSONObject searchRoom(JSONObject request);

    JSONObject searchState(JSONObject request);



}
