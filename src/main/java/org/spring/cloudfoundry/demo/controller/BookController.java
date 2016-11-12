package org.spring.cloudfoundry.demo.controller;


import org.spring.cloudfoundry.demo.gateway.MysqlBook;
import org.spring.cloudfoundry.demo.gateway.MysqlBookGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private MysqlBookGateway mysqlBookGateway;

    @RequestMapping("/book")
    public List<MysqlBook> index() {

        return mysqlBookGateway.findAll();
        //return "Greetings from Spring Boot!";
    }
}