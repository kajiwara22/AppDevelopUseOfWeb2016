package jp.ac.tama.repository;

import jp.ac.tama.entity.UserEntity;
import org.springframework.data.mirage.repository.MirageRepository;

import java.util.List;

/**
 * Created by kajiwarayutaka on 2016/08/02.
 */
public interface UserRepository extends MirageRepository<UserEntity, String> {
    int findSekaiNoNabetsune();
    List<UserEntity> findLikeQuery();
}
