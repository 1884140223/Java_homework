package abstracts;
/**
 * 旅游类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public abstract class Lvyou_fu {
	private String city;		//旅游的城市
	private String time;		//去旅游的时间
	private String days;		//旅游的天数
	public String show(){		//父类普通方法
		String str=time+","+"我们在"+city+"游玩了"+days;
		return str;
	}
	
	
	/**
	 * 对类的封装
	 * private除了本类，其他类无法使用
	 * 使用get、set方法访问privat成员
	 * @return
	 */
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	
	
}
