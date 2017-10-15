package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class TV_abstract_color extends TV_abstract {

	@Override
	public String show() {	//重写父类方法
		// TODO Auto-generated method stub
		String str="这是彩色液晶电视机";
		return str;
	}

}
