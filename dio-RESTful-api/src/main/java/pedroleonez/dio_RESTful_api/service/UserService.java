package pedroleonez.dio_RESTful_api.service;

import pedroleonez.dio_RESTful_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
