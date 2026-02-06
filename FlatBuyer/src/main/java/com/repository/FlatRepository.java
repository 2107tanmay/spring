package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bean.Flat;

public interface FlatRepository extends JpaRepository<Flat, String> {

}
