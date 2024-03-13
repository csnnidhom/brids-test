package com.dev.bridstest.service;

import com.dev.bridstest.dto.ReqRes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@Service
public class BridsService {

    public ReqRes test(ReqRes reqRes){
        if (!Objects.equals(reqRes.getPath(),"yDEEW3KjymTG9yjj9830")){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Path variabel salah");
        }

        return ReqRes.builder()
                .name(reqRes.getName())
                .address(reqRes.getAddress())
                .nid(reqRes.getNid())
                .officeId(reqRes.getOfficeId())
                .build();
    }
}
