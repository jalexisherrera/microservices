package co.edu.udea.carro.service.servicio;

import co.edu.udea.carro.service.entidades.Carro;
import co.edu.udea.carro.service.repositorio.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> getAll(){
        return carroRepository.findAll();
    }

    public Carro getCarroById(int id){
        return carroRepository.findById(id).orElse(null);
    }

    public Carro save(Carro carro){
        Carro nuevoCarro = carroRepository.save(carro);
        return nuevoCarro;
    }


    public List<Carro> byUsuario(int usuarioId){
        return carroRepository.findByUsuarioId(usuarioId);
    }
}
