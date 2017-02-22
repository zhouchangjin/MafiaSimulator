package mafia;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumberGenerator rn=new RandomNumberGenerator();
		CardPool<String> card=new CardPool<String>();
		card.addCard("werewolf",4);
		card.addCard("seer",1);
		card.addCard("hunter",1);
		card.addCard("wizard",1);
		card.addCard("guard",1);
		card.addCard("civilian",4);
		//card.addCard("thief",1);
		CardSequence<String> seq=new CardSequence<>(card);
		//System.out.println(seq.output());
		//System.out.println(Test(seq,100000000));
	
	}
	
	
	public static int Test(CardSequence<String> seq,int num){
		int countTotal=0;
		for(int ci=0;ci<num;ci++){
			List<String> list=seq.roll();
			for(int i=0;i<list.size();i++){
				String e=list.get(i);
				if(e.equals("thief")){
					if(i<12){
						String a1=list.get(i+1);
						String a2=list.get(i+2);
						if(bury(a1,a2)){
							countTotal++;
							System.out.println(e.toString()+"_"+list.get(i+1).toString()+"_"+list.get(i+2));
						}
						
						
					}else if(i==12){
						
						String a1=list.get(i-1);
						String a2=list.get(i+1);
						if(bury(a1,a2)){
							//countTotal++;
							System.out.println(list.get(i-1).toString()+"_"+list.get(i).toString()+"_"+list.get(i+1));
						}
						

					}else{

						String a1=list.get(i-2);
						String a2=list.get(i-1);
						if(bury(a1,a2)){
							//countTotal++;
							System.out.println(list.get(i-2).toString()+"_"+list.get(i-1).toString()+"_"+list.get(i));
						}
						
					}
				}
			}

		}
		return countTotal;
		
	}


	private static boolean bury(String a1, String a2) {
		// TODO Auto-generated method stub
		if(a1.equals("seer") && a2.equals("werewolf")){
			return true;
		}else if(a1.equals("werewolf") && a2.equals("seer")){
			return true;
		}
		return false;
	}

}
