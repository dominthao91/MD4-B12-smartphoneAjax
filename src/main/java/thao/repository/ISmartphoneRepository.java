package thao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import thao.model.Smartphone;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}