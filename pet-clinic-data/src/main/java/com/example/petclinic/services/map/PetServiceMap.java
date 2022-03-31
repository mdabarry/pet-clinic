package com.example.petclinic.services.map;

import com.example.petclinic.model.Pet;
import com.example.petclinic.services.CRUDService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CRUDService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}