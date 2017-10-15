package chongxie;
/**
 * 车类——父类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Car_fu {
	private String brand="大客车";			//车辆类型
	private String number="京AC5326";		//车牌号
	private String type="32座";				//核载人数
	public String show(){			//父类中的show()方法，返回车辆的基本信息
		String str=brand+number+type;
		return str;
	}
	
	/**
	 * 对类的封装
	 * private除了本类，其他类无法使用
	 * 使用get、set方法访问privat成员
	 * @return
	 */
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
