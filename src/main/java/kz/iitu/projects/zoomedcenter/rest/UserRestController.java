package kz.iitu.projects.zoomedcenter.rest;

import kz.iitu.projects.zoomedcenter.model.User;
import kz.iitu.projects.zoomedcenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("api/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    public ResponseEntity<User> addOwner(@RequestBody @Valid User user, BindingResult bindingResult) throws Exception{

        BindingErrorsResponse errors = new BindingErrorsResponse();

    }

}
