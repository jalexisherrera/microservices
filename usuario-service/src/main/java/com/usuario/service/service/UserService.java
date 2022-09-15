package com.user.service.service;

import org.springframework.stereotype.Service;

@service
public class UserService{

    @Autowired
    private userRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user){
        User newUser = userRepository.save(user);
        return newUser;
    }


}
