package com.armazemww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.armazemww.models.Fornecedor;
import com.armazemww.repository.FornecedorRepository;

@Controller
public class FornecedorController {

	@Autowired
	private FornecedorRepository fr;
	
	@RequestMapping(value="/fornecedor", method=RequestMethod.GET)
	public String formFornecedor() {
		return "formFornecedor";
	}
	
	@RequestMapping(value="/fornecedor", method=RequestMethod.POST)
	public String formFornecedor(Fornecedor fornecedor) {
		fr.save(fornecedor);
		
		return "redirect:/fornecedor";
	}
}
