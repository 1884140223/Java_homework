package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Game_abstract_com {	//父类作为返回类型
	public Game_abstract show(int i){
		Game_abstract game=null;
		if(i==1){
			game=new Game_abstract_zi1();
		}else{
			game=new Game_abstract_zi2();
		}
		return game;
	}
}
