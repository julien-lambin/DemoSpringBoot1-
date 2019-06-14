package com.kf.demo.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class testController {


        @GetMapping(value = "/")
        public String index() {
            return "index";
        }
    }
