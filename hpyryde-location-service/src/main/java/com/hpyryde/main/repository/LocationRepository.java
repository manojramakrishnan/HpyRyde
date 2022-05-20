package com.hpyryde.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.hpyryde.main.entity.Location;

@Repository
public interface LocationRepository extends PagingAndSortingRepository<Location,Long>{


}
