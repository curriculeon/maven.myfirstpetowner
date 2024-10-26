package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class PetOwner extends Person {
    private Pet pet=null;

    public PetOwner(String firstName, String lastName) {
        super();
    }

    public PetOwner() {
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Pet getPet() {
        return pet;
    }
}
