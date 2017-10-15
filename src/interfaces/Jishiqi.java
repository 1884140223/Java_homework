package interfaces;
/**
 * 计时器接口实现类
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public class Jishiqi implements Jishiqi_interface {

	@Override
	public String show() {	//实现接口功能
		// TODO Auto-generated method stub
		String str="已启动计时器功能，正在计时……";
		return str;
	}
	
}
