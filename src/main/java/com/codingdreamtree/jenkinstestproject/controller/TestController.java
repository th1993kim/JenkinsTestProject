package com.codingdreamtree.jenkinstestproject.controller;

import com.codingdreamtree.jenkinstestproject.controller.dto.CustomDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {


    @GetMapping
    public ResponseEntity<CustomDto> findCustomDto() {
        return ResponseEntity.ok(new CustomDto(200, "테스트 성공"));
    }

}
