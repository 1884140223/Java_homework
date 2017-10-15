package interfaces;
/**
 * usb接口实现类
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public class Usb implements Usb_interface {

	@Override
	public String show() {	//实现接口功能
		// TODO Auto-generated method stub
		String str="已连接USB接口……";
		return str;
	}

	@Override
	public String show1() {	//实现接口功能
		// TODO Auto-generated method stub
		String str="正在传输数据……";
		return str;
	}

}
