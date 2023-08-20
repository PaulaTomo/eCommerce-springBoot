package com.store.mystorespringboot.controller;

import com.store.mystorespringboot.dto.DressRequestDto;
import com.store.mystorespringboot.dto.DressResponseDto;
import com.store.mystorespringboot.service.DressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping(value = "/dresses",produces = MediaType.APPLICATION_JSON_VALUE)
public class DressesController {

    @Autowired
    private DressesService dressesService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DressResponseDto> save(@RequestBody DressRequestDto request){
        DressResponseDto response = dressesService.save(request);
        return  new ResponseEntity<DressResponseDto>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "/")
    public ResponseEntity<DressResponseDto> findById(@RequestParam(value = "id") Long dressId){
        DressResponseDto response = dressesService.findById(dressId);

        return  new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping(value = "/" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DressResponseDto> update(@RequestBody DressRequestDto requestDto, @RequestParam(value = "id") Long dressId){
        DressResponseDto responseDto = dressesService.update(requestDto, dressId);

        return new ResponseEntity<>(responseDto,HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/")
    public  ResponseEntity<DressResponseDto> deleteById(@RequestParam(value = "id") Long dressId){
        DressResponseDto responseDto = dressesService.deleteById(dressId);
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<DressResponseDto>> findAll(){
        List<DressResponseDto> response = dressesService.findAll();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
