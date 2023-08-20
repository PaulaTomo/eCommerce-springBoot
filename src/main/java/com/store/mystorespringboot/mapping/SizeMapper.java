package com.store.mystorespringboot.mapping;

import com.store.mystorespringboot.dto.*;
import com.store.mystorespringboot.model.Dresses;
import com.store.mystorespringboot.model.Size;

import java.util.ArrayList;
import java.util.List;

public class SizeMapper {

    public static Size dtoToEntity(SizeRequestDto dto){
        Dresses dress = new Dresses();
        dress.setId(dto.getDresses().getId());
        Size entity = new Size();
        entity.setSizeName(dto.getSizeName());
        entity.setDresses(dress);
        return entity;
    }

    public static SizeResponseDto entityToDto(Size entity){
        DressResponseDto dressResponseDto = new DressResponseDto();
        dressResponseDto.setId(entity.getDresses().getId());
        dressResponseDto.setDressName(entity.getDresses().getDressName());
        dressResponseDto.setPrice(entity.getDresses().getPrice());
        dressResponseDto.setCategory(entity.getDresses().getCategory());
        dressResponseDto.setQuantity(entity.getDresses().getQuantity());

        SizeResponseDto dto = new SizeResponseDto();
        dto.setId(entity.getSizeId());
        dto.setSizeName(entity.getSizeName());

        DressSizeRequestDto dressSize = new DressSizeRequestDto();
        dressSize.setId(dressSize.getId());
        dto.setDresses(dressSize);
        return dto;
    }

    public static List<Size> dtoListToEntityList(List<SizeRequestDto> dtoList){
        List<Size> entityList = new ArrayList<>();
        for(SizeRequestDto dto : dtoList){
            Size entity = dtoToEntity(dto);
            entityList.add(entity);
        }
        return entityList;
    }

    public static List<SizeResponseDto> entityListToDtoList(List<Size> entityList ){
        List<SizeResponseDto> dtoList = new ArrayList<>();
        for(Size entity : entityList){
            SizeResponseDto dto = entityToDto(entity);
            dtoList.add(dto);

        }
        return dtoList;
    }
}
