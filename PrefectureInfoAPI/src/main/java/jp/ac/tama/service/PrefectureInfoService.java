package jp.ac.tama.service;

import jp.ac.tama.entity.PrefectureInfo;
import jp.ac.tama.entity.PrefectureSimpleInfo;
import jp.ac.tama.repository.PrefectureInfoRepository;
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
public class PrefectureInfoService {
    @Autowired
    private PrefectureInfoRepository prefectureInfoRepository;

    @Transactional
    public List<PrefectureSimpleInfo> findAllState(){
        val  simpleInfos = new ArrayList<PrefectureSimpleInfo>();
        for (PrefectureInfo prefectureInfo: prefectureInfoRepository.findAll()){
            simpleInfos.add(new PrefectureSimpleInfo(prefectureInfo.getId(),prefectureInfo.getName()));
        }
        return simpleInfos;
    }

    @Transactional
    public PrefectureInfo findOneState(int stateId){
        return prefectureInfoRepository.findOne(stateId);
    }

    @Transactional
    public List<PrefectureInfo> findLikePrefecture(String likePrefecture){
        return prefectureInfoRepository.findByNameLikeParam(likePrefecture + "%");
    }
}
