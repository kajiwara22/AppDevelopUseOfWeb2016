package jp.ac.tama.service;

import jp.ac.tama.entity.StateInfo;
import jp.ac.tama.entity.StatesInfo;
import jp.ac.tama.repository.StateInfoRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kajiwarayutaka on 2016/08/04.
 */
@Service
public class StateInfoService {
    @Autowired
    private StateInfoRepository stateInfoRepository;

    @Transactional
    public List<StatesInfo> findAllState(){
        val  statesInfoes = new ArrayList<StatesInfo>();
        for (StateInfo stateinfo:stateInfoRepository.findAll()){
            statesInfoes.add(new StatesInfo(stateinfo.getStateId(),stateinfo.getName()));
        }
        return statesInfoes;
    }

    @Transactional
    public StateInfo findOneState(int stateId){
        return stateInfoRepository.findOne(stateId);
    }
}
