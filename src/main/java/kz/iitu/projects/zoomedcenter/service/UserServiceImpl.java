package kz.iitu.projects.zoomedcenter.service;

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

        userRepository.save(user);

    }
}
