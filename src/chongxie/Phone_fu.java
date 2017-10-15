package chongxie;
/**
 * 手机类——父类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Phone_fu {
	private String brand="华为";			//手机品牌		
	private String type="华为荣耀V9";		//手机型号
	public String show(){			//show()方法返回手机的基本信息
		String str="我是："+brand+"\t型号："+type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
