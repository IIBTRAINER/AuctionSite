package com.auction.test.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.auction.test.model.Auction;


/**
 * Here JpaRepository Interface manages all the Database connection and 
 * provides CRUD functions for Controller Class;
 * @author Rishi
 *
 */
@Controller
public interface AuctionDAO extends JpaRepository<Auction, Integer> {
	
}
