package Assignment6;
/*
 * When we will run Main1 and Main2 class at same time then exception will occure
 */
public class Main1 {

	public static void main(String[] args) {

		JDBCHelper vehicleJDBCHelper = new JDBCHelper();
		vehicleJDBCHelper.deadlock1();
	}

}