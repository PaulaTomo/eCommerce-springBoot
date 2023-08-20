package com.store.mystorespringboot.controller;

import com.store.mystorespringboot.dto.ColorRequestDto;
import com.store.mystorespringboot.dto.ColorResponseDto;
import com.store.mystorespringboot.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/color" , produces = MediaType.APPLICATION_JSON_VALUE)
public class ColorController {

    @Autowired
  private  ColorService colorService;


    @PostMapping(value = "/" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ColorResponseDto> save(@RequestBody ColorRequestDto request){
        ColorResponseDto responseColor = colorService.save(request);

        return  new ResponseEntity<>(responseColor, HttpStatus.CREATED);
    }
}
