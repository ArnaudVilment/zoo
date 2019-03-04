package fr.vilment.zoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.vilment.zoo.service.impl.AnimauxServiceImpl;

@Controller
public class AnimauxController {

	@Autowired
	public AnimauxServiceImpl animauxService;
	
	@GetMapping(path="/listAnimaux")
	public String selectAllAnimaux(Model model) {
		
		model.addAttribute("listAnimaux", animauxService.selectAll());
		return "/listAnimaux";
	}
	
	
}
