package examQuestionExample;

abstract class Puma implements HasTail {
/*has to be public, all methods declared in an interface are public
 * can change the visibility
		protected int getTailLength(){
			return 4;
		}*/
		public int getTailLength(){
			return 4;
		}
}
