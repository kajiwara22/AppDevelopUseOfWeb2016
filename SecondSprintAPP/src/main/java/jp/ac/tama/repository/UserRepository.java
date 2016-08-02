package jp.ac.tama.repository;

import org.springframework.data.mirage.repository.MirageRepository;

import jp.ac.tama.entity.UserEntity;

/**
 * Created by kajiwarayutaka on 2016/08/02.
 */
public interface UserRepository extends MirageRepository<UserEntity, String> {
}
