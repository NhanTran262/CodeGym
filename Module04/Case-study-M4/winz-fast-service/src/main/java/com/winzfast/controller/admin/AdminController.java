package com.winzfast.controller.admin;


import com.winzfast.dto.UserDTO;
import com.winzfast.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")

public class AdminController {

    @Autowired
    private  UserService userService;

    @GetMapping("/user-list")
    public ResponseEntity<Iterable<UserDTO>> getUserList() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/user-list/user/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @PostMapping("/user-list/user/save/{id}")
    public ResponseEntity<String> saveOrUpdateUser(@PathVariable Integer id, @RequestBody UserDTO userDTO) {
        userDTO.setId(id);
        userService.save(userDTO);
        return ResponseEntity.ok("Save/Update completed!");
    }

    @DeleteMapping("/user-list/user/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        UserDTO userDTO = userService.getUserById(id);
        String username = userDTO.getUsername();
        userService.remove(id);
        return ResponseEntity.ok("User " + username + " deleted!");
    }


}
