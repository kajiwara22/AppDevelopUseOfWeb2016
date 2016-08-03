package jp.ac.tama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.ac.tama.entity.UserEntity;
import jp.ac.tama.service.UserService;
import lombok.val;

/**
 * Created by kajiwarayutaka on 2016/08/03.
 */
@RestController
@RequestMapping(value = "/users", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UsersController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Iterable<UserEntity> showUsers(){
        val users = userService.getUsers();
        return users;
    }
}
