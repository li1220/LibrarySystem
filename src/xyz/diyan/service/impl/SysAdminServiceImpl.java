package xyz.diyan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.diyan.mapper.SysAdminMapper;
import xyz.diyan.pojo.Books;
import xyz.diyan.pojo.SysAdmin;
import xyz.diyan.pojo.Users;
import xyz.diyan.service.SysAdminService;



@Service
public class SysAdminServiceImpl implements SysAdminService
{

	@Autowired
	private SysAdminMapper sysAdminMapper;
	@Override
	public List<Books> getBooks(Books book)
	{
		// TODO Auto-generated method stub
		return sysAdminMapper.getBooks(book);
	}
	@Override
	public void addBooks(Books book)
	{
		// TODO Auto-generated method stub
		sysAdminMapper.addBooks(book);
	}
	@Override
	public Books getBookById(Integer id)
	{
		// TODO Auto-generated method stub
		return sysAdminMapper.getBookById(id);
	}
	@Override
	public void updateBooks(Books book)
	{
		// TODO Auto-generated method stub
		sysAdminMapper.updateBooks(book);
	}
	@Override
	public void deleteBooks(Integer id)
	{
		// TODO Auto-generated method stub
		sysAdminMapper.deleteBooks(id);
	}
	@Override
	public List<Users> getUsers(Users user)
	{
		// TODO Auto-generated method stub
		return sysAdminMapper.getUsers(user);
	}
	@Override
	public void addUsers(Users user)
	{
		// TODO Auto-generated method stub
		sysAdminMapper.addUsers(user);
	}
	@Override
	public Users getUserById(Integer id)
	{
		// TODO Auto-generated method stub
		return sysAdminMapper.getUserById(id);
	}
	@Override
	public void updateUser(Users user)
	{
		sysAdminMapper.updateUser(user);
	}
	@Override
	public void deleteUser(Integer id)
	{
		// TODO Auto-generated method stub
		sysAdminMapper.deleteUser(id);
	}
	@Override
	public SysAdmin getSysAdmin(Users user)
	{
		// TODO Auto-generated method stub
		return sysAdminMapper.getSysAdmin(user);
	}
	@Override
	public int selectUsers(String code)
	{
		// TODO Auto-generated method stub
		return sysAdminMapper.selectUsers(code);
	}

}
