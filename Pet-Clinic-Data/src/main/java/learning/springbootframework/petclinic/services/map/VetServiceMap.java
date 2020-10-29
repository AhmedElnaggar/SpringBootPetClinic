package learning.springbootframework.petclinic.services.map;

import learning.springbootframework.petclinic.model.Vet;
import learning.springbootframework.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMap<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId() , vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
