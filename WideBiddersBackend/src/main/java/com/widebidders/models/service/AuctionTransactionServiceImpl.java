package com.widebidders.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widebidders.models.db.AuctionTransactionDaoImpl;
import com.widebidders.models.entities.AuctionTransaction;

@Service
public class AuctionTransactionServiceImpl implements AuctionTransactionService{

	@Autowired
	private AuctionTransactionDaoImpl auctionTransactionDaoImpl;

	@Override
	public List getAllBids() {
		return auctionTransactionDaoImpl.getAllBids();
	}

	@Override
	public List getBidById(int id) {
		return auctionTransactionDaoImpl.getBidById(id);
	}

	@Override
	public void addBid(AuctionTransaction auction) {
		auctionTransactionDaoImpl.addBid(auction);
	}

	@Override
	public void deleteAuction(int id) {
		auctionTransactionDaoImpl.deleteAuction(id);		
	}
}
