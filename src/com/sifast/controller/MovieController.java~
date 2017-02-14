package com.sifast.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sifast.model.Movie;
import com.sifast.model.User;

@Api(value = "movie", description = "every thing about your movies")
@RestController
@RequestMapping("/movie")
public class MovieController {

    ArrayList<Movie> movies = new ArrayList<>();

    ArrayList<User> users = new ArrayList<>();

    @Autowired
    Movie movie;

    @Autowired
    User user;

    // TODO Check other annotation
    @ApiOperation(value = "add a movie and get all of them")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ArrayList<User> addMovieAuthor(@ApiParam(value = "name of the movie", required = true) @RequestParam String name,
            @ApiParam(value = "name of the author", required = true) @RequestParam String authorName,
            @ApiParam(value = "last name of the author", required = true) @RequestParam String authorLastName) {

        movie.setName(name);
        movies.add(movie);

        // check and test for the annotation
        System.out.println("user => " + user + "movie =>" + movie);

        User u = new User();
        u.setName(authorName);
        u.setLastName(authorLastName);
        users.add(u);
        return users;
    }

    @ApiOperation(value = "get All list of movies")
    @ApiResponse(code = 404, message = "Movies not found")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Movie> getAllMovies() {
        movies.forEach(i -> System.out.println(i.toString()));
        return movies;

    }

}
