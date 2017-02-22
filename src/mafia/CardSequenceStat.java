package mafia;

import java.util.List;

public class CardSequenceStat<E> {
	CardSequence<E> seq;
	public CardSequenceStat(CardPool<E> pool) {
		seq=new CardSequence<E>(pool); 
	}
	
	

}
