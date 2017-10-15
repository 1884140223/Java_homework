package interfaces;
/**
 * 电灯开关接口实现类
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public class Kaiguan implements Kaiguan_interfaces {

	@Override
	public String show() {	//实现接口功能
		String str="已打开电灯，照亮光明……";
		return str;
	}

	@Override
	public String show1() {	//实现接口功能
		String str="已关闭电灯，节约用电……";
		return str;
	}

}
