package jp.ac.tama.repository;

import jp.ac.tama.entity.PrefectureInfo;
import org.springframework.data.mirage.repository.MirageRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by kajiwarayutaka on 2016/08/04.
 */
public interface PrefectureInfoRepository extends MirageRepository<PrefectureInfo,Integer>{
    List<PrefectureInfo> findByNameLikeParam(@Param("prefecture_name") String prefecture_name);
}
