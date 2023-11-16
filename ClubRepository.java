package br.com.meli.partidafutbol.Repository;

import br.com.meli.partidafutbol.Model.ClubModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<ClubModel, Long> {
}
