package com.sifast.model;

import io.swagger.annotations.ApiModel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
@ApiModel(value = "Movie", description = "The movie")
public class Movie {

    private String name;

    public Movie() {
        super();
    }

    public Movie(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + "]";
    }

}
