package com.cof.server.controller;

import com.cof.server.service.CatelogService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class CatelogController {
    @Resource
    private CatelogService catelogService;
}
