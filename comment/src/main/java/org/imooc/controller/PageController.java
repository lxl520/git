package org.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面跳转
 * @author admin
 *
 */
@RestController
@RequestMapping("/Page")
public class PageController {
	
	@RequestMapping("indexPage")
	public ModelAndView indexPage(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("system/index");
		return modelAndView;
	}
}
