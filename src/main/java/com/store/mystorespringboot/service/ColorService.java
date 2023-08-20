package com.store.mystorespringboot.service;

import com.store.mystorespringboot.dto.ColorRequestDto;
import com.store.mystorespringboot.dto.ColorResponseDto;
import com.store.mystorespringboot.exception.DressNotExistException;
import com.store.mystorespringboot.mapping.ColorMapper;
import com.store.mystorespringboot.model.Color;
import com.store.mystorespringboot.model.Dresses;
import com.store.mystorespringboot.repository.ColorRepository;
import com.store.mystorespringboot.repository.DressesRepository;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ColorService {
    private static Logger logger = LoggerFactory.getLogger(ColorService.class);
    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private DressesRepository dressesRepository;

    public ColorResponseDto save(ColorRequestDto colorDto) {
        Color color = new Color();
        color.setColorName(colorDto.getColorName());

        Long dressId = colorDto.getDresses().getId();

        Dresses dress = dressesRepository.findById(dressId)
                .orElseThrow(() -> new DressNotExistException("Incorrect ID provided"));

        color.setDresses(dress);

        Color colorSave = colorRepository.save(color);
        logger.info("Saved the color with id: {}", colorSave.getId());
        return ColorMapper.entityToDto(colorSave);
    }
}
