package Á¦³×¸¯;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");

		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		for (int i = 0; i < 100; i++) {
			Tv tv = storage.get(i);
			System.out.println(tv);
		}
	}

}
