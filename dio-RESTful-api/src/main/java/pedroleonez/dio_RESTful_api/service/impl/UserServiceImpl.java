package pedroleonez.dio_RESTful_api.service.impl;

import org.springframework.stereotype.Service;
import pedroleonez.dio_RESTful_api.domain.model.User;
import pedroleonez.dio_RESTful_api.domain.repository.UserRepository;
import pedroleonez.dio_RESTful_api.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("User already exists");
        }
        return userRepository.save(userToCreate);
    }
}
