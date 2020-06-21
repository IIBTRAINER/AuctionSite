package com.auction.controller;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.auction.model.Auction;
import com.auction.repository.AuctionRepo;


/**
 * This Controller class contains all the functions for the RestFul API
 * 
 * @author Rishi
 *
 */
@RestController
public class AuctionController {
	
	 @Autowired
	AuctionRepo auctionRepo;
	 
	 
	private static final Logger LOGGER = LoggerFactory.getLogger(AuctionController.class);

	/**
	 * This is used to get all items in the SuperMarket Store
	 * 
	 * @return
	 */
	@GetMapping(path= "listitems", produces= "application/json")
	public List<Auction> getItems() {
		
		
		LOGGER.info("Successfully Returned :" + auctionRepo.findAll() );
		return auctionRepo.findAll();
	}

	/**
	 * This method returns the items in auction database by ID
	 * 
	 * @param id
	 * @return
	 * @throws Exception 
	 */

//	@GetMapping("item/{id}")
	
	@GetMapping(path = "item/{id}", produces= "application/json")

//	public Resource<Auction> getItem(@PathVariable("id") int id) throws Exception  {
	public Auction getItem(@PathVariable("id") int id)  {	
		 
		return auctionRepo.findById(id)
//				.orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
				
				.orElseThrow(() -> new EntityNotFoundException("The entered entity does not exist " + String.valueOf(id)));
	
	
	/*	
		Auction auc = auctionRepo.getOne(new Integer(id));
			
			if(auc==null)
				throw new ItemNotFoundException("id-"+ id);
			
			
			//"all-users", SERVER_PATH + "/users"
			//retrieveAllUsers
			Resource<Auction> resource = new Resource<Auction>(auc);
			
		
		  ControllerLinkBuilder linkTo = linkTo(((AuctionController)
		  methodOn(this.getClass())).getItems());
		  
		  resource.add(linkTo.withRel("all-users"));
		  
		  //HATEOAS
		 			
			return resource;*/
		}
	




	

	/**
	 * This method is used to add items in the auction site
	 * 
	 * @param Auction
	 * @return
	 */

	@PostMapping(path="items", produces= "application/json")
//	public Auction addItem(@RequestBody Auction auction) {
//		return auctionRepo.save(auction);
		
		public ResponseEntity<Object> addItem(@Valid @RequestBody Auction auction) {
			Auction savedauction = auctionRepo.save(auction);
			// CREATED
			// /user/{id}     savedUser.getId()
			
			URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedauction.getId()).toUri();
			
			return ResponseEntity.created(location).build();
	}
	/**
	 * This method is used to update items in the auction site.
	 * 
	 * @param auction
	 * @return
	 */

	@PutMapping(path="item", produces= "application/json")
	public Auction saveOrUpdateItem(@RequestBody Auction auction) {
		return auctionRepo.save(auction);
	}

	/**
	 * This Method updates the item in the auction site by ID
	 * 
	 * @param id
	 * @param auctionDetails
	 * @return
	 */

	/*
	 * @PutMapping("item/{id}")
	 * 
	 * public Optional<Auction> updateItemById(@PathVariable int id, @RequestBody
	 * Auction auctionDetails) {Optional<Auction> auction = this.getItem(id);
	 * 
	 * 
	 * auction..setCurrbid(auctionDetails.getCurrbid());
	 * auction.setResprice(auctionDetails.getResprice());
	 * auction.setBidname(auctionDetails.getBidname());
	 * 
	 * 
	 * Optinal<Auction> updatedItem = auctionRepo.save(auction); return updatedItem;
	 * }
	 */		 

	/**
	 * This method is used to delete all items in the auction site.
	 * 
	 * @param delete
	 */
	@DeleteMapping("items")
	public void deleteAllItems(Auction auction) {
		auctionRepo.deleteAll();
	}
	
	/**
	 * This method deletes an item from the auction site.
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("items/{id}")
	public String deleteItem(@PathVariable int id) {
		auctionRepo.deleteById(new Integer(id));//jpa-- .delete(id);
		return "Deleted";
	}
	 
	/**
	 * This method patch updates the Quantity and Date of supermarket Items.
	 * 
	 * @param partialUpdate
	 * @param id
	 * @return
	 */
/*
 * @PatchMapping("item/{id}") public Auction patchUpdateItemById(@PathVariable
 * int id, @RequestBody Auction auctionDetails) { Optional<Auction> auction =
 * this.getItem(id); auction.setCurrbid(auctionDetails.getCurrbid());
 * auction.setResprice(auctionDetails.getResprice());
 * auction.setBidname(auctionDetails.getBidname());
 * 
 * Auction updatedItem = auctionRepo.save(auction);
 * 
 * return updatedItem; }
 */ 
 }

