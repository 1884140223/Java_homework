package chongxie;
/**
 * 大学类——父类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class College_fu {
	private String name="武汉大学";		//大学名称
	private String number="36540";		//大学编号
	private String city="武汉";		//大学所在城市
	private String type="211";		//大学类型
	
	/*方法show():返回学校的基本信息*/
	public String show(String name,String number,String city,String type){
		this.name=name;
		this.number=number;
		this.city=city;
		this.type=type;
		String str="大学名称："+this.name+"\n大学编号："+this.number+"\n大学所在城市："+this.city+"\n大学类型："+this.type;
		return str;
	}
	
	
	/**
	 * 对类的封装
	 * private除了本类，其他类无法使用
	 * 使用get、set方法访问privat成员
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
