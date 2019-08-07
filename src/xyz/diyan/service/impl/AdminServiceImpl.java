package xyz.diyan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.diyan.mapper.AdminMapper;
import xyz.diyan.pojo.Admin;
import xyz.diyan.pojo.Borrows;
import xyz.diyan.pojo.Reserve;
import xyz.diyan.pojo.Users;
import xyz.diyan.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService
{

	@Autowired
	private AdminMapper adminMapper;
	@Override
	public List<Borrows> getBorrows(Borrows borrows)
	{
		return adminMapper.getBorrows(borrows);
	}
	@Override
	public void updateBorrows(Integer id)
	{
		// TODO Auto-generated method stub
		adminMapper.updateBorrows(id);
	}
	@Override
	public void notAllowBorrows(Integer id)
	{
		// TODO Auto-generated method stub
		adminMapper.notAllowBorrows(id);
	}
	@Override
	public void inserBackBooks(Integer id)
	{
		// TODO Auto-generated method stub
		adminMapper.inserBackBooks(id);
	}
	@Override
	public List<Borrows> getBackBooks()
	{
		// TODO Auto-generated method stub
		return adminMapper.getBackBooks();
	}
	@Override
	public void allowBackBook(Integer id)
	{
		// TODO Auto-generated method stub
		adminMapper.allowBackBook(id);
	}
	@Override
	public List<Reserve> getAllReserve()
	{
		// TODO Auto-generated method stub
		return adminMapper.getAllReserve();
	}
	@Override
	public void updateReserveBook(Integer id)
	{
		// TODO Auto-generated method stub
		adminMapper.updateReserveBook(id);
	}
	@Override
	public Admin getAdmin(Users user)
	{
		// TODO Auto-generated method stub
		return adminMapper.getAdmin(user);
	}
	@Override
	public void notAllowReserveBook(Integer id)
	{
		// TODO Auto-generated method stub
		adminMapper.notAllowReserveBook(id);
	}
	
	@Override
	public int selectBorrowsId(Integer id)
	{
		// TODO Auto-generated method stub
		return adminMapper.selectBorrowsId(id);
	}
	
	@Override
	public int selectBooksId(Integer id)
	{
		// TODO Auto-generated method stub
		return adminMapper.selectBooksId(id);
	}
	
	@Override
	public void updateBooks(Integer id)
	{
		// TODO Auto-generated method stub
		adminMapper.updateBooks(id);
	}
	@Override
	public void descBooks(Integer id)
	{
		// TODO Auto-generated method stub
		adminMapper.descBooks(id);
	}
	@Override
	public void updateBorrowsTime(Borrows borrow)
	{
		// TODO Auto-generated method stub
		adminMapper.updateBorrowsTime(borrow);
	}
	@Override
	public void updateReserveTime(Reserve reserve)
	{
		// TODO Auto-generated method stub
		adminMapper.updateReserveTime(reserve);
	}
	

	

}
