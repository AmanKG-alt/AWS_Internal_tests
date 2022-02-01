
package com.exam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="users")
public class User {




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean enabled=true;
    private String profile;



//user many roles
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    @JsonIgnore
 private Set<UserRole> userRoles=new HashSet<>();

}
