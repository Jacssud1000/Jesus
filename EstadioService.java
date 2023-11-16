package br.com.meli.partidafutbol.Service;

import br.com.meli.partidafutbol.Model.EstadioModel;
import br.com.meli.partidafutbol.Repository.EstadioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadioService {
    @Autowired
    private static EstadioRepository estadioRepository;

    public EstadioService() {
    }

    public List<EstadioModel> findAll() {
        return this.estadioRepository.findAll();
    }

    public EstadioModel findByid(Long id) {
        Optional<EstadioModel> savedEstadio = this.estadioRepository.findById(id);
        return savedEstadio.get();
    }

    public static EstadioModel agregarEstadio(EstadioModel obj) {
        return estadioRepository.save(obj);
    }

    public EstadioModel save(EstadioModel estadioModel) {
        return estadioModel;
    }

    public static void deleteById(Long id) {
    }
}
