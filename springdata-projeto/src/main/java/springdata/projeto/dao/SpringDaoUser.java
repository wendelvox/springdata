package springdata.projeto.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import springdata.projeto.model.Usuarios;

public interface SpringDaoUser extends CrudRepository<Usuarios, Long> {

}
