package kz.iitu.projects.zoomedcenter.service;

import kz.iitu.projects.zoomedcenter.model.Role;
import kz.iitu.projects.zoomedcenter.model.User;
import kz.iitu.projects.zoomedcenter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) throws Exception {

        if(user.getRoles() == null || user.getRoles().isEmpty()) {
            throw new Exception("User must have at least a role set!");
        }

        for (Role role : user.getRoles()) {
            if(!role.getName().startsWith("ROLE_")) {
                role.setName("ROLE_" + role.getName());
            }

            if(role.getUser() == null) {
                role.setUser(user);
            }
        }

        userRepository.save(user);

    }
}
