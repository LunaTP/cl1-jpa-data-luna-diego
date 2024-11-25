package pe.edu.i202223044.cl1_jpa_data_luna_diego;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202223044.cl1_jpa_data_luna_diego.repository.CountryRepository;

import java.util.List;

@SpringBootApplication
public class Cl1JpaDataLunaDiegoApplication implements CommandLineRunner {
	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataLunaDiegoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Eliminando los paises, ciudades y lenguajes con el CODE: COL y ARG");
		countryRepository.deleteAllById(List.of("COL", "ARG"));
		System.out.println("Países, ciudades y lenguajes DE 'COL' y 'ARG' eliminados correctamente.");
	}
}

//		System.out.println("Consultando los lenguajes antes de borrar:");
//		obtenerLenguajes();


//		countryRepository.deleteAllById(List.of("COL", "ARG"));
//		System.out.println("Eliminando COL y ARG...");
//		System.out.println("=");

//
//		System.out.println("Consultando los lenguajes después de la borrar:");
//		obtenerLenguajes();

//private void obtenerLenguajes() {

//
//}