package interfaces;
/**
 * 饮水机接口实现类
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public class yinshuiji implements Yinshuiji_interface {

	@Override
	public String show() {	//实现接口功能
		// TODO Auto-generated method stub
		String str="正在放热水,注意烫伤";
		return str;
	}

	@Override
	public String show1() {	//实现接口功能
		// TODO Auto-generated method stub
		String str="正在放冷水,注意身体，多喝热水";
		return str;
	}

}
