package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Game_abstract_zi2 extends Game_abstract {
	public Game_abstract_zi2(){		//重写父类方法
		super.setName("乒乓球");
		super.setPerson("2人");
	}
	@Override
	public String show() {
		// TODO Auto-generated method stub
		String str=super.getName()+"是由"+super.getPerson()+"玩的游戏";
		return str;
	}

}
