package learning.springbootframework.petclinic.bootstrap;

import learning.springbootframework.petclinic.model.Owner;
import learning.springbootframework.petclinic.model.Vet;
import learning.springbootframework.petclinic.services.OwnerService;
import learning.springbootframework.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
   private final OwnerService ownerService;
   private final VetService vetService;

   @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setFirstName("ahmed");
        owner1.setLastName("ebrahim");
        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("Ali");
        owner2.setLastName("mohab");
        ownerService.save(owner2);

        System.out.println("Loaded owners ...");
        Vet vet1=new Vet();
        vet1.setFirstName("adam");
        vet1.setLastName("smith");
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("jack");
        vet2.setLastName("arnold");
        vetService.save(vet2);
        System.out.println("Loaded Vets ...");
    }
}
