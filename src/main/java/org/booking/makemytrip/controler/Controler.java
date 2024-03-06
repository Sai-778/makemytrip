package org.booking.makemytrip.controler;

import org.booking.makemytrip.model.IrctcTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/book")
public class Controler {
@Autowired
RestTemplate restTemplate;


    @PostMapping("/payNow")
    public ResponseEntity booKTicket(@RequestBody IrctcTicket request){


        String url ="http://localhost:1254/irctc/pay";
        ResponseEntity<Object> irctcResponseEntity = restTemplate.postForEntity(url, request, Object.class);
        HttpStatus statusCode = (HttpStatus) irctcResponseEntity.getStatusCode();
        Object body = irctcResponseEntity.getBody();
    //  IrctcTicket body1= (IrctcTicket) body;
        System.out.println(statusCode);
        System.out.println(body);
        if(irctcResponseEntity.getStatusCode().value()==200){
            return new ResponseEntity(body,HttpStatus.OK);
        }
        else
            return new ResponseEntity("Server down please try again",HttpStatus.INTERNAL_SERVER_ERROR);

    }

    }



