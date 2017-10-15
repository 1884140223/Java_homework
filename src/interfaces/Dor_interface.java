package interfaces;
/**
 * 门接口
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public interface Dor_interface {
	public static final String name="123";
	public abstract String open();			//开门功能
	public abstract String close();			//关门功能
}
