package com.fifth.pillar.usercrudms;

import com.fifth.pillar.usercrudms.controllers.UserController;
import com.fifth.pillar.usercrudms.models.User;
import com.fifth.pillar.usercrudms.services.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    private List<User> userList;
    private User user1;
    private User user2;

    @Before
    public void setUp() {
//        user1 = new User(1l, "userOne", "pword1", "User", "One", "userOne@email.com", "760-555-5555");
//        user2 = new User(2l, "userTwo", "pword2", "User", "Two", "userTwo@email.com", "760-555-5555");

        user1 = new User();
        user2 = new User();
        user1.setId(1l);
        user1.setUName("userOne");
//        user1.setPWord("pword1");
//        user1.setFName("User");
//        user1.se
        userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Mockito.when(userService.getAllUsers()).thenReturn(userList);
        Mockito.when(userService.getUserById(1l)).thenReturn(user1);
        Mockito.when(userService.getUserById(2l)).thenReturn((user2));
    }

    @Test
    public void getAllUsers_shouldReturnAllUsers_whenCalled() {
        ResponseEntity<List<User>> result = userController.getAllUsers();
        Assert.assertEquals(result.getBody(), userList);
    }

    @Test
    public void getUserById_shouldReturnTheUserWithTheIdPassedIn_whenCalledWithValidId() {
        ResponseEntity<User> result = userController.getUserById(1l);
        Assert.assertEquals(result.getBody(), user1);
    }
}
