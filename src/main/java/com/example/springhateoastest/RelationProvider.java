package com.example.springhateoastest;

import org.springframework.hateoas.RelProvider;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class RelationProvider implements RelProvider {
    @Override
    public String getItemResourceRelFor(Class<?> type) {
        return StringUtils.uncapitalize(type.getSimpleName());
    }

    @Override
    public String getCollectionResourceRelFor(Class<?> type) {
        return "_entries";
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
