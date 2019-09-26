package pack.controller;

import pack.model.DataDaoImpl;

public class SelectServiceImpl implements SelectService {
	private DataDaoImpl daoImpl;
	
	public SelectServiceImpl(DataDaoImpl daoImpl) {
		this.daoImpl = daoImpl;
	}
	
	public void selectProcess() {
		System.out.println("Working Business Logic...");
		daoImpl.selectData();
	}
}