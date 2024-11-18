package com.example.Account.controller;

import com.example.Account.bo.AccountResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


//import com.example.Account.bo.CreateOrderRequest;
//import com.example.Account.bo.OrderResponse;


@RestController
@RequestMapping("/api")
public class AccountController {


    private static final String STOCK_API = "http://localhost:8080/api/updateAccount";
    private final RestTemplate restTemplate;

    public AccountController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
   }

    @GetMapping("/accounts")
    public AccountResponse doOrder() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);


        ResponseEntity<AccountResponse> responseAccountEntity = restTemplate.getForEntity(STOCK_API, AccountResponse.class);
        AccountResponse orderStatus = responseAccountEntity.getBody();


        return orderStatus;
    }




}
