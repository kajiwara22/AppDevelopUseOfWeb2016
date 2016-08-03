package jp.ac.tama.service;

import jp.ac.tama.entity.UserEntity;
import jp.ac.tama.repository.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public void addUser(){
        String userName = "名無しの権兵衛";
        String userId = "7745";
        val userEntity = new UserEntity(userId,userName);
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

    @Transactional
    public int getSekaiNoNabetsuneCount(){
        return userRepository.findSekaiNoNabetsune();
    }

    @Transactional
    public List<UserEntity> getFirstKAuser(){
        return userRepository.findLikeQuery();
    }



    }
