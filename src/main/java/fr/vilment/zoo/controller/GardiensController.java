package fr.vilment.zoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.vilment.zoo.service.impl.AnimauxServiceImpl;

@Controller
public class GardiensController {

	@Autowired
	public AnimauxServiceImpl gardiensService;
	
	@GetMapping(path="/listGardiens")
	public String selectAllGardiens(Model model) {
		
		model.addAttribute("listGardiens", gardiensService.selectAll());
		return "/listGardiens";
	}
}
