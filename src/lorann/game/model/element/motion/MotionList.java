package lorann.game.model.element.motion;

import lorann.game.model.Direction;

/**
 * this class serves the purpose of instantiating a new motionless element depending on the char  it's method recieves.
 * @author Game
 *
 */
	public abstract class MotionList {
		public static final Mobile	HERO = new Hero(0,0);
		public static final Mobile MONSTER = new Monster(0,0,Direction.LEFT);
		

		private static Mobile	motionList[]	= { HERO, MONSTER };

		
		/**
		 * for each Motionless of our motionlessList[], it tries to find a match between fileSymbol and the char of each element.
		 * @param fileSymbol is a character that each element has.
		 * @return the instantiated new Element.
		 */
		public static Mobile getFromSymbol(char fileSymbol) {
			for (final Mobile mobile : motionList) {
				if (mobile.getC() == fileSymbol) {
					return mobile;
				}
			}
			return null;
		}
	}