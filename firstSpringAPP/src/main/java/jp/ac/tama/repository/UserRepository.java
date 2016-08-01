package jp.ac.tama.repository;

import jp.ac.tama.entity.UserEntity;
import org.springframework.data.mirage.repository.MirageRepository;

/**
 * Created by kajiwarayutaka on 2016/08/02.
 */
public interface UserRepository extends MirageRepository<UserEntity, String> {
}
