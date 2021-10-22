package com.sparta.bt.northwindrest.exceptions;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExceptionHandlerGlobal implements ErrorController {

    @RequestMapping(value="/error",method=RequestMethod.GET)
    public String errorMessage(){
        return"\uD83C\uDD54\uD83C\uDD61\uD83C\uDD61\uD83C\uDD5E\uD83C\uDD61 PLEASE MAKE SURE THE SEARCH TERM IS CORRECT";

    }


}


