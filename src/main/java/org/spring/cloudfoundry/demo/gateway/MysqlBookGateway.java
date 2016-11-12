package org.spring.cloudfoundry.demo.gateway;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MysqlBookGateway {

    @Autowired
    private BookRepository bookRepository;

    public List<MysqlBook> findAll(){
        return (List<MysqlBook>) bookRepository.findAll();

    }
}
