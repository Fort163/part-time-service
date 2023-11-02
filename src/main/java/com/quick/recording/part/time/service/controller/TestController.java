package com.quick.recording.part.time.service.controller;

import com.quick.recording.gateway.dto.company.CompanyDto;
import com.quick.recording.gateway.dto.user.UserDto;
import com.quick.recording.gateway.service.company.CompanyController;
import com.quick.recording.gateway.service.user.UserController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
//@SecurityRequirement(name = "bearerAuth")
public class TestController {

    @Autowired
    private CompanyController companyController;

    @Autowired
    private UserController userController;

    @GetMapping("/test")
    @Tag(name = "Tag 1", description = "первый таг")
    public ResponseEntity<List<Object>> test(){
        ResponseEntity<CompanyDto> company = companyController.getCompany();
        ResponseEntity<UserDto> user = userController.getUserByName("Петя");
        return ResponseEntity.ok(List.of(user,company));
    }


    @Operation(summary = "Get a book by its id")
    @Tag(name = "Tag 1", description = "первый таг")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book", content =
                    {
                            @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = CompanyDto.class)
                            )
                    }
                    ),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content) })
    @GetMapping("/{uuid}")
    public ResponseEntity<CompanyDto> findById(@Parameter(description = "id of book to be searched") @PathVariable UUID id) {
        return companyController.getCompany();
    }
}
