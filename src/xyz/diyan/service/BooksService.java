package xyz.diyan.service;

import java.util.List;

import xyz.diyan.pojo.Books;
import xyz.diyan.pojo.Borrows;
import xyz.diyan.pojo.Page;
import xyz.diyan.pojo.Reserve;
import xyz.diyan.pojo.Users;

public interface BooksService
{
	//查询所有书籍
//List<Books> getAllBooks(Books book);
	Page getAllBooks(Books book);
	//借阅书籍
	Books getBook(Integer id);
	//确认借阅书籍
	void insertBorrow(Borrows borrow);
	//查询借阅的书籍
	List<Borrows> getBorrows(Integer uid);
	//查询需要归还的书籍
	List<Borrows> getBacks(Integer id);
	//申请归还
	void updateBacks(Integer id);
	//预定信息
	void insertReserve(Reserve reserve);
	//查询预定书籍信息
	List<Reserve> getReserveBook(Integer id);
	//查询是否存在用户
	Users selectUser(Users user);
	//用户借书减少书籍数量
	/*void updateBooks(Integer id);*/
}
