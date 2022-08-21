package me.aleishawalters.payrollsystem.usersvc.controllers;

import me.aleishawalters.payrollsystem.companysvc.controllers.requests.CreateCompanyRequest;
import me.aleishawalters.payrollsystem.companysvc.exceptions.CompanyCodeDuplicateException;
import me.aleishawalters.payrollsystem.companysvc.models.Company;
import me.aleishawalters.payrollsystem.usersvc.UserService;
import me.aleishawalters.payrollsystem.usersvc.controllers.requests.CreateUserRequest;
import me.aleishawalters.payrollsystem.usersvc.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Controller @RestController
public class UserController
{
    private UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody CreateUserRequest createUserRequest)
    {
        User user = this.userService.createUser(createUserRequest.getUsername(), createUserRequest.getPassword());

        return user;
    }
}
