package ¹®Á¦;

public class Dao {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDB());
		dbWork(new Mysql());
	}

}
