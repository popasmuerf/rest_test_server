package gov.dhs.fema.rest_test_server.service;

import gov.dhs.fema.rest_test_server.domain.User;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BootStrappingService {
    private List<User> userList = new ArrayList<User>() ;
    User user = new User();
    private void createUserList(){
        User user = new User();
        user.setId(new Long(1));
        user.setName("foo bar -1");
        user.setAddress("coventry way Arkansas");
        user.setEmail("foo@bar.com");
        userList.add(user);

        user = new User();
        user.setId(new Long(2));
        user.setName("foo bar -2");
        user.setAddress("coventry way Arkansas");
        user.setEmail("foo@bar.com");
        userList.add(user);

        user = new User();
        user.setId(new Long(3));
        user.setName("foo bar -2");
        user.setAddress("coventry way Arkansas");
        user.setEmail("foo@bar.com");
        userList.add(user); 
    }

    public List<User> getUserLists(){
        return userList;
    }

    public User getUser(Long id){
        for(User user: userList){
            if(user.getId() == id){
                return user ;
            }
        }
         User user =   new User() ;
        user.setId(new Long(-1)) ;
        user.setName("noname") ;
        user.setAddress("noaddress");
        user.setEmail("noname@nowhere.com");
        return user ;
    }

    @Autowired
    public BootStrappingService(){
        createUserList();
    }

}