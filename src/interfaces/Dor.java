package interfaces;
/**
 * 门接口实现类
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public class Dor implements Dor_interface{

	@Override
	public String open() {		//实现接口功能
		// TODO Auto-generated method stub
		String str="正在开门……请稍后";
		return str;
	}

	@Override
	public String close() {	//实现接口功能
		// TODO Auto-generated method stub
		String str="正在关门……请稍后";
		return str;
	}

}
