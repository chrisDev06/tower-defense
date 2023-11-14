package helperMethods;

public class Constants {

    public static class Direction {
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class Enemies {
        public static final int ORC = 0;
        public static final int BAT = 1;
        public static final int KNIGHT = 2;
        public static final int WOLF = 3;

        public static float GetSpeed(int enemyType) {
            switch (enemyType) {
                case ORC:
                    return 0.5f;
                case BAT:
                    return 0.65f;
                case KNIGHT:
                    return 0.8f;
                case WOLF:
                    return 1.0f;
            }
            return 0;
        }

        public static int GetStartHealth(int enemyType) {
            switch (enemyType) {
                case ORC:
                    return 100;
                case BAT:
                    return 60;
                case KNIGHT:
                    return 250;
                case WOLF:
                    return 85;
            }
            return 0;
        }
    }

    public static class Tiles {
        public static final int WATER_TILE = 0;
        public static final int GRASS_TILE = 1;
        public static final int ROAD_TILE = 2;
    }

    public static class Towers {
        public static final int CANNON = 0;
        public static final int ARCHER = 1;
        public static final int WIZARD = 2;

        public static String GetName(int towerType) {
            switch (towerType) {
                case CANNON:
                    return "CANNON";
                case ARCHER:
                    return "ARCHER";
                case WIZARD:
                    return "WIZARD";
            }
            return "";
        }

        public static float GetStartDmg(int towerType) {
            switch (towerType) {
                case CANNON:
                    return 25;
                case ARCHER:
                    return 15;
                case WIZARD:
                    return 5;
            }
            return 0;
        }

        public static float GetDefaultRange(int towerType) {
            switch (towerType) {
                case CANNON:
                    return 150;
                case ARCHER:
                    return 200;
                case WIZARD:
                    return 400;

            }
            return 0;
        }

        public static float GetDefaultCooldown(int towerType) {
            switch (towerType) {
                case CANNON:
                    return 10;
                case ARCHER:
                    return 10;
                case WIZARD:
                    return 30;
            }
            return 0;
        }
    }

}
