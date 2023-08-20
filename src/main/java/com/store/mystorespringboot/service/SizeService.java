package com.store.mystorespringboot.service;

import com.store.mystorespringboot.dto.SizeRequestDto;
import com.store.mystorespringboot.dto.SizeResponseDto;
import com.store.mystorespringboot.exception.DressNotExistException;
import com.store.mystorespringboot.mapping.SizeMapper;
import com.store.mystorespringboot.model.Dresses;
import com.store.mystorespringboot.model.Size;
import com.store.mystorespringboot.repository.DressesRepository;
import com.store.mystorespringboot.repository.SizeRepository;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SizeService {

    private static Logger logger = LoggerFactory.getLogger(SizeService.class);
    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private DressesRepository dressesRepository;

    public SizeResponseDto save(SizeRequestDto sizeDto) {
        Size size = new Size();
        size.setSizeName(sizeDto.getSizeName());


        Long dressId = sizeDto.getDresses().getId();
        Dresses dress = dressesRepository.findById(dressId)
                .orElseThrow(() -> new DressNotExistException("Incorrect ID provided"));

        size.setDresses(dress);

        Size sizeSave = sizeRepository.save(size);
        logger.info("Saved the size with id: {}", sizeSave.getSizeId());
        return SizeMapper.entityToDto(sizeSave);
    }
    public List<SizeResponseDto> findByDress(Long dressId){

        Dresses dresses = dressesRepository.findById(dressId)
                .orElseThrow(() -> new DressNotExistException("Incorrect ID provided"));

        List <Size> size = sizeRepository.findByDresses(dresses);
        return SizeMapper.entityListToDtoList(size);
    }
}

