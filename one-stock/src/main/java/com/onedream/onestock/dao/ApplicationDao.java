package com.onedream.onestock.dao;

import java.util.ArrayList;

import com.onedream.onestock.database.Developer;
import com.onedream.onestock.vo.DeveloperVO;

public interface ApplicationDao {

	public ArrayList<Developer> fetchDeveloper();
	public void updateDeveloper(DeveloperVO developerVO);
	public void saveDeveloper(Developer developer);
	
}









































