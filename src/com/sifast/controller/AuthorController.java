package com.sifast.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sifast.model.User;

@Api(value = "author", description = "every thing about your authors")
@RestController
@RequestMapping("/author")
public class AuthorController {

    ArrayList<User> users = new ArrayList<User>();

    @Autowired
    User user;

    @ApiOperation(value = "add an author ")
    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public ArrayList<User> addAuthor(@ApiParam(value = "name of the author", required = true) @RequestParam String authorName,
            @ApiParam(value = "last name of the author", required = true) @RequestParam String authorLastName) {

        // check and test for the annotation
        System.out.println("user => " + user);
		// git demo
        User u = new User();
        u.setName(authorName);
        u.setLastName(authorLastName);
        users.add(u);

        return users;
    }

}
