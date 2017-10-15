package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Pet_extends_comm {
	public String show(Pet_extends_fu pet){	//使用父类类型作为形参
		String str=pet.show();
		return str;
	}
}
