package com.bookMyshow.bookMyshow.Service;

import com.bookMyshow.bookMyshow.Entities.UserEntity;
import com.bookMyshow.bookMyshow.EntryDTOs.UserEntryDTO;
import com.bookMyshow.bookMyshow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDTO userEntryDTO){

        // here we need to convert(Entry DTO to a entity) and save
        /*
        the old method is you really create a object and set attributes
         */
        // This is to set all of the attributes in one go
        // Creating object
        UserEntity userEntity= UserEntity.builder().age(userEntryDTO.getAge()).name(userEntryDTO.getName())
                .address(userEntryDTO.getAddress()).email(userEntryDTO.getEmail()).mobile(userEntryDTO.getMobile())
                .build();

        // Save this entity in repository
        userRepository.save(userEntity);


    }
}
