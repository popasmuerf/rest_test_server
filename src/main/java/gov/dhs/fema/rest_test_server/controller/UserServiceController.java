package gov.dhs.fema.rest_test_server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import gov.dhs.fema.rest_test_server.domain.User;
import gov.dhs.fema.rest_test_server.service.BootStrappingService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by mdb on 10/3/18.
 */
@RestController
//@RequestMapping("/api/user")
public class UserServiceController {

   private  BootStrappingService bstrService  ;

    public static final Logger logger = LoggerFactory.getLogger(UserServiceController.class);

    @Autowired
    public void setBootStrappingService(BootStrappingService bstrService){
        this.bstrService = bstrService ;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> userList = bstrService.getUserLists() ;
        ResponseEntity<List<User>> respEntity = new  ResponseEntity<List<User>>(userList,HttpStatus.OK);
        return respEntity ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById( @PathVariable("id")  Long id) {
        User user =  bstrService.getUser(id);
        ResponseEntity<User> respEntity = new  ResponseEntity<User>(user,HttpStatus.OK);
        return respEntity ;
    }

    /*
    @PostMapping(value="/",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser(@Valid @RequestBody final User user){
       return null ;
    }


    @PutMapping(value="/{id}", consumes =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> updateUser(@PathVariable("id") final Long id,@RequestBody User user){
       return null ;
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") final Long id){
       return null ;
    }

    */

}
