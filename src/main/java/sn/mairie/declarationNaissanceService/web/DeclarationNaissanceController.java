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

import sn.mairie.declarationNaissanceService.entities.DeclarationNaissance;
import sn.mairie.declarationNaissanceService.metier.IDeclarationNaissanceMetier;

@RestController
@RequestMapping("/declarationNaissances" )
public class DeclarationNaissanceController {
	@Autowired
	IDeclarationNaissanceMetier metier;
	
	@PostMapping("/create")
	public DeclarationNaissance save(@RequestBody DeclarationNaissance declarationNaissance) {
		return metier.save(declarationNaissance);
	}
	@GetMapping("/read")
	public List<DeclarationNaissance> list() {
		return metier.list();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return metier.remove(id);
	}
	@GetMapping("/search/{id}")
	public DeclarationNaissance search(@PathVariable Long id) {
		return metier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id,@RequestBody DeclarationNaissance declarationNaissance) {
		return metier.update(id, declarationNaissance);
	}
}
