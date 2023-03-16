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

import sn.mairie.declarationNaissanceService.entities.Temoin;
import sn.mairie.declarationNaissanceService.metier.ITemoinMetier;

@RestController
@RequestMapping("/temoins" )
public class TemoinController {
	@Autowired
	private ITemoinMetier temoinMetier;
	
	@PostMapping("/create")
	public Temoin save(@RequestBody  Temoin t) {
		return temoinMetier.save(t);
	}
	@GetMapping("/read")
	public List<Temoin> list() {
		return temoinMetier.list();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return temoinMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Temoin search(@PathVariable Long id) {
		return temoinMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id,@RequestBody Temoin t) {
		return temoinMetier.update(id, t);
	}
}
