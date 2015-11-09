package assignmentOOP_3;

public class GoodsTrain extends Train
{
        int availableWeight;

		public GoodsTrain(String trainID, String trainName, String trainFrom,
				String trainTo, int trainDuration, int trainFare,
				int availableWeight) {
			super(trainID, trainName, trainFrom, trainTo, trainDuration,
					trainFare);
			this.availableWeight = availableWeight;
		}

		/**
		 * @return the availableWeight
		 */
		public int getAvailableWeight() {
			return availableWeight;
		}

		/**
		 * @param availableWeight the availableWeight to set
		 */
		public void setAvailableWeight(int availableWeight) {
			this.availableWeight = availableWeight;
		}
        
}
