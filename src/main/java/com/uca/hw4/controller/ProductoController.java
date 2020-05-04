package com.uca.hw4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.hw4.producto.Producto;

@Controller
public class ProductoController {
	
	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("productos");
		mav.addObject("producto", new Producto());
		
		return mav;
	}
	
	@RequestMapping("/validator")
	public ModelAndView validar(@Valid @ModelAttribute Producto producto, BindingResult bRes) {
		ModelAndView mav = new ModelAndView();
		
		if(bRes.hasErrors()) { mav.setViewName("productos"); }
		else {
			producto.getEnExist();
			mav.setViewName("validator");
			mav.addObject("nomProduct", "Producto " + producto.getNomProduct() + " guardado con éxito");
		}
		
		return mav;
	}
}
