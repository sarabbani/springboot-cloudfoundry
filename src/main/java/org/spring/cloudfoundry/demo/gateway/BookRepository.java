package org.spring.cloudfoundry.demo.gateway;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<MysqlBook, Long> {
}
