public class Test {

	public static void main(String[] args) {

		TestUserDAO dao=new TestUserDAO();

		//④
		dao.select("taro", "123");
		//⑥
		dao.selectAll();
		//⑧
		dao.selectByName("taro");
		//⑩
		dao.selectByPassword("123");
		//⑫
		dao.updateUserNameByUserName("taro", "saburo");
		//⑭
		dao.insert(4, "shiro", "012");
		//⑯
		dao.delete("jiro");

	}

}

