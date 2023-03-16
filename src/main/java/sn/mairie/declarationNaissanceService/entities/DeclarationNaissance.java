package sn.mairie.declarationNaissanceService.entities;

import java.util.Collection;
import java.util.Date;

import org.hibernate.sql.ast.tree.expression.Collation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Entity
@Table(name = "declarationNaissances")
public class DeclarationNaissance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDeclaration;
	private Date date;
	private String declaration;
	private String reference;
	private String scanAt;
	private Date dateModification;
	@OneToOne
	@JoinColumn(name = "idDeclare")
	private Declare declare;
	@ManyToOne
	@JoinColumn(name = "idDeclarant")
	private Declarant declarant;
	@ManyToOne
	@JoinColumn(name="idPere")
	private Pere pere;
	@ManyToOne
	@JoinColumn(name="idMere")
	private Mere mere;
	@ManyToMany
	@JoinTable(name = "T_Temoin_declarationNaissance",
	joinColumns = @JoinColumn(name= "idDeclaration"),
	inverseJoinColumns = @JoinColumn(name="idTemoin"))
	private Collection<Temoin> temoin; 
	@ManyToOne
	@JoinColumn(name = "idCentre")
	private Centre centre;
	@ManyToOne
	@JoinColumn(name = "idRegistre")
	private Registre registre;
	@OneToOne
	@JoinColumn(name = "idJugement")
	private Jugement jugement;
	@ManyToOne
	@JoinColumn(name = "idFormationSanitaire")
	private FormationSanitaire formationSanitaire;
	@ManyToMany
	@JoinTable(name = "T_mention_declarationNaissance",
	joinColumns = @JoinColumn(name= "idDeclaration"),
	inverseJoinColumns = @JoinColumn(name="idMention"))
	private Collection<Mention> mention; 
}
