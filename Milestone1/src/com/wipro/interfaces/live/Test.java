package com.wipro.interfaces.live;

import com.wipro.interfaces.music.Playable;
import com.wipro.interfaces.music.string.*;
import com.wipro.interfaces.music.wind.*;

public class Test {
	public static void main(String args[])
	{
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable p1=new Veena();
		Playable p2=new Saxophone();
		p1.play();
		p2.play();
	}

}
