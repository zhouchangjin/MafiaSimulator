package mafia;

import java.util.Date;
import java.util.Random;

public class RandomNumberGenerator {
	
	RandomNumberGenerator(){
		r=new Random(new Date().getTime());
	}
	Random r;
	public int RandomInt(int mod){
		int result=Math.abs(r.nextInt())%mod;
		return result+1;
	}

}
