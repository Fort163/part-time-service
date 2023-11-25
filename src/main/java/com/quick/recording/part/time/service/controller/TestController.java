package com.quick.recording.part.time.service.controller;

import com.quick.recording.gateway.dto.company.CompanyDto;
import com.quick.recording.gateway.dto.user.UserDto;
import com.quick.recording.gateway.service.company.CompanyController;
import com.quick.recording.gateway.service.user.UserController;
import com.quick.recording.resource.service.security.QROAuth2AuthenticatedPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private CompanyController companyController;

    @Autowired
    private UserController userController;

    @GetMapping("/test")
    public ResponseEntity<List<Object>> test(){
        ResponseEntity<List<CompanyDto>> companyList = companyController.getCompanyList();
        ResponseEntity<UserDto> user = userController.getUserByName("Петя");
        return ResponseEntity.ok(List.of(user,companyList));
    }

}
