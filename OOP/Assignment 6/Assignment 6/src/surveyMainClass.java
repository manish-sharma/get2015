import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class surveyMainClass {

	 //ArrayList that maintain the Participant objects
   public static ArrayList<Participant> participant = new ArrayList<Participant>();
  
  
   //method calculate the percentage rating 
   public double[]  getOverAllRating(){   
       double[] result=new double[5];
       double a1=0,a2=0,a3=0,a5=0,a4=0;
       double counter=0;
      /*Iterator object to access the list elements*/
       Iterator<Participant> iterator = ((ArrayList<Participant>) participant)
               .iterator();
       while (iterator.hasNext()) {//loop to iterate the participant choices
           Participant paticipantObject = iterator.next();
           counter++;
           /*Condition to check the option in single select question*/
           if (paticipantObject.singleChoice.equalsIgnoreCase("1")){
              
               a1++;
           }
           /*Condition to check the option in single select question*/
           else if(paticipantObject.singleChoice.equalsIgnoreCase("2")){
               a2++;
           }
           /*Condition to check the option in single select question*/
           else if(paticipantObject.singleChoice.equalsIgnoreCase("3")){
               a3++;
           }
           /*Condition to check the option in single select question*/
           else if(paticipantObject.singleChoice.equalsIgnoreCase("4")){
               a4++;
           }
           /*Condition to check the option in single select question*/
           else if(paticipantObject.singleChoice.equalsIgnoreCase("5")){
               a5++;
           }
       }
       /*Calculation of percentage opinion on the rating*/
       result[0]=(a1/counter)*100;
       result[1]=(a2/counter)*100;
       result[2]=(a3/counter)*100;
       result[3]=(a4/counter)*100;
       result[4]=(a5/counter)*100;
       return result;
   }

	public static void main(String[] args) throws IOException {
	      
		List<String> Questions=new ArrayList<String>();//array list to store questions
		String questions[];//array to stor the questions
		int index1=0;
		//String token[]=new String[5];
		Questions=surveyQues.readQuestion();
		questions=new String[Questions.size()];
		for(int index=0;index<Questions.size();index++)
		{
			questions[index]=Questions.get(index);
		}
        singleSelectQuestion sSelect=new singleSelectQuestion("1",questions[0]);
        multiSelectQuestions mSelect=new multiSelectQuestions("2",questions[1]);
        Text text=new Text("3",questions[2]);
       
       
         int p=0;
         String flag="0";
         System.out.println("****Servey System****\n");
            while (flag.equals("0")) {
               
                int pId = (++p);
                Scanner sc=new Scanner(System.in);
                System.out.println("**Answer the Following Questions** \n");
                System.out.println(sSelect.qBody);
               
                String q1=sc.nextLine();
                do
                {
                	//condition to check if the input for single select question is between 1 to 5
                if(!(q1.equals("1")||q1.equals("2")||q1.equals("3")||q1.equals("4")||q1.equals("5"))){
                    System.out.println("Please enter number 1/2/3/4/5 only");
                   
                    q1=sc.nextLine();}
                }while(!(q1.equals("1")||q1.equals("2")||q1.equals("3")||q1.equals("4")||q1.equals("5")));
                System.out.println(mSelect.qBody);
                String q2=sc.nextLine();//Input of multiselect question
                
                System.out.println(text.qBody);
                String q3=sc.nextLine();//Input of feedback question
               
                Participant part=new Participant(pId,q1,q2,q3);
                participant.add(part);
               
                System.out.println("\nIf you want to continue Application then Press 0 \nfor exit from Application input any othe character");
                /*Condition to check if user wants to continue or not*/
                if (!(sc.next().equals("0"))) {
                    System.out.println("\nAre You Really Want to Exit From Application ? y/n");
                    /*double confirmation from the user*/
                    if (sc.next().equalsIgnoreCase("n")) {
                        flag = "0";
                    } else {
                        flag = "1";
                    }
                }
            }
            /*calculating the percentage of the rating*/
            System.out.println(" \nPERCENTAGE COMPARISION OF RATING ");
            double []result=new surveyMainClass().getOverAllRating();
            for(int i=0;i<result.length;i++){
                System.out.println((i+1)+" - "+result[i]+"%");
            }
            /*Genearting the report of participant and his respective answers*/
            System.out.println("\n REPORT OF PARTICIPANT ");
            int i=1;
            Iterator<Participant> iterator = ((ArrayList<Participant>) participant)
                    .iterator();
            while (iterator.hasNext()) {//printing the report of respective participant and his respective answers
                Participant pobject = iterator.next();
                System.out.println("\n\nParticipant "+i+"\n");
                System.out.println("Q."+sSelect.qID+"  "+sSelect.qBody);
                System.out.println("Answer =" +pobject.singleChoice);
               
               
                System.out.println(mSelect.qID+"  "+mSelect.qBody);
                System.out.println("Answer =" +pobject.multiChoice);
               
                System.out.println("Q."+text.qID+"  "+text.qBody);
                System.out.println("Answer =" +pobject.text);
                i++;
        }
       
       
    }
}

