package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.model.Connection;

@Component
public class ProviderService {

	ArrayList<Connection> connectionList = new ArrayList<Connection>();
	
	public ArrayList<Connection> getConnectionList() {
		return connectionList;
	}

	public void setConnectionList(ArrayList<Connection> connectionList) {
		this.connectionList = connectionList;
	}

	public ProviderService(){
		Connection connectionObj1=new Connection(1,"peter","unlimited","prepaid");
		Connection connectionObj2=new Connection(2,"John","plan500","postpaid");
		connectionList.add(connectionObj1);
		connectionList.add(connectionObj2);
		
	}
	
	public boolean updateConnectionType(int connectionNum,String connectionType)
	{	
		for(Connection conn: connectionList) {
			if(conn.getConnectionNum()==connectionNum) {
				conn.setConnectionType(connectionType);
				return true; //successfully updated YAYYYYYYY
			}
		}
		
		return false; //aww hell nah
	}
	
	public boolean deleteConnection(int connectionNum)
	{
		return connectionList.removeIf(conn -> conn.getConnectionNum() == connectionNum); //remove only if connection numbers match
	}
	
}
