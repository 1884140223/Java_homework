package interfaces;
/**
 * 遥控器接口实现类
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public class Yaokongqi implements Yaokongqi_interface {

	@Override
	public String show() {	//实现接口功能
		String str="正在打开……";
		return str;
	}

	@Override
	public String show1() {	//实现接口功能
		String str="正在关闭……";
		return str;
	}

	@Override
	public String show2() {	//实现接口功能
		String str="正在按键……";
		return str;
	}

}
