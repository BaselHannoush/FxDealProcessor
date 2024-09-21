package com.baselhannoush.Repository;

import com.baselhannoush.Model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deal, Long> {
    boolean existsByDealUniqueId(String dealUniqueId);
}
