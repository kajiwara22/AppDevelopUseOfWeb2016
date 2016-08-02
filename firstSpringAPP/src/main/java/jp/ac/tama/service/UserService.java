package jp.ac.tama.service;

import jp.ac.tama.model.InputUserResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.tama.entity.UserEntity;
import jp.ac.tama.repository.UserRepository;
import lombok.val;

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
    public void addUser(InputUserResult inputUserResult){
        String userName = inputUserResult.getUserName();
        String userId = inputUserResult.getUserId();
        val userEntity = new UserEntity(userId,userName);
        userRepository.save(userEntity);
    }
    @Transactional
    public UserEntity getUser(InputUserResult inputUserResult){
        String userId = inputUserResult.getUserId();
        val userEntity = userRepository.findOne(userId);
        return userEntity;
    }

    @Transactional
    public Boolean existUser(InputUserResult inputUserResult){
        String userId = inputUserResult.getUserId();
        return userRepository.exists(userId);
    }

    @Transactional
    public void deleteUser(InputUserResult inputUserResult){
        String userId = inputUserResult.getUserId();
        userRepository.delete(userId);
    }


}
