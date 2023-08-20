package com.store.mystorespringboot.mapping;

import com.store.mystorespringboot.dto.ColorRequestDto;
import com.store.mystorespringboot.dto.ColorResponseDto;
import com.store.mystorespringboot.dto.DressResponseDto;
import com.store.mystorespringboot.dto.DressesColorRequestDto;
import com.store.mystorespringboot.model.Color;
import com.store.mystorespringboot.model.Dresses;

import java.util.ArrayList;
import java.util.List;

public class ColorMapper {
    public static Color dtoToEntity(ColorRequestDto dto){
        Dresses dress = new Dresses();
      dress.setId(dto.getDresses().getId());
      Color entity = new Color();
      entity.setColorName(dto.getColorName());
      entity.setDresses(dress);
      return entity;
    }

    public static ColorResponseDto entityToDto(Color entity){
        DressResponseDto dress = new DressResponseDto();
        dress.setId(entity.getDresses().getId());
        dress.setDressName(entity.getDresses().getDressName());
        dress.setPrice(entity.getDresses().getPrice());
        dress.setCategory(entity.getDresses().getCategory());
        dress.setQuantity(entity.getDresses().getQuantity());

        ColorResponseDto dto = new ColorResponseDto();
        dto.setId(entity.getId());
        dto.setColorName(entity.getColorName());

        DressesColorRequestDto dressesColor = new DressesColorRequestDto();
        dressesColor.setId(dress.getId());
        dto.setDresses(dressesColor);
        return dto;
    }

    public static List<Color> dtoListToEntityList(List<ColorRequestDto> dtoList){
        List<Color> entityList = new ArrayList<>();
        for(ColorRequestDto dto : dtoList){
            Color entity = dtoToEntity(dto);
            entityList.add(entity);
        }
        return entityList;
    }

    public static List<ColorResponseDto> entityListToDtoList(List<Color> entityList ){
        List<ColorResponseDto> dtoList = new ArrayList<>();
        for(Color entity : entityList){
            ColorResponseDto dto = entityToDto(entity);
            dtoList.add(dto);

        }
        return dtoList;
    }
}
