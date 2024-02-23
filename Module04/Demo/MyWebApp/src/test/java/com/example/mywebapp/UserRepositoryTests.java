package com.example.mywebapp;

import com.example.mywebapp.model.User;
import com.example.mywebapp.repository.IUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    private IUserRepository repository;

    @Test
    public void testAddNew() {
        User user = new User();
        user.setEmail("hoangnhan@gmail.com");
        user.setPassword("abc1234");
        user.setFirstName("nhan");
        user.setLastName("hoang");
        User saveUser = repository.save(user);
        Assertions.assertThat(saveUser).isNotNull();
        Assertions.assertThat(saveUser.getId()).isGreaterThan(0);

    }

    @Test
    public void testListAll() {
        Iterable<User> users = repository.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate() {
        Integer userId = 1;
        Optional<User> optionalUser = repository.findById(userId);
        User user = optionalUser.get();
        user.setPassword("abcd123");
        repository.save(user);
        User updatedUser = repository.findById(userId).get();
        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("abcd123");
    }
    @Test
    public void testGet(){
        Integer userId=7;
        Optional<User> optionalUser=repository.findById(userId);
        Assertions.assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());
    }
    @Test
    public void testDelete(){
        Integer userId=7;
        repository.deleteById(userId);
        Optional<User> optionalUser=repository.findById(userId);
        Assertions.assertThat(optionalUser).isNotPresent();
    }
}
