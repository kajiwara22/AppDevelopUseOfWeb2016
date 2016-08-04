package jp.ac.tama.service;

import jp.ac.tama.entity.UserEntity;
import jp.ac.tama.model.User;
import jp.ac.tama.repository.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * Created by kajiwarayutaka on 2016/08/02.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public Iterable<UserEntity> getUsers(){
        return userRepository.findAll();
    }

    @Transactional
    public void addUser(UserEntity userEntity){
        userRepository.save(userEntity);
    }
    @Transactional
    public UserEntity getUser(){
        String userId ="7745";
        val userEntity = userRepository.findOne(userId);
        return userEntity;
    }

    @Transactional
    public Boolean existUser(){
        String userId = "7745";
        return userRepository.exists(userId);
    }

    @Transactional
    public void deleteUser(){
        String userId = "7745";
        userRepository.delete(userId);
    }

    public Iterable<UserEntity> getRestArrayEntity() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserEntity[]> responseEntity = restTemplate.getForEntity("http://localhost:8080/users", UserEntity[].class);
        val userEntities = new ArrayList<UserEntity>();
        for (UserEntity userEntity:responseEntity.getBody()) {
            userEntities.add(userEntity);
        }
        return userEntities;
    }

    public User getRestEntity() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> responseEntity = restTemplate.getForEntity("http://localhost:8080/user/987654321", User.class);
        return responseEntity.getBody();
    }

}
