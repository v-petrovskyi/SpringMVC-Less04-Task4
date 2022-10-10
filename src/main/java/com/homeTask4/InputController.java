package com.homeTask4;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InputController{

    @ResponseBody
    @GetMapping(value = "/uuid", produces = MediaType.APPLICATION_JSON_VALUE)
    public UUIDclass uuid(){

        return new UUIDclass();
    }

    @ResponseBody
    @GetMapping(value = "/exchange", produces = MediaType.APPLICATION_JSON_VALUE)
    public Exchange exchange(){
        Exchange exchange = new Exchange();
        exchange.setRandomCurrency();
        exchange.setRandomRate();
        return exchange;
    }
}
