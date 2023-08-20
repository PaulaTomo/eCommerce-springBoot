package com.store.mystorespringboot.controller;


import com.store.mystorespringboot.dto.SizeRequestDto;
import com.store.mystorespringboot.dto.SizeResponseDto;
import com.store.mystorespringboot.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping(value = "/size" , produces = MediaType.APPLICATION_JSON_VALUE)
public class SizeController {

    @Autowired
    private SizeService sizeService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SizeResponseDto> save(@RequestBody SizeRequestDto requestDto){
        SizeResponseDto responseDto = sizeService. save(requestDto);

        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }

    @GetMapping("dress/{dressId}")
public ResponseEntity<List<SizeResponseDto>> findByDress(@PathVariable Long dressId){
        List<SizeResponseDto> size = sizeService.findByDress(dressId);

        return  new ResponseEntity<>(size, HttpStatus.OK);
    }

}
