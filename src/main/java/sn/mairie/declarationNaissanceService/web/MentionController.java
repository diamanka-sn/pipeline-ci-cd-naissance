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

import sn.mairie.declarationNaissanceService.entities.Mention;
import sn.mairie.declarationNaissanceService.metier.IMentionMetier;

@RestController
@RequestMapping("/mentions" )
public class MentionController {
	@Autowired
	IMentionMetier mentionMetier;
	
	@PostMapping("/create")
	public Mention save(@RequestBody Mention mention) {
		return mentionMetier.save(mention);
	}
	@GetMapping("/read")
	public List<Mention> list() {
		return mentionMetier.list();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return mentionMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Mention search(@PathVariable Long id) {
		return mentionMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id,@RequestBody Mention mention) {
		return mentionMetier.update(id, mention);
	}
}
