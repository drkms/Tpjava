package com.java.AppforDocker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.AppforDocker.modele.Personne;

@Controller
public class PersonController {

	Logger log=LoggerFactory.getLogger(getClass());
	
	@GetMapping("/")
	public String accueil(Model model){
		log.info("------------------------Envoi requette vers accuiel");
		
		Personne person= new Personne();
		
		model.addAttribute("person", person);
		
		return "accueil";
		
	}
	
	@PostMapping(value="/saisir")
	public String afficherAllAssures(Personne person, Model model) {
		
		
		String message="Bonjour " + person.getNom() +  " "+ person.getPrenom() + " Vous êtes bien matinal ";
		
		person.setMessage(message);
		model.addAttribute("person", person);
		
		return "accueil" ;
	}
}
