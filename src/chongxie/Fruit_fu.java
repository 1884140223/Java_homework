package chongxie;
/**
 * 水果类——父类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Fruit_fu {
	private String name="西瓜";		//水果名字
	public String show(){			//show方法：返回水果的味道
		String str=name+"吃起来是甜的";
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
	
}
