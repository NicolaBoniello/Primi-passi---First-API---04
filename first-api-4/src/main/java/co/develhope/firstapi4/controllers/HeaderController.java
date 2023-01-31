package co.develhope.firstapi4.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/")
    public String getHeaders(@RequestHeader HttpHeaders headers){
        return "Name of the host = " +  headers.getHost().getHostName() + " // " +
                " Number of the port = " + headers.getHost().getPort();

    }


}