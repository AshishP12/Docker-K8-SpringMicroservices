package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Hotel;

import java.util.*;

@Service
public class HotelService {
@Autowired
	private List<Hotel> hotelList;

public List<Hotel> getHotelList(){
	
	return hotelList;
}
	
}
