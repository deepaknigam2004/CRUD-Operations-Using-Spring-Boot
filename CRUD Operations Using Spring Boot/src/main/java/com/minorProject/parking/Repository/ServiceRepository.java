package com.minorProject.parking.Repository;

import com.minorProject.parking.UserModel.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<UsersEntity, String> {


}
