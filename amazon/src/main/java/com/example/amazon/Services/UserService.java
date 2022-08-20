package com.example.amazon.Services;

import com.example.amazon.Entity.UserMetaData;
import com.example.amazon.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    // Submit the data into the database
    public UserMetaData saveUserMetaDataToDB(UserMetaData metaData){

        return userRepo.save(metaData);
    }

    // Retrieve the data from the database
    public UserMetaData getUserDetailsFromDB(String userId){
        return userRepo.findAllByUniqueId(userId);
    }
}

