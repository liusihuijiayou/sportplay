package com.lsh.sportplay.controller;

import com.lsh.sportplay.service.TProviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvideController {
    //把service注入
    @Autowired
    private TProviceService tProviceService;
}
