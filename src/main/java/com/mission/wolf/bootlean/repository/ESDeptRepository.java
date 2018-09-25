package com.mission.wolf.bootlean.repository;

import com.mission.wolf.bootlean.entities.Dept;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/25 22:49
 */
public interface ESDeptRepository extends ElasticsearchRepository<Dept, Integer> {

  List<Dept> findByNameLike(String name);
}
