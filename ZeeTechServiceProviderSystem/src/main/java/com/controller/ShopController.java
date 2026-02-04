package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Connection;
import com.service.ProviderService;
@RestController
@RequestMapping("/SPS")
public class ShopController {	
	@Autowired
	private ProviderService providerService;
	
	@PutMapping("/updateConnectionType/{connectionNum}/{connectionType}")
    public boolean updateConnectionType(@PathVariable Integer connectionNum,@PathVariable String connectionType) {	
		return providerService.updateConnectionType(connectionNum, connectionType);
        }
    
	@DeleteMapping("/deleteConnection/{connectionNum}")
   	public boolean deleteConnection(@PathVariable Integer connectionNum)	{
		return providerService.deleteConnection(connectionNum);
	}	

}