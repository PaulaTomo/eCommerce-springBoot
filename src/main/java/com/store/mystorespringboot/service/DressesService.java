package com.store.mystorespringboot.service;

import com.store.mystorespringboot.dto.DressRequestDto;
import com.store.mystorespringboot.dto.DressResponseDto;
import com.store.mystorespringboot.exception.DressNotExistException;
import com.store.mystorespringboot.mapping.DressesMapper;
import com.store.mystorespringboot.model.Dresses;
import com.store.mystorespringboot.repository.DressesRepository;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DressesService {
    private static Logger logger = LoggerFactory.getLogger(DressesService.class);
    @Autowired
    private DressesRepository dressesRepository;

    public DressResponseDto save(DressRequestDto dto) {
        Dresses dresses = DressesMapper.dtoToEntity(dto);
        Dresses saveDress = dressesRepository.save(dresses);

        logger.info(" Saved the dress with ID: {} ", saveDress.getId());
        return DressesMapper.entityToDto(saveDress);
    }
    @Transactional(readOnly = true)
    public DressResponseDto findById(Long dressId) {
        Optional<Dresses> optional = dressesRepository.findById(dressId);
        Dresses dress = optional.orElseThrow(() -> new DressNotExistException("The dress with this id is not exist"));

        logger.info("Find the dress with the Id: {}", dressId);

        return DressesMapper.entityToDto(dress);
    }

    public DressResponseDto update(DressRequestDto dto, Long dressId) {
        Optional<Dresses> optional = dressesRepository.findById(dressId);
        Dresses dress = optional.orElseThrow(() -> new DressNotExistException("The dress with this id is not exist"));
        dress.setDressName(dto.getDressName());
        dress.setPrice(dto.getPrice());
        dress.setQuantity(dto.getQuantity());
        dress.setCategory(dto.getCategory());
        dress.setImagePath(dto.getImagePath());

        Dresses newDress = dressesRepository.save(dress);

        logger.info("Update the dress with id: {} ", dressId );

        return DressesMapper.entityToDto(newDress);
    }

    public DressResponseDto deleteById(Long dressId){
        Optional<Dresses> optional = dressesRepository.findById(dressId);
        Dresses dress = optional.orElseThrow(() -> new DressNotExistException("The dress with this id is not exist"));

        dressesRepository.deleteById(dressId);
        return DressesMapper.entityToDto(dress);
    }

    public List<DressResponseDto> findAll(){
        List<Dresses> entityList = dressesRepository.findAll();
        logger.info("Find {} dresses" , entityList.size());

        return  DressesMapper.entityListToDtoList(entityList);
    }

}
