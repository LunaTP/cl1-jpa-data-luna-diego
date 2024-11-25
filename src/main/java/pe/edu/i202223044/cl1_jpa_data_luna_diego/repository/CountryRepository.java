package pe.edu.i202223044.cl1_jpa_data_luna_diego.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.i202223044.cl1_jpa_data_luna_diego.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country,String> {
}
