package Utilclass;
import java.util.Random;







public class RandomNumber {

        public int generateRandomNumber(int size){
            return new Random().nextInt(size-1);
        }
    }










