package com.alaa.hotel.user;

import java.util.List;

import com.alaa.hotel.user.dtos.UserRequest;
import com.alaa.hotel.user.dtos.UserResponse;

public interface UserService {

    UserResponse saveUser(UserRequest userRequest);

    UserResponse getUserByUsername(String username);

    UserResponse getUser();

    List<UserResponse> getAllUser();

}
