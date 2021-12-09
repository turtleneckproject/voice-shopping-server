package com.example.demo.repository;

import com.example.demo.dto.CardVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardVO, String> {

    List<CardVO> findByUserid(String userid);
    //CardVO findByUseridAndCard_company(String userid, String card_company);
    CardVO findCardVOByUseridAndCardcompany(String userid, String cardcompany);
    boolean existsByUseridAndCardcompany(String userid, String cardcompany);
    boolean existsByUserid(String userid);
}
