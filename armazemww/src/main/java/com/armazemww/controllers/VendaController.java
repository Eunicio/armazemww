package com.armazemww.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VendaController {
	/*
	@Autowired
	private FornecedorRepository fr;
	
	@Autowired
	private FardoRepository far;
	*/
	@RequestMapping(value="/venda", method=RequestMethod.GET)
	public String formFornecedor() {
		return "formVenda";
	}
	/*
	@RequestMapping(value="/venda", method=RequestMethod.POST)
	public String formFornecedor(Venda venda) {
		fr.save(venda);
		
		return "redirect:/venda";
	}
	
	@RequestMapping("/fornecedores")
	public ModelAndView listaFornecedores() {
		ModelAndView mv = new ModelAndView("listaFornecedores");
		Iterable<Fornecedor> fornecedores = fr.findAll();
		mv.addObject("fornecedores", fornecedores);
		
		return mv;
	}
	
	@RequestMapping("/{codigo}")
	public ModelAndView detalhesFornecedor(@PathVariable("codigo") long codigo) {
		Fornecedor fornecedor = fr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("detalhesFornecedor");
		mv.addObject("fornecedor", fornecedor);
		System.out.println("fornecedor" + fornecedor);
		
		return mv;													
	}
	
	/*	Buscar o evento atraves do codigo	
	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)//O valor do codigo
	public ModelAndView detalhesFornecedor(@PathVariable("codigo") long codigo) {
		Fornecedor fornecedor = fr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("detalhesFornecedor");
		mv.addObject("fornecedor", fornecedor);
		
		Iterable<Fardo> fardos = far.findByFornecedor(fornecedor);
		mv.addObject("fardos", fardos);
		
		return mv;
	}
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.POST)
	public String detalhesFornecedor(@PathVariable("codigo") long codigo, Fardo fardo) {
		Fornecedor fornecedor = fr.findByCodigo(codigo);
		fardo.setFornecedor(fornecedor);
		far.save(fardo);
		
		return "redirect:/{codigo}";												
	}*/

}
