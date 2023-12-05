package springdata.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name = "usuario_pessoa", uniqueConstraints = {@UniqueConstraint(columnNames= {"login"})})

public class Usuarios {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String login;
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
