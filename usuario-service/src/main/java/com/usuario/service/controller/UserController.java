package com.usuario.service.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> listUsers(){
        List<User> users = userService.getAll();
        if(users.isEmpty()){
            return ResponseEntity.noContent().build();
            //si nuestra lista está vacía, devolvemos un no content
        }
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id){
        User user = userService.getUserById(id);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userService.saveUser(user);
        return ResponseEntity.ok(newUser);
    }

}