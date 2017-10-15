package abstracts;
/**
 * usb类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Usb_zi extends Usb_fu {
	private String chuan;		//USB接口的传输速率
	public Usb_zi(){		//子类构造方法
		super.setType("type-c接口");
		super.setSize("迷你版");
		this.chuan="15M/S";
	}
	public String show(){		//父类普通方法的重写
		String str="usb的类型："+super.getType()+"\nusb的尺寸大小："+super.getSize()+"\nusb传输速率："+chuan;
		return str;
	}
}
