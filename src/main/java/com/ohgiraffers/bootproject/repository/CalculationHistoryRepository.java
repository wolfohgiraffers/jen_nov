package com.ohgiraffers.bootproject.repository;

import com.ohgiraffers.bootproject.entity.CalculationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalculationHistoryRepository extends JpaRepository<CalculationHistory, Long> {
    
    /* 설명. 최신 순으로 정렬하여 조회 */
    List<CalculationHistory> findAllByOrderByCreatedAtDesc();
}

