package me.aleishawalters.payrollsystem.usersvc;

import me.aleishawalters.payrollsystem.companysvc.models.Company;
import me.aleishawalters.payrollsystem.encryptionsvc.EncryptionService;
import me.aleishawalters.payrollsystem.usersvc.models.User;
import me.aleishawalters.payrollsystem.usersvc.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    private UserRepository userRepository;
    private EncryptionService encryptionService;

    public UserService(UserRepository userRepository, EncryptionService encryptionService) {
        this.userRepository = userRepository;
        this.encryptionService = encryptionService;
    }

    public User createUser(String username, String password)
    {
       String hashedPassword = password;

        User user = new User();
        user.setUsername(username);
        user.setHashedPassword(encryptionService.generateHashedPassword(password));

        this.userRepository.save(user);
        return user;
    }

    public Optional<User> getUserByUsername(String username)
    {
        List<User> users = this.userRepository.findByUsername(username);

        if(users.isEmpty())
        {
          return Optional.empty();
        }

        User user = users.get(0);

        return Optional.of(user);
    }

}
