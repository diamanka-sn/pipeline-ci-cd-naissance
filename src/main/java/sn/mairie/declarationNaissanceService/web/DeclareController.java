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

import sn.mairie.declarationNaissanceService.entities.Declare;
import sn.mairie.declarationNaissanceService.metier.IDeclareMetier;

@RestController
@RequestMapping("/declares" )
public class DeclareController {
	
	@Autowired
	IDeclareMetier declareMetier;
	
	@PostMapping("/create")
	public Declare save(@RequestBody Declare declare) {
		return declareMetier.save(declare);
	}
	@GetMapping("/read")
	public List<Declare> list() {
		return declareMetier.list();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return declareMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Declare search(@PathVariable Long id) {
		return declareMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id,@RequestBody Declare declare) {
		return declareMetier.update(id, declare);
	}

}
