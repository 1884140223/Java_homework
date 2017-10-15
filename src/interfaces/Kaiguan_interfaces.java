package interfaces;
/**
 * 电灯开关接口
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public interface Kaiguan_interfaces {
	public abstract String show();		//开灯功能
	public abstract String show1();		//关灯功能
}
