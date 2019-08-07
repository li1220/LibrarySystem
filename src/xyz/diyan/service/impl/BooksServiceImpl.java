package xyz.diyan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.diyan.mapper.BooksMapper;
import xyz.diyan.pojo.Books;
import xyz.diyan.pojo.Borrows;
import xyz.diyan.pojo.Page;
import xyz.diyan.pojo.Reserve;
import xyz.diyan.pojo.Users;
import xyz.diyan.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService
{
	@Autowired
	private BooksMapper booksMapper;

	@Override
	public Page getAllBooks(Books book)
	{
		//开始
		Page page=new Page();
		if(book.getCurrentPage()==0)
		{
			book.setCurrentPage(1);
		}
		int start=(book.getCurrentPage()-1)*5; 
		book.setStart(start);
		//List集合
		List<Books> list = booksMapper.getAllBooks(book);
		page.setList(list);
		//总页数9/5=1	10/5=2;
		int count = booksMapper.getCount(book);
		int counPage=count/5;
		if(count%5!=0)
		{
			counPage++;
		}
		//总页数
		page.setTotalPage(counPage);
		//总记录数
		page.setCount(count);
		return page;
//		return booksMapper.getAllBooks(book);
	}

	@Override
	public Books getBook(Integer id)
	{
		return booksMapper.getBook(id);
	}

	@Override
	public void insertBorrow(Borrows borrow)
	{
		booksMapper.insertBorrow(borrow);
	}

	@Override
	public List<Borrows> getBorrows(Integer uid)
	{
		return booksMapper.getBorrows(uid);
	}

	@Override
	public List<Borrows> getBacks(Integer id)
	{
		// TODO Auto-generated method stub
		return booksMapper.getBacks(id);
	}

	@Override
	public void updateBacks(Integer id)
	{
		// TODO Auto-generated method stub
		booksMapper.updateBacks(id);
	}

	@Override
	public void insertReserve(Reserve reserve)
	{
		// TODO Auto-generated method stub
		booksMapper.insertReserve(reserve);
	}

	@Override
	public List<Reserve> getReserveBook(Integer id)
	{
		// TODO Auto-generated method stub
		return booksMapper.getReserveBook(id);
	}

	@Override
	public Users selectUser(Users user)
	{
		// TODO Auto-generated method stub
		return booksMapper.selectUser(user);
	}

	/*@Override
	public void updateBooks(Integer id)
	{
		// TODO Auto-generated method stub
		booksMapper.updateBooks(id);
	}*/

}
