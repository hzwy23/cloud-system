package com.wisrc.microservice.dao;

import com.wisrc.microservice.entity.SysDictionaryItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SysDictionaryItemDao extends JpaRepository<SysDictionaryItemEntity, Integer> {
}
