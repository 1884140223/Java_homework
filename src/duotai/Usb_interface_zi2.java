package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Usb_interface_zi2 implements Usb_interface {

	@Override
	public String show() {	//重写父类方法
		// TODO Auto-generated method stub
		String str="USB开始传输数据";
		return str;
	}

}
