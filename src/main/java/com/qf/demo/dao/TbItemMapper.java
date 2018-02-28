package com.qf.demo.dao;


import com.qf.demo.pojo.TbItem;

import java.util.List;
import java.util.Map;


public interface TbItemMapper {
    List<TbItem> listItemsByPage(Map<String, Object> map);
}
