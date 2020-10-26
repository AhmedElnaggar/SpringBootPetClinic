package learning.springbootframework.petclinic.services;

import learning.springbootframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner , Long> {
    Owner findByLastName(String lastName);
}
