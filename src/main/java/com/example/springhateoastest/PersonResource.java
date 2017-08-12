package com.example.springhateoastest;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

@Data
@EqualsAndHashCode(callSuper = false)
public class PersonResource extends ResourceSupport {
    @JsonUnwrapped
    private Person person;
}
