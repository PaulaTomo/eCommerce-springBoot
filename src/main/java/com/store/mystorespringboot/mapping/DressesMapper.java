package com.store.mystorespringboot.mapping;

import com.store.mystorespringboot.dto.DressRequestDto;
import com.store.mystorespringboot.dto.DressResponseDto;
import com.store.mystorespringboot.model.Dresses;

import java.util.ArrayList;
import java.util.List;

public class DressesMapper {
    public static Dresses dtoToEntity(DressRequestDto dto){
        Dresses entity = new Dresses();
        entity.setDressName(dto.getDressName());
        entity.setPrice(dto.getPrice());
        entity.setCategory(dto.getCategory());
        entity.setQuantity(dto.getQuantity());
        entity.setImagePath(dto.getImagePath());

        return entity;
    }
    public static DressResponseDto entityToDto(Dresses entity){
        DressResponseDto dto = new DressResponseDto();
        dto.setId(entity.getId());
        dto.setDressName(entity.getDressName());
        dto.setPrice(entity.getPrice());
        dto.setCategory(entity.getCategory());
        dto.setQuantity(entity.getQuantity());
        dto.setImagePath(entity.getImagePath());
        return dto;
    }

    public static List<Dresses> dtoListToEntityList(List<DressRequestDto> dtoList){
        List<Dresses> entityList = new ArrayList<>();
        for(DressRequestDto dto : dtoList){
            Dresses entity = dtoToEntity(dto);
            entityList.add(entity);

        }
        return entityList;
    }

    public static List<DressResponseDto> entityListToDtoList(List<Dresses> entityList){
        List<DressResponseDto> dtoList = new ArrayList<>();
        for(Dresses entity : entityList){
            DressResponseDto dto = entityToDto(entity);
            dtoList.add(dto);
        }
        return dtoList;
    }
}
