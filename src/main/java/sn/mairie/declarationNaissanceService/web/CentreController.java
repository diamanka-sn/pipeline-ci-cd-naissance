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

import sn.mairie.declarationNaissanceService.entities.Centre;
import sn.mairie.declarationNaissanceService.metier.CentreMetier;
import sn.mairie.declarationNaissanceService.metier.ICentreMetier;

@RestController
@RequestMapping("/centres" )
public class CentreController {
	
	@Autowired
	ICentreMetier centreMetier;
	
	@PostMapping("/create")
	public Centre save(@RequestBody Centre centre) {
		return centreMetier.save(centre);
	}
	@GetMapping("/read")
	public List<Centre> list() {
		return centreMetier.list();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return centreMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Centre search(@PathVariable Long id) {
		return centreMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id,@RequestBody Centre centre) {
		return centreMetier.update(id, centre);
	}
}
