package jp.ac.tama.controller;

import jp.ac.tama.entity.UserEntity;
import jp.ac.tama.model.User;
import jp.ac.tama.service.UserService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kajiwarayutaka on 2016/08/03.
 */
@RestController
@RequestMapping(value = "/user", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "{userId}",method = RequestMethod.GET)
    public User showUser(@PathVariable String userId){
        val user = new User(userId,"リクエストより生成されたユーザー");
        return user;
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Iterable<UserEntity> showUsers(){
        val users = userService.getUsers();
        return users;
    }
}
