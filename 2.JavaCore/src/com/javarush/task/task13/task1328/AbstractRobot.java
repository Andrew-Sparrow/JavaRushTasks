package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable , Defensable {

        int hitCount = 0 ;

        public BodyPart attack() {

            BodyPart attackedBodyPart = null;

            hitCount = hitCount + 1;

            if (hitCount == 1) {

                attackedBodyPart = BodyPart.ARM;

            } else if (hitCount == 2) {
                attackedBodyPart = BodyPart.HEAD;

            } else if (hitCount == 3) {
                //hitCount = 0;
                attackedBodyPart = BodyPart.LEG;
            }
            else {

                attackedBodyPart = BodyPart.CHEST;
                hitCount = 1;
            }
            return attackedBodyPart;
        }

        public BodyPart defense() {

            BodyPart defencedBodyPart = null;

            // int hitCount = 0;

            //hitCount = hitCount + 2;

            if (hitCount == 1) {
                defencedBodyPart = BodyPart.HEAD;

            } else if (hitCount == 2) {
                defencedBodyPart = BodyPart.LEG;

            } else if (hitCount == 3) {
                //hitCount = 0;
                defencedBodyPart = BodyPart.ARM;
            }
            else if (hitCount >= 4) {
                //hitCount = 1;
                defencedBodyPart = BodyPart.CHEST;
            }
            return defencedBodyPart;

        }
}
