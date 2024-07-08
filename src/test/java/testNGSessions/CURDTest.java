package testNGSessions;

import org.testng.annotations.Test;

public class CURDTest {

	//CURD operations - Edit, update, retrieve, delete
//AAA - every test has its own, user or fresh data
	public int addUser() {
		return 123;
	}
	public String getUser(int uid) {
		return "user info for "+uid;
	}
	public String updateUser(int uid) {
		return "updated user info for "+uid;
	}
	public void deleteUser(int uid) {
		System.out.println("user is delete");
	}
	@Test
	public void addUserTest() {
		int uID=addUser();
	}
	
	@Test
	public void getUserTest() {
		int uID=addUser();
		String userInfo=getUser(uID);
		System.out.println(userInfo);
	}
	@Test
	public void updateUserTest() {
		//int uID=6873;//not recommended, always create fresh user
		int uID=addUser();
		updateUser(uID);
		getUser(uID);
		
	}
	@Test
	public void deleteUserTest() {
		//int uID=6873;//not recommended, always create fresh user
		int uID=addUser();
		deleteUser(uID);
		getUser(uID);
		
	}
}
