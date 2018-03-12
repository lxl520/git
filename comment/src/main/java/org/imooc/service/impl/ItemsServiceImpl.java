package org.imooc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.imooc.bean.Items;
import org.imooc.dao.ItemsMapper;
import org.imooc.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;

	public Items findItemsById(Integer id) {
		return itemsMapper.findItemsById(id);

	}


	
}
