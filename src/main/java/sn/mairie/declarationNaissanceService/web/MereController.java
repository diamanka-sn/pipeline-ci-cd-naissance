package sn.mairie.declarationNaissanceService.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.mairie.declarationNaissanceService.entities.Mere;
import sn.mairie.declarationNaissanceService.entities.Pere;
import sn.mairie.declarationNaissanceService.metier.IMereMetier;
import sn.mairie.declarationNaissanceService.metier.IPereMetier;

@RestController
@RequestMapping("/meres" )
public class MereController {
	@Autowired
	private IMereMetier mereMetier;
	
	@PostMapping("/create")
	public Mere saveMere( @RequestBody Mere m) {
		return mereMetier.saveMere(m);
	}
	
	@GetMapping("/read")
	public List<Mere> listMeres() {
		return mereMetier.listMeres();
	}
	
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return mereMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Mere search(@PathVariable Long id) {
		return mereMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id, @RequestBody Mere mere) {
		return mereMetier.update(id, mere);
	}
	
}
