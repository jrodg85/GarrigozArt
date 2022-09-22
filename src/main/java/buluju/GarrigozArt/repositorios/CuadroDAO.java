package buluju.GarrigozArt.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import buluju.GarrigozArt.entidades.Cuadro;

@RepositoryRestResource(path = "ofertas", itemResourceRel = "oferta",
    collectionResourceRel = "ofertas")
public interface CuadroDAO extends JpaRepository<Cuadro, Long> {

}
