package com.dev.bridstest.controller;

import com.dev.bridstest.dto.ReqRes;
import com.dev.bridstest.service.BridsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/brids-test")
public class BridsController {

    private final BridsService bridsService;

    @PostMapping("/{path}")
    public ReqRes test(
            @PathVariable String path,
            @RequestBody ReqRes reqRes
    ){
        reqRes.setPath(path);
        return bridsService.test(reqRes);
    }
}
