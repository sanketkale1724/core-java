package jungle_book;

public class game {
	public static void main(String[] args)
	{
		human hu=new human();
		hu.name="Mogali";
		//hu.hight=5.9f;
		hu.drink();
		hu.eat();
		hu.run();
		hu.think();
		hu.walk();
		
		
		bear br=new bear();
		br.name="Baloo";
		br.eat();
		br.run();
		br.hunnydrink();
		br.sleep();
		
		snake sn=new snake();
		sn.name= "Ka";
		sn.eat();
		sn.sleep();
		sn.bite();
		
		tiger tr=new tiger();
		tr.name="Shearkhan";
		tr.eat();
		tr.drink();
		tr.hunt();
		tr.run();
		tr.walk();
		
		wolf wl=new wolf();
		wl.name="Akhila";
		wl.walk();
		wl.eat();
		wl.run();
		wl.sleep();
		
		elephant el=new elephant();
		el.name="hathi";		
		el.drink();
		el.eat();
		el.run();
		el.fight();
		el.sleep();
	}

}
