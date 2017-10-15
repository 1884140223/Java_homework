package interfaces;
/**
 * 多媒体接口实现类
 * 接口不能被实例化
 * 实现类必须实现接口的所有方法
 * 实现类可以实现多个接口
 * 接口中的变量都是静态常量
 * @author Administrator
 */
public class DuoMeiTi implements DuoMeiTi_interfaces {

	@Override
	public String show() {	//实现接口功能
		String str="启用视频功能，正在播放视频";
		return str;
	}

	@Override
	public String show1() {	//实现接口功能
		String str="启用音频功能，正在播放音乐";
		return str;
	}

}
