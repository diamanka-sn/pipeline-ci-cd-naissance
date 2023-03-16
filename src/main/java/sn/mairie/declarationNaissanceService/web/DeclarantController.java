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

import sn.mairie.declarationNaissanceService.entities.Declarant;
import sn.mairie.declarationNaissanceService.metier.IDeclarantMetier;

@RestController
@RequestMapping("/declarants" )
public class DeclarantController {

	@Autowired
	IDeclarantMetier declarantMetier;
	
	@PostMapping("/create")
	public Declarant save(@RequestBody Declarant declarant) {
		return declarantMetier.save(declarant);
	}
	@GetMapping("/read")
	public List<Declarant> list() {
		return declarantMetier.list();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return declarantMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Declarant search(Long id) {
		return declarantMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(Long id, Declarant declarant) {
		return declarantMetier.update(id, declarant);
	}
}
