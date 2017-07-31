package com.example.springhateoastest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonResourceAssembler assembler;

    @GetMapping
    public Resources<PersonResource> getAllPersons() {
        Person person1 = new Person("test1");
        Person person2 = new Person("test2");

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

        List<PersonResource> resources = assembler.toResources(persons);
        Link self = ControllerLinkBuilder.linkTo(this.getClass()).withSelfRel();
        return new Resources<>(resources, self);
    }

}
