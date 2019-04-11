package gov.dhs.fema.rest_test_server.domain;

/**
 * Created by mdb on 10/1/18.
 */
public class User {
    Long id ;
    String name ;
    String address ;
    String email ;

    public Long getId(){return id ;}
    public void setId(Long i){this.id = i ;}
    public String getName(){return name ;}
    public void setName(String name){this.name = name ;}
    public String  getAddress(){return address ;}
    public void setAddress(String address){this.address = address;}
    public String getEmail(){return email;}
    public void setEmail(String email ){this.email = email ;}


}
