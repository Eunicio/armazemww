package com.armazemww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.armazemww.models.Fardo;
import com.armazemww.models.Fornecedor;
import com.armazemww.repository.FardoRepository;

@Controller
public class FardoController {

	@Autowired
	private FardoRepository fr;
	
	@RequestMapping(value="/fardo", method=RequestMethod.GET)
	public String formFardo() {
		return "formFardo";
	}
	
	@RequestMapping(value="/fardo", method=RequestMethod.POST)
	public String formFardo(Fardo fardo) {
		fr.save(fardo);
		
		return "redirect:/fardo";
	}
	
	@RequestMapping("/fardos")
	public ModelAndView listaFardos() {
		ModelAndView mv = new ModelAndView("listaFardos");
		Iterable<Fardo> fardos = fr.findAll();
		mv.addObject("fardos", fardos);
		
		return mv;
	}
	
}
