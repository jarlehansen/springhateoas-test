package com.example.springhateoastest;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;

@Service
public class PersonResourceAssembler extends ResourceAssemblerSupport<Person, PersonResource> {
    public PersonResourceAssembler() {
        super(PersonController.class, PersonResource.class);
    }

    @Override
    public PersonResource toResource(Person entity) {
        return createResourceWithId(entity.getName(), entity);
    }
}
