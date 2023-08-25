package com.store.mystorespringboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.mystorespringboot.dto.DressRequestDto;
import com.store.mystorespringboot.dto.DressResponseDto;
import com.store.mystorespringboot.service.DressesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DressesController.class)
public class DressControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DressesService dressesService;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSaveNewDress() throws Exception {

        DressResponseDto dress = new DressResponseDto();
        dress.setId(null);

        given(dressesService.save(any(DressRequestDto.class))).willReturn(dress);
        mockMvc.perform(post("/dresses" + "/")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dress)))
                .andExpect(status().isCreated());


    }

    @Test
    public void testUpdateDress() throws Exception {
        DressResponseDto dressResponseDto = new DressResponseDto();
        dressResponseDto.setId(1L);

        given(dressesService.update(any(DressRequestDto.class), any(Long.class))).willReturn(dressResponseDto);
        mockMvc.perform(put("/dresses/")
                        .param("id", "1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new DressRequestDto())))
                .andExpect(status().isCreated());

    }


    @Test
    void testDeleteTest() throws Exception {
        DressResponseDto dressResponseDto = new DressResponseDto();

        given(dressesService.deleteById(any())).willReturn(dressResponseDto);

        mockMvc.perform(delete("/dresses" + "/" + dressResponseDto.getId())
                .accept(MediaType.APPLICATION_JSON));


    }
}

