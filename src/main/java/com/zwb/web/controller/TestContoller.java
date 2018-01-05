package com.zwb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestContoller
{
	@RequestMapping("/test")
    public String Test(){

           System.out.println("TestContoller.Test");

           return"Test";
    }
}
