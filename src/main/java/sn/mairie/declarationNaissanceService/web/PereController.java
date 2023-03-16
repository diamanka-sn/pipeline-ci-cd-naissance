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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sn.mairie.declarationNaissanceService.entities.Pere;
import sn.mairie.declarationNaissanceService.metier.IPereMetier;

@RestController
@RequestMapping("/peres" )
public class PereController {

	
	@Autowired
	private IPereMetier pereMetier;
	
	
	//faire un clic droit sur pereMetier +source+ generate Dalegate Methode
	//qui va generer les les methodes savePere()et listPeres()
	
//	@RequestMapping(value = "/peres",method = RequestMethod.POST)
	@PostMapping("/create")
	public Pere savePere(@RequestBody @Valid Pere p) {
		return pereMetier.savePere(p);
	}
//	@RequestMapping(value = "/peres111",method = RequestMethod.GET)
	@GetMapping("/read")
	public List<Pere> listPeres() {
		return pereMetier.listPeres();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return pereMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Pere search(@PathVariable Long id) {
		return pereMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id, @RequestBody Pere pere) {
		return pereMetier.update(id, pere);
	}
}
