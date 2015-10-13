/*This class is used to implement the participant object and its details
 * @author Shishir Pareek
 * Date 17th August 2015
 */
public class Participant {
	int pId;//participant id
    String singleChoice;//singlechoice question answer
    String multiChoice;//multichoice question answer
    String text;//feedback question answer
   
        public Participant(int pId,String q1,String q2,String q3){ //constructor for participant
        this.pId=pId;
        this.singleChoice=q1;
        this.multiChoice=q2;
        text=q3;
        }

}
