package com.example.demo.config;

import static com.example.demo.util.ValidationErrorMessages.ROLE_ADMIN;
import static com.example.demo.util.ValidationErrorMessages.ROLE_USER;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Role;
import com.example.demo.repository.UserRoleRepository;

@Component
public class DatabaseRolesSeeder {

	private final UserRoleRepository userRoleRepository;

    @Autowired
    public DatabaseRolesSeeder(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @PostConstruct
    public void seed() {
        if (this.userRoleRepository.count() == 0) {
            //Role rootAdmin = new Role();
        	//rootAdmin.setAuthority(ROLE_ADMIN);

            Role admin = new Role();
            admin.setAuthority(ROLE_ADMIN);

            Role user = new Role();
            user.setAuthority(ROLE_USER);

            //this.userRoleRepository.save(rootAdmin);
            this.userRoleRepository.save(admin);
            this.userRoleRepository.save(user);
        }
    }
}
