package interfaces;
/**
 * 耳机接口
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public interface Erji_interface {
	public abstract String show();		//检测连接是否成功
	public abstract String show1();		//可以传输音频
}
