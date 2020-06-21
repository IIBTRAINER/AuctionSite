package com.auction.test.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auction.test.dao.AuctionDAO;
import com.auction.test.model.Auction;


/**
 * This Controller class contains all the functions for the RestFul API
 * 
 * @author Rishi
 *
 */
@RestController
public class AuctionController {

	@Autowired
	AuctionDAO auctionDao;

	/**
	 * This is used to get all items in the SuperMarket Store
	 * 
	 * @return
	 */
	@GetMapping("listitems")
	public List<Auction> getItems() {
		return auctionDao.findAll();
	}

	/**
	 * This method returns the items in auction database by ID
	 * 
	 * @param id
	 * @return
	 */

//	@GetMapping("item/{id}")
	
	@GetMapping("item/{id}")
	public Auction getItem(@PathVariable("id") int id) {
		return auctionDao.findOne(id);
	}

	/**
	 * This method is used to add items in the auction site
	 * 
	 * @param Auction
	 * @return
	 */

	@PostMapping("items")
	public Auction addItem(@RequestBody Auction auction) {
		return auctionDao.save(auction);
	}
	/**
	 * This method is used to update items in the auction site.
	 * 
	 * @param auction
	 * @return
	 */

	@PutMapping("item")
	public Auction saveOrUpdateItem(@RequestBody Auction auction) {
		return auctionDao.save(auction);
	}

	/**
	 * This Method updates the item in the auction site by ID
	 * 
	 * @param id
	 * @param auctionDetails
	 * @return
	 */

	@PutMapping("item/{id}")
	public Auction updateItemById(@PathVariable int id, @Valid @RequestBody Auction auctionDetails) {
		Auction auction = auctionDao.findOne(id);

		auction.setCurrbid(auctionDetails.getCurrbid());
		auction.setResprice(auctionDetails.getResprice());
		auction.setBidname(auctionDetails.getBidname());
		
		Auction updatedItem = auctionDao.save(auction);
		return updatedItem;
	}

	/**
	 * This method is used to delete all items in the auction site.
	 * 
	 * @param delete
	 */
	@DeleteMapping("items")
	public void deleteAllItems(Auction auction) {
		auctionDao.deleteAll();
	}
	
	/**
	 * This method deletes an item from the auction site.
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("items/{id}")
	public String deleteItem(@PathVariable int id) {
		auctionDao.delete(id);
		return "Deleted";
	}
	 
	/**
	 * This method patch updates the Quantity and Date of supermarket Items.
	 * 
	 * @param partialUpdate
	 * @param id
	 * @return
	 */
	@PatchMapping("item/{id}")
	public Auction patchUpdateItemById(@PathVariable int id, @Valid @RequestBody Auction auctionDetails) {
		Auction auction = auctionDao.findOne(id);
		auction.setCurrbid(auctionDetails.getCurrbid());
		auction.setResprice(auctionDetails.getResprice());
		auction.setBidname(auctionDetails.getBidname());
		
		Auction updatedItem = auctionDao.save(auction);

		return updatedItem;
	}
}
