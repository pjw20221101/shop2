package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.Test;

public interface TestRepository extends JpaRepository<Test,Long>{

}
