package org.imooc.controller;

import org.imooc.bean.Items;
import org.imooc.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
	/**
	 * GET请求查询
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	public Items findItemsById(@PathVariable int id){
		Items items=itemsService.findItemsById(id);
		items.setName("小龙");
		return items;
	}
	
	/**
	 * POST请求查询
	 * @param items
	 * @return
	 */
	@RequestMapping(value="/findItemsByid",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public Items findItemsByid(@RequestBody Items items){
		Items items1=itemsService.findItemsById(items.getId());
		items1.setName("小龙");
		return items1;
	}
}
