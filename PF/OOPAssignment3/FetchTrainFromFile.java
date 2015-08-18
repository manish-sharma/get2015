

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;



/**
 * @author Sumitra
 *this class is to fetch data from file storage.
 */
public class FetchTrainFromFile {
	static List<PassangerTrain> passangerList;
	static List<GoodsTrain> goodsList;
	public static void fetch()
	{
		
		passangerList=new ArrayList<PassangerTrain>();
		goodsList=new ArrayList<GoodsTrain>();
		
		try{
		FileInputStream fr=new FileInputStream("C:/Users/Sumitra/workspace/TrainManagement/src/Storage.txt");
		String source = "";
		String destination="";
		String price="";
		String availableSeat="";
		String number="";
		String trainNum="";
		int count=0;
		char c;
		while (((InputStream) fr).available() > 0){
			c=(char) fr.read();
			if(c!=','){
				if(count==0){
					number=number+c;
					}if(count==1){
				source=source+c;}
				if(count==2){
					destination=destination+c;}
				if(count==3){
					trainNum=trainNum+c;
				}
				if(count==4){
					availableSeat=availableSeat+c;	

					}
				if(count==5){
					price=price+c;	

					}
			}
			else{
				count++;
				if(count==6)
				{
					count=0;
					int num=Integer.parseInt(number);
					if(num==1){
						//if the data is for passenger train list.
					PassangerTrain passanger=new PassangerTrain(source,destination,Integer.parseInt(trainNum),Integer.parseInt(availableSeat),Double.parseDouble(price));
					passangerList.add(passanger);
					}
					else 
					{
						//if the data is for goods train.
						GoodsTrain goods=new GoodsTrain(source,destination,Integer.parseInt(trainNum),Integer.parseInt(availableSeat),Double.parseDouble(price));
						goodsList.add(goods);
					}
					number="";
					source="";
					destination="";
					availableSeat="";
					price="";
					trainNum="";
				}
			}
			
		}
		fr.close();
		}catch (IOException e) {

			e.printStackTrace();
		}
		
	}
}
