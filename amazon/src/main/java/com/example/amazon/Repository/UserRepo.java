package com.example.amazon.Repository;

import com.example.amazon.Entity.UserMetaData;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserMetaData,Long> {

    UserMetaData save(UserMetaData userdata);
    UserMetaData findAllByUniqueId(String uniqueId);
}
