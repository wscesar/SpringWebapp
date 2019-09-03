package wscesar.spring.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import wscesar.spring.crud.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
