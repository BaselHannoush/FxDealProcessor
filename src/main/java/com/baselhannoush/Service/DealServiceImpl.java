package com.baselhannoush.Service;



import com.baselhannoush.Model.Deal;
import com.baselhannoush.Repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealServiceImpl implements DealService {

    @Autowired
    private DealRepository dealRepository;

    @Override
    public void saveDeal(Deal deal) {
        if (dealRepository.existsByDealUniqueId(deal.getDealUniqueId())) {
            throw new IllegalArgumentException("Deal already exists");
        }
        dealRepository.save(deal);
    }
}
