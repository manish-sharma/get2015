package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mkyong.web.exception.CustomGenericException;
import com.mkyong.web.service.MainService;

@Controller
public class MainController {

	@RequestMapping(value = "/{type}", method = RequestMethod.GET)
	public ModelAndView getPages(@PathVariable("type") String type) {
		try {

			if ("error".equals(type)) {
				// go handleCustomException
				throw new CustomGenericException(MainController.class.getName(),"This is custom message");
			} else if ("generateError".equals(type)) {
				MainService.getPages();
			}
		} catch (CustomGenericException e) {
			System.out.println(e.getMessage());
		}
		return new ModelAndView("index").addObject("msg", type);
	}

}