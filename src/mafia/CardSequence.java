package mafia;

import java.util.ArrayList;
import java.util.List;

public class CardSequence<E> {
	RandomNumberGenerator gen;
	CardPool<E> pool;
	CardPool<E> shuffle;
	public CardSequence(CardPool<E> pool){
		gen=new RandomNumberGenerator();
		this.pool=pool;
	}
	
	public List<E> roll(){
		ArrayList<E> result=new ArrayList<E>();
		shuffle=new CardPool<E>();
		while(pool.count()>0){
			int seq=gen.RandomInt(pool.count())-1;
			E ele=pool.getCard(seq);
			shuffle.addCard(ele);
			pool.delCard(seq);
			result.add(ele);
		}
		pool=shuffle;
		return result;
	}
	
	public String output(){
		String result="";
		shuffle=new CardPool<E>();
		while(pool.count()>0){
			int seq=gen.RandomInt(pool.count())-1;
			E ele=pool.getCard(seq);
			shuffle.addCard(ele);
			pool.delCard(seq);
			result+=ele.toString()+",";
		}
		pool=shuffle;
		
		return result;
	}

}
