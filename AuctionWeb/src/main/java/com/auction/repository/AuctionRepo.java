package com.auction.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.auction.model.Auction;


/**
 * Here JpaRepository Interface manages all the Database connection and 
 * provides CRUD functions for Controller Class;
 * @author Rishi
 *
 */
@Repository
public interface AuctionRepo extends JpaRepository<Auction, Integer> {
	
	

	
	
}
