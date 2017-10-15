package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Music_abstract_zi2 extends Music_abstract {

	@Override
	public String show() {	//重写父类方法
		// TODO Auto-generated method stub
		String str="已拔出耳机，正在使用外音播放音乐";
		return str;
	}

}
