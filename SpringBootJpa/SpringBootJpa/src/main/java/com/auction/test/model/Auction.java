package com.auction.test.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Date :Aug 18,2019
 * @author Rishi
 * @version 1.0
 *
 */
@Entity
@Table(name = "Auction")  
public class Auction {
	
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id ;

	@Column(name ="currbid")
	private String currbid;
	
	@Column(name ="resprice")
	private String resprice;
	
	@Column(name ="bidname")
	private String bidname;



	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getCurrbid() {
		return currbid;
	}

	public void setCurrbid(String currbid) {
		this.currbid = currbid;
	}

	public String getResprice() {
		return resprice;
	}

	public void setResprice(String resprice) {
		this.resprice = resprice;
	}

	public String getBidname() {
		return bidname;
	}

	public void setBidname(String bidname) {
		this.bidname = bidname;
	}

	@Override
	public String toString() {
		return "Auction [id=" + id + ", currbid=" + currbid + ", resprice=" + resprice + ", bidname=" + bidname + "]";
	}


	
}
