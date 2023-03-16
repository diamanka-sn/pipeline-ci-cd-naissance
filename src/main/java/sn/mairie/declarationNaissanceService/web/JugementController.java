package sn.mairie.declarationNaissanceService.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.mairie.declarationNaissanceService.entities.Jugement;
import sn.mairie.declarationNaissanceService.metier.IJugementMetier;

@RestController
@RequestMapping("/jugements" )
public class JugementController {
	
	@Autowired
	IJugementMetier iJugementMetier;
	
	@PostMapping("/create")
	public Jugement save(@RequestBody Jugement jugement) {
		return iJugementMetier.save(jugement);
	}
	@GetMapping("/read")
	public List<Jugement> list() {
		return iJugementMetier.list();
	}
	
	@DeleteMapping("/delete/{id}")
	public String remove(Long id) {
		return iJugementMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Jugement search(Long id) {
		return iJugementMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(Long id, Jugement jugement) {
		return iJugementMetier.update(id, jugement);
	}
	
}
