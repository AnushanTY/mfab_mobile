package com.mfab_mobile.repositery;

import com.mfab_mobile.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
