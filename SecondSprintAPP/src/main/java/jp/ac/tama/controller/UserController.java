package jp.ac.tama.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.ac.tama.model.User;
import lombok.val;

/**
 * Created by kajiwarayutaka on 2016/08/03.
 */
@RestController
@RequestMapping(value = "/user", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {
    @RequestMapping(value = "{userId}",method = RequestMethod.GET)
    public User showUser(@PathVariable String userId){
        val user = new User(userId,"リクエストより生成されたユーザー");
        return user;
    }
}
